import java.util.ArrayList;
import java.util.Scanner;

public class Client extends Person {
	
	private static int badge;
	static ArrayList<String> listObj = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);
	


	public static int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}
	
	public Client() {
		super();
		this.badge = badge;
		// TODO Auto-generated constructor stub
		
	}

	//Ajouter Nouveau Client
	public static void AjouterClient() {
		Client cli = new Client();
		
		System.out.println("Entrer ID de Client :");
		int clientId = scanner.nextInt();
		cli.setIdentifiant(clientId);
		
		System.out.println("Entrer le nom de Client :");
		String clientNom = scanner.next();
		cli.setNomComplet(clientNom);
		
		System.out.println("Entrer le numero de Telephone de Client :");
		String clientTele = scanner.next();
		cli.setNumeroTelephone(clientTele);
		
		System.out.println("Entrer l'email de Client :");
		String clientEmail = scanner.next();
		cli.setEmail(clientEmail);
		
		System.out.println("Entrer le numero d'achat de pour chaque Produit :");
		int clientBadge = scanner.nextInt();
		cli.setBadge(clientBadge);
		
		listObj.add(cli.getIdentifiant()+" "+cli.getNomComplet()+" "+cli.getNumeroTelephone()+" "+cli.getEmail()+" "+cli.getBadge());
	}
	
	//Modifier un Client
	public static void ModificationClient() {
		
		System.out.println("Entrer le nombre de Client a Modifier");
		int ClientId = scanner.nextInt();
		
		Client cli1 = new Client();
		int inp = 0;
		
		do {
			System.out.println("##### SubMenu #####");
			System.out.println("1 - Modifier Nom");
			System.out.println("2 - Modifier Numero de telephone");
			System.out.println("3 - Modifier Email");
			System.out.println("4 - Modifier Numero d'achats");
			System.out.println("5 - Sortie");
			
			System.out.println("Entrer un nombre");
			inp = scanner.nextInt();
			
			switch(inp) {
				case 1 :
					System.out.println("Entrer Nouveau nom du Client :");
					String cliNom = scanner.next();
					cli1.setNomComplet(cliNom);
					listObj.set(ClientId, ClientId+" "+cli1.getNomComplet()+" "+getNumeroTelephone()+" "+getEmail()+" "+getBadge());
					break;
				case 2 :
					System.out.println("Entrer Nouveau Numero de telephone du Client :");
					String cliTele = scanner.next();
					cli1.setNomComplet(cliTele);
					listObj.set(ClientId, ClientId+" "+getNomComplet()+" "+cli1.getNumeroTelephone()+" "+getEmail()+" "+getBadge());
					break;
				case 3 :
					System.out.println("Entrer Nouveau Email du Client :");
					String cliEmail = scanner.next();
					cli1.setEmail(cliEmail);
					listObj.set(ClientId, ClientId+" "+getNomComplet()+" "+getNumeroTelephone()+" "+cli1.getEmail()+" "+getBadge());
					break;
				case 4 :
					System.out.println("Entrer Nouveau nom du Client :");
					int cliBadge = scanner.nextInt();
					cli1.setBadge(cliBadge);
					listObj.set(ClientId, ClientId+" "+getNomComplet()+" "+getNumeroTelephone()+" "+getEmail()+" "+cli1.getBadge());
					break;
				default :
					System.out.println("Le programme est arreté");
			}
		} while (inp != 5);
	}
	
	//Afficher liste des Clients
	public static void AfficheClient() {
		for(Object i : listObj) {
			System.out.println(i);
		}
	}
	
	// Supprimer Client selon l'index d' Array
	public static void SupprimerClient() {
		
		System.out.println("Entrer le Nombre de ligne a Supprimer");
		int supp = scanner.nextInt();
		listObj.remove(supp);
	}
	
	//Client fidèle
	public static void Clientfidele() {
		
	}

}
