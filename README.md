API-Spring-Boot para Cadastro de Carros
Definição do cenário da aplicação
A aplicação consiste em uma API para cadastro de carros, permitindo o armazenamento e consulta de informações sobre os veículos. Os usuários podem cadastrar novos carros, visualizar os carros já cadastrados e atualizar informações existentes, bem como realizar a exclusão lógica de um carro.

Estruturação das APIs
A API foi desenvolvida utilizando o framework Spring Boot, que oferece uma estrutura robusta para a criação de APIs. A API está estruturada em quatro endpoints principais:

/carros: Endpoint para listar todos os carros cadastrados. Suporta filtros opcionais por montadora, nome, placa, tipo, e especificações (cor, cavalaria, torque, peso, origem de fabricação).
/carros/{id}: Endpoint para dar baixa em um carro específico, a partir do seu ID.
/carros: Endpoint para cadastrar um novo carro na base de dados.
/carros/{id}: Endpoint para atualizar um registro de carro específico, a partir do seu ID.
Para cada endpoint, foram definidas as rotas, os parâmetros aceitos, os possíveis códigos de resposta e os formatos dos dados enviados e recebidos.

Implementação dos serviços
Os serviços descritos na API foram implementados utilizando o framework Spring Boot e outras bibliotecas, como o driver do MySQL, o Flyway e o Lombok. O CarroController é responsável por listar todos os carros cadastrados e permitir a realização das demais ações.

Integração com Banco de Dados
Para a integração com banco de dados, foi utilizado o framework Spring Data JPA, sendo utilizado o banco de dados relacional MySQL para armazenamento dos dados.

Tecnologias e recursos utilizados
Foram utilizadas as seguintes tecnologias e recursos na implementação da API:

Spring Boot: framework utilizado para a criação da API, oferecendo uma estrutura robusta e intuitiva para a definição de rotas e serviços.
Spring Data JPA: framework utilizado para a integração com banco de dados, oferecendo uma forma simples e eficiente de acesso aos dados.
MySQL: banco de dados relacional utilizado para armazenamento dos dados dos carros.
Postman: ferramenta para testes da aplicação.
JSON: formato utilizado para envio e recebimento de dados na API, oferecendo uma estrutura simples e legível para representação dos objetos.
Conclusão
A API de Cadastro de Carros desenvolvida com o uso do framework Spring Boot, Spring Data JPA e MySQL, permite o armazenamento e consulta de informações sobre veículos de forma simples e eficiente.
