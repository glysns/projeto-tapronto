CREATE TABLE tab_estabelecimento (
	id int4,
	cpf_cnpj varchar(14),
	nome varchar(70),
	celular numeric(12)
);

CREATE TABLE tab_servico (
	id int4,
	descricao varchar(70),
	valor numeric(7,2)
);


CREATE TABLE tab_cliente (
	id int4,
	cpf_cnpj varchar(14),
	nome varchar(70),
	celular numeric(12)
);

CREATE TABLE tab_equipamento (
	id int4,
	tag varchar(20),
	descricao varchar(70),
	tipo varchar(20)
);

--DML -> inserir, alterar, excluir

-- ordem servico ???


