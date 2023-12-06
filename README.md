# [Lojinha API Automação](https://github.com/MatheusCaputo/lojinhaAPIAutomacao)

Esse é um repositório que contém a automação de alguns testes de API Rest de um software denominado Lojinha. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## [Tecnologias Utilizadas](https://github.com/MatheusCaputo/lojinhaAPIAutomacao#tecnologias-utilizadas)

-   Java  [https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
-   JUnit  [https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.0-M1](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.0-M1)
-   RestAssured  [https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.4.0](https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.4.0)
-   Jackson Databind [https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.12.3](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.12.3)
-   Maven  [https://maven.apache.org/](https://maven.apache.org/)
-   Postman [https://www.postman.com/](https://www.postman.com/)
-   Swagger [https://swagger.io/](https://swagger.io/)


## [Testes Automatizados](https://github.com/MatheusCaputo/lojinhaAPIAutomacao#testes-automatizados)

Testes para validar as partições de equivalência relacionadas ao valor do produto na Lojinha, que estão vinculados diretamente a regra de negócio que diz que o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

###CT1 - Validar que o valor do Produto igual a 0.00 não é permitido
**Resultado esperado:** visualizar um pop-up com a seguinte mensagem:
"O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00" e receber um HTTP status code igual a 422.
**Passo a passo:** Faça login na aplicação WEB, adicione um produto com valor igual a 0,00.

**Resultado obtido:** Passou ✅

###CT2 - Validar que o valor do Produto maior que 7000.00 não é permitido
**Resultado esperado:** visualizar um pop-up com a seguinte mensagem:
"O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00" e receber um HTTP status code igual a 422.
**Passo a passo:** Faça login na aplicação WEB, adicione um produto com valor igual a 0,00.

**Resultado obtido:** Passou ✅

## [Notas Gerais](https://github.com/MatheusCaputo/lojinhaAPIAutomacao#notas-gerais)

-   Sempre utilizamos a anotação **Before Each** para capturar o token que será utilizado posteriormente nos métodos de teste.
-   Armazenamos os dados que são enviados para a API através do uso de classes POJO.
-   Criei dados iniciais através do uso de classe Data Factory, para facilitar a criação e controle dos mesmos.
-   Nesse projeto fiz uso do JUnit 5, o que me dá a possibilidade de usar a anotação DisplayName para dar descrições em português para meus testes.
