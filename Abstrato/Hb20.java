package Abstrato;

public class Hb20 extends Veiculos {

	
		public Hb20 (String placa,String modelo, String cor, int ano ) {
		    super (placa, modelo, cor, ano);
		}
		   @Override
		   public void acelerar() {
			   System.out.println("O hb20 esta acelerando");
		   }
		   @Override
		   public void frear () {
			   System.out.println("O hb20 esta freando");
		   }
		   @Override
		   public void virar () {
			   System.out.println("O hb20 esta virando");
		   }
		   @Override
		   public void ligar () {
			   System.out.println("O hb20 esta ligando");
		   }
	}