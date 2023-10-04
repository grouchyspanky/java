package checkpointone;

class coordinatePair {
	

	private double x= 0;
	private double y =0;
	

coordinatePair(){
	this(0,0);
}
	
coordinatePair(double userValForX){
	
	this.x=userValForX;
	
}

coordinatePair(double userValForX, double userValForY){
	
	this.x=userValForX;
	this.y=userValForY;
	
}

	public double getXVal() {
		return x;
		
	}

	
	public double getYVal() {
		return y;
		
	}
	
	
	double getEucledianDistance(coordinatePair otherpair) {

		double distance = 0;
		
		double x= (this.x - otherpair.getXVal());
		double y= (this.y - otherpair.getYVal());
		
		distance = Math.sqrt(Math.pow(x,2)- Math.pow(y, 2));
		
		
		
		
		return distance;
	}
	
}