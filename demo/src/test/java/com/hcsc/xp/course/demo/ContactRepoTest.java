package com.hcsc.xp.course.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcsc.xp.course.demo.model.Contact; 

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContactRepoTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private ContactRepo repo;
	private Contact john;
	private Contact mike;
	private Contact scott;
	
	public public ContactRepoTest() {
		john = new Contact.ContactBuilder(Long.valueOf(10)).withFirstName("John").withLastName("Smith").build();
				
	}
	
	@Test
	public void writeAContactToDataStore()  {
		ContactServiceImpl service = new ContactServiceImpl();
		
		String contactResponse = service.add("John Smith");
		assertThat(contactResponse, is(notNullValue()));
	}
}
