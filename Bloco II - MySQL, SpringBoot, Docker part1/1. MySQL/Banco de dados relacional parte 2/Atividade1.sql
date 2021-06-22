CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
id_classe INT AUTO_INCREMENT,
tipo VARCHAR (20) NOT NULL,
PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagem(
id_personagem INT AUTO_INCREMENT,
nome VARCHAR (20) NOT NULL,
categoria VARCHAR (20),
ataque INT NOT NULL,
defesa INT NOT NULL,
speed INT NOT NULL,
fk_personagem INT,
PRIMARY KEY (id_personagem),
FOREIGN KEY (fk_personagem) REFERENCES tb_classe(id_classe)
);

INSERT INTO tb_classe (tipo) VALUES 
("fire"),
("psychic"),
("fighting"),
("electric"),
("bug"),
("water"),
("fairy");

INSERT INTO tb_personagem (nome, categoria, ataque, defesa, speed, fk_personagem) VALUES
("Abra","Psi",2000,1000,6000,2),
("Charmander","Lizard",4000,3000,4000,1),
("Caterpie","Worm",2000,3000,3000,5),
("Squirtle","Tiny Turtle",3000,4000,3000,6),
("Ninetales","Fox",5000,5000,6000,1),
("Togepi","Spike Ball",2000,4000,2000,7),
("Growlithe","Puppy",5000,3000,4000,1),
("Machop","Superpower",5000,3000,3000,3),
("Pikachu","Mouse",1500,1000,6000,4);

select * from tb_personagem where ataque > 2000;

select * from tb_personagem where ataque > 1000 AND ataque < 2000;

SELECT * FROM tb_personagem where nome like "C%";

SELECT * FROM tb_personagem where nome like "%r%";

SELECT * FROM tb_personagem where nome like "%e";

select * from tb_classe;

select * from tb_personagem;

select nome, categoria, speed "velocidade" from tb_personagem;

select tb_personagem.nome, tb_personagem.categoria, tb_classe.tipo 
from tb_personagem 
INNER JOIN tb_classe
on tb_classe.id_classe = tb_personagem.fk_personagem
order by tb_classe.tipo ASC;

select tb_personagem.nome, tb_personagem.categoria, tb_classe.tipo 
from tb_personagem 
INNER JOIN tb_classe
on tb_classe.id_classe = tb_personagem.fk_personagem
where tb_classe.tipo like "fire" -- como se fosse um "if" by Bia
order by tb_personagem.nome ASC;