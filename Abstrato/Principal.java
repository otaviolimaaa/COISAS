package Abstrato;

public class Principal {
	public static void main(String[] args) {
		Carro ferrari = new Carro ("0000","Ferrari","Vermelho,",2023);
		ferrari.ligar();
		ferrari.acelerar ();
		ferrari.virar ();
		ferrari.frear();
		
		System.out.println("------------------------");
		
		Onibus marcopolo = new Onibus ("1111","xb1","prata",2020);
	    marcopolo.ligar ();
	    marcopolo.acelerar ();
	    marcopolo.virar ();
	    marcopolo.frear ();
	    
	    System.out.println("------------------");
	   
	    Hb20 hyunday = new Hb20 ("5555","Hb20","preto,",2023);
	    hyunday .ligar();
	    hyunday .acelerar ();
	    hyunday .virar ();
	    hyunday .frear();
	
		System.out.println("---------------------");
	
		Moto bis = new Moto ("333","Moto","branco",2023);
		bis.ligar();
		bis.acelerar ();
		bis.virar ();
		bis.frear();
	}
}
