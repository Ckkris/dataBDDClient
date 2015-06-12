package org.demo.core;

import java.util.List;

import org.demo.core.config.Config;
import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
import org.demo.core.metier.IMetier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


//@SpringBootApplication-----------Arnaud Test
public class DataBdd2Application {

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

    List<Client> clients = métier.getAllClients();
    display("Liste des clients :", clients);

    List<Compte> comptes = métier.getAllComptes(); 
    display("Liste des comptes :", comptes);
        /*List<Compte> comptes = métier.getAllComptes();
        display("Liste des comptes :", comptes); Ne marche pas car Compte n'est noté commeune entity JPA mais une superclasse*/

//                List<Courant> courants = métier.getAllCourants();
//                display("Liste des comptes courants :", courants);
//
//
//        List<PEL> pels = métier.getAllPels();
//        display("Liste des comptes pel :", pels);

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
