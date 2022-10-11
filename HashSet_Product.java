package com.collectionAssignments;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Product {
	int productId;
	String productName;

	public HashSet_Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "HashSet_Product [productId=" + productId + ", productName=" + productName + "]";
	}

	public static void main(String args[]) {

		HashSet_Product product1 = new HashSet_Product(1, "Laptop");
		HashSet_Product product2 = new HashSet_Product(2, "Charger");
		HashSet_Product product3 = new HashSet_Product(3, "Mobile");
		HashSet_Product product4 = new HashSet_Product(4, "Book");
		HashSet_Product product5 = new HashSet_Product(5, "Pen");
		HashSet_Product product6 = new HashSet_Product(6, "Keyboard");
		HashSet_Product product7 = new HashSet_Product(7, "Headphone");
		HashSet_Product product8 = new HashSet_Product(8, "Shoes");
		HashSet_Product product9 = new HashSet_Product(9, "Mirror");
		HashSet_Product product10 = new HashSet_Product(10, "Bag");

		HashSet<HashSet_Product> list = new HashSet<HashSet_Product>();

		// Adding elements to the HashSet
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product5);
		list.add(product4);
		list.add(product6);
		list.add(product7);
		list.add(product8);
		list.add(product9);
		list.add(product10);

		// Addition of duplicate elements
		list.add(product1);
		list.add(product6);

		Iterator<HashSet_Product> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
