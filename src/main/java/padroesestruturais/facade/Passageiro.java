package padroesestruturais.facade;

public class Passageiro {

    public boolean embarcar() {
        return PassageiroFacade.verificarPendenciasEmbarque(this);
    }
}
