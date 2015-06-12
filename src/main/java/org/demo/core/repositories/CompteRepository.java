package org.demo.core.repositories;
import org.demo.core.entities.Compte;
import org.springframework.data.repository.CrudRepository;

public interface CompteRepository extends CrudRepository<Compte, String> {

}
