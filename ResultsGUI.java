import java.awt.TextArea;

import javax.swing.JFrame;

public class ResultsGUI extends JFrame {
	public ResultsGUI(SortedBoxList sbl)
	{
		setTitle("Project 3");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().add(new TextArea(sbl.toString()));
		setVisible(true);
	}
}
