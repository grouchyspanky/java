package circletest;


public class circletest {
	
		public static void main(String[] args) {
			
		Rectangle userRectangleOne = new Rectangle();
		
		System.out.print("The First Rectangle has the a height of " + userRectangleOne.height);
		System.out.println(" and a width of " + userRectangleOne.width);
		System.out.println("The Area of the First Rectange is " + userRectangleOne.getArea());
		System.out.println("The Perimeter of the First Rectange is " + userRectangleOne.getPerimeter()+ "\n");
		
		
		Rectangle userRectangleTwo = new Rectangle(6);
		
		System.out.print("The Second Rectangle has the a height of " + userRectangleTwo.height);
		System.out.println(" and a width of " + userRectangleTwo.width);		
		System.out.println("The Area of the Second Rectange is " + userRectangleTwo.getArea());
		System.out.println("The Perimeter of the Second Rectange is " + userRectangleTwo.getPerimeter()+ "\n");
		
		Rectangle userRectangleThree = new Rectangle(8,12);
		
		System.out.print("The Third Rectangle has the a height of " + userRectangleThree.height);
		System.out.println(" and a width of " + userRectangleThree.width);	
		System.out.println("The Area of the Third Rectange is " + userRectangleThree.getArea());
		System.out.println("The Perimeter of the Third Rectange is " + userRectangleThree.getPerimeter()+ "\n");
			
			
			
			
			
		}
}
/** The height and width of the rectangle*/
class Rectangle {
 
	
	double height = 1; 
	double width = 1;



 /** Construct a rectangle object */
Rectangle() { 
	
} 

Rectangle(double newHeight){
	height = newHeight;

}

Rectangle(double newHeight, double newWidth){
	height = newHeight;
	width = newWidth;
}

 
  /** Return the area of this rectangle */
double getArea() { 

	double area = height * width;
	
return area; 
		} 

 

 /** Return the parameter of this rectangle */
double getPerimeter() { 

	double perimeter = (2 *(height + width));
return perimeter; 
} 



  /** Set new height and width for this rectangle */
void setRadius(double newHeight, double newWidth) { 

    height = newHeight;
    width = newWidth;
    
  }


} 