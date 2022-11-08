CREATE DATABASE IF NOT EXISTS dbsistemavenda;

USE dbsistemavenda;

CREATE TABLE pessoa (
     id BIGSERIAL,
     nome VARCHAR(50),
     perfil VARCHAR(20),
     documento VARCHAR(20),
     endereco VARCHAR(80),
     telefone VARCHAR(20)

     CONSTRAINT pk_pessoa PRIMARY KEY (id),
);

CREATE TABLE cliente (
     id BIGSERIAL,
     email VARCHAR(50),

     CONSTRAINT pk_cliente PRIMARY KEY (id),
);

CREATE TABLE vendedor (
     id BIGSERIAL,

     CONSTRAINT pk_vendedor PRIMARY KEY (id),
);