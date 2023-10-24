#!/bin/bash

# Solicita ao usuário que insira o nome de usuário
read -p "Nome de Usuário do Banco de Dados: " DB_USUARIO

# Solicita ao usuário que insira a senha (a senha será mascarada)
read -s -p "Senha do Banco de Dados: " DB_SENHA

echo  # Adiciona uma quebra de linha após a entrada da senha

DB_NOME="PAPELARIA"

SQL_SCRIPT=$(cat <<EOF
CREATE DATABASE IF NOT EXISTS $DB_NOME;
USE $DB_NOME;

CREATE TABLE IF NOT EXISTS tbProduto (
  PRO_CODIGO INT NOT NULL AUTO_INCREMENT,
  PRO_NOME VARCHAR(30) NOT NULL,
  PRO_PRECO DECIMAL(6,2) UNSIGNED NOT NULL,
  PRO_QUANTIDADE_ESTOQUE INT UNSIGNED NOT NULL,
  PRO_CATEGORIA VARCHAR(45) NOT NULL,
  PRIMARY KEY (PRO_CODIGO)
);

CREATE TABLE IF NOT EXISTS tbVenda (
  VEN_CODIGO INT NOT NULL AUTO_INCREMENT,
  VEN_DATA_VENDA DATE NOT NULL,
  VEN_QUANTIDADE_PRODUTOS INT UNSIGNED NOT NULL,
  VEN_NOME_CLIENTE VARCHAR(60) NOT NULL,
  PRO_CODIGO INT NOT NULL,
  PRIMARY KEY (VEN_CODIGO),
  INDEX fk_tbVenda_1_idx (PRO_CODIGO ASC) VISIBLE,
  CONSTRAINT fk_tbVenda_1
    FOREIGN KEY (PRO_CODIGO)
    REFERENCES tbProduto (PRO_CODIGO)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
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

