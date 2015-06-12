package org.demo.core.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
import org.demo.core.repositories.ClientRepository;
import org.demo.core.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service("métier")
//@Transactional
public class Metier implements IMetier{
	
	@Autowired
    private ClientRepository clientRepository;


    public List<Client> getAllClients() {
        return Lists.newArrayList(clientRepository.findAll());
    }

    public Client saveClients(Client client) {
        return clientRepository.save(client);
    }
    
    
    
    
    @Autowired
    private CompteRepository compteRepository;


    public List<Compte> getAllComptes() {
        return Lists.newArrayList(compteRepository.findAll());
    }

    public Compte saveComptes(Compte compte) {
        return compteRepository.save(compte);
    }
}
