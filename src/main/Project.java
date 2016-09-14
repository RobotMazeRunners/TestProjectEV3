package main;

//Main class for starting threads and initializing the program.
public class Project {

	Movement mvr = new Movement();
	ColorSensor csr = new ColorSensor();
	
	public static void main(String[] args) {
		MovementThread mvrThread = new MovementThread();
		SensorThread csrThread = new SensorThread();
		
		mvrThread.start();
		csrThread.start();
	}

}
