create database db_ecommerce;


use db_ecommerce;

create table produtos(
	id bigint auto_increment,
    nome varchar(30) not null,
    categoria varchar(30) not null,
    preco decimal(10,2),
    disponibilidade boolean,
    primary key (id)
);


use db_ecommerce;

insert into produtos(nome, categoria, preco, disponibilidade) values ("Controle", "Eletrônicos", 50.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("TV", "Eletrônicos", 3000.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Celular", "Eletrônicos", 800.00, false);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Rádio", "Eletrônicos", 250.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Geladeira", "Eletrodométicos", 5000.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Fogão", "Eletrodométicos", 950.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Micro-ondas", "Eletrônicos", 2000.00, false);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Guarda-roupas", "Móveis", 1999.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Sofá", "Móveis", 700.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Mesa", "Móveis", 460.00, false);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Cama", "Móveis", 680.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Cadeira", "Móveis", 90.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Vaso", "Paisagismo", 50.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Estante", "Móveis", 5000.00, true);
insert into produtos(nome, categoria, preco, disponibilidade) values ("Banco", "Móveis", 50.00, true);


select * from produtos where preco > 500;

select * from produtos where preco < 500;

update produtos set categoria = "Mesa de jantar" where id = 10