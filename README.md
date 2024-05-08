
# Agendamento de Transferências

## Tecnologias Utilizadas

### Backend (Spring Boot)
- Java
- Spring Boot
- Spring Data JPA
- Banco de Dados (H2)

### Frontend (Vue.js)
- Vue.js
- Vue Router
- Axios
- Bootstrap 

## Como Rodar

### Backend
- comando: ./mvnw spring-boot:run
- Ou rode diretamente da IDE.
- O backend estará disponível em `http://localhost:8080`.

### Frontend
- comando: npm install
- comando: npm run serve
- O frontend estará disponível em `http://localhost:80`.

### Observaçõoes
   - É Persistida 2 contas na carga do programa, Maria e Bárbara.
   - Procurei fazer alguns testes, o ultimo não esta passsando pois adicionei uma verificação de existência de contas
     no BD no método save do TransferenciaService, que fez o teste parar de passar.   
 
### Collection PostMan
   Segue em ultimo commit a Collection do Postman, para testes do Backend separadamente.

