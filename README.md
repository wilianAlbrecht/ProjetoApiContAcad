# ProjetoApiContAcad
Projeto API para um sistema escolar.<br>

Essa API simula um sistema escolar, que na qual pode ser acessado pelo o professor e pelo aluno. O professor pode lançar trabalho e notas dos trabalhos já existentes, os alunos podem pesquisar por suas notas ou ver o histório escolar.<br>
<br>
Em todas as ações ma API é necessario autenticar o usuario, assando pelo Json o nome de usuario e a senha.<br>
<br>
{</br>
	"nomeUsuario" : "wilian",<br>
	"senha" : "123"<br>
}<br>
<br>
<br>
Para o aluno pesquisar o seu historio escolar, é necessario informar apenas o nome de usuario e senha. <br>
Exemplo:<br>
GET: aluno/buscar-trabalho<br>
<br>
{<br>
	"nomeUsuario" : "wilian",<br>
	"senha" : "123"<br>
}<br>
<br>
Para buscar pelo o historio escolar funciona da mesma forma, é necessario apenas o Json com nome e senha.<br>
Exemplo:<br>
GET: aluno/buscar-historico<br>
<br>
{<br>
	"nomeUsuario" : "wilian",<br>
	"senha" : "123"<br>
}<br>
<br>
<br>
Agora para o professor lançar um trabalho é necessario mais informações como nome da disciplina e descrição.<br>
Exemplo:<br>
PUT: professor/lancar-trabalho<br>
<br>
{<br>
	"nomeUsuario" : "rodrigo",<br>
	"senha" : "123",<br>
	"disciplina" : "geografia",<br>
	"trabalho" : {<br>
		"descricao" : "Trabalho sobre biomas"<br>
	}<br>
}<br>
<br>
E para lançar notas dos trabalhos é necessario o nome de usuario do aluno e a descrição do trabalho.<br>
Exemplo:<br>
PUT: professor/lancar-nota-trabalho<br>
<br>
{<br>
	"nomeUsuario" : "rodrigo",<br>
	"senha" : "123",<br>
	"nomeAluno" : "wilian",<br>
	"descricao" : "Trabalho sobre biomas",<br>
	"notaAluno" : "6.6"<br>
}<br>

