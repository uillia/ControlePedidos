## Os scripts da estrutura do banco de dados estão disponiveis na pasta "Structure"

## Para que o sistema funcione corretamente, voce terá que preencher tabelas:

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

