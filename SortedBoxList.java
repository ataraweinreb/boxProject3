/**
 * 
 * @author Tara Weinreb
 *
 * 
 * Linked list class SortedBoxList
 */

public class SortedBoxList extends BoxList{
	public void add(Box b) {
		// find the correct position for the new box, 
		// then insert the new box
		// if the new box is at the end of the list, change the "last" pointer.	
		BoxNode p = this.head;
		BoxNode tmp = new BoxNode(b);
		while (p.next != null && p.next.data.compareTo(tmp.data) < 0) {
			p = p.next;
		}
		tmp.next = p.next; //create tmp
		p.next = tmp;
		if (tmp.next == null) {
			this.tail = tmp;
		}
		this.length ++; //increment length 
	}
}

