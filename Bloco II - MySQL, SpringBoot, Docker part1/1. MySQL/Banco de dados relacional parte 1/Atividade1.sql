create database db_RH;

use db_RH;

create table tb_funcionaries (
	id_funcionarios bigint(5) auto_increment,
    nome varchar (20) not null,
    idade int (3),
    funcao varchar (20),
    salario decimal (10,2),
    primary key (id_funcionarios)
);

insert into tb_funcionaries (nome, idade, funcao, salario) VALUES ("Denise", 27, "Desenvolvedor Java", 3500);
insert into tb_funcionaries (nome, idade, funcao, salario) VALUES ("Tainá", 26, "Desenvolvedor Java", 1900);
insert into tb_funcionaries (nome, idade, funcao, salario) VALUES ("Daysi", 26, "Desenvolvedor Java", 2400);
insert into tb_funcionaries (nome, idade, funcao, salario) VALUES ("Agda", 30, "Desenvolvedor Java", 2800);
insert into tb_funcionaries (nome, idade, funcao, salario) VALUES ("Igor", 27, "Desenvolvedor Java", 4000);

select * from tb_funcionaries where salario > 2000;

select * from tb_funcionaries where salario < 2000;

update tb_funcionaries set nome = "Hanna" where id_funcionarios = 3;

select * from tb_funcionaries;
