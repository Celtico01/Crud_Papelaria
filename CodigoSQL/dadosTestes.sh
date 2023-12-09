#!/bin/bash

# Solicita ao usuário que insira o nome de usuário
read -p "Nome de Usuário do Banco de Dados: " DB_USUARIO

# Validação do nome de usuário
if [ -z "$DB_USUARIO" ]; then
  echo "Nome de Usuário é obrigatório."
  exit 1
fi

# Solicita ao usuário que insira a senha (a senha será mascarada)
read -s -p "Senha do Banco de Dados: " DB_SENHA

echo  # Adiciona uma quebra de linha após a entrada da senha

# Validação da senha
if [ -z "$DB_SENHA" ]; then
  echo "Senha é obrigatória."
  exit 1
fi

DB_NOME="PAPELARIA"

# Script SQL para inserir dados de teste
SQL_SCRIPT=$(cat <<EOF
USE $DB_NOME;

-- Inserção de dados na tabela 'tbProduto'
INSERT INTO tbProduto (PRO_NOME, PRO_DESCRICAO, PRO_PRECO, PRO_QUANTIDADE_ESTOQUE)
VALUES 
    ('Caneta Azul', 'Caneta esferográfica azul', 1.50, 100),
    ('Caderno Universitário', 'Caderno de 100 folhas', 8.99, 50),
    ('Lápis HB', 'Lápis com grafite HB', 0.75, 200),
    ('Borracha', 'Borracha branca', 0.50, 150),
    ('Mochila Escolar', 'Mochila para estudantes', 29.99, 30),
    ('Lápis de Cor', 'Conjunto de lápis de cor', 5.99, 80),
    ('Grampeador', 'Grampeador de mesa', 12.99, 20),
    ('Pasta', 'Pasta de arquivo', 2.99, 100),
    ('Régua', 'Régua de 30 cm', 1.25, 75),
    ('Caneta Vermelha', 'Caneta esferográfica vermelha', 1.50, 50);

-- Inserção de dados na tabela 'tbPedido'
INSERT INTO tbPedido (PED_NOME_CLIENTE, PED_DATA_PEDIDO)
VALUES 
    ('Cliente A', '2023-11-09'),
    ('Cliente B', '2023-11-10'),
    ('Cliente C', '2023-11-11'),
    ('Cliente D', '2023-11-12'),
    ('Cliente E', '2023-11-13'),
    ('Cliente F', '2023-11-14'),
    ('Cliente G', '2023-11-15'),
    ('Cliente H', '2023-11-16'),
    ('Cliente I', '2023-11-17'),
    ('Cliente J', '2023-11-18');

-- Inserção de dados na tabela 'tbItemPedido'
-- Considerando que os códigos de produtos e pedidos correspondem aos inseridos anteriormente

-- Pedido 1 (Cliente A) com vários produtos
INSERT INTO tbItemPedido (PED_CODIGO, PRO_CODIGO, IPE_QUANTIDADE, IPE_PRECO_UNITARIO)
VALUES
    (1, 1, 5, 1.50),   -- 5 Canetas Azuis para o Cliente A
    (1, 2, 2, 8.99),   -- 2 Cadernos para o Cliente A
    (1, 3, 10, 0.75);  -- 10 Lápis HB para o Cliente A

-- Pedido 2 (Cliente B) com alguns produtos
INSERT INTO tbItemPedido (PED_CODIGO, PRO_CODIGO, IPE_QUANTIDADE, IPE_PRECO_UNITARIO)
VALUES
    (2, 4, 3, 0.50),   -- 3 Borrachas para o Cliente B
    (2, 5, 1, 29.99);  -- 1 Mochila para o Cliente B

-- Pedido 3 (Cliente C) com um produto
INSERT INTO tbItemPedido (PED_CODIGO, PRO_CODIGO, IPE_QUANTIDADE, IPE_PRECO_UNITARIO)
VALUES
    (3, 6, 4, 5.99);   -- 4 Conjuntos de Lápis de Cor para o Cliente C

-- Pedido 4 (Cliente D) com mais produtos
INSERT INTO tbItemPedido (PED_CODIGO, PRO_CODIGO, IPE_QUANTIDADE, IPE_PRECO_UNITARIO)
VALUES
    (4, 7, 1, 12.99),  -- 1 Grampeador para o Cliente D
    (4, 8, 6, 1.50);   -- 6 Canetas Azuis para o Cliente D

-- Pedido 5 (Cliente E) com produtos variados
INSERT INTO tbItemPedido (PED_CODIGO, PRO_CODIGO, IPE_QUANTIDADE, IPE_PRECO_UNITARIO)
VALUES
    (5, 9, 8, 2.99),   -- 8 Pastas para o Cliente E
    (5, 10, 5, 1.25);  -- 5 Réguas para o Cliente E
EOF
)

# Executa o script SQL no banco de dados
mysql -u "$DB_USUARIO" -p"$DB_SENHA" -e "$SQL_SCRIPT"

# Verifica o status da execução
if [ $? -eq 0 ]; then
  echo "Dados de teste inseridos com sucesso."
else
  echo "Erro ao inserir dados de teste."
  exit 1
fi

