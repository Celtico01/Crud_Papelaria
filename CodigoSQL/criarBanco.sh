#!/bin/bash

# Solicita ao usuário que insira o nome de usuário
read -p "Nome de Usuário do Banco de Dados: " DB_USUARIO

# Solicita ao usuário que insira a senha (a senha será mascarada)
read -s -p "Senha do Banco de Dados: " DB_SENHA

echo  # Adiciona uma quebra de linha após a entrada da senha

DB_NOME="PAPELARIA"

SQL_SCRIPT=$(cat <<EOF
create database $DB_NOME;
use $DB_NOME;

-- Criação da tabela 'produtos'
CREATE TABLE tbProduto (
    PRO_CODIGO INT AUTO_INCREMENT PRIMARY KEY,
    PRO_NOME VARCHAR(255) NOT NULL,
    PRO_DESCRICAO VARCHAR(255),
    PRO_PRECO DECIMAL(10, 2) NOT NULL,
    PRO_QUANTIDADE_ESTOQUE INT NOT NULL
);

-- Criação da tabela 'pedidos'
CREATE TABLE tbPedido (
    PED_CODIGO INT AUTO_INCREMENT PRIMARY KEY,
    PED_NOME_CLIENTE VARCHAR(255) NOT NULL,
    PED_DATA_PEDIDO VARCHAR(15) NOT NULL
);

-- Criação da tabela 'itens_pedido' para representar os produtos em um pedido
CREATE TABLE tbItemPedido(
    IPE_CODIGO INT AUTO_INCREMENT PRIMARY KEY,
    PED_CODIGO INT,
    PRO_CODIGO INT,
    IPE_QUANTIDADE INT NOT NULL,
    IPE_PRECO_UNITARIO DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (PED_CODIGO) REFERENCES tbPedido(PED_CODIGO) ON DELETE CASCADE,
    FOREIGN KEY (PRO_CODIGO) REFERENCES tbProduto(PRO_CODIGO) ON DELETE SET NULL
);
EOF
)

# Executa o script SQL no banco de dados
mysql -u $DB_USUARIO -p$DB_SENHA -e "$SQL_SCRIPT"

# Verifica o status da execução
if [ $? -eq 0 ]; then
  echo "Banco de dados e tabelas criados com sucesso em $DB_NOME."
else
  echo "Erro ao criar o banco de dados e tabelas em $DB_NOME."
fi

