#!/bin/bash

# Solicita ao usuário que insira o nome de usuário
read -p "Nome de Usuário do Banco de Dados: " DB_USUARIO

# Solicita ao usuário que insira a senha (a senha será mascarada)
read -s -p "Senha do Banco de Dados: " DB_SENHA

echo  # Adiciona uma quebra de linha após a entrada da senha

# Script SQL para inserir dados de teste
SQL_SCRIPT=$(cat <<EOF
USE PAPELARIA;

-- Inserção de dados na tabela 'tbProduto'
INSERT INTO tbProduto (PRO_NOME, PRO_DESCRICAO, PRO_PRECO, PRO_QUANTIDADE_ESTOQUE)
VALUES 
    ('Caneta Azul', 'Caneta esferográfica azul', 1.50, 100),
    ('Caderno Universitário', 'Caderno de 100 folhas', 8.99, 50),
    ('Lápis HB', 'Lápis com grafite HB', 0.75, 200);

-- Inserção de dados na tabela 'tbPedido'
INSERT INTO tbPedido (PED_NOME_CLIENTE, PED_DATA_PEDIDO)
VALUES 
    ('Cliente A', '2023-11-09'),
    ('Cliente B', '2023-11-10'),
    ('Cliente C', '2023-11-11');

-- Inserção de dados na tabela 'tbItemPedido'
-- Considerando que os códigos de produtos e pedidos correspondem aos inseridos anteriormente
INSERT INTO tbItemPedido (PED_CODIGO, PRO_CODIGO, IPE_QUANTIDADE, IPE_PRECO_UNITARIO)
VALUES
    (1, 1, 5, 1.50), -- 5 Canetas Azuis para o Cliente A
    (2, 2, 2, 8.99), -- 2 Cadernos para o Cliente B
    (3, 3, 10, 0.75); -- 10 Lápis HB para o Cliente C
EOF
)

# Executa o script SQL no banco de dados
mysql -u $DB_USUARIO -p$DB_SENHA -e "$SQL_SCRIPT"

# Verifica o status da execução
if [ $? -eq 0 ]; then
  echo "Dados de teste inseridos com sucesso."
else
  echo "Erro ao inserir dados de teste."
fi
