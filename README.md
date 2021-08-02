# Microsserviços:

Um exemplo básico de um sistema que utilizando a arquitetura de microservices:


![Web 1](https://raw.githubusercontent.com/DiegoWanBorges/assets/main/twokeys-ms/doc/apresentacao-ms.png)

## Detalhamento

O serviço tk-sales possui o cadastro de cliente que é instanciado pelo serviço tk-payment através do OpenFeign.

O balanceamento de carga e descoberta de serviços é feito pelo Eureka Server e a centralização das requisições é feita pelo Spring Cloud Gateway utilizando roteamento dinâmico.

As configurações foram centralizadas utilizando Spring Cloud Config Server.

# Tecnologias Utilizadas:
- Java
- Spring Boot
- JPA / Hibernate
- Eureka
- Spring Cloud Gateway
- Spring Cloud Config Server
- Spring Cloud OpenFeign
- Maven
