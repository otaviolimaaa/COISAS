package Animal;

public class Cachorro extends Animais{
	  
	
	public Cachorro (String nome,String sexo, String raça) {
	    super (nome, sexo, raça);
	}
	   @Override
	   public void dormir() {
		   System.out.println("O cachorro dormi");
	   }
	   @Override
	   public void caminhar () {
		   System.out.println("O cachorro caminha");
	   }
	   @Override
	   public void correr () {
		   System.out.println("O cachorro corre");
	   }
	   @Override
	   public void emitirsom () {
		   System.out.println("O cachorro late");
	   }
}


