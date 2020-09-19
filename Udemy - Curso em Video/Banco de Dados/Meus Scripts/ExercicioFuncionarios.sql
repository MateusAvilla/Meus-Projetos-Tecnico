create table funcionarios
(
	idFuncionario integer,
	nome varchar(100),
	email varchar(200),
	sexo varchar(10),
	departamento varchar(100),
	admissao varchar(10),
	salario integer,
	cargo varchar(100),
	idRegiao int
);


/*Contando quantos registros tem na tabela*/

select count(*) from funcionarios;

/* Traga funcionarios que trabalhem no departamento de filmes OU no departamento
de roupas */

/* Como tem 53 funcionarios no dep. de Roupas e 21 no dep. de Filmes, 
no comando colocamos primeiro para verificar o dep de roupas por conter mais registros, pois o OR so vai verificar 
a segunda opcao se a primeira nao for verdadeira. */

select * from funcionarios
where departamento =  'Roupas'
or
departamento = 'Filmes';


--O gestor de marketing pediu a lista das funcionarias (AS) = FEMININO que trabalhem no departamento 
--de filmes ou no departamento lar. Ele necessita enviar um email para as colaboradoras
--desses dois setores. OR +  AND * 

/*contando quantos funcionarios tem por sexo (agrupando) */

select count(*), sexo
from funcionarios
group by sexo; 

-- 491 Feminino
-- 484 Masculino

/*Contando quantos funcionarios por departamento*/

select count(*), departamento
from funcionarios
group by departamento; 

-- 52/Lar
-- 21/Filmes

/*Trazendo os dados das funcionarias que trabalham no dep. Lar e filmes*/

select * from funcionarios
where (departamento = 'Lar' and sexo = 'Feminino')
or (departamento = 'Filmes' and sexo = 'Feminino');

/*Trazendo os funcionarios do sexo masculino ou que trabalhem no setor Jardim*/

select * from funcionarios
where sexo = 'Masculino'
or departamento = 'Jardim';





/* Filtrando valores nulos */

select nome, sexo, endereco
from cliente
where email is null; /* Considerando que o email É nulo */

/* Trasendo todo mundo que NÃO É nulo */

select nome, sexo, endereco
from cliente
where email is not null;

/* IS ou IS NOT null */