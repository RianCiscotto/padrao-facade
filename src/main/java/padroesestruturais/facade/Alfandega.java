package padroesestruturais.facade;

public class Alfandega extends Controle {

    private static Alfandega alfandega = new Alfandega();

    private Alfandega() {};

    public static Alfandega getInstancia() {
        return alfandega;
    }
}
