package ativididadepo;

public class Usuario {
	int id;
		String nome;
		String usu;
		int senha;
		String permissao;
		String comprar;
		String receber;
		
		public int getid() {
			return id;
		}
		public void setcid (int id) {
			this.id=id;
		}
		public String getnome() {
			return nome;
		}
		public void setnome (String nome ) {
			this.nome = nome;
		}
		public  String getusu () {
			return usu;
		}
		public void setusu (String usu) {
			this.usu= usu;
		}
		public int getsenha () {
			return senha;
		}
		public void setsenha (int senha) {
			this.senha = senha;
		}
			public String getpermissao() {
				return permissao;
			}
			public void setpermissao (String permissao) {
				this.permissao=permissao;
			}
			public String getcomprar () {
				return comprar;
			}
			public void setcomprar (String comprar ) {
				this.comprar = comprar;
			}
			public  String getreceber() {
				return receber;
			}
			public void setreceber (String recebr) {
				this.receber= receber;
			
	}}