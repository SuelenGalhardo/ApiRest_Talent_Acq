# ApiRest_Talent_Acq

API REST para gestionar empresas, ofertas de empleo y candidaturas, utilizando los principales paquetes de Spring Boot para persistencia, seguridad y autorización


Docker + PostgreSQL: 
https://docs.docker.com/desktop/install/windows-install/
[version: '3.8'

services:
  postgres:
    container_name: gestao_vagas_postgres
    image: postgres
    ports:
      - 5432:5432
    environment:
      - POSTGRES_USER=admin
      - POSTGRES_PASSWORD=admin
      - POSTGRES_DB=talent_acq]
***docker-compose up -d


database para test:
https://github.com/Paxa/postbird?tab=readme-ov-file  or 
https://www.beekeeperstudio.io/


Lombok: 
https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.34
JPAData: 




Documentation:
Swagger es un conjunto de herramientas de software de código abierto para diseñar, construir, documentar, y utilizar servicios web RESTful:
https://swagger.io/ 
https://petstore.swagger.io/

mvn Repository:
https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui


Generar TOKEN :

JWT (JSON Web Token) - https://jwt.io/