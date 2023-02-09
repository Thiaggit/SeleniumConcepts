package abstraction;

public abstract class Phone implements Telegram, Telephone{

	public abstract void Software();
	
	public abstract void Battery();
	
	public void Camera() {
		System.out.println("The Phone should have a camera");
	};
	
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

	}

}
