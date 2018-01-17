package com.hcsc.xp.course.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hcsc.xp.course.demo.model.Contact;


@RepositoryRestResource
public interface ContactRepo extends CrudRepository<Contact, Long> {
	
}
