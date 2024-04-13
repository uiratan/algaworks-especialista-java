create table venda (
id bigint not null auto_increment,
nome_cliente varchar(60) not null,
valor_total decimal(10,2) not null,
data_pagamento date not null,

primary key (id)
);
