package ende;

/**
*
*/
public class Jugador{
  
	/**
    * Escoge piedra, papel o tijera al azar
    */
	
	int exitos;      // nÃºmero de partidas ganadas
	int winTotal;
	   
   public String opcionAlAzar()
   {
       String opcion="";
       Integer c = (int)(Math.random()*3);
       switch(c){
           case 0:
           	opcion=("piedra");
               break;
           case 1:
           	opcion=("papel");
               break;
           case 2:
           	opcion=("tijeras");
       }
       return opcion;
   }
   
   public String opcionAlAzar() {
		// TODO Apéndice de método generado automáticamente
	}
	public void setExitos() 
   {
       exitos++;
   }
   public int geteExitos() 
   {
       return(exitos);
   }
   
   
}
