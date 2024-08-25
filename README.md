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
https://github.com/Paxa/postbird?tab=readme-ov-file


Lombok: 
https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.34
JPAData: 