INSERT INTO tab_motorista(nome, cpf, cnh, tipo_cnh, matricula) VALUES ('Calos Ferreira', 03664585214, 02556485214, 'A', 012);
INSERT INTO tab_motorista(nome, cpf, cnh, tipo_cnh, matricula) VALUES ('Felipe Mota', 36445891245, 78954163521, 'B', 123);
INSERT INTO tab_motorista(nome, cpf, cnh, tipo_cnh, matricula) VALUES ('Amanda Rodrigues', 41257896548, 44561233857, 'B', 124);
INSERT INTO tab_motorista(nome, cpf, cnh, tipo_cnh, matricula) VALUES ('Lorena Passos', 56489754825, 745896254821, 'A', 125);

INSERT INTO tab_veiculo(marca, modelo, ano, placa, chassi, estado_atual) VALUES ('Ford', 'KA', 2020, '568UXI', '7S785T888EE', 'OPERANTE');
INSERT INTO tab_veiculo(marca, modelo, ano, placa, chassi, estado_atual) VALUES ('Ford', 'Maverick', 2021, '785FAW', '69E85D445WD', 'OPERANTE');
INSERT INTO tab_veiculo(marca, modelo, ano, placa, chassi, estado_atual) VALUES ('Volkswagen', 'GOL', 2020, '568UXI', '4C78S7328DA', 'INOPERANTE');
INSERT INTO tab_veiculo(marca, modelo, ano, placa, chassi, estado_atual) VALUES ('Nissan', 'Fiesta', 2019, '384BAE', '3K79Q8632HE', 'OPERANTE');


INSERT INTO tab_viagens(motorista_id, veiculo_id, horario_saida, horario_chegada, hodometro_saida, hodometro_chegada, destino, solicitante) VALUES (1, 3, '09:25:36', '10:14:45', 14, 15, 'Cidade Nova 6', 'gerente');
INSERT INTO tab_viagens(motorista_id, veiculo_id, horario_saida, horario_chegada, hodometro_saida, hodometro_chegada, destino, solicitante) VALUES (2, 2, '09:45:36', '11:39:15', 16, 18, 'Icuí', 'gerente');


