package ativididadepo;

public class ObjetoPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa () ;
		Pessoa pessoa2 = new Pessoa ();
		
		pessoa1.setNome ("Tom Cruise");
		pessoa1.setIdade (60) ;
		pessoa1.setEndereço ("California, USA") ;
		pessoa1.setProfissao ("Ator") ;
		pessoa1.setCpf (45916620803l);
		pessoa1.setRg (4564l);
		
		pessoa2. setNome ("Messi") ;
		pessoa2. setIdade (35) ;
		pessoa2. setEndereço ("Miami, USA") ;
		pessoa2.setProfissao ("Jogador de Futebol") ;
		
		System.out.println("-----OBJETO 1-----");
		System. out.println (pessoa1.getNome () );
		System. out.println (pessoa1.getIdade ());
		System. out.println (pessoa1.getEndereço ());
		System. out.println (pessoa1.getProfissao());
		System. out.println (pessoa1.getCpf());
		System. out.println (pessoa1.getRg());
		
		System.out.println("-----OBJETO 2-----");
		System. out.println (pessoa2.getNome ()) ;
		System.out.println (pessoa2.getIdade ());
		System. out.println (pessoa2.getEndereço () );
		System. out.println (pessoa2.getProfissao()) ;
		System. out.println (pessoa2.getCpf()) ;
		System. out.println (pessoa2.getRg()) ;
	}
}