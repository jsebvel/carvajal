# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

## Descripción del proyecto
Este proyecto fue creado con Java 11, usando spring boot junto con JPA e Hibernate. El motor de base de datos 
usado para este proyecto es PostgresSQL.
En este se pueden realizar operación de registro e inición de sesión de usuario, así como la manipulación de tarjetas
de crédito. Para las tarjetas, se realizan operaciones de CRUD.

## Configuración de la conección con la base de datos
Para una correcta ejecución del proyecto, se deben configurar las siguientes propiedas en el archivo
application.properties: 

spring.datasource.url=jdbc:postgresql://urlBd:puertoConexionBd/nombreBD
spring.datasource.username=userNameBd
spring.datasource.password=passwordBD
spring.jpa.hibernate.ddl-auto=update

por ejemplo, para una conexión con local host quedaría algo como 
spring.datasource.url=jdbc:postgresql://localhost:5432/carvajalTest
spring.datasource.username=postgres
spring.datasource.password=12345
spring.jpa.hibernate.ddl-auto=update

## Ejecución
 La ejecución del proyecto se debe hacer a través de maven con alguno de los siguientes comandos
  ### Para windows: mvnw.cmd spring-boot:run 
  ### Para linux: mvn spring-boot
  En el caso de linux, es importante verificar que el path de $JAVA_HOME se encuentra bien configurado y exportado.
