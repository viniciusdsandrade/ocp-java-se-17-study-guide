-- Criação do banco de dados
IF DB_ID('db_jdbc_sql_server_chapter_15') IS NULL
    BEGIN
        CREATE DATABASE db_jdbc_sql_server_chapter_15;
    END
GO

-- Usando o banco de dados recém-criado
USE db_jdbc_sql_server_chapter_15;
GO

-- Criação da tabela tb_employees
IF OBJECT_ID('dbo.tb_employees', 'U') IS NULL
    BEGIN
        CREATE TABLE tb_employees
        (
            id   INT IDENTITY (1,1) PRIMARY KEY,
            name NVARCHAR(100) NOT NULL,
            age  INT           NOT NULL
        );
    END
GO

-- Inserção de dados na tabela
INSERT INTO tb_employees (name, age) VALUES ('John Doe', 30);
INSERT INTO tb_employees (name, age) VALUES ('Jane Smith', 25);
GO
