package Abstrato;

public class Onibus extends Veiculos {
	public Onibus (String placa,String modelo, String cor, int ano ) {
	    super (placa, modelo, cor, ano);
	}
	   @Override
	   public void acelerar() {
		   System.out.println("O onibus esta acelerando");
	   }
	   @Override
	   public void frear () {
		   System.out.println("O onibus esta freando");
	   }
	   @Override
	   public void virar () {
		   System.out.println("O onibus esta virando");
	   }
	   @Override
	   public void ligar () {
		   System.out.println("O onibus esta ligando");
	   }
	}