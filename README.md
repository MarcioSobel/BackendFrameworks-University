# Atividade - BackEnd Frameworks

Criar uma API utilizando Springboot sobre o gerenciamento de pessoas de uma universidade.\
Aluno: Márcio Sobel - 01578025

### Rotas:

Criar uma pessoa no banco:

```
$ curl -X POST http://localhost:8080/person \
     -H "Content-Type: application/json" \
     -d '{
           "name": "example",
           "cpf": "123.456.789-10",
           "age": 22
         }'
```

Ver uma pessoa no banco:

```
$ curl -X GET http://localhost:8080/person/123e4567-e89b-12d3-a456-426614174000
```

### Rodando a aplicação

Para rodar a aplicação, primeiro, certifique-se de que possui docker instalado na máquina -- Caso não tenha, poderá editar o `spring.datasource.url` do arquivo `application.properties` para qualquer banco de dados MySQL.
Iniciar o docker:

```
$ docker compose up -d
```

Após isso, basta iniciar a aplicação pelo comando:

```
$ ./mvnw spring-boot:run
```

ou:

```
$ mvn spring-boot:run
```
