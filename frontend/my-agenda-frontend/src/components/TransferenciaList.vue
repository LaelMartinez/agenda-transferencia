<template>
  <div class="d-flex justify-content-center align-items-center vh-100">
    <div>
      <h3 class="mb-4">Lista de Transferências</h3>
      <ul class="list-group">
        <li v-for="transferencia in transferencias" :key="transferencia.id" class="list-group-item">
          <div class="mt-2">
            <strong>Conta Origem:</strong> {{ transferencia.contaOrigem }}
          </div>
          <div>
            <strong>Conta Destino:</strong> {{ transferencia.contaDestino }}
          </div>
          <div>
            <strong>Valor:</strong> {{ transferencia.valor }}
          </div>
          <div>
            <strong>Data do Agendamento:</strong> {{ formatarData(transferencia.dataAgendamento) }}
          </div>
          <div>
            <strong>Data de Transferência:</strong> {{ formatarData(transferencia.dataTransferencia) }}
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import axios from 'axios';
import { format } from 'date-fns';

export default {
  data() {
    return {
      transferencias: []
    };
  },
  mounted() {
    this.fetchTransferencias();
  },
  methods: {
    fetchTransferencias() {
      axios.get('http://localhost:8080/transferencias')
        .then(response => {
          this.transferencias = response.data.content;
        })
        .catch(error => {
          console.error('Erro ao buscar transferências:', error);
        });
    },
    formatarData(data) {
      return format(new Date(data), 'dd/MM/yyyy'); 
    }
  }
};
</script>
