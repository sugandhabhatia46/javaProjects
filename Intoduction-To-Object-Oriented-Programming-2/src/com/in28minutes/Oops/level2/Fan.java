package com.in28minutes.Oops.level2;

public class Fan {

	// state
	private String manufacturer;
	private double radius;
	private String color;
	private boolean isOn;
	private byte Speed;

	// constructors
	public Fan(String manufacturer, double radius, String color) {
		this.manufacturer = manufacturer;
		this.radius = radius;
		this.color = color;

	}

	// isOn
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	// Speed
	public void setSpeed(byte Speed) {
		this.Speed = Speed;
	}

	@Override
	public String toString() {
		return String.format("manufaturer - %s, radius - %f, color - %s, isOn - %b, Speed - %d", manufacturer, radius,
				color, isOn, Speed);

	}

}
