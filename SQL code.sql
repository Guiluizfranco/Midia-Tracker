Create Database midias;

Use midias;

Create Table midia (
id int AUTO_INCREMENT PRIMARY KEY,
nome varchar(100),
tipo varchar(100),
genero varchar(100),
ano int, 
status varchar(100),
nota double,
comentario varchar(100)
);
