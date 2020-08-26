
-- Criação de tabela:

use db_diversos;

create table petshop(
     id bigint auto_increment,
     peso bigint not null,
     especie varchar(30) not null,
     tamanho varchar(20) not null,
     cor varchar(20) not null,
     descricao varchar(50) not null,
     idade bigint, 
     primary key (id)
);


-- Todos os inserts:

insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (35, "Réptil", "médio", "marrom", "pacífico", 12);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (15, "Mamífero", "pequeno", "preto", "pacífico", 60);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (80, "Mamífero", "grande", "marrom", "feroz", 45);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (20, "Réptil", "pequeno", "laranja", "pacífico", 78);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (60, "Mamífero", "médio", "vermelho", "feroz", 56);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (90, "Mamífero", "grande", "marrom", "pacífico", 22);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (80, "Réptil", "grande", "caramelo", "pacífico", 32);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (43, "Réptil", "médio", "marrom", "pacífico", 25);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (35, "Réptil", "pequeno", "cinza", "feroz", 33);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (50, "Mamífero", "médio", "marrom", "pacífico", 72);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (54, "Mamífero", "médio", "azul", "feroz", 14);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (14, "Mamífero", "pequeno", "marrom", "pacífico", 42);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (75, "Réptil", "grande", "marrom", "pacífico", 82);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (45, "Réptil", "médio", "cinza", "pacífico", 52);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (55, "Réptil", "pequeno", "marrom", "feroz", 22);
insert into petshop(peso, especie, tamanho, cor, descricao, idade) values (35, "Réptil", "pequeno", "amarelo", "pacífico", 12);

-- Todos os selects:

select * from petshop where peso > 10;

select * from petshop where peso < 10;

select * from petshop where peso between 10 and 30;

-- Todas as atualizações:

update petshop set peso= 8, tamanho = "pequeno" where id=6;