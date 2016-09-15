package main;

//Main class for starting threads and initializing the program.
public class Project {
	
	public static Robot rbt = new Robot();
	
	public static void main(String[] args) {
		Runnable mvrThread = new MovementThread(rbt);
		Runnable csrThread = new SensorThread(rbt);
		
		new Thread(mvrThread).start();
		new Thread(csrThread).start();
	}

}
