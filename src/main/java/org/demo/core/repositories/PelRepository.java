package org.demo.core.repositories;

import java.util.List;

import org.demo.core.entities.Courant;
import org.demo.core.entities.PEL;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PelRepository extends CrudRepository<PEL, String> {
	
	//List<PEL> findByLoginfk(String loginfk);
	
	// liste des courants négatifs
	@Query("select c from PEL c where c.montant < '0'") //Courant : synthaxe du nom de l'objet dans entity
	Iterable<PEL> getPelNegatif();
	
	
}
