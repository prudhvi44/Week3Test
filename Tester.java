package com.prodapt.week3Test;

import java.util.ArrayList;



public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLogic bl=new BusinessLogic();
		ArrayList<Library> LibarayBucket = bl.addBooks();
		
		bl.displayBooks(LibarayBucket);
		bl.UpdateBooks(LibarayBucket);
		bl.DeletBook(LibarayBucket);

	}

}
