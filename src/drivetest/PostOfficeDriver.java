package drivetest;

import iterator.Operator;
import iterator.PostOfficeCollection;
import template.BranchOffice;
import template.HeadOffice;
import template.PostOffice;
import template.SubOffice;
import facade.*;
public class PostOfficeDriver {

	public static void main(String[] args) {
		PostOffice headOffice = new HeadOffice();
		PostOffice branchOffice = new BranchOffice();
		PostOffice subOffice = new SubOffice();
		
		PostOfficeCollection poCollection = new PostOfficeCollection();
		PostOfficeFacade postOfficeFacade = 
			new PostOfficeFacade(poCollection, headOffice,
					branchOffice, subOffice);
		
		postOfficeFacade.processMail();
			
	}

}
