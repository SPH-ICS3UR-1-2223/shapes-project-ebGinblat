package shapes;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner in = new Scanner(System.in);

int userChoice;
Rectangle rr = null;
Circle cc =null;
Triangle tt =null;
do {
System.out.println("Choose your shape");
System.out.println("1. Triangle");
System.out.println("2. Circle");
System.out.println("3. Rectangle");
System.out.println("4. Quit");


System.out.println("Your Selection: ");

userChoice = in.nextInt();

if(userChoice == 1) {
System.out.println("You Chose TRIANGLE");
System.out.println("Enter a number for the sides");
System.out.println("How long is Side A,B, and C? (Enter your number then press SHIFT");
tt = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
tt.printStats();
}   else if (userChoice == 2) {
System.out.println("You Chose CIRCLE");
System.out.println("Enter a number for the radius");
System.out.println("How long is the radius? (Enter your number then press SHIFT");
cc = new Circle(in.nextDouble());
cc.printStats();
} else if(userChoice == 3) {
System.out.println("You Chose RECTANGLE");
System.out.println("Enter a number for the lenth and width ");
System.out.println("How long is the Length and Width? (Enter your number then press SHIFT");
rr = new Rectangle(in.nextDouble(), in.nextDouble());
rr.printStats();

}else if (userChoice == 4); {
   System.out.println("This is the end.....");
   System.exit(0); }



} while (userChoice != 4);
System.out.println("NEW SET");
   



}
}