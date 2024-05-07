import { createRouter, createWebHistory } from 'vue-router';
import TransferenciaList from '../components/TransferenciaList.vue';
import TransferenciaNew from '../components/TransferenciaNew.vue'; 

const routes = [
  { path: '/', redirect: '/transferencias/new' },
  { path: '/transferencias', name: 'TransferenciaList', component: TransferenciaList },
  { path: '/transferencias/new', name: 'TransferenciaNew', component: TransferenciaNew }, 
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;
