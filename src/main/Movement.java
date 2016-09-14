package main;

import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

//This is will be an encapsulation of tasks performed by the motors.
public class Movement {
	
	public void moveForward(int ms){
		Motor.A.forward();
		Motor.B.forward();
		Delay.msDelay(ms);
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void moveBackward(int ms){
		Motor.A.backward();
		Motor.B.backward();
		Delay.msDelay(ms);
		Motor.A.stop();
		Motor.B.stop();
	}
	
	public void turnLeft(){}
	
	public void turnRight(){}
}
