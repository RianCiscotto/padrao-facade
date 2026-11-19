package padroesestruturais.facade;

public class PassageiroFacade {

    public static boolean verificarPendenciasEmbarque(Passageiro passageiro) {
        if (Imigracao.getInstancia().verificarPassageiroComPendencia(passageiro)) {
            return false;
        }
        if (Alfandega.getInstancia().verificarPassageiroComPendencia(passageiro)) {
            return false;
        }
        if (CompanhiaAerea.getInstancia().verificarPassageiroComPendencia(passageiro)) {
            return false;
        }
        return true;
    }
}
