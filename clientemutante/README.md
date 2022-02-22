# Challenge Backend (LB)

Proyecto backend spring boot.

# DB postgreSQL

CREATE SEQUENCE mutant.log_adn_seq
start with 1
increment by 1;

CREATE TABLE mutant.log_adn(
id_log                   numeric  NOT null default nextval('mutant.log_adn_seq'),
adn                      varchar  NOT null,
mutante                  bool     NOT null,
fecha                    timestamp NOT null,
CONSTRAINT log_adn_pk PRIMARY KEY (id_log)
);

#despliegue sobre AWS fargate "Elastic Container Service"

# Compila proyecto

mvn clean install
mvn install -DskipTests=true

# creamos archivo dockerFile

FROM openjdk:8-jdk-alpine
ADD clientemutante.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

# Pasar jar junto con el archivo dockerfile

# Inicio sesion en docker hub

docker login -uusuario -ppassword

# Generar imagen

docker build -t usuarioDocker/clientemutante:latest .

# Subir imagen docker personal

docker push usuarioDocker/clientemutante:latest

# En esta punto vamos hacia AWS ECS-FARGATE

1. Get started
2. Custom->Configure

# Edit container

Container name* = clientemutante

Image* = docker.io/giovannyarturogutierrez/clientemutante:latest

Memory Limits (MiB) - soft limit = 512

Port mappings
8080
80

update->next->next->next->create

