

import java.util.List;

import org.demo.core.config.Config;
import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
import org.demo.core.entities.Courant;
import org.demo.core.entities.PEL;
import org.demo.core.metier.IMetier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


//@SpringBootApplication-----------Arnaud Test
public class DataBddClientApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(DataBdd2Application.class, args);
//    }
	
	// le boot
    public static void main(String[] args) {
    	System.out.println("Starting");

    //SpringApplication app = new SpringApplication(DataBdd2Application.class);------------- Arnaud Test
    
    SpringApplication app = new SpringApplication(Config.class);
    
    //app.setLogStartupInfo(false);
    
    // on la lance
    ConfigurableApplicationContext context = app.run(args);
    
    IMetier métier = context.getBean(IMetier.class);

    
    //Méthode native au crudrepository
    
    //CLIENT
    
    List<Client> clients = métier.getAllClients();
    display("Liste des clients :", clients);
    
    // affichage du nom du client par la recherche de son login
    Client client = métier.getClientById("client1");
    System.out.println("id du client par son login 'client1' : " + client.getLogin());
    
    //Affiche le nom du client du compte par l'id d'un compte courant
    Courant courant = métier.getCourantById("compte1");
    System.out.println("Nom du client par l'id de son compte : " + courant.getClient().getNom()); //Besoin  de virer fetch.LAZY
   
    
    
    //Affiche les comptes courant d'un client
//    Courant courant = métier.getCourantById("compte1");
//    System.out.println("Nom du client par l'id de son compte : " + courant.getClient().getNom()); //Besoin  de virer fetch.LAZY
//   
    

    //COMPTE
    
    //List<Compte> comptes = métier.getAllComptes();
    //display("Liste des comptes :", comptes); //Ne marche pas car Compte n'est noté comme une entity JPA mais une superclasse*/

    
    //COURANT
    
    //Affiche tous les comptes courant
    List<Courant> courants = métier.getAllCourants();
    display("Liste des comptes courants :", courants);
    
    //Affiche tous les courant du client1
    List<Courant> courantss = métier.findByLoginfk("client1");
    display("Liste des comptes courants du client 1 :", courantss);
    

    //PEL
    
    //Affiche tous les pel du client
    List<PEL> pels = métier.getAllPels();
    display("Liste des comptes pel :", pels);
    
    //Affiche tous les courant du client1
    List<Courant> pelss = métier.findByLoginfk("client1");
    display("Liste des comptes courants du client 1 :", pelss);
    

        context.close();
        
        System.out.println("Finished OK");
        }

private static void display(String message, Iterable<?> elements) {
        System.out.println(message);
        for (Object element : elements) {
        System.out.println(element);
        }
}
}
