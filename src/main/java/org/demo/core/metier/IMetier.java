package org.demo.core.metier;

import java.util.List;

import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
import org.demo.core.entities.Courant;
import org.demo.core.entities.PEL;
import org.demo.core.entities.Transaction;

public interface IMetier {
	
	//CLIENT___________________
	
	//Liste des clients
	public List<Client> getAllClients();
	
	//Liste client à partir de l'ID
	public Client getClientById(String Login);
	
	//COURANT_________________
		
	//Liste des courant
    public List<Courant> getAllCourants();
    
	//Liste courant à partir de l'ID client ------------------->Ne marche pas car id_client n'est pas l'id du compte
	public Courant getCourantById(String id);

	// Liste des courants par le login du client
	public List<Courant> findByLoginfk(String loginfk);

	public List<Courant> getCourantNegatif();
	  
	//PEL ______________________
	
    //Liste des PEL
    public List<PEL> getAllPels();
    
    public List<PEL> getPelNegatif();
    
    //Liste des courants par le login du client
 	//public List<PEL> findByLoginfk1(String loginfk);

    //COMPTE______________________
    
    //liste des compte d'un client
    public List<Compte> getAllComptes();

    //Transaction_______________________________
    
    //liste des transactions d'un compte
    public List<Transaction> getAllTransactions();
    
    public List<Transaction> getTransactionsDate();
    
    public List<Transaction> getTransactionsDateCompteNeg();
    
//  //Liste client à partir de l'ID // En mode COMPOSITE PRIMARY
//  	public Transaction getTransactionById(String id);
    
    
    
    
}
