/**
 * 
 * @author Tara Weinreb
 * 
 * Main program
 */
import java.util.StringTokenizer;
public class Project3 {
	  public static void main(String[] args) {
	     int[][] BoxInfo = fillArray("C:\\Users\\atara\\Desktop\\boxes.txt");
	     UnsortedBoxList ubl = new UnsortedBoxList();
	     SortedBoxList sbl = new SortedBoxList();
	     //TODO: go through the boxInfo
	     // create the Box, BoxNode
	     //add them to the ubl, sbl
	     for(int i=0; i < BoxInfo.length; i++) {
	    	 try {
	    		 Box b = new Box(BoxInfo[i][0], BoxInfo[i][1], BoxInfo[i][2]); //creates the box
	    		 ubl.add(b);
	    		 sbl.add(b);
	    	 }
	    	 catch(IllegalBoxException e) {
	    		 System.out.println(e.getMessage());
	    	 }
	     }
	     BoxGUI b = new BoxGUI(ubl, sbl);
	  }
	     
	   public static int[][] fillArray(String myFile) {
	        TextFileInput input = new TextFileInput(myFile);
	        
	        // reads the first line of the input file, 
	        String line = input.readLine();
	        // tokenizes it to get the number of rows and columns,
	        StringTokenizer myTokens = new StringTokenizer(line,",");    
	        int row =  Integer.parseInt(myTokens.nextToken());
	        int col =  Integer.parseInt(myTokens.nextToken());
	       
	        System.out.println("The dimension of the array is: " + row + ' ' + col);
	        // creates a two-dimension array of integers of the proper dimensions
	        int[][] integers = new int[row][col];
	        // reads the rest of the file, 
	        // tokenizing each line and storing the number in the array
	        for (int i = 0; i < row; i++) {
	           StringTokenizer rowToken = new StringTokenizer(input.readLine(),",");
	           int j = 0;
	           while (rowToken.hasMoreTokens()) {
	              integers[i][j]= Integer.parseInt(rowToken.nextToken());
	              j++;
	           }

	       }
	       return integers;   
	     }

}
