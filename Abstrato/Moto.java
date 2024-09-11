package Abstrato;

public class Moto extends Veiculos {
	public Moto (String placa,String modelo, String cor, int ano ) {
	    super (placa, modelo, cor, ano);
	}
	   @Override
	   public void acelerar() {
		   System.out.println("A moto esta acelerando");
	   }
	   @Override
	   public void frear () {
		   System.out.println("A moto esta freando");
	   }
	   @Override
	   public void virar () {
		   System.out.println("A moto esta virando");
	   }
	   @Override
	   public void ligar () {
		   System.out.println("A moto esta ligando");
	   }
	}

