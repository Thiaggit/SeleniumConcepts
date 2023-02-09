package abstraction;

public class SamsungPhone extends Phone implements Telegram, Telephone{

	public void Software() {
		System.out.println("The Phone should have a Android");
	}
	
	public void Battery() {
		System.out.println("The Phone should have a Samsung Battery");
	}
	
	@Override
	public void communication() {
		// TODO Auto-generated method stub
		System.out.println("Used for communication");
	}

	@Override
	public void wired() {
		// TODO Auto-generated method stub
		System.out.println("Used for wireless communication");
	}

	@Override
	public void information() {
		// TODO Auto-generated method stub
		System.out.println("Used to consume info");
	}

	@Override
	public void lettermode() {
		// TODO Auto-generated method stub
		System.out.println("Used in e mode");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone obj = new SamsungPhone();
		obj.Battery();
		obj.Software();
		obj.communication();
		obj.wired();
		obj.information();
		obj.lettermode();
	}

	
}
