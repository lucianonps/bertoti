public class Dashbord implements observer{

    @Override
    public void update(double pressao, double batimento, double oxigenacao) {
        System.out.println("Pressão: " + pressao + ", Batimento: " + batimento + ", Oxigenação: " + oxigenacao);
    }
    
}
