package template;

public class BranchOffice extends PostOffice{
	@Override
	public void collect() {
		// TODO Auto-generated method stub
		System.out.println("Branch office mail collection");
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Branch office process mail");
	}

	@Override
	public void transmit() {
		// TODO Auto-generated method stub
		System.out.println("Branch office transmit mail");
	}

	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		System.out.println("Branch office mail delivery");
	}
}
