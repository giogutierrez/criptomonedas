# Cliente Persona

Proyecto backend spring boot.

Java JDK 8

Apache maven


# DB postgreSQL

CREATE SEQUENCE public.persona_seq
start with 1
increment by 1;

CREATE TABLE public.persona (
            id integer   NOT null default nextval('public.persona_seq'),
            numero_documento varchar(25) not NULL,
            edad integer not NULL,
            nombre varchar null,
            CONSTRAINT pk_usuario PRIMARY KEY (id)
           );

# Servicio mayores edad
localhost:8080/clientePersona/personaService/getPersonasMayoresEdad