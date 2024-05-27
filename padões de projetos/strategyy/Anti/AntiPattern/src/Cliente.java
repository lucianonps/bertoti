public class Cliente {
    private AluguelPermitido aluguelPermitido;
    private AluguelNegado aluguelNegado;
    private boolean podeAlugar;

    public Cliente(boolean podeAlugar) {
        this.podeAlugar = podeAlugar;
        this.aluguelPermitido = new AluguelPermitido();
        this.aluguelNegado = new AluguelNegado();
    }

    public void realizarAluguel() {
        if (podeAlugar) {
            aluguelPermitido.realizarAluguel();
        } else {
            aluguelNegado.realizarAluguel();
        }
    }

    public void setPodeAlugar(boolean podeAlugar) {
        this.podeAlugar = podeAlugar;
    }
    
}
