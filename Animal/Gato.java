package Animal;

public class Gato  extends Animais{
	  
	
	public Gato (String nome,String sexo, String raça) {
	    super (nome, sexo, raça);
	}
	   @Override
	   public void dormir() {
		   System.out.println("O Gato dormi");
	   }
	   @Override
	   public void caminhar () {
		   System.out.println("O Gato caminha");
	   }
	   @Override
	   public void correr () {
		   System.out.println("O Gato corre");
	   }
	   @Override
	   public void emitirsom () {
		   System.out.println("O Gato mia");
	   }
}



