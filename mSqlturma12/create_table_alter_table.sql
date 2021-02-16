create table funcionarios (
    id int not null auto_increment primary key,
    nome varchar(30) NOT NULL,
    nascimento date,
    sexo enum('M','F'),
    peso decimal(5,2),
    altura decimal(3,2),
    dia_cadastro TIMESTAMP DEFAULT current_timestamp,
    nacionalidade varchar(20) DEFAULT 'Brasil'
);
    #mostrar id no fim
    
	#comandos DDL (data definition languagem  create    drop    alter    rename)
    #comandos DDL (data definition languagem,     1       ,2,      3         ,4)
    #
    
    describe funcionarios;
    
    alter table funcionarios modify column nome char(255);
    
    alter table funcionarios add column historico varchar (50) after nome;
     alter table funcionarios add column historico varchar (50) first;
     
     rename table funcionarios to colaboradores;
     show tables;
     
     use Fiat;
     show tables
     
     