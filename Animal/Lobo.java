package Animal;

public class Lobo extends Animais{
	  
	
	public Lobo (String nome,String sexo, String raça) {
	    super (nome, sexo, raça);
	}
	   @Override
	   public void dormir() {
		   System.out.println("O lobo dormi");
	   }
	   @Override
	   public void caminhar () {
		   System.out.println("O lobo caminha");
	   }
	   @Override
	   public void correr () {
		   System.out.println("O lobo corre");
	   }
	   @Override
	   public void emitirsom () {
		   System.out.println("O lobo uiva");
	   }
}

