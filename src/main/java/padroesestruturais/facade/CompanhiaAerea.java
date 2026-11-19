package padroesestruturais.facade;

public class CompanhiaAerea extends Controle {

    private static CompanhiaAerea companhiaAerea = new CompanhiaAerea();

    private CompanhiaAerea() {};

    public static CompanhiaAerea getInstancia() {
        return companhiaAerea;
    }
}
