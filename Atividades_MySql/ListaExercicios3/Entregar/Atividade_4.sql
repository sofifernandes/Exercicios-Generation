-- Criação de banco de dados:

create database db_cidade_das_carnes;

-- Criação de tabelas:

use db_cidade_das_carnes;

create table tb_categoria (
    id bigint auto_increment,
    tipo varchar(20) not null,
    quantidade bigint not null,
    fornecedor varchar(50) not null,
    primary key (id)
);

create table tb_produto(
    id bigint auto_increment,
    nome varchar(30) not null,
    quantidade bigint not null,
    preco decimal(10,2),
    disponibilidade boolean,
    id_categoria bigint,
    primary key (id),
    foreign key (id_categoria) references tb_categoria(id)
);

-- Todos os selects:

insert into tb_categoria(tipo, quantidade, fornecedor) values ("Bovino", 1, "Bovino's Carne");
insert into tb_categoria(tipo, quantidade, fornecedor) values ("Caprino", 3, "Caprino's Carne");
insert into tb_categoria(tipo, quantidade, fornecedor) values ("Suíno", 6, "Suíno Carne");
insert into tb_categoria(tipo, quantidade, fornecedor) values ("Aves", 1, "Aves Venda");
insert into tb_categoria(tipo, quantidade, fornecedor) values ("Ovinos", 5, "Ovinos Venda");


insert into tb_produto(nome, quantidade, preco, disponibilidade, id_categoria) values ("Carne de ovelha", 2, 50.00, true,  5);
insert into tb_produto(nome, quantidade, preco, disponibilidade, id_categoria) values ("Frango ", 3, 80.00, true, 4 );
insert into tb_produto(nome, quantidade, preco, disponibilidade, id_categoria) values ("Carne de cabra", 2, 60.00, false, 2 );
insert into tb_produto(nome, quantidade, preco, disponibilidade, id_categoria) values ("Carne de boi", 4, 90.00, true, 1 );
insert into tb_produto(nome, quantidade, preco, disponibilidade, id_categoria) values ("Carne de porco", 2, 20.00, false, 3 );
insert into tb_produto(nome, quantidade, preco, disponibilidade, id_categoria) values ("Frango", 1, 13.00, true, 4 );
insert into tb_produto(nome, quantidade, preco, disponibilidade, id_categoria) values ("Carne de vaca", 2, 100.00, false, 1 );
insert into tb_produto(nome, quantidade, preco, disponibilidade, id_categoria) values ("Carne de cabra", 4, 400.00, false, 2 );

-- Todos os selects:

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%c%";

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria;

select tb_produto.nome, tb_categoria.tipo from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria
where tipo = "Bovino";


