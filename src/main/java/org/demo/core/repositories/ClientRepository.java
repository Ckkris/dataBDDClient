package org.demo.core.repositories;
import org.demo.core.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, String> {

}
