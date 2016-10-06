package com.ottobots;

import com.ottobots.services.implementation.FeatureDAOImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PeopleFeaturesApplicationTests {

	@Autowired
	DataSource datasource;
	@Test
	public void contextLoads() {
	}


	@Test
	public void testDBOperations(){
		FeatureDAOImpl myFeatureDAO = new FeatureDAOImpl(datasource);
		myFeatureDAO.downVote("WBMS-1800");

		System.out.println(myFeatureDAO.getFeatures().get(0).getVote());
	}

}
