package tests;

import iterator.Iterator;
import iterator.PostOfficeCollection;
import template.BranchOffice;
import template.HeadOffice;
import template.PostOffice;
import template.SubOffice;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostOffice headOffice = new HeadOffice();
		PostOffice branchOffice = new BranchOffice();
		PostOffice subOffice = new SubOffice();
		
		PostOfficeCollection poCollection = new PostOfficeCollection();
		
		poCollection.addItem(subOffice);
		poCollection.addItem(branchOffice);
		poCollection.addItem(headOffice);
		
		Iterator iterator = poCollection.createIterator();
		
		if(iterator.hasNext()) {
			System.out.println("Iterator test passed");
		}
		else {
			System.out.println("Iterator test failed");
		}
	}

}
