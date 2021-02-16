create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id_categoria int not null auto_increment primary key,
tipo varchar(50)
);

insert into tb_categoria(tipo)values
("Pizza Salgada"),
("Pizza Doce"),
("Pizza vegana");

drop table tb_pizza;

create table tb_pizza(
id_pizza bigint not null auto_increment primary key,
sabor varchar(50),
preco double (4,2),
tamanho varchar(50),
id_categoria int,

constraint fk_categoria foreign key (id_categoria) references tb_categoria(id_categoria)

);

insert into tb_pizza(id_categoria, sabor, preco)values
(1,"frango com catupiry",22.00),
(1,"mussarela", 26.00),
(3,"brocolis", 45.00),
(2, "chocolate", 64.00),
(2, "chocolate branco",70.00),
(3, "cenoura", 42.00),
(1,"calabresa",20.00),
(1,"4 queijos",55.00);

select*from tb_pizza where preco>45.00;

select*from tb_pizza;


select* from tb_pizza
inner join tb_categoria
where tb_categoria.id_categoria=tb_pizza.id_categoria;
