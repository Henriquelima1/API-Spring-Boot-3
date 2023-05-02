create table carros(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    montadora varchar(100) not null,
    placa varchar(7) not null unique,
    tipo varchar(100) not null,
    cor varchar(100) not null,
    cv varchar(100) not null,
    torque varchar(100) not null,
    peso varchar(100) not null,
    origem char(2) not null,
    ano varchar(4) not null,
    estado char(2) not null,

    primary key(id)

);