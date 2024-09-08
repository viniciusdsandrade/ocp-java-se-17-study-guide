-- Exclui o banco de dados se ele existir
DROP DATABASE IF EXISTS db_jdbc_postgresql_chapter_15;

-- Cria o banco de dados se ele não existir
CREATE DATABASE db_jdbc_postgresql_chapter_15;

-- Cria a tabela se ela não existir
CREATE TABLE IF NOT EXISTS tb_employees
(
    id   SERIAL,
    name VARCHAR(100) NOT NULL,
    age  SMALLINT     NOT NULL,

    PRIMARY KEY (id)
);

-- Insere dados na tabela
INSERT INTO tb_employees (name, age) VALUES ('John Doe', 30);
INSERT INTO tb_employees (name, age) VALUES ('Jane Smith', 25);