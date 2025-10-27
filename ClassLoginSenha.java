import java.util.Scanner;

public class SistemaLogin {

    // Credenciais corretas
    private static final String LOGIN_CORRETO = "java8";
    private static final String SENHA_CORRETA = "java8";
    private static final int MAX_TENTATIVAS = 3;

    // Inicia o processo de autenticação 
    
    public static void main(String[] args) {
        // Objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        boolean acessoConcedido = false;

        System.out.println("---  Bem-vindo ao Sistema de Login ---");

        // Loop 'for' para controlar as 3 tentativas
        for (int tentativa = 1; tentativa <= MAX_TENTATIVAS; tentativa++) {
            System.out.printf("\n--- Tentativa %d de %d ---\n", tentativa, MAX_TENTATIVAS);

            // 1. Solicita Login
            System.out.print(" Digite o login: ");
            String login = scanner.nextLine();

            // 2. Solicita Senha
            System.out.print(" Digite a senha: ");
            String senha = scanner.nextLine();

            // 3. Verifica as credenciais (usando .equals() para comparação de Strings em Java)
            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                System.out.println("\n Acesso concedido! Bem-vindo ao sistema.");
                acessoConcedido = true;
                break; // Sai do loop imediatamente
            } else {
                // Mensagens de erro informativas
                int tentativasRestantes = MAX_TENTATIVAS - tentativa;

                if (!login.equals(LOGIN_CORRETO) && !senha.equals(SENHA_CORRETA)) {
                    System.out.printf("\n Erro: Login e senha incorretos! Você tem mais %d tentativa(s).\n", tentativasRestantes);
                } else if (!login.equals(LOGIN_CORRETO)) {
                    System.out.printf("\n Erro: Login incorreto! Você tem mais %d tentativa(s).\n", tentativasRestantes);
                } else { // Senha incorreta
                    System.out.printf("\n Erro: Senha incorreta! Você tem mais %d tentativa(s).\n", tentativasRestantes);
                }
            }
        }

        // 4. Verifica se o acesso foi negado após todas as tentativas
        if (!acessoConcedido) {
            System.out.printf("\n Limite de %d tentativas excedido.\n", MAX_TENTATIVAS);
            System.out.println(" Sistema bloqueado. Entre em contato com o administrador.");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
