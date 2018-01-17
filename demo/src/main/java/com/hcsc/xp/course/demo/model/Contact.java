package com.hcsc.xp.course.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.annotation.Generated;

@Entity
public class Contact {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String firstName;
    private String lastName;

    public Contact()  {
    	
    }
    
	@Generated("SparkTools")
	private Contact(ContactBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
	}
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	/**
	 * Creates builder to build {@link Contact}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static ContactBuilder builder() {
		return new ContactBuilder();
	}

	/**
	 * Builder to build {@link Contact}.
	 */
	@Generated("SparkTools")
	public static final class ContactBuilder {
		private long id;
		private String firstName;
		private String lastName;

		private ContactBuilder() {
		}

		public ContactBuilder withId(long id) {
			this.id = id;
			return this;
		}

		public ContactBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public ContactBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Contact build() {
			return new Contact(this);
		}
	}
}
