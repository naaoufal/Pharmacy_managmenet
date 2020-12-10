package models;
import java.util.ArrayList;
import java.util.Scanner;

public class Medicament {
	private int id;
	private static String nom;
	private static double prix;
	private static String desc;
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<String> listObj = new ArrayList<String>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public static String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public Medicament(int id, String nom, double prix, String desc) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.desc = desc;
	}
	
	public Medicament() {
	}
	//Ajuoter Nouvel Medicament
	public String AjouterMedi() {
		try {
			Medicament medi = new Medicament();
			
			System.out.println("Enter Medicamenent ID :");
			int mediId = scanner.nextInt();
			medi.setId(mediId);
			
			System.out.println("Enter Nom de Medicamenent :");
			String mediNom = scanner.next();
			medi.setNom(mediNom);
			
			System.out.println("Enter Prix de Medicamenent :");
			double mediPrix = scanner.nextDouble();
			medi.setPrix(mediPrix);
			
			System.out.println("Enter Description du Medicamenent :");
			String mediDesc = scanner.next();
			medi.setDesc(mediDesc);
			
			listObj.add(medi.getId()+" "+medi.getNom()+" "+medi.getPrix()+" "+medi.getDesc());
		} catch (Exception e) {
			return e.getMessage();
		}
		return null;
	}
	
	//Afficher liste des Medicaments
	public String AfficheMedicament() {
		try {
			for(Object i : listObj) {
				System.out.println(i);
			}
		} catch (Exception e) {
			return e.getMessage();
		}
		return null;
	}
	
	//Modification les Medicaments
	public String ModifierMedicament() {
		try {
			System.out.println("Entrer le nombre de Medicament a Modifier");
			int newMedicamentId = scanner.nextInt();
			
			Medicament medi1 = new Medicament();
			int inp;
			
			do {
				System.out.println("##### SubMenu #####");
				System.out.println("1 - Modifier Nom");
				System.out.println("2 - Modifier Prix");
				System.out.println("3 - Modifier Description");
				System.out.println("4 - Sortie");
				
				System.out.println("Entrer un nombre :");
				inp = scanner.nextInt();
				
				switch(inp) {
					case 1 :
						System.out.println("Entrer Nouveau nom du Medicament :");
						String mediNom = scanner.next();
						medi1.setNom(mediNom);
						listObj.set(newMedicamentId, newMedicamentId+" "+medi1.getNom()+" "+getPrix()+" "+getDesc());
						break;
					case 2 :
						System.out.println("Entrer Nouveau Prix du Medicament :");
						double mediPrix = scanner.nextDouble();
						medi1.setPrix(mediPrix);
						listObj.set(newMedicamentId, newMedicamentId+" "+getNom()+" "+medi1.getPrix()+" "+getDesc());
						break;
					case 3 :
						System.out.println("Entrer Nouveau Description :");
						String mediDesc = scanner.next();
						medi1.setDesc(mediDesc);
						listObj.set(newMedicamentId, newMedicamentId+" "+getNom()+" "+getPrix()+" "+medi1.getDesc());
						break;
					default :
						System.out.println("Le programme est arreté");
				}
				
			} while (inp != 4);
		} catch (Exception e) {
			return e.getMessage();
		}
		return null;

	}
	
	//Supprimer un Medicament selon l'index
	public String SupprimerMedicamnt() {
		try {
			System.out.println("Entrer le Nombre de ligne a Supprimer");
			int supp = scanner.nextInt();
			listObj.remove(supp);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	//Recherche Medicament par index
	public String RecherchMedicament() {
		try {
			Medicament medi2 = new Medicament();
			System.out.println("Entrer l'index du Medicament a Rechercher");
			int searchkey = scanner.nextInt();
			medi2.setId(searchkey);
			System.out.println(listObj.get(searchkey));
		} catch (Exception e) {
			return e.getMessage();
		}
		return null;
	}
}
