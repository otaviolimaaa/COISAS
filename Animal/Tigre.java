package Animal;

public class Tigre extends Animais{
	  
	
	public Tigre (String nome,String sexo, String raça) {
	    super (nome, sexo, raça);
	}
	   @Override
	   public void dormir() {
		   System.out.println("O tigre dormi");
	   }
	   @Override
	   public void caminhar () {
		   System.out.println("O tigre caminha");
	   }
	   @Override
	   public void correr () {
		   System.out.println("O tigre corre");
	   }
	   @Override
	   public void emitirsom () {
		   System.out.println("O tigre ruge");
	   }
}

