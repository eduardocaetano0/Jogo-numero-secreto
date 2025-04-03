import java.util.Random;

public class Secreto {
    private int numeroSecreto;
    private int tentativas;

    public Secreto() {
        this.numeroSecreto = geradorDoNumero();
        this.tentativas = 0;
    }

    private int geradorDoNumero() {
        Random numeroSecreto = new Random();
        return numeroSecreto.nextInt(100) + 1;
    }

    public String verificaSecreto(int palpite) {
        tentativas++;
        if (palpite > numeroSecreto) {
            return "O chute foi alto e passou do número secreto!";
        } else if (palpite < numeroSecreto) {
            return "O chute foi baixo e passou do número secreto!";
        } else
            return"Parabéns! Você acertou o número em " + tentativas + " tentativas.";
    }
    public int getTentativas() {
        return tentativas;
    }
}
