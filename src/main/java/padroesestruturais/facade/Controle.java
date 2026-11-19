package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Controle {

    private List<Passageiro> passageirosComPendencia = new ArrayList<Passageiro>();

    public void addPassageiroPendente(Passageiro passageiro) {
        this.passageirosComPendencia.add(passageiro);
    }

    public boolean verificarPassageiroComPendencia(Passageiro passageiro) {
        return this.passageirosComPendencia.contains(passageiro);
    }

}
