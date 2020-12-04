import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacier extends Person {

	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Object> listObj = new ArrayList<Object>();
	
	public Pharmacier() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Ajouter des Pharmaciers :
	public static void AjouterFamacier() {
		
		Pharmacier pha = new Pharmacier();
		
		System.out.println("Enter Pharmacier Identifiant :");
		int phaIdentifiant = scanner.nextInt();
		pha.setIdentifiant(phaIdentifiant);
		
		System.out.println("Enter Pharmacier Nom Complet :");
		String phaNom = scanner.next();
		pha.setNomComplet(phaNom);
		
		System.out.println("Enter Pharmacier Numero de telephone :");
		String phaTelephone = scanner.next();
		pha.setNumeroTelephone(phaTelephone);
		
		System.out.println("Enter Pharmacier EMail :");
		String phaEmail = scanner.next();
		pha.setEmail(phaEmail);
		
		listObj.add(pha.getIdentifiant()+" "+pha.getNomComplet()+" "+pha.getNumeroTelephone()+" "+pha.getEmail());
		
		
	}
	
	// Afficher tous les Pharmaciers :
	public static void AffichePharmaciers() {
		
		for(Object i : listObj) {
			System.out.println(i);
		}
	}
	
	//Modifier des Pharmaciers :
	public static void ModifierPharmacier() {
		
		System.out.println("Enter le nombre de Pharmacier a Modifier :");
		int newPharmacieId = scanner.nextInt();
		
		Pharmacier pha1 = new Pharmacier();
		int inp;
		
		do {
			System.out.println("##### SubMenu #####");
			System.out.println("1 - Modifier Nom Complet");
			System.out.println("2 - Modifier Numero de telephone");
			System.out.println("3 - Modifier Email");
			System.out.println("4 - Sortie");
			
			System.out.println("Enter un nombre :");
			inp = scanner.nextInt();

			switch(inp) {
				case 1 :
					System.out.println("Entrer Nouveau nom du Pharmacier :");
					String phatNom = scanner.next();
					pha1.setNomComplet(phatNom);
					listObj.set(newPharmacieId, newPharmacieId+" "+pha1.getNomComplet()+" "+getNumeroTelephone()+" "+getEmail());
					break;
				case 2 :
					System.out.println("Enter Nouveau numero de Telephone");
					String phatTele = scanner.next();
					pha1.setNumeroTelephone(phatTele);
					listObj.set(newPharmacieId, newPharmacieId+" "+getNomComplet()+" "+pha1.getNumeroTelephone()+" "+getEmail());
					break;
				case 3 :
					System.out.println("Enter Nouveau Email");
					String phatEmail = scanner.next();
					pha1.setEmail(phatEmail);
					listObj.set(newPharmacieId, newPharmacieId+" "+getNomComplet()+" "+getNumeroTelephone()+" "+pha1.getEmail());
				default :
					System.out.println("Le programme est arreté");
			}
			
		} while (inp != 4);
	}

	// Supprimer Pharmacier selon l'index d' Array
	public static void SupprimerPharmacier() {
		
		System.out.println("Entrer le Nombre de ligne a Supprimer");
		int supp = scanner.nextInt();
		listObj.remove(supp);
	}
	
	//Recherche selon index du Pharmacier
	public static void RecherchPharmacier() {
		
		Pharmacier pha2 = new Pharmacier();
		System.out.println("Entrer le nombre d'index a Rechercher");
		int searchkey = scanner.nextInt();
		pha2.setIdentifiant(searchkey);
		System.out.println(listObj.get(searchkey));
	}
}
