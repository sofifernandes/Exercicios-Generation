create database db_rh;

use db_rh;
create table Funcionarios(
		id bigint auto_increment,
        nome varchar(50) not null,
        cargo varchar(20) not null,
        telefone bigint(11) not null,
        salario decimal (10,2) not null,
        primary key (id)
);

insert into Funcionarios(nome, cargo, telefone, salario) values ("Marco", "Gerente", 944454445, 5500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Samanta", "Gerente de RH", 963636363, 4100.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Sabrina", "Desenvolvedora Java", 912121212, 5500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Bruno", "Estagiário TI", 989898989, 1500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Mercedes", "Suspervisora TI", 978787878, 3500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Rogério", "Estagiário Marketing", 956565656, 1500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Marta", "Supervisora RH", 947474747, 2500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Carol", "Arquiteta", 923232323, 4500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Daiane", "Analista de BI", 924242424, 5500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Dário", "Gerente de Projetos", 914141414, 8500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Eleonor", "Estagiária BI", 927272727, 1500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Elena", "Supervisora", 957575757, 6500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Carla", "Estagiária", 967676767, 1500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Bárbara", "Gerente", 919191919, 5500.00);
insert into Funcionarios(nome, cargo, telefone, salario) values ("Nina", "Diretora TI", 928282828, 12500.00);


select * from Funcionarios where salario > 2000;

select * from Funcionarios where salario < 2000;

update funcionarios set nome = "Sofia" where id = 5



