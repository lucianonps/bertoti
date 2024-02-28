public class cliente {
    private Emprestimo emprestimo;
    public void setEmprestimo(Emprestimo emp){
    emprestimo=emp; } 

    public void fazerEmprestimo(){
        emprestimo.emprestar();
    }
}
