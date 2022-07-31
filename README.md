<div>
<h1>Twitter_clone</h1>

<img align="center" alt="Twitter_clone" height="70" width="70" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/twitter/twitter-original.svg">
 
<img align="center" alt="Twitter_clone" height="70" width="70" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/twitter/twitter-original.svg">
 
<img align="center" alt="Twitter_clone" height="70" width="70" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/twitter/twitter-original.svg">
 
<img align="center" alt="Twitter_clone" height="70" width="70" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/twitter/twitter-original.svg">
 
<img align="center" alt="Twitter_clone" height="70" width="70" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/twitter/twitter-original.svg">
</div>

<h2>Repositório para projeto de clone do Twitter em Java.</h2>

Sistema capaz de armazenar mensagens de texto no formato de um microblog.

1. Requisitos:\n
1.1 Um usuário geral (nome, email e CPF) pode enviar várias mensagens (pruus).
- 1.2 Um usuário administrador (com todos os dados do usuário geral) pode analisar pruus e bloqueá-los.
- 1.2 Cada pruu contém:
- id: atributo inteiro para representar unicamente um determinado pruu.
- Estratégias para gerar o id (ESCOLHER UMA SÓ):
- a- Gerar de forma randômica ao construir um novo objeto pruu. Exemplo: https://www.educative.io/answers/how-to-generate-random-numbers-in-java
- b- Receber o id como parâmetro no construtor, e controlar o valor atual (global) na classe PrincipalPombo;
- c- Representar o valor atual do último id gerado como um atributo estático na classe Pruu
- texto: com no máximo 300 caracteres (considerando espaços) e no mínimo 1 (desconsiderando espaços). Caso o tamanho do texto seja inválido, não deixe criar o
pruu (implemente essa regra na classe PrincipalPombo;
- data de criação (use java.util.Date).
- quantidade de likes.
- uma indicação se ele está bloqueado ou não.
- mostre no toString(): id, texto (caso não bloqueado), quantidade de likes.
- 1.4 Cada usuário pode enviar vários pruus.
- 1.5 Cada usuário pode ver todos os pruus de:
- qualquer usuário (mostrar todos pruus).
- um usuário selecionado (pruus apenas desse usuário).
- 1.6 Ao listar os pruus, o sistema deve permitir que o usuário atual dê like.

2. Desenvolva:
- 2.1 as classes de entidades para modelar adequadamente o problema proposto (no pacote entidade).
- 2.2 uma classe PrincipalPombo (no pacote principal) e implemente no método main() as seguintes operações:
- cadastrar usuários (pelo menos 3, sendo um deles administrador).
- cada usuário deve enviar pelo menos 2 pruus.
- mostrar todos os pruus de todos os usuários.
- mostrar todos os pruus de um determinado usuário.
- dar like em um determinado pruu.
- administrador bloquear um determinado pruu.
- visualizar o pruu bloqueado (com usuário comum).
- dica: crie um método estático na classe PrincipalPombo para cada item solicitado e chame todos eles no main()

3. Entrega:
- enviar o link do projeto versionado no git para vilmarcesarpereira@gmail.com
- assunto [POO-Entra21 2022] NomeAluno1_NomeAluno2
- prazo: entregar até 31/07/2022 23:59
