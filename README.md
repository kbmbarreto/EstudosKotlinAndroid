# CAR - Projeto de viagens por aplicativo

<p>Projeto criado para estudos do livro APIs REST em Kotlin, Alexandre Saudate, 2021</p>

## Ferramentas utilizadas

- Kotlin
- Gradle
- MySql
- Spring Framework
- HATEOAS
- Wiremock

## Preparação do ambiente
Para rodar o projeto, utlize a IDE que você mais se identifique **(no meu caso, utilizo o IntelliJ)**, em seguida, altere o arquivo **application.properties** para que o projeto se adeque ao seu servidor de **banco de dados**:

**Exemplo do arquivo application.properties**:

````java
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/{Nome do banco de dados}
spring.datasource.username={usuário do servidor MySql}
spring.datasource.password={Senha do servidor MySql}
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE
````

Em seguida, basta criar um banco de dados no MySql com o comando `Create schema {Nome do banco de dados}`

## Tutoriais úteis para configurar sua estação de trabalho.

- [Configurar variáveis de ambiente JAVA](https://mauriciogeneroso.medium.com/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f)
- [Configurar variáveis de ambiente Graddle](https://giordanolins.com/instalando-e-configurando-o-gradle-no-windows/)