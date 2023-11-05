#!/bin/bash

read -p "Nome de Usuário do Banco de Dados: " DB_USUARIO

# Solicita ao usuário que insira a senha (a senha será mascarada)
read -s -p "Senha do Banco de Dados: " DB_SENHA

echo  # Adiciona uma quebra de linha após a entrada da senha

DB_NOME="PAPELARIA"

SQL_SCRIPT=$(cat <<EOF
USE $DB_NOME;

INSERT INTO tbProduto (PRO_NOME, PRO_PRECO, PRO_QUANTIDADE_ESTOQUE, PRO_CATEGORIA) VALUES
('Caneta', 2.50, 100, 'Material de Escritório'),
('Caderno', 10.99, 50, 'Material de Escritório'),
('Lápis', 1.00, 150, 'Material de Escritório'),
('Borracha', 0.75, 200, 'Material de Escritório');

INSERT INTO tbVenda (VEN_DATA_VENDA, VEN_QUANTIDADE_PRODUTOS, VEN_NOME_CLIENTE, PRO_CODIGO) VALUES
('2023-10-19', 5, 'Cliente A', 1),
('2023-10-20', 2, 'Cliente B', 2),
('2023-10-21', 10, 'Cliente C', 3),
('2023-10-22', 3, 'Cliente A', 4);

EOF
)

mysql -u $DB_USUARIO -p$DB_SENHA -e "$SQL_SCRIPT"

if [ $? -eq 0 ]; then
  echo "Dados inseridos com sucesso em $DB_NOME."
else
  echo "Erro ao inserir dados em $DB_NOME."
fi
