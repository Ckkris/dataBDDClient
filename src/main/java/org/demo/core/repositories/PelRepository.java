package org.demo.core.repositories;

import java.util.List;

import org.demo.core.entities.Courant;
import org.demo.core.entities.PEL;
import org.springframework.data.repository.CrudRepository;

public interface PelRepository extends CrudRepository<PEL, String> {
	
	//List<PEL> findByLoginfk(String loginfk);
	
	
}
