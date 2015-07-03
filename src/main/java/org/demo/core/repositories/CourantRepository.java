package org.demo.core.repositories;

import java.util.List;

import org.demo.core.entities.Compte;
import org.demo.core.entities.Courant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CourantRepository extends CrudRepository<Courant, String> {
	
//	 // liste des créneaux horaires d'un médecin
//	@Query("select c from courant c where c.login_fk=?1")
//	Iterable<Courant> getCourantClient(String login_fk);
	
	List<Courant> findByLoginfk(String loginfk);
	
	// liste des courants négatifs
	@Query("select c from Courant c where c.montant < '0'") //Courant : synthaxe du nom de l'objet dans entity
	Iterable<Courant> getCourantNegatif();

}
