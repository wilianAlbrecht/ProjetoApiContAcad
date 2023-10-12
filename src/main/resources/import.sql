INSERT INTO disciplina (codigo, ementa, nome) VALUES (1, 'ementa', 'geografia')

INSERT INTO professor (codigo, disciplina_codigo, data_nascimento, cargo, nome, nome_usuario, senha) VALUES (1, 1, '1975-05-25', 'professor' ,'rodrigo', 'rodrigo', '123')

INSERT INTO turma (codigo, professor_codigo, capacidade) VALUES (1, 1, 5)

INSERT INTO aluno (codigo, turma_codigo, periodo, data_nascimento, nome, nome_usuario, senha) VALUES(1, 1, 1,'1999-12-27', 'wilian', 'wilian', '123')
INSERT INTO aluno (codigo, turma_codigo, periodo, data_nascimento, nome, nome_usuario, senha) VALUES (2, 1, 1,'1998-09-05', 'maria', 'maria', '123')
INSERT INTO aluno (codigo, turma_codigo, periodo, data_nascimento, nome, nome_usuario, senha) VALUES (3, 1, 1,'1988-11-08', 'paulo', 'paulo', '123')


INSERT INTO trabalho (codigo, disciplina_codigo, descricao) VALUES (1, 1,'trabalho de geografia')

-- INSERT INTO rendimento_escolar VALUES (1, 1, 5.5, 5.0, 5, 6 , 1)
-- INSERT INTO rendimento_escolar VALUES (2, 2, 10, 5.0, 5, 6 , 1)
-- INSERT INTO rendimento_escolar VALUES (3, 3, 7.5, 5.0, 5, 6 , 1)

-- INSERT INTO trabalho_nota VALUES (1, 1, 1,1)
-- INSERT INTO trabalho_nota VALUES (2, 2, 2,1)
-- INSERT INTO trabalho_nota VALUES (3, 3, 3,1)

-- INSERT INTO RENDIMENTO_ESCOLAR_TRABALHO_NOTA VALUES (1,1)
-- INSERT INTO RENDIMENTO_ESCOLAR_TRABALHO_NOTA VALUES (2,2)
-- INSERT INTO RENDIMENTO_ESCOLAR_TRABALHO_NOTA VALUES (3,3)