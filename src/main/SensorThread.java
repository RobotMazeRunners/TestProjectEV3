package main;

//Will implement logic/actions conducted by the ColorSensor object.
public class SensorThread implements Runnable {

	Robot rbt;
	
	public SensorThread(Robot rbt){
		this.rbt = rbt;
	}

	@Override
	public void run() {
		try {
			while(rbt.active){
				rbt.checkColor();
				Thread.sleep(700);
			}
		} catch (Exception ex) {
			
		}
	}

}
