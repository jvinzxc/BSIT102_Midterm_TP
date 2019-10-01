import java.io.IOException;
import java.util.Scanner;
import java.io.File;	

  class Fouutt {
	public static void main(String[] args) throws IOException {
    	
    
    	
    System.out.println("File Name:  ");
    Scanner scn = new Scanner(System.in);
    
    	File file = new File(scn.nextLine() + ".divina");
    	scn = new Scanner(file);
    	
    	String snn = scn.nextLine();
    	System.out.println(snn);
    	
    	scn.close();
	}
}
