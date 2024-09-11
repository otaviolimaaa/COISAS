package Animal;

public class Principal {public static void main(String[] args) {
	Lobo lobinho = new Lobo ("Lobito","LObo","M");
	lobinho.dormir();
	lobinho.caminhar ();
	lobinho.correr ();
	lobinho.emitirsom();
	
	System.out.println("------------------------");
	
	Leao leao = new Leao ("Leo","leao","m");
    leao.dormir ();
    leao.caminhar ();
    leao.correr ();
    leao.emitirsom ();
    
    System.out.println("------------------");
   
    Tigre tigui = new Tigre ("Tigui","Tigre","m");
    tigui.dormir();
    tigui.caminhar ();
    tigui.correr ();
    tigui.emitirsom();

	System.out.println("---------------------");

	Cachorro bis = new Cachorro ("bis","Cachorro","m");
	bis.dormir();
	bis.caminhar ();
	bis.correr ();
	bis.emitirsom();
}
}


