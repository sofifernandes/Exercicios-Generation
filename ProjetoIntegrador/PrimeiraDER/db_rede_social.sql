
CREATE DATABASE db_rede_social;

USE db_rede_social;


CREATE TABLE `tb_tema` (
	`id` INT(16) NOT NULL AUTO_INCREMENT,
	`tema` varchar(255) NOT NULL,
	`descricao` varchar(511) NOT NULL,
	`qnt_posts` INT(16) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_usuario` (
	`id` INT(16) NOT NULL AUTO_INCREMENT,
	`nome_completo` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL UNIQUE,
	`senha` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `tb_postagem` (
	`id` INT(16) NOT NULL AUTO_INCREMENT,
	`tipo_postagem` varchar(255) NOT NULL,
	`texto_postagem` varchar(511) NOT NULL,
	`titulo` varchar(255) NOT NULL,
	`data_postagem` DATETIME NOT NULL,
	`qnt_curtidas` INT(16) NOT NULL,
	`id_usuario` INT(16) NOT NULL,
	`id_tema` INT(16) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario`(`id`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`id_tema`) REFERENCES `tb_tema`(`id`);
