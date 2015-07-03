package org.demo.core.repositories;
import java.util.List;

import org.demo.core.entities.Client;
import org.demo.core.entities.Courant;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, String> {
	
	List<Client> findByLogin(String login);

}
