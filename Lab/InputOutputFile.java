package lab1;
import java.io.*;
import java.util.*;
public class InputOutputFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        File file = new File("number.txt");
        if (file.exists()) {
            System.out.println(file + " exists.");
        } else {
        	try {
            file.createNewFile();
            System.out.println(file + " created.");
        	} catch (IOException e) {
        	System.out.println("Error: " + e.getMessage());
        	}
		} 
        
        
        File f2= new File("even.txt");
        if (f2.exists()) {
            System.out.println(f2 + " exists.");
        } else {
        	try {
            f2.createNewFile();
            System.out.println(f2 + " created.");
        	} catch (IOException e) {
        	System.out.println("Error: " + e.getMessage());
        	}
		} 
        
        File f3= new File("odd.txt");
        if (f3.exists()) {
            System.out.println(f3 + " exists.");
        } else {
        	try {
            f3.createNewFile();
            System.out.println(f3 + " created.");
        	} catch (IOException e) {
        	System.out.println("Error: " + e.getMessage());
        	}
		}
        
        try {
        	FileOutputStream out = new FileOutputStream(file);
        	System.out.println("Enter the no of elements you want to store:");
        	int ele = sc.nextInt();
        	System.out.println("Enter the elements:");
        	for(int i=0;i<ele;i++) {
        		int no = sc.nextInt();
        		out.write(no);
        	}
        	System.out.println("Data added.");
        	out.close();
        }catch(Exception e) {
        	System.out.println("Error reading "+file);
        }
        
        try {
        	FileInputStream in = new FileInputStream(file);
        	FileOutputStream eve = new FileOutputStream(f2);
        	FileOutputStream odd = new FileOutputStream(f3);
        	System.out.println("\n\nContents of "+file);
        	int c;
        	while((c= in.read())!= -1) {
        		System.out.print(c+" ");
        		if(c%2==0) {
        			eve.write(c);
        		}else {
        			odd.write(c);
        		}
        	}
        	System.out.println("\n\nEven and odd numbers have been seperated into "+f2+" and "+f3);
        	in.close();
        	eve.close();
        	odd.close();
        }catch(IOException e) {
        	System.out.println("Error reading "+file);
        }catch(NumberFormatException e) {
        	System.out.println("Invalid character read from "+file);
        }
        
        try {
        	FileInputStream eve = new FileInputStream(f2);
        	FileInputStream odd = new FileInputStream(f3);
        	System.out.println("\n\nContents of "+f2);
        	int c;
        	while((c= eve.read())!= -1) {
        		System.out.print(c+" ");
        		
        	}
        	System.out.println("\n\nContents of "+f3);
        	int d;
        	while((d= odd.read())!= -1) {
        		System.out.print(d+" ");
        		
        	}
        	eve.close();
        	odd.close();
        }catch(Exception e) {
        	System.out.println("Error reading "+file);
        }
        
	}

}
