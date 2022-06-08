package com.chainsys.bestPractices.decoupled;

public class Bike {
	private Iengine engine;
	private Iwheel[] wheels;
	public Iengine getEngine()
	{
		return engine;
	}
	public void setEngine(Iengine engine)
	{
		this.engine=engine;
	}
	public Iwheel[] getWheels() {
		return wheels;
	}
	public void setWheels(Iwheel[] wheels) {
		this.wheels = wheels;
	}
	public void startBike()
	{
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
	}
	
}
