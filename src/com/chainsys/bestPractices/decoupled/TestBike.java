package com.chainsys.bestPractices.decoupled;

public class TestBike {


	    public static void main(String[] args) {
	        PetrolEngine pe = new PetrolEngine();
	        SteelWheel[] sWheels = new SteelWheel[4];
	        sWheels[0] = new SteelWheel();
	        sWheels[0].location = "front";
	        sWheels[1] = new SteelWheel();
	        sWheels[1].location = "back";
	        Bike bike= new Bike();
	        bike.setEngine(pe);
	        bike.setWheels(sWheels);
            bike.startBike(); 
	        DiselEngine de = new DiselEngine();
	        WoodenWheel[] wWheels = new WoodenWheel[2];
	        wWheels[0] = new WoodenWheel();
	        wWheels[0].location = "front";
	        wWheels[1] = new WoodenWheel();
	        wWheels[1].location = "back";
	        Bike secondbike= new Bike();
	        secondbike.setEngine(de);
	        secondbike.setWheels(wWheels);
	        secondbike.startBike(); 

	       
	                

	    }

	
}
