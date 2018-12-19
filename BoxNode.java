/**
 * 
 * @author Tara Weinreb
 * 
 * Creates BoxNode
 */

public class BoxNode {
	protected Box data; //instance var for data
	protected BoxNode next; //instance var for next
	public BoxNode(Box d) { //constructor
		data = d;
		next = null;
	}
}
