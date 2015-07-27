package org.demo.core.metier;

import java.util.List;

import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
import org.demo.core.entities.Courant;
import org.demo.core.entities.PEL;
import org.demo.core.entities.Transaction;
import org.demo.core.repositories.ClientRepository;
import org.demo.core.repositories.CompteRepository;
import org.demo.core.repositories.CourantRepository;
import org.demo.core.repositories.PelRepository;
import org.demo.core.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service("métier")
public class Metier implements IMetier{
	
	 // répositories
	
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CourantRepository courantRepository;
    @Autowired
    private PelRepository pelRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private TransactionRepository transactionRepository;

    
    // implémentation interface
    
    
    //CLIENT______________________________________________________________
    
    
    @Override
     public List<Client> getAllClients() {
        return Lists.newArrayList(clientRepository.findAll());
    }
    
    @Override
    public Client getClientById(String Login) {
    return clientRepository.findOne(Login);
}
    
    public Client saveClients(Client client) {
    	    return clientRepository.save(client);
    	  }

    
    //COMPTE_____________________________________________________________________
    
    @Override
    public List<Compte> getAllComptes() {
        return Lists.newArrayList(compteRepository.findAll());
    }
    
    
    //COURANT____________________________________________________________________
    
    @Override
    public List<Courant> getAllCourants() {
        return Lists.newArrayList(courantRepository.findAll());
    }
    
	public Courant getCourantById(String id) {
	return courantRepository.findOne(id);
	}
    
    @Override
    public List<Courant> findByLoginfk(String loginfk) {
    return courantRepository.findByLoginfk(loginfk);
    }
    
    @Override
    public List<Courant> getCourantNegatif() {
        return Lists.newArrayList(courantRepository.getCourantNegatif());
    }
    
    public Courant saveCourant(Courant courant) {
	    return courantRepository.save(courant);
	  }
    
//  public Compte saveComptes(Compte compte) {
//	   return compteRepository.save(compte);
//	 }

    
	//@Override
	//public List<Courant> getCourantsClient(String login_fk) {
	//return Lists.newArrayList(courantRepository.getCourantsClient(login_fk));
	//}
    
    //PEL___________________________________________________________________________________

    @Override
    public List<PEL> getAllPels() {
        return Lists.newArrayList(pelRepository.findAll());
    }
    
    @Override
    public List<PEL> getPelNegatif() {
        return Lists.newArrayList(pelRepository.getPelNegatif());
    }
    
    
    //Transaction______________________________________________
    
    @Override
    public List<Transaction> getAllTransactions() {
    return Lists.newArrayList(transactionRepository.findAll());
    }
    
    @Override
    public List<Transaction> getTransactionsDate() {
    return Lists.newArrayList(transactionRepository.getTransactionsDate());
    }

    
    //__________________________________________________________
    
	@Override
	public List<Transaction> getTransactionsDateCompteNeg() {
		// TODO Auto-generated method stub
		return null;
	}
    
//    @Override
//    public List<Transaction> getTransactionsDateCompteNeg() {
//    return Lists.newArrayList(transactionRepository.getTransactionsDateCompteNeg());
//    }
    
    //Méthode enmode composite primary
//    @Override
//    public Transaction getTransactionById(String id) {
//    return transactionRepository.findOne(id);
//}

    
    
    
		 //Arnaud
		
		 //public Client saveClients(Client client) {
		 //  return clientRepository.save(client);
		 //}
		
		 //@Autowired
		 //private CompteRepository compteRepository;
		 //
		 //
		 //public List<Compte> getAllComptes() {
		 //  return Lists.newArrayList(compteRepository.findAll());
		 //}
		 //
		 //public Compte saveComptes(Compte compte) {
		 //  return compteRepository.save(compte);
		 //}
  
}
