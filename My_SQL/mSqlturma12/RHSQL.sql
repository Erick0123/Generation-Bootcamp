create database db_RH;
use db_RH;

create table tb_Funcionarios(
id bigint(5) auto_increment,
nome varchar(30) not null,
genero enum ('M','F','Outros'),
salario double,
cargo varchar(50),
ativo boolean,
primary key (id)
);
	
	INSERT INTO tb_Funcionarios(nome, genero, salario, cargo, ativo)VALUES	("Erick Alan",'M', 3000.00, "Dev.Junior", true);
    INSERT INTO tb_Funcionarios(nome, genero, salario, cargo, ativo)VALUES	("Alanis Mayra",'F', 4500.00, "Fotografa", true);
    INSERT INTO tb_Funcionarios(nome, genero, salario, cargo, ativo)VALUES	("Fabiane Moura",'F', 2100.00, "Costureira Chefe", false);
    INSERT INTO tb_Funcionarios(nome, genero, salario, cargo, ativo)VALUES	("Maria",'F', 1200.00, "costureira", true);
    INSERT INTO tb_Funcionarios(nome, genero, salario, cargo, ativo)VALUES	("Luzia",'F', 1200.00, "costureira", true);
	INSERT INTO tb_Funcionarios(nome, genero, salario, cargo, ativo)VALUES	("Lucas",'Outros', 8000.00, "Dev.Junior", true);
    
  
     select*from tb_Funcionarios;
     select*from tb_Funcionarios where salario>=2000;
     select*from tb_Funcionarios where salario<2000;
     
     update tb_Funcionarios set salario=2000 where id=3;

  
    