package org.demo.core.metier;

import java.util.List;

import org.demo.core.DataBddClientApplicationTests;
import org.demo.core.entities.Client;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MetierTest extends DataBddClientApplicationTests {

	@Autowired
	protected Metier metier;
	
	@Test
	public void testFindAll(){		
		List<Client> res = metier.getAllClients();
		Assert.assertNotNull(res);
		Assert.assertTrue(res.size() >= 2);
	}


}
