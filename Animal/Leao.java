package Animal;

public class Leao  extends Animais{
	  
	
	public Leao (String nome,String sexo, String raça) {
	    super (nome, sexo, raça);
	}
	   @Override
	   public void dormir() {
		   System.out.println("O leao dormi");
	   }
	   @Override
	   public void caminhar () {
		   System.out.println("O leao caminha");
	   }
	   @Override
	   public void correr () {
		   System.out.println("O leao corre");
	   }
	   @Override
	   public void emitirsom () {
		   System.out.println("O leao ruge");
	   }
}


