create database db_escola;

use db_escola;

use db_escola;

create table alunos(
	id bigint auto_increment,
    nome varchar(30) not null,
    matricula bigint(11) not null,
    nota bigint not null,
    endereco varchar(100) not null,
    telefone bigint (20) not null,
    primary key (id)
);



insert into alunos(nome, matricula, nota, endereco, telefone) values ("Patricia", 2001, 10, "Rua A, nº1", 911111111);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Elena", 2002, 9, "Rua B, nº2", 9222222222);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Pedro", 2003, 6, "Rua B, nº6", 955555555);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Kelen", 2004, 10, "Rua A, nº3", 933333333);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Bernardo", 2005, 10, "Rua D, nº1", 911112222);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Caique", 2006, 7, "Rua V, nº1", 912222222);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Gustavo", 2007, 3, "Rua L, nº1", 958585858);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Igor", 2008, 2, "Rua O, nº1", 945454545);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Mauro", 2009, 8, "Rua J, nº7", 985858585);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Stefanie", 2010, 9, "Rua U, nº1", 914141414);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Rafaela", 2011, 5, "Rua K, nº1", 956565656);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Rafael", 2012, 8, "Rua G, nº4", 94343434343);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Keren", 2013, 10, "Rua A, nº16", 916161616);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Laura", 2014, 9, "Rua D, nº15", 915151515);
insert into alunos(nome, matricula, nota, endereco, telefone) values ("Leticia", 2015, 10, "Rua X, nº1", 911114444);

select * from alunos where nota > 7;

select * from alunos where nota < 7;

update alunos set nome= "Pedro A" where id=6