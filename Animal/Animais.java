package Animal;

public abstract class Animais {
	
	    private String nome;
		private String sexo;
		private String raça;
	
		
		public Animais(String nome,String sexo,String raça) {
			this.nome = nome;
			this.sexo = sexo;
			this.raça = raça;
			
			}
	        //Gerar Getter e Setters
	      
		public abstract void dormir ();
		public abstract void caminhar ();
		public abstract void correr ();
		public abstract void emitirsom ();
		
	}


