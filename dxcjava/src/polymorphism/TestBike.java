package polymorphism;

public class TestBike {
	
	public static void main(String args[]){  
		Bike9 obj=new  Bike9();  
		obj.run();  
		 //this has one partition-- speedLimit
		//Honda myHonda = new Honda(); //this has 2 partitions -- speedLimit and petrolTank
		//myHonda = (Honda) myBike; //upcasting is not defined -- which partition should i remove i don't know
		//mybike = (Bike9)myHonda; //downcasting -- petrol tank partition from honda gets removed
	}  


}
