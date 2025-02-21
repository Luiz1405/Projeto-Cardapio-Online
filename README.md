🍽️ Cardápio Digital - Aplicação FullStack
Este projeto é um Cardápio Digital desenvolvido com React e Spring Boot.
A aplicação permite visualizar e gerenciar pratos e menus de forma dinâmica.

🛠️ Estrutura do Projeto
🔹 Frontend
React com TypeScript
React Query para gerenciamento de estado
Vite para um ambiente de desenvolvimento otimizado
🔹 Backend
Java 17+ com Spring Boot
Spring Data JPA para acesso ao banco de dados
PostgreSQL para armazenamento de dados
Docker para ambiente de contêinerização
Postman para testes de API
✅ Requisitos
Antes de iniciar, certifique-se de ter as seguintes ferramentas instaladas:

Node.js (16 ou superior)
npm ou yarn
Docker
Java 17+
PostgreSQL
🚀 Instalação e Execução
🔹 Clonando o repositório
bash
Copiar
Editar
git clone https://github.com/Luiz1405/Projeto-Cardapio-Online.git
🔹 Executando o Frontend
Acesse a pasta do frontend e instale as dependências:

bash
Copiar
Editar
cd frontend-cardapio
npm install
# ou
yarn install
Inicie o ambiente de desenvolvimento:

bash
Copiar
Editar
npm run dev
# ou
yarn dev
A aplicação estará disponível em http://localhost:5173/ (caso esteja utilizando o Vite).

🔹 Executando o Backend
Acesse a pasta do backend:

bash
Copiar
Editar
cd backend-cardapio
Execute o backend com:

bash
Copiar
Editar
./mvnw spring-boot:run
🐳 Executando com Docker
Caso prefira rodar toda a stack com Docker, basta executar:

bash
Copiar
Editar
docker-compose up -d
Isso iniciará frontend, backend e banco de dados PostgreSQL automaticamente.

🚀 Desenvolvido por Luiz Augusto de Souza Kubaszewski.
