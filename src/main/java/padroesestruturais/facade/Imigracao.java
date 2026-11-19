package padroesestruturais.facade;

public class Imigracao extends Controle {

    private static Imigracao imigracao = new Imigracao();

    private Imigracao() {};

    public static Imigracao getInstancia() {
        return imigracao;
    }

}
