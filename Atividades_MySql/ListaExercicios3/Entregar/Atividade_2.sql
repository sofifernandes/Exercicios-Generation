-- Criação do banco de dados:

create database db_pizzaria_legal;

-- Criação de tabela:

use db_pizzaria_legal;

create table tb_categoria (
    id bigint auto_increment,
    tipo varchar(20) not null,
    quantidade bigint not null,
    endereco varchar(50) not null,
    primary key (id)
);

create table tb_pizza (
    id bigint auto_increment,
    sabor varchar(20) not null,
    preco decimal(10,2) not null,
    tamanho varchar(15) not null,
    ingredientes_extras varchar(15) not null,
    tipo_entrega varchar(80) not null,
    id_categoria bigint,
    primary key (id),
   foreign key (id_categoria) references tb_categoria(id)
);

-- Todos os inserts:

insert into tb_categoria(tipo, quantidade, endereco) values ("Doce", 3, "Rua A, nº6");
insert into tb_categoria(tipo, quantidade, endereco) values ("Salgada", 4, "Rua B, nº5");
insert into tb_categoria(tipo, quantidade, endereco) values ("Doce", 1, "Rua C, nº1");
insert into tb_categoria(tipo, quantidade, endereco) values ("Salgada", 2, "Rua D, nº6");
insert into tb_categoria(tipo, quantidade, endereco) values ("Doce", 1, "Rua K, nº17");

insert into tb_pizza(sabor, preco, tamanho, ingredientes_extras, tipo_entrega, id_categoria) values ("Calabresa",50.00, "Grande", "Cebola", "Pegar no restaurante", 1);
insert into tb_pizza(sabor, preco, tamanho, ingredientes_extras, tipo_entrega, id_categoria) values ("Queijo",30.00, "Média", "Nenhum", "Entregar em casa", 5);
insert into tb_pizza(sabor, preco, tamanho, ingredientes_extras, tipo_entrega, id_categoria) values ("2 Queijos",20.00, "Pequena", "Borda recheada", "Entregar em casa", 4);
insert into tb_pizza(sabor, preco, tamanho, ingredientes_extras, tipo_entrega, id_categoria) values ("Chocolate",60.00, "Grande", "Granulado", "Pegar no restaurante", 3);
insert into tb_pizza(sabor, preco, tamanho, ingredientes_extras, tipo_entrega, id_categoria) values ("Portuguesa",30.00, "Média", "Cebola", "Pegar no restaurante", 2);
insert into tb_pizza(sabor, preco, tamanho, ingredientes_extras, tipo_entrega, id_categoria) values ("Brócolis",20.00, "Pequena", "Nenhum", "Entregar em casa", 1);
insert into tb_pizza(sabor, preco, tamanho, ingredientes_extras, tipo_entrega, id_categoria) values ("Palmito",40.00, "Média", "Mais palmito", "Entregar em casa", 3);
insert into tb_pizza(sabor, preco, tamanho, ingredientes_extras, tipo_entrega, id_categoria) values ("Romeu e Julieta",40.00, "Média", "Nenhum", "Pegar no restaurante", 2);

-- Todos os selects:

select * from tb_pizza where preco > 45;

-- ou: select sabor,preco from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where sabor like "%C%";

select tb_pizza.sabor, tb_pizza.tamanho, tb_categoria.quantidade, tb_categoria.tipo from tb_categoria
inner join tb_pizza on tb_categoria.id = tb_pizza.id_categoria;

select tb_pizza.sabor, tb_categoria.tipo from tb_categoria
inner join tb_pizza on tb_categoria.id = tb_pizza.id_categoria
where tipo = "Doce";








