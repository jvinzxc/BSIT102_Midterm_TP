import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
 
 class Finnn {
	public static void main(String[] args) throws IOException {
    	Scanner scn = new Scanner(System.in);
    	
    	System.out.println("Enter your file name");
    	FileWriter flw = new FileWriter(scn.nextLine() + ".divina");
    	
    	System.out.println("Write anything");
    	flw.write(scn.nextLine());
    	flw.close();
	}   	
}
