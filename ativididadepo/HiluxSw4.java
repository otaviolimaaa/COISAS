package ativididadepo;

public class HiluxSw4 {
	public static void main(String[] args) {
		Carro carro1 = new Carro () ;
		Carro carro2 = new Carro ();
		Carro carro3 = new Carro ();
		Carro carro4 = new Carro ();
		
		carro1.setModelo ("Sw4");
		carro1.setCor ("preto") ;
		carro1.setPassageiros (7) ;
		carro1.setMarca ("Hilux") ;
		
		carro2. setModelo ("Uno") ;
		carro2. setCor("Preto") ;
		carro2. setPassageiros (4) ;
		carro2.setMarca("Fiat") ;
		
		carro3.setModelo ("Punto");
		carro3.setCor ("preto") ;
		carro3.setPassageiros (4) ;
		carro3.setMarca ("Fiat") ;
		
		carro4. setModelo ("Hb20") ;
		carro4. setCor("Preto") ;
		carro4. setPassageiros (4) ;
		carro4.setMarca("Hiunday") ;
		
		System.out.println("-----OBJETO 1-----");
		System. out.println (carro1.getModelo () );
		System. out.println (carro1.getCor ());
		System. out.println (carro1.getPassageiros ());
		System. out.println (carro1.getMarca());
		
		System.out.println("-----OBJETO 2-----");
		System. out.println (carro2.getModelo ()) ;
		System.out.println (carro2.getCor ());
		System. out.println (carro2.getPassageiros () );
		System. out.println (carro2.getMarca()) ;
		

		System.out.println("-----OBJETO 3-----");
		System. out.println (carro3.getModelo ()) ;
		System.out.println (carro3.getCor ());
		System. out.println (carro3.getPassageiros () );
		System. out.println (carro3.getMarca()) ;
		

		System.out.println("-----OBJETO 4-----");
		System. out.println (carro4.getModelo ()) ;
		System.out.println (carro4.getCor ());
		System. out.println (carro4.getPassageiros () );
		System. out.println (carro4.getMarca()) ;
		
		
	}
}


