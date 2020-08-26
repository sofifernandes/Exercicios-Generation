-- Criação de tabela:

use db_diversos;

create table varejo (
    id bigint auto_increment,
    preco decimal (10,2) not null,
    categoria varchar (30) not null,
    nome varchar (30) not null,
    disponivel boolean,
    quantidade bigint not null,
    codigo bigint not null,
    primary key (id)
);


-- Todos os inserts: 

insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (60.00, "Eletrônicos","Controle", true, 5, 1661);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (3000.00, "Eletrônicos","TV", true, 1, 1662);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (800.00, "Eletrônicos","Celular", true, 2, 1663);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (250.00, "Eletrônicos","Rádio", false, 3, 1664);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (5000.00, "Eletrodomésticos","Geladeira", true, 1, 1551);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (950.00, "Eletrodomésticos","Fogão", false, 1, 1552);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (2000.00,"Eletrodomésticos","Micro-ondas", true, 2, 1553);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (1999.00, "Móveis","Guarda-roupas", true, 4, 1441);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (700.00, "Móveis","Sofá", true, 2, 1442);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (460.00, "Móveis","Mesa", true, 3, 1443);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (680.00, "Móveis","Cama", true, 2, 1444);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (90.00, "Móveis","Cadeira", false, 4, 1445);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (50.00, "Paisagismo","Vaso", true, 1, 1221);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (5000.00, "Móveis","Estante", true, 1, 1446);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (50.00, "Móveis","Banco", true, 5, 1447);
insert into varejo(preco, categoria, nome, disponivel, quantidade, codigo) values (6000.00, "Eletrônicos","Home theater", true, 1, 1665);

-- Todos os selects:

select * from varejo where nome like "A%";

select * from varejo where categoria = "Móveis";

select nome, preco from varejo where categoria = "Eletrônicos" and preco between 1000 and 1500;

select * from varejo where categoria like "M%";

-- Todas as atualizações:

update varejo set preco = 1400 where id = 3;