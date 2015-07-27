package org.demo.core.repositories;

import java.util.List;

import org.demo.core.entities.Courant;
import org.demo.core.entities.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, String>{
	
	// liste des transactions dont la date de transaction est inférieur au 2003-03-00
		@Query("select c from Transaction c where c.date_trans < '2003-03-00'") //Transaction : synthaxe du nom de l'objet dans entity
		Iterable<Transaction> getTransactionsDate();

//		// liste des transactions dont la date de trasaction est inférieur au 2003-03-00 et dont les comptes sont négatifs
//		@Query("select c, b from Transaction c JOIN b.id_compte c Courant b ON (c.idcomptefkemeteur = b.id_compte) where c.date_trans < '2003-03-00' AND b.montant < '0'") //Transaction : synthaxe du nom de l'objet dans entity
//		Iterable<Transaction> getTransactionsDateCompteNeg();
				
}
