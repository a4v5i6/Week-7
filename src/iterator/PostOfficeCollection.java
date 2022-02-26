package iterator;
import java.util.*;

import template.PostOffice;

public class PostOfficeCollection implements Office {
	List<PostOffice> postOffices;
	
	public PostOfficeCollection() {
		postOffices = new ArrayList<PostOffice>();
	}
	public void addItem(PostOffice postOffice) {
		postOffices.add(postOffice);
	}
	public List<PostOffice> getOffices(){
		return postOffices;
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new PostOfficeCollectionIterator(postOffices);
	}

}
