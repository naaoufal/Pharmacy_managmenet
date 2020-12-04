import java.util.Scanner;

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
			System.out.println("13 - Supprimer Un Pharmacier");
			System.out.println("14 - Recherche Un Clinet par l'index");
			System.out.println("15 - Clinet fideles");
			System.out.println("16 - Exit");
			
			System.out.println("Enter un nombre :");
			
			input = scanner.nextInt();
			
			switch (input) {
				case 1 :
					Pharmacier.AjouterFamacier();
					break;
				case 2 : 
					Pharmacier.AffichePharmaciers();
					break;
				case 3 :
					Pharmacier.ModifierPharmacier();
					break;
				case 4 :
					Pharmacier.SupprimerPharmacier();
					break;
				case 5 :
					Medicament.AjouterMedi();
					break;
				case 6 :
					Medicament.AfficheMedicament();
					break;
				case 7 :
					Medicament.ModifierMedicament();
					break;
				case 8 :
					Medicament.SupprimerMedicamnt();
					break;
				case 9 :
					Medicament.RecherchMedicament();
					break;
				case 10 :
					Client.AjouterClient();
					break;
				case 11 :
					Client.AfficheClient();
					break;
				case 12 :
					Client.ModificationClient();
					break;
				case 13 :
					Client.SupprimerClient();
					break;
				case 14 :
					Pharmacier.RecherchPharmacier();
					break;
				case 15 :
					Client.Clientfidele();
					break;
				default :
					System.out.println("BOOM !!!");
			}
		} while (input != 16);
	}
}
