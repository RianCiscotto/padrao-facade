package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassageiroTest {

    @Test
    void deveRetornarPendenciaImigracaoEmbarque() {
        Passageiro passageiro = new Passageiro();
        Imigracao.getInstancia().addPassageiroPendente(passageiro);

        assertEquals(false, passageiro.embarcar());
    }

    @Test
    void deveRetornarPendenciaAlfandegaEmbarque() {
        Passageiro passageiro = new Passageiro();
        Alfandega.getInstancia().addPassageiroPendente(passageiro);

        assertEquals(false, passageiro.embarcar());
    }

    @Test
    void deveRetornarPendenciaCompanhiaAereaEmbarque() {
        Passageiro passageiro = new Passageiro();
        CompanhiaAerea.getInstancia().addPassageiroPendente(passageiro);

        assertEquals(false, passageiro.embarcar());
    }

    @Test
    void deveRetornarPassageiroSemPendenciaEmbarque() {
        Passageiro passageiro = new Passageiro();

        assertEquals(true, passageiro.embarcar());
    }

}
