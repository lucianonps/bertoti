public class cliente {
    private Aluguel aluguel;
    public void setAluguel(Aluguel al){
    aluguel=al; } 

    public void realizarAluguel(){
        aluguel.alugar();
    }
}
