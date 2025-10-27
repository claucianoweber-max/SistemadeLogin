## → Sistema de Login em Java.

Este Classe é uma simples sistema de autenticação em Java, para demonstrar conceitos básicos de entrada de dados, laços de repetição, comparação de strings e controle de tentativas.
O sistema solicita um login e senha ao usuário e permite até três tentativas para o acesso correto.

## → Funcionalidades.

Solicita login e senha ao usuário via console.

Permite três tentativas de acesso antes de bloquear o sistema.

Exibe mensagens informativas sobre erros de autenticação (login incorreto, senha incorreta ou ambos).

Utiliza comparação de strings com .equals(), conforme boas práticas da linguagem Java.

Bloqueia o acesso após o limite de tentativas e orienta o usuário a procurar o administrador.

## → Lógica do Programa.

→ O sistema possui credenciais pré-definidas:
Exemplo abaixo:↓

private static final String LOGIN_CORRETO = "java8";
private static final String SENHA_CORRETA = "java8";

## → O usuário tem até 3 tentativas para acertar as credenciais:
Exemplo abaixo:↓

private static final int MAX_TENTATIVAS = 3;
Em cada tentativa:

## → O sistema solicita o login e a senha.

Verifica se correspondem às credenciais corretas.

Caso estejam erradas, informa o tipo de erro e o número de tentativas restantes.
Se o usuário acerta:↓

O sistema exibe: ↓

→ Acesso concedido! Bem-vindo ao sistema.

## → Se o usuário erra as três vezes:

O programa é encerrado imediatamente.

O sistema mostra:↓

Limite de 3 tentativas excedido.
Sistema bloqueado. Entre em contato com o administrador.

## → Conceitos de Programação Utilizados.

Scanner	Utilizado para capturar a entrada do usuário via teclado.

Constantes (final)	Definem valores fixos para login, senha e número máximo de tentativas.

Estrutura de repetição for	Controla as três tentativas de login.

Condicionais if/else	Verificam a correção das credenciais e exibem mensagens apropriadas.

Comparação de Strings com .equals()	Garante a comparação correta entre textos em Java.

Boas práticas de fechamento de recursos	O objeto Scanner é fechado ao final do programa (scanner.close()).

## → Como Executar

Ter o Java JDK instalado em seu computador.

Salve o arquivo como → SistemaLogin.java.

Compile o código no terminal:

javac SistemaLogin.java


Execute o programa:

java SistemaLogin

## → Requisitos

Java SE 8 ou superior

Editor de texto ou IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)

## → Autor

### Clauciano Weber
Desenvolvido como Atividade prática e conceito de aprendizado do uso do Github, e da lógica e controle de fluxo em Java.
Objetivo1 : Aprender e entender o conceito da utilização correta e apresentação do trabalho desenvolvido.
