create database db_diversos;

-- Criação de tabela:

use db_diversos;

create table Escola(
    Id bigint auto_increment,
    Idade bigint not null,
    Nome varchar(30) not null,
    Matricula bigint not null,
    Turma varchar(20) not null,
    Endereco varchar(100) not null,
    Telefone bigint not null,
    primary key (id)
);

-- Todos os inserts:

insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (19,"Patricia", 2001, "Turma 7A", "Rua A, nº1", 911111111);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (20,"Elena", 2002, "Turma 11A", "Rua B, nº2", 9222222222);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (14,"Pedro", 2003, "Turma 9A", "Rua B, nº6", 955555555);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (13, "Kelen", 2004, "Turma 6A", "Rua A, nº3", 933333333);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (10, "Bernardo", 2005, "Turma 4A", "Rua D, nº1", 911112222);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (12,"Caique", 2006, "Turma 9A", "Rua V, nº1", 912222222);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (11,"Gustavo", 2007, "Turma 5A", "Rua L, nº1", 958585858);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (12,"Igor", 2008, "Turma 9A", "Rua O, nº1", 945454545);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (19,"Mauro", 2009, "Turma 9A", "Rua J, nº7", 985858585);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (20,"Stefanie", 2010, "Turma 11A", "Rua U, nº1", 914141414);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (16,"Rafaela", 2011, "Turma 8A", "Rua K, nº1", 956565656);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (15,"Rafael", 2012, "Turma 7A", "Rua G, nº4", 94343434343);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (13,"Keren", 2013, "Turma 6A", "Rua A, nº16", 916161616);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (14,"Laura", 2014, "Turma 6A", "Rua D, nº15", 915151515);
insert into Escola(idade, nome, matricula, turma, endereco, telefone) values (17,"Leticia", 2015, "Turma 9A", "Rua X, nº1", 911114444);

-- Todos os selects:

select * from Escola where idade > 18;

select * from Escola where idade < 18;

select * from Escola where idade between 20 and 25;

-- Todas as atualizações:

update Escola set nome= "Pedro B" where id=6