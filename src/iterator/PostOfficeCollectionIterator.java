package iterator;

import template.PostOffice;
import java.util.*;

public class PostOfficeCollectionIterator implements Iterator {
	List<PostOffice> postOffices;
	int pos = 0;
	
	
	public PostOfficeCollectionIterator(List<PostOffice> postOffices) {
		this.postOffices = postOffices;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return postOffices.size() > pos;
	}

	@Override
	public PostOffice next() {
		// TODO Auto-generated method stub
		return  postOffices.get(pos++);
	}

}
