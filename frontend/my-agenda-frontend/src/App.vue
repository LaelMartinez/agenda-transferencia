<template>
  <div id="app">
    <div class="mobile-header">
      <div class="mobile-header__menu">
        <button @click="showTransferenciaList">Transferências</button>
        <button @click="showLaunchTransfer">Lançar Transferência</button>
      </div>
    </div>
    
    <main class="mobile-content">
      <router-view></router-view>
    </main>
  </div>
</template>

<script>
export default {
  name: 'App',
  methods: {
    showTransferenciaList() {
      this.$router.push({ name: 'TransferenciaList' });
    },
    showLaunchTransfer() {
      this.$router.push({ name: 'TransferenciaNew' });
    }
  }
}
</script>

<style scoped>
#app {
  font-family: Arial, sans-serif;
}

.mobile-header {
  background-color: #333;
  color: #fff;
  padding: 10px 20px;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.mobile-header__menu button {
  background: none;
  border: none;
  color: #fff;
  cursor: pointer;
  font-size: 16px;
  padding: 5px 10px;
}

.mobile-header__menu button:hover {
  background-color: rgba(255, 255, 255, 0.1);
}

.mobile-content {
  padding: 20px;
}
</style>
