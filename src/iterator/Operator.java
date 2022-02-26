package iterator;

import template.PostOffice;

public class Operator {
	Office office;
	
	public Operator(Office office) {
		this.office = office;
	}
	public void processMail() {
		Iterator iter = office.createIterator();
		processMail(iter);
	}
	private void processMail(Iterator iterator) {
		while(iterator.hasNext()) {
			PostOffice postOffice = iterator.next();
			postOffice.send();
			System.out.println();
		}
	}
}
