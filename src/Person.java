import java.util.ArrayList;

public class Person {
	private int identifiant;
	private static String nomComplet;
	private static String phone;
	private static String email;
	

	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public static String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public static String getNumeroTelephone() {
		return phone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		this.phone = numeroTelephone;
	}
	public static String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Person () {

	}
	
	
	@Override
	public String toString() {
		return "Identifiant :"+ identifiant + "\n Nom Complet :"+ nomComplet + "\n Numero de telephone :" + phone +"\n Email :"+ email;
	}
	
}
