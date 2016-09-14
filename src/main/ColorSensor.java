package main;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

//This is will be an encapsulation of tasks performed by the color sensor.
public class ColorSensor { 
	
	EV3ColorSensor sensor = new EV3ColorSensor(SensorPort.S4);
	
	public ColorSensor(){
		sensor.setCurrentMode("ColorID");
	}
	
	public boolean checkOnPath(){
		if (sensor.getColorID() != 1) 
			return false;
		
		return true;
	}
	
}
