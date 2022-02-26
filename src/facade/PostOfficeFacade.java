package facade;
import template.*;
import iterator.*;
public class PostOfficeFacade {
	private PostOffice headOffice;
	private PostOffice branchOffice;
	private PostOffice subOffice;
	private PostOfficeCollection poCollection;
	private Operator mailOperator;
	public PostOfficeFacade(
			PostOfficeCollection poCollection,
			PostOffice headOffice, 
			PostOffice branchOffice, 
			PostOffice subOffice
			) {
		this.poCollection = poCollection;
		this.headOffice = headOffice;
		this.branchOffice = branchOffice;
		this.subOffice = subOffice;
		
		this.addOffices();
	}
	
	private void addOffices() {
		poCollection.addItem(subOffice);
		poCollection.addItem(branchOffice);
		poCollection.addItem(headOffice);
		mailOperator = new Operator(poCollection);
	}
	public void processMail() {
		mailOperator.processMail();
	}
	
}
