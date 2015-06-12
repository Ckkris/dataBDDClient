package org.demo.core.metier;

import java.util.List;

import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
public interface IMetier {
	
	//Liste des clients
	public List<Client> getAllClients();

	//Liste des Compte
		public List<Compte> getAllComptes();
}
