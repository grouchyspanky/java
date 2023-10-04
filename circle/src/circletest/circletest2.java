package circletest;

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