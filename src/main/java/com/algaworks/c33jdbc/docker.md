# Docker: Alternativa para qualquer sistema operacional
Docker é uma plataforma para desenvolver e rodar aplicações isoladas em containers de forma muito simples e rápida.

Se você já usa Docker, esta é a forma mais simples de ter o MySQL Server instalado e executando na sua máquina.

Abra o terminal e digite o comando abaixo para criar um novo container do servidor de banco de dados na porta 3306 e sem nenhuma senha para o usuário root:

```sh 
$ docker container run -d --publish 3306:3306 \
--env MYSQL_ALLOW_EMPTY_PASSWORD=yes --name mysql8 mysql:8.0
```

Quando quiser parar o container, execute:
```sh 
$ docker container stop mysql8
```

Para colocá-lo rodando novamente, execute:
```sh 
$ docker container start mysql8
```