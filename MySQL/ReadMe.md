## Os scripts da estrutura do banco de dados estão disponiveis na pasta "Structure"

Para que o sistema funcione corretamente, primeiro crie o database com o nome "market"
```
CREATE DATABASE  IF NOT EXISTS `market` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `market`;
```

voce também terá que preencher tabelas:

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

