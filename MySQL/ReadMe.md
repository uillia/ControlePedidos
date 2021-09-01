## Para criar o banco de dados, siga as instruções em ordem:

primeiramente voce precisara do Community server e MySQL Worckbanch,
Disponível em: https://dev.mysql.com/get/Downloads/MySQLInstaller/mysql-installer-community-8.0.26.0.msi

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

Passo 3- Selecione a opção Import from Dump project folder e vá até o diretório de dowload do projeto que voce realizou no passo anterior e selecione o diretório Structure, dentro do Diretório MySQL
![image](https://user-images.githubusercontent.com/50975425/131743255-83aaa249-a11c-40df-888b-2178a217adfc.png)

Passo 4- Agora clique na opção Dump only structure
![image](https://user-images.githubusercontent.com/50975425/131743371-27f00a27-a0d6-4c89-8d9c-ee59a45e0ece.png)

Clique em start Import e se o banco de dados com o nome "market" foi criado no passo 1, certamente funcionará


Passo 5- Você também terá que preencher tabelas, 
para isso crie uma Query:

![image](https://user-images.githubusercontent.com/50975425/131745968-19f68270-5090-47bc-a28b-6fdcf79d12c5.png)

agora copie e cole na Query os códigos abaixo :

```
use market;
INSERT INTO statusorder (idStatusOrder, description) VALUES ('0', 'Ativo');
INSERT INTO statusorder (idStatusOrder, description) VALUES ('1', 'Finalizado');
INSERT INTO statusorder (idStatusOrder, description) VALUES ('2', 'Cancelado');
INSERT INTO employeestatus (idEmployeeStatus, description) VALUES ('0', 'Empregado');
INSERT INTO employeestatus (idEmployeeStatus, description) VALUES ('1', 'Desempregado');
INSERT INTO hierarchicaltype (idhierarchicalType, description) VALUES ('0', 'Matriz');
INSERT INTO hierarchicaltype (idhierarchicalType, description) VALUES ('1', 'Filial');
```
agora, selecione tudo e clique no icone de executar: 

![image](https://user-images.githubusercontent.com/50975425/131746344-1a5195ce-6694-45d9-a791-984bae579521.png)

Para que o sistema se comunique com o my sql, será necessario fazer algumas alterções no projeto

Dentro do netbeans, adicione o driver JDBC que está na pasta de instalção do MySQL:
![image](https://user-images.githubusercontent.com/50975425/131748812-fd2f8dcd-5c6a-4b2d-a945-f5c0a82b65b1.png)

Nas propriedades, Vá em Bibliotecas e clique em Adicionar JAR/Pasta
![image](https://user-images.githubusercontent.com/50975425/131749028-98e71c05-3860-4a5f-a755-5168bfeda9ea.png)

copie e cole o seguinte caminho em "Nome do Arquivo":

```
C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-java-8.0.26.jar
```

![image](https://user-images.githubusercontent.com/50975425/131749371-37ec6a60-df3e-4bcf-bb46-630256655509.png)



por ultimo, edite o arquivo MySqlConnection , que esta em scr/main/repository, colocando o usuário na varivel user e a senha em password
![image](https://user-images.githubusercontent.com/50975425/131748446-ee46f710-53c6-4d6d-afe8-f8be66406b10.png)

