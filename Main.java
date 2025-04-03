import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var secreto = new Secreto();
        int palpite;
        String mensagem;

        System.out.println("""
                
                =Bem vindo ao jogo do número aleatório=
                Digite um número e veja se você consegue acertar!
                O número ele fica entre 0 e 100! 
               
                
                Boa sorte ! :)
                """);
        do{
            System.out.println("Digite aqui: ");
            palpite = sc.nextInt();
            mensagem = secreto.verificaSecreto(palpite);
            System.out.println(mensagem);
        }while(!mensagem.startsWith("Parabéns"));
        sc.close();
    }
}





