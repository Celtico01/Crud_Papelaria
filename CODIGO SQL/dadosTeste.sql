-- Inserir dados de teste na tabela tbProduto
INSERT INTO `PAPELARIA`.`tbProduto` (`PRO_NOME`, `PRO_PRECO`, `PRO_QUANTIDADE_ESTOQUE`, `PRO_CATEGORIA`) VALUES
('Caneta', 2.50, 100, 'Material de Escritório'),
('Caderno', 10.99, 50, 'Material de Escritório'),
('Lápis', 1.00, 150, 'Material de Escritório'),
('Borracha', 0.75, 200, 'Material de Escritório');

-- Inserir dados de teste na tabela tbVenda
INSERT INTO `PAPELARIA`.`tbVenda` (`VEN_DATA_VENDA`, `VEN_QUANTIDADE_PRODUTOS`, `VEN_NOME_CLIENTE`, `PRO_CODIGO`) VALUES
('2023-10-19', 5, 'Cliente A', 1),
('2023-10-20', 2, 'Cliente B', 2),
('2023-10-21', 10, 'Cliente C', 3),
('2023-10-22', 3, 'Cliente A', 4);

