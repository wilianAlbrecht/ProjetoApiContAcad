
INSERT INTO disciplina (codigo, ementa, nome) VALUES (1, 'ementa', 'geografia')

INSERT INTO professor (codigo, disciplina_codigo, data_nascimento, cargo, nome, nome_usuario, senha) VALUES (1, 1, '1975-05-25', 'professor' ,'rodrigo', 'rodrigo', '123')

INSERT INTO turma (codigo, professor_codigo, capacidade) VALUES (1, 1, 5)

INSERT INTO aluno (codigo, turma_codigo, periodo, data_nascimento, nome, nome_usuario, senha) VALUES(1, 1, 1,'1999-12-27', 'wilian', 'wilian', '123')
INSERT INTO aluno (codigo, turma_codigo, periodo, data_nascimento, nome, nome_usuario, senha) VALUES (2, 1, 1,'1998-09-05', 'maria', 'maria', '123')
INSERT INTO aluno (codigo, turma_codigo, periodo, data_nascimento, nome, nome_usuario, senha) VALUES (3, 1, 1,'1988-11-08', 'paulo', 'paulo', '123')


INSERT INTO trabalho (codigo, disciplina_codigo, descricao) VALUES (0, 1,'trabalho de geografia')

INSERT INTO rendimento_escolar (codigo, media_geral, media_trabalhos, prova1, prova2, turma_codigo, aluno_codigo)  VALUES (0, 10, 10, 10, 10, 1 , 1)
INSERT INTO rendimento_escolar (codigo, media_geral, media_trabalhos, prova1, prova2, turma_codigo, aluno_codigo) VALUES (1, 8, 10, 5.0, 5, 1 , 2)
INSERT INTO rendimento_escolar (codigo, media_geral, media_trabalhos, prova1, prova2, turma_codigo, aluno_codigo) VALUES (2, 6, 7.5, 5.0, 5, 1 , 3)

INSERT INTO trabalho_nota (codigo, aluno_codigo, RENDIMENTO_ESCOLAR_CODIGO, NOTA_ALUNO, TRABALHO_CODIGO ) VALUES (0, 1, 0, 10, 0)
INSERT INTO trabalho_nota (codigo, aluno_codigo, RENDIMENTO_ESCOLAR_CODIGO, NOTA_ALUNO, TRABALHO_CODIGO ) VALUES (1, 2, 1, 7, 0)
INSERT INTO trabalho_nota (codigo, aluno_codigo, RENDIMENTO_ESCOLAR_CODIGO, NOTA_ALUNO, TRABALHO_CODIGO ) VALUES (2, 3, 2, 6, 0)

INSERT INTO TRABALHOS_NOTA_POR_RENDIMENTO (codigo, RENDIMENTO_ESCOLAR_CODIGO, TRABALHOS_NOTA_POR_RENDIMENTO_CODIGO ) VALUES (0, 0, 0)
INSERT INTO TRABALHOS_NOTA_POR_RENDIMENTO (codigo, RENDIMENTO_ESCOLAR_CODIGO, TRABALHOS_NOTA_POR_RENDIMENTO_CODIGO ) VALUES (1, 1, 1)
INSERT INTO TRABALHOS_NOTA_POR_RENDIMENTO (codigo, RENDIMENTO_ESCOLAR_CODIGO, TRABALHOS_NOTA_POR_RENDIMENTO_CODIGO ) VALUES (2, 2, 2)