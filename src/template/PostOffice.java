package template;

public abstract class PostOffice {
	public void send() {
		collect();
		process();
		transmit();
		delivery();
	}
	public abstract void collect();
	public abstract void process();
	public abstract void transmit();
	public abstract void delivery();
	
}
