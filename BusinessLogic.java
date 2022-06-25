package com.prodapt.week3Test;

import java.util.ArrayList;

import com.prodapt.CollectionProducts.Product;



public class BusinessLogic {
	public ArrayList<Library> addBooks(){
		Library l1=new Library(8914, "CPP","Dennis Ritchie");
		Library l2=new Library(7538, "JAVA","James Gosling");
		Library l3=new Library(5432, "PYTHON","Guido van Rossum");
		Library l4=new Library(6235, "HTML","ABCD");
		
		ArrayList<Library>LibarayBucket=new ArrayList<Library>();
		LibarayBucket.add(l1);
		LibarayBucket.add(l2);
		LibarayBucket.add(l3);
		LibarayBucket.add(l4);
		return LibarayBucket;
	}
	public void displayBooks(ArrayList<Library> LibarayBucket) {
		System.out.println("List of Library Books\n");

		for (Library l : LibarayBucket) {
			System.out.println("Books" + l);

		}

	}
	public void UpdateBooks(ArrayList<Library> LibarayBucket) {
		
	      LibarayBucket.get(0).setName("C");
	
		System.out.println("\nUpdated List....");
		for (Library o : LibarayBucket) {
			System.out.println("Updated Book " + o);

		}

	}
	public void DeletBook(ArrayList<Library> LibarayBucket) {
		System.out.println("\nDeleted duplicateList");
		LibarayBucket.remove(3);
		for (Library l : LibarayBucket) {
			System.out.println("After Deleted Book " + l);

		}
	
	}
	
}
