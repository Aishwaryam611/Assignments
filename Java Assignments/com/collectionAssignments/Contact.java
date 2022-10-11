package com.collectionAssignments;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Contact {
	String name;
	String email;

	public enum Gender {
		male, female;

	}

	Gender gen;

	public Contact(String name, String email, Gender gen) {
		this.name = name;
		this.email = email;
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", gen=" + gen + "]";
	}

	public static void main(String[] args) {
		TreeMap<Long, Contact> c = new TreeMap<Long, Contact>();
		Contact c1 = new Contact("Aish", "aish@123", Gender.female);
		Contact c2 = new Contact("Tejus", "Tejus@123", Gender.male);

		c.put((long) 9854339009l, c1);
		c.put((long) 7058770334l, c2);

		System.out.println("Keys");
		Set<Long> keys = c.keySet();
		for (long key : keys) {
			System.out.println(key);
		}
			System.out.println("Values");
			Collection<Contact> values = c.values();
			for (Contact value : values) {
				System.out.println(value);

			
		}
	}
}
