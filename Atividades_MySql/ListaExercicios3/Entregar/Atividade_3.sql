-- Criação de banco de dados:

create database db_farmacia_do_bem;

-- Criação de tabelas:

use db_farmacia_do_bem;

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
    tamanho varchar(15) not null,
    preco decimal(10,2),
    disponibilidade boolean,
    id_categoria bigint,
    primary key (id),
    foreign key (id_categoria) references tb_categoria(id)
)

-- Todos os inserts:

insert into tb_categoria(tipo, quantidade, fornecedor) values ("Suplemento", 1, "Isabel");
insert into tb_categoria(tipo, quantidade, fornecedor) values ("Cosmético", 3, "Sabrina");
insert into tb_categoria(tipo, quantidade, fornecedor) values ("Vitamina", 6, "Carlos");
insert into tb_categoria(tipo, quantidade, fornecedor) values ("Medicamento", 1, "Laís");
insert into tb_categoria(tipo, quantidade, fornecedor) values ("Formulado", 5, "Laura");

insert into tb_produto(nome, tamanho, preco, disponibilidade, id_categoria) values ("Creme facial", "Médio", 50.00, true, 2 );
insert into tb_produto(nome, tamanho, preco, disponibilidade, id_categoria) values ("Suplemento muscular", "Grande", 80.00, true, 1 );
insert into tb_produto(nome, tamanho, preco, disponibilidade, id_categoria) values ("Vitamina C", "Pequeno", 20.00, false, 3 );
insert into tb_produto(nome, tamanho, preco, disponibilidade, id_categoria) values ("Remédio formulado", "Médio", 60.00, true, 5 );
insert into tb_produto(nome, tamanho, preco, disponibilidade, id_categoria) values ("Remédio Estômago", "Grande", 10.00, false, 4 );
insert into tb_produto(nome, tamanho, preco, disponibilidade, id_categoria) values ("Creme Corpotal", "Médio", 13.00, true, 2 );
insert into tb_produto(nome, tamanho, preco, disponibilidade, id_categoria) values ("Remédio Rim", "Pequeno", 100.00, true, 4 );
insert into tb_produto(nome, tamanho, preco, disponibilidade, id_categoria) values ("Creme Mãos", "Médio", 10.00, true, 2 );

-- Todos os selects:

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%B%";

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria;

select tb_produto.nome, tb_categoria.tipo from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria
where tipo = "Medicamento";


