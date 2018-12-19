/**
 * 
 * @author Tara Weinreb
 * 
 * Creates the abstract class BoxList
 */

public abstract class BoxList {
	protected BoxNode head; //declare head and tail to use as reference points when transversing the linked list
	protected BoxNode tail;
	protected int length; //declare size counter

	public BoxList() { 
		BoxNode dummy = new BoxNode(null); //create dummy and set to null
		head = tail = dummy; //sets head and tail to null because there is no data yet
		length = 0; //sets the length to 0 because there is no data yet
	}
	
	public void append(Box d) { //append method
		BoxNode n = new BoxNode(d);
		tail.next = n;
		tail = n;
		length++;
	}
	public String toString() { //toString method
		BoxNode p = this.head.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data.toString() + "\n";
			p = p.next;
		}
		return returnString;
	}
}
