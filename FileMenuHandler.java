import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {
	JFrame jf;
	
	public FileMenuHandler(JFrame j) {
		jf=j;
	}
	
	public void actionPerformed(ActionEvent event) {
		String menuName;
		menuName=event.getActionCommand();
		if (menuName.equals("Search")){
			int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length:"));
			int w = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the width:"));
			int h = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the height:"));
			Box match = new Box(l,w,h); //create a box to look for a match which is bigger
			searchBoxes(match);
		} else if (menuName.equals("Quit")) {
			System.exit(0);  //quit the program
		}
	}//actionPerformed

	private void searchBoxes(Box match) {
		SortedBoxList sbl = BoxGUI.sortedList; //gets sorted box list from the gui
		SortedBoxList boxesThatFit = new SortedBoxList(); //creates a new instance of the sorted box list class
		BoxNode p = sbl.head; //temporary variable to go through box list. Starts at the head.
		while (p.next != null) { //while you didn't yet reach the end of the list
			if(p.next.data.boxCompare(match) > 0) //if the box is bigger or equal to match box
				boxesThatFit.add(p.next.data); //add it to the boxes that fit list
			p = p.next; //iterates to next box node
		}
		new ResultsGUI(boxesThatFit);
	}

}
