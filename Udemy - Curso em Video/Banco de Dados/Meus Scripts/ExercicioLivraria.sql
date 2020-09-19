/* Resolvendo o exercício */ 

/*criando a tabela livros*/

create table livros
(
    livro varchar(100),
    autor varchar(100),
    sexo char(1),
    paginas int(5),
    editora varchar(30),
    valor float(10,2),
    uf char(2),
    ano int(4)
);

/* VERIFICANDO OS BANCOS */

/*  show databases;  */

/* CONECTANDO A UM BANCO */

USE LIVRARIA;

/* Inserindo as informações no banco */

INSERT INTO LIVROS VALUES('Cavaleiro Real','Ana Claudia','F',465,'Atlas',49.9,'RJ',2009);
INSERT INTO LIVROS VALUES('SQL para leigos','João Nunes','M',450,'Addison',98,'SP',2018);
INSERT INTO LIVROS VALUES('Receitas Caseiras','Celia Tavares','F',210,'Atlas',45,'RJ',2008);
INSERT INTO LIVROS VALUES('Pessoas Efetivas','Eduardo Santos','M',390,'Beta',78,'RJ',2018);
INSERT INTO LIVROS VALUES('Habitos Saudáveis','Eduardo Santos','M',630,'Beta',150,'RJ',2019);
INSERT INTO LIVROS VALUES('A Casa Marrom','Hermes Macedo','M',250,'Bubba',60,'MG',2016);
INSERT INTO LIVROS VALUES('Estacio Querido','Geraldo Francisco','M',310,'Insignia',100,'ES',2015);
INSERT INTO LIVROS VALUES('Pra sempre amigas','Leda Silva','F',510,'Insignia',78,'ES',2011);
INSERT INTO LIVROS VALUES('Copas Inesqueciveis','Marco Alcantara','M',200,'Larson',130,'RS',2018);
INSERT INTO LIVROS VALUES('O poder da mente','Clara Mafra','F',120,'Continental',56,'SP',2017);


/* 1. Mostrar todos os dados do banco */

select livro, autor, sexo, paginas, editora, valor, uf, ano 
from livros;


/* 2. Mostrar o nome do livro e o nome da editora */

select livro, editora
from livros;

/* 3. Mostrar o nome do livro e a UF dos livros publicados por autores do sexo masculino.*/

select livro, uf
from livros
where sexo = 'm';


/* 4. Mostrar o nome do livro e o número de páginas dos livros publicados por autores do sexo feminino.*/

select livro, paginas
from livros
where  sexo = 'f';


/* 5. Mostrar os valores dos livros das editoras de São Paulo. */

select livro, valor, uf
from livros
where uf = 'sp';


/* 6. Mostrar os dados dos autores do sexo masculino que tiveram livros publicados por São Paulo ou Rio de Janeiro (Questão Desafio). */
/* Usando tabela verdade, operadores lógicos */

select autor, sexo, uf
from livros
where sexo = 'm' and (uf = 'sp' or uf = 'rj');
