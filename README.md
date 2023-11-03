# ProjetoApiContAcad
Projeto API para um sistema escolar.<br>

Essa API simula um sistema escolar, que na qual pode ser acessado pelo o professor e pelo aluno. O professor pode lançar trabalho e notas dos trabalhos já existentes, os alunos podem pesquisar por suas notas ou ver o histório escolar.

Em todas as ações ma API é necessario autenticar o usuario, assando pelo Json o nome de usuario e a senha.

{
	"nomeUsuario" : "wilian",
	"senha" : "123"
}


Para o aluno pesquisar o seu historio escolar, é necessario informar apenas o nome de usuario e senha. 
Exemplo:
GET: aluno/buscar-trabalho

{
	"nomeUsuario" : "wilian",
	"senha" : "123"
}

Para buscar pelo o historio escolar funciona da mesma forma, é necessario apenas o Json com nome e senha.
Exemplo:
GET: aluno/buscar-historico

{
	"nomeUsuario" : "wilian",
	"senha" : "123"
}


Agora para o professor lançar um trabalho é necessario mais informações como nome da disciplina e descrição.
Exemplo:
PUT: professor/lancar-trabalho

{
	"nomeUsuario" : "rodrigo",
	"senha" : "123",
	"disciplina" : "geografia",
	"trabalho" : {
		"descricao" : "Trabalho sobre biomas"
	}
}

E para lançar notas dos trabalhos é necessario o nome de usuario do aluno e a descrição do trabalho.
Exemplo:
PUT: professor/lancar-nota-trabalho

{
	"nomeUsuario" : "rodrigo",
	"senha" : "123",
	"nomeAluno" : "wilian",
	"descricao" : "Trabalho sobre biomas",
	"notaAluno" : "6.6"
}

