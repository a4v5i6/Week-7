package template;

public class HeadOffice extends PostOffice{

	@Override
	public void collect() {
		// TODO Auto-generated method stub
		System.out.println("Head office mail collection");
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Head office process mail");
	}

	@Override
	public void transmit() {
		// TODO Auto-generated method stub
		System.out.println("Head office transmit mail");
	}

	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		System.out.println("Head office mail delivery");
	}

}
