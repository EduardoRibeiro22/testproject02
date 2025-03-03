package entities;

public class Student {
	
	private String nome;
	private String eMail;
	
	
	public Student(String nome, String eMail) {
		this.nome = nome;
		this.eMail = eMail;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String toString () {
		return nome + "," + eMail;
	}
}
