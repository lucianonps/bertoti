import java.util.LinkedList;


public class UTI {
   private double pressao; 
   private double batimento;
   private double oxigenacao;
   
   private LinkedList<observer>observerr = new LinkedList<observer>();


    public void subcri(observer obs){
    observerr.add(obs);

    }
   
   public void notobserve(){
    for(observer observer: observerr){

        observer.update(pressao,batimento,oxigenacao);
    }

   }


}
