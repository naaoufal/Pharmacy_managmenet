import java.util.Scanner;

import models.Client;
import models.Medicament;
import models.Pharmacier;

public class Main {
	public static void main (String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("#### Menu #####");
			System.out.println("1 - Ajouter Nouveau Pharmacier");
			System.out.println("2 - Afifcher tous les Pharmaciers");
			System.out.println("3 - Modifier Un Pharmacier");
			System.out.println("4 - Supprimer Un Pharmacier");
			System.out.println("5 - Ajouter Nouveau Medicament");
			System.out.println("6 - Afficher listes des Medicaments");
			System.out.println("7 - Modifier un Medicament");
			System.out.println("8 - Supprimer un Medicament");
			System.out.println("9 - Rechercher Par index Sur liste des Medicament");
			System.out.println("10 - Ajouter Nouveau Client");
			System.out.println("11 - Afficher liste des Clients");
			System.out.println("12 - Modifier Un Client");
			System.out.println("13 - Supprimer Un Client");
			System.out.println("14 - Recherche Un Pharmacier par l'index");
			System.out.println("15 - Order liste des Client");
			System.out.println("16 - Exit");
			
			System.out.println("Enter un nombre :");
			
			input = scanner.nextInt();
			
			switch (input) {
				case 1 :
					Pharmacier PharAjou = new Pharmacier();
					PharAjou.AjouterFamacier();
					break;
				case 2 : 
					Pharmacier PharAff = new Pharmacier();
					PharAff.AffichePharmaciers();
					break;
				case 3 :
					Pharmacier PharMod = new Pharmacier();
					PharMod.ModifierPharmacier();
					break;
				case 4 :
					Pharmacier PharSupp = new Pharmacier();
					PharSupp.SupprimerPharmacier();
					break;
				case 5 :
					Medicament MediAjo = new Medicament();
					MediAjo.AjouterMedi();
					break;
				case 6 :
					Medicament MediAff = new Medicament();
					MediAff.AfficheMedicament();
					break;
				case 7 :
					Medicament MediMod = new Medicament();
					MediMod.ModifierMedicament();
					break;
				case 8 :
					Medicament MediSupp = new Medicament();
					MediSupp.SupprimerMedicamnt();
					break;
				case 9 :
					Medicament MediRech = new Medicament();
					MediRech.RecherchMedicament();
					break;
				case 10 :
					Client cliAjou = new Client();
					cliAjou.AjouterClient();
					break;
				case 11 :
					Client cliAff = new Client();
					cliAff.AfficheClient();
					break;
				case 12 :
					Client cliMod = new Client();
					cliMod.ModificationClient();
					break;
				case 13 :
					Client cliSupp = new Client();
					cliSupp.SupprimerClient();
					break;
				case 14 :
					Pharmacier PharRech = new Pharmacier();
					PharRech.RecherchPharmacier();
					break;
				case 15 :
					System.out.println("testing field !!!");
					break;
				default :
					System.out.println("BOOM !!!");
			}
		} while (input != 16);
	}
}
