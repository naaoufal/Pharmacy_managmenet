package models;
import java.lang.reflect.Array;
import java.util.*;

public class Client extends Person {
	
	private static int badge;
	private static String status;
	public static String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	static ArrayList<String> listObj = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);
	


	public static int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}
	
	public Client(int identifiant, String nomComplet, String phone, String email) {
		super();
		this.badge = badge;
		this.status = status;
		
	}

	public Client() {
		
	}

	//Ajouter Nouveau Client
	public String AjouterClient() {
		try {
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
			
			
			if(clientBadge >= 3) {
				cli.setStatus("Client-fidele");
			} else {
				cli.setStatus("Client-normal");
			}
			
			listObj.add(cli.getIdentifiant()+" "+cli.getNomComplet()+" "+cli.getNumeroTelephone()+" "+cli.getEmail()+" "+cli.getBadge()+" "+cli.getStatus());
		} catch (Exception e) {
			return e.getMessage();
		}
		return status;
	}
	
	//Modifier un Client
	public String ModificationClient() {
		try {
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
						System.out.println("Entrer Nouveau Badge du Client :");
						int cliBadge = scanner.nextInt();
						cli1.setBadge(cliBadge);
						if(cliBadge >= 3) {
								cli1.setStatus("Client-fidele");
							} else {
								cli1.setStatus("Client-normal");
						}
						listObj.set(ClientId, ClientId+" "+getNomComplet()+" "+getNumeroTelephone()+" "+getEmail()+" "+cli1.getBadge()+" "+getStatus());
						break;
					default :
						System.out.println("Le programme est arreté");
				}
			} while (inp != 5);
		} catch (Exception e) {
			return e.getMessage();
		}
		return null;
	}
	
	//Afficher liste des Clients
	public String AfficheClient() {
		try {
			for(Object i : listObj) {
				System.out.println(i);
			}
		} catch (Exception e) {
			return e.getMessage();
		}
		return null;
	}
	
	// Supprimer Client selon l'index d' Array
	public String SupprimerClient() {
		try {
			System.out.println("Entrer le Nombre de ligne a Supprimer");
			int supp = scanner.nextInt();
			listObj.remove(supp);
		} catch (Exception e) {
			return e.getMessage();
		}
		return null;
	}

}
