package contadoresConInterfaz;

public class ContadorEntero implements Contador {
   protected int valor;
   
   public ContadorEntero(int valor){
       super();
       this.valor = valor;
   }

   public int getValor(){
       return this.valor;
   }
   public void setValor(int valor){
       this.valor = valor;
   }
   public void setValor(){
       
   }
}
