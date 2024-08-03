import java.util.*;
public class Charsame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter the string:");
        String str = obj.nextLine();
        String subStr = str.substring(0, 2);
        System.out.println((str.endsWith(subStr))?str+" ends with "+subStr:str+" does not ends with "+subStr);
        obj.close();
    }
}


