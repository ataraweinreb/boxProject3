/**
 * 
 * @author Tara Weinreb
 * Linked list class UnsortedBoxList. Calls the append method from the BoxList class.
 */

public class UnsortedBoxList extends BoxList {
	//add to the end of the list by calling the append method in the super class
	UnsortedBoxList(){
		
	}
	public void add(Box d){
		this.append(d); //calls append method from super class
	}
}
