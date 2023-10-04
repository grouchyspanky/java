package homeWorkOne;

import java.util.Arrays;

public class HomeWorkOne {

	public static void main(String[] args) {
		
	stringManipulation arrayone = new stringManipulation();
	
	String[] firstArray = {"apples", "bananan","bread ","zeanut"};
	
	arrayone.setArray(firstArray);
	
	System.out.println(arrayone.findLargeVal());
	
	String oldString =" Godilla is king!";	
    int subStart = 12;
    int subEnd = 16;
    String stringToInsert = "delicious";
    
    String newStringOne = arrayone.replaceSubstring(oldString,subStart, subEnd, stringToInsert);
    
    System.out.println(newStringOne);
    
	String oldStringTwo =" Meow Meow is king!";	
    int subStartTwo = 14;
    int subEndTwo = 18;
    String stringToInsertTwo = "the best cat in the whole world";
    
    String newStringTwo = arrayone.replaceSubstring(oldStringTwo,subStartTwo, subEndTwo, stringToInsertTwo);

	System.out.println(newStringTwo);

	}
}

class stringManipulation {

	private String[] stringArray;
	

stringManipulation(){
	
}
 
stringManipulation(String[] userArray) { 
	
	this.stringArray= userArray;

} 

public void setArray(String[] userArray) { 
	
	this.stringArray= userArray;

} 

public String findLargeVal(){
	
	String largestVal=" ";
	
	Arrays.sort(stringArray);
	
	largestVal = stringArray[stringArray.length -1 ];
	
	return largestVal;


}

public String replaceSubstring(String oldString, int subStart, int subEnd, String stringToInsert) {
	
	String result;
	
	String substringStart = oldString.substring(0,subStart);
	
	String substringAfter= oldString.substring(subEnd);
	
	result = substringStart + stringToInsert + substringAfter;
	
	

	
	return result;
	
}

 



 

} 
	


