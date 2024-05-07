<template>
  <div class="d-flex justify-content-center align-items-center vh-100">
    <div>
      <h3 class="text-center mb-4">Nova Transferência</h3>
      <form @submit.prevent="submitTransfer" class="p-3 border rounded">
        <div class="mb-3">
          <label for="contaOrigem" class="form-label">Conta Origem:</label>
          <select id="contaOrigem" v-model="transferData.contaOrigem" class="form-select" required>
            <option value="" disabled selected>Selecione uma conta</option>
            <option v-for="conta in contas" :key="conta.id" :value="conta.numero"><b>{{ conta.nome }}</b> - {{ conta.numero }}</option>
          </select>
        </div>
        <div class="mb-3">
          <label for="contaDestino" class="form-label">Conta Destino:</label>
          <select id="contaDestino" v-model="transferData.contaDestino" class="form-select" required>
            <option value="" disabled selected>Selecione uma conta</option>
            <option v-for="conta in contas" :key="conta.id" :value="conta.numero"><b>{{ conta.nome }}</b> - {{ conta.numero }} </option>
          </select>
        </div>
        <div class="mb-3">
          <label for="valor" class="form-label">Valor:</label>
          <input type="number" id="valor" v-model.number="transferData.valor" class="form-control" required>
        </div>
        <div class="mb-3">
          <label for="dataTransferencia" class="form-label">Data de Transferência:</label>
          <input type="date" id="dataTransferencia" v-model="transferData.dataTransferencia" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-primary d-block mx-auto">Enviar</button>
      </form>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'TransferenciaNew',
  data() {
    return {
      transferData: {
        contaOrigem: '',
        contaDestino: '',
        valor: null,
        dataTransferencia: ''
      },
      contas: [] 
    };
  },
  mounted() {
    this.fetchContas();
  },
  methods: {
    fetchContas() {
      axios.get('http://localhost:8080/contas')
        .then(response => {
          this.contas = response.data.content;
        })
        .catch(error => {
          console.error('Erro ao buscar contas:', error);
        });
    },
    submitTransfer() {
      axios.post('http://localhost:8080/transferencias', this.transferData)
        .then(response => {
          console.log('Transferência enviada com sucesso:', response.data);
          this.resetForm();
        })
        .catch(error => {
          console.error('Erro ao enviar transferência:', error);
        });
    },
    resetForm() {
      this.transferData.contaOrigem = '';
      this.transferData.contaDestino = '';
      this.transferData.valor = null;
      this.transferData.dataTransferencia = '';
    }
  }
}
</script>

<style scoped>

</style>
