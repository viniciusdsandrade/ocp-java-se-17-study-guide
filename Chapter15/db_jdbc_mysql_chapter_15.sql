-- Exclui o banco de dados 'db_jdbc_mysql_chapter_15' se ele existir.
DROP DATABASE IF EXISTS db_jdbc_mysql_chapter_15;

-- Cria o banco de dados 'db_jdbc_mysql_chapter_15' se ele não existir.
CREATE DATABASE IF NOT EXISTS db_jdbc_mysql_chapter_15;

-- Seleciona o banco de dados 'db_jdbc_mysql_chapter_15' para uso.
USE db_jdbc_mysql_chapter_15;

CREATE TABLE IF NOT EXISTS tb_employees
(
    id   INT UNSIGNED AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age  TINYINT UNSIGNED NOT NULL,

    PRIMARY KEY (id)
);


INSERT INTO tb_employees (name, age) VALUES ('John Doe', 30);
INSERT INTO tb_employees (name, age) VALUES ('Jane Smith', 25);
