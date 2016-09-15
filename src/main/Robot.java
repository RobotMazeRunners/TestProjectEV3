package main;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

public class Robot {
	
	public final int BLACK = 1;
	public boolean active = true;
	EV3ColorSensor sensor = new EV3ColorSensor(SensorPort.S4);
	
	public Robot(){
		sensor.setCurrentMode("ColorID");
	}

	public void checkColor() {
		int color = sensor.getColorID();
		if (color != BLACK) {
			stop();
			//make decision.
		}
	}

	public void forward(){
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public void backward(){
		Motor.A.backward();
		Motor.B.backward();
	}
	
	public void turnLeft(){}
	
	public void turnRight(){}
	
	public void stop(){
		Motor.A.stop(true);
		Motor.B.stop(true);
	}
	
	public void checkActive(){
		if (Button.readButtons() != 0)
			active = false;
	}
	
}
