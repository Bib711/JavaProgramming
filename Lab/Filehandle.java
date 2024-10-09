package lab1;
import java.io.*;
import java.util.Scanner;

public class Filehandle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        File file = new File("sample.txt");
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
            
        
        
        System.out.println("Enter the String:");
        String content = sc.nextLine();

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content); 
            fw.close();
            System.out.println("Content Written to "+file);
        } catch (IOException e) {
            System.out.printf("Error writing to file: %s%n", e.getMessage());
        }
        
        
        File file1 = new File("new-sample.txt");
        if (file1.exists()) {
            System.out.println(file1+ " exists.");
        } else {
        	try {
        		file.createNewFile();
        		System.out.println(file1 + " created.");
        	} catch (IOException e) {
        		System.out.println("Error: " + e.getMessage());
        	}
		}  
        
        try {
        	FileReader fr = new FileReader(file);
        	System.out.println("-------Contents of Sample.txt-------");
        	FileWriter fw = new FileWriter(file1);
        	int i;
        	while((i = fr.read())!= -1) {
        		System.out.print((char)i);
        		fw.write((char)i);
        	}
        	System.out.println("\nContents copied from "+file+" to "+file1);
        	fr.close();
        	fw.close();
        }catch(IOException e) {
        	System.out.printf(e.getMessage());
        }
        
        try {
        	FileReader fr = new FileReader(file1);
        	System.out.println("\n-------Contents of new-sample.txt-------");
        	int i;
        	while((i = fr.read())!= -1) {
        		System.out.print((char)i);
        	}
        	fr.close();
        }catch(IOException e) {
        	System.out.printf(e.getMessage());
        }
        
        sc.close(); 
    }
}
