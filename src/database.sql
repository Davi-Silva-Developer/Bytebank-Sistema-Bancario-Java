-- Criar o Banco de Dados "bytebank"
 CREATE DATABASE bytebank;
--  Entrar dentro dele (Selecionar)
 USE bytebank;

-- Criar a Tabela de Clientes
 CREATE TABLE Clientes(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR (50),
cpf VARCHAR(50)  
);
-- Inserir o Clientes
INSERT INTO Clientes (nome, cpf) VALUES("Davi",   "111.222.333-44");
-- Ver se ficou guardado
SELECT * FROM  Clientes;



CREATE TABLE Contas(
id INT PRIMARY KEY AUTO_INCREMENT,
saldo DECIMAL(10,2),
numero INT,
cliente_id INT,
FOREIGN KEY (cliente_id) REFERENCES Clientes(id)
);

SELECT * FROM  Contas;

INSERT INTO Contas (saldo, numero, clinete_id ) VALUES(25.00, 1234, 1  );
