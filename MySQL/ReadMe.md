## Para criar o banco de dadosm seiga as instruções em ordem:

primeiramente voce precisara do MySQL Worckbanch,

disponivel em: https://dev.mysql.com/downloads/file/?id=506568

Apos o dowload, crie uma localinstace, entre no ambiente e siga os passos:

![image](https://user-images.githubusercontent.com/50975425/131742377-76f63812-97f4-4047-90a3-9740524175b9.png)

Passo 1- Para que o sistema funcione corretamente, primeiro crie o database com o nome "market"

Para isso, inicie uma Query e coloque o seguinte comando:
```
CREATE DATABASE  IF NOT EXISTS `market` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `market`;
```

ou voce pode também clica com o botão direito no mouse e ir em na opção create schema

![image](https://user-images.githubusercontent.com/50975425/131745163-7495305c-8699-4742-b41b-e90558cb7e16.png)
![image](https://user-images.githubusercontent.com/50975425/131745226-e09f0530-0a36-411b-830e-a7553b9c9d65.png)

Passo 2- faça o dowload do projeto e vá em server/data import dentro do MySQL Workbanch:
![image](https://user-images.githubusercontent.com/50975425/131742004-6e608d9a-fd22-4431-bcfa-d2fccf5b3e3d.png)

Passo 3- Selecione a opção Import from Dump project folder e vá até o diretório de dowload do projeto que voce realizou no passo anterior e selecione o diretório Struture, dentro do Diretório MySQL
![image](https://user-images.githubusercontent.com/50975425/131743255-83aaa249-a11c-40df-888b-2178a217adfc.png)

Passo 4- Agora clique na opção Dump only structure
![image](https://user-images.githubusercontent.com/50975425/131743371-27f00a27-a0d6-4c89-8d9c-ee59a45e0ece.png)

Clique em start Import e se o banco de dados com o nome "market" foi criado no passo 1, certamente funcionará


Passo 5- Você também terá que preencher tabelas:

statusorder:
```
INSERT INTO statusorder (idStatusOrder, description) VALUES ('0', 'Ativo');
INSERT INTO statusorder (idStatusOrder, description) VALUES ('1', 'Finalizado');
INSERT INTO statusorder (idStatusOrder, description) VALUES ('2', 'Cancelado');
```

employeestatus:
```
INSERT INTO employeestatus (idEmployeeStatus, description) VALUES ('0', 'Empregado');
INSERT INTO employeestatus (idEmployeeStatus, description) VALUES ('1', 'Desempregado');
```

hierarchicaltype:
```
INSERT INTO hierarchicaltype (idhierarchicalType, description) VALUES ('0', 'Matriz');
INSERT INTO hierarchicaltype (idhierarchicalType, description) VALUES ('1', 'Filial');
```
por ultimo, 
