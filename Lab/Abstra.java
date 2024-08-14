package Lab1;
import java.util.*;
abstract class Shape{
	abstract void noOfSides();
}//no of sides -2 *180


class Triangle extends Shape{
	int side,angle;
	Triangle(int side){
		this.side = side;
		angle= (side-2)*180;
	}
	//int angle= (side-2)*180;
	void noOfSides() {
		System.out.printf("\nI am a Triangle. I have %d sides.\nSum of Angles = %d",side,angle);
	}
}
class Rectangle extends Shape{
	int side,angle;
	Rectangle(int side){
		this.side = side;
		angle= (side-2)*180;
	}
	
	void noOfSides() {
		System.out.printf("\nI am a Rectangle. I have %d sides.\nSum of Angles = %d",side,angle);
	}
}
class Hexagon extends Shape{
	int side,angle;
	Hexagon(int side){
		this.side = side;
		angle= (side-2)*180;
	}
	
	void noOfSides() {
		System.out.printf("\nI am a Hexagon. I have %d sides.\nSum of Angles = %d",side,angle);
	}
}
public class Abstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int side;
		String s1 = "y";
		String s2= null;
		
		
		do {
			System.out.println("Enter the number of sides for the geometric shape:");
			side = sc.nextInt();
			if (side==3) {
				Triangle t = new Triangle(side);
				System.out.printf("Shape with %d sides:\n",side);
				t.noOfSides();
				
			}
			else if(side==4) {
				Rectangle r = new Rectangle(side);
				System.out.printf("Shape with %d sides:\n",side);
				r.noOfSides();
			}
			else if(side==6) {
				Hexagon h = new Hexagon(side);
				System.out.printf("Shape with %d sides:\n",side);
				h.noOfSides();
			}
			else {
				System.out.printf("Shape with %d is not supported.",side);
			}
			System.out.println("\nDo you wanna continue? (y/n) :");
			s2= sc.next();
		}while(s1.equals(s2));
		System.out.println("Exiting program. Goodbye!");
	}

}
