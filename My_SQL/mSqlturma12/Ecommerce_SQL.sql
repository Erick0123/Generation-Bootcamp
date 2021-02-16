create database db_ecommerce;
use db_ecommerce;

create table tb_produtos(
id bigint(5)auto_increment,
nome varchar (30) not null,
preco double,
marca varchar(30),
esgotado enum('S','N'),
unidade int,
primary key(id)
);


INSERT INTO tb_produtos(nome,preco,marca,esgotado,unidade) VALUES("Chuteira",899.00,"Adidas",'N', 17);
INSERT INTO tb_produtos(nome,preco,marca,esgotado,unidade) VALUES("Tênis",499.00,"Nike",'N', 9);
INSERT INTO tb_produtos(nome,preco,marca,esgotado,unidade) VALUES("Tênis",368.99,"New Balance",'N', 20);
INSERT INTO tb_produtos(nome,preco,marca,esgotado,unidade) VALUES("Air Max",null,"Nike",'S', null);
INSERT INTO tb_produtos(nome,preco,marca,esgotado,unidade) VALUES("Regata",1678.99,"Warriors",'N', 7);
INSERT INTO tb_produtos(nome,preco,marca,esgotado,unidade) VALUES("Camisa de Time",null,"Juventus",'S', null);

select *from tb_produtos;
select *from tb_produtos where preco>=500;
select *from tb_produtos where preco<500;

update tb_produtos set preco=1128.67, esgotado='N', unidade=20 where id=4;
update tb_produtos set preco=70.99, esgotado='N', unidade=18 where id=6