package template;

public class SubOffice extends PostOffice{
	@Override
	public void collect() {
		// TODO Auto-generated method stub
		System.out.println("Sub office mail collection");
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Sub office process mail");
	}

	@Override
	public void transmit() {
		// TODO Auto-generated method stub
		System.out.println("Sub office transmit mail");
	}

	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		System.out.println("Sub office mail delivery");
	}
}
