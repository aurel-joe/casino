//import javax.swing.*;
import java.util.Scanner;

public class Runner {
	public static void main (String[] args) {
		
		//JFrame frame = new JFrame("Input Dialog");
		
		//String input = JOptionPane.showInputDialog(frame, "Enter your name");
		
		//System.out.println(input);
		
		//JOptionPane.showMessageDialog(frame, "Hello "+ input+ "!");
		
		//for(int i=0;i<5;i++)
			
		//Slow bob = new Slow();
		//bob.sloww();
		//Fast f = new Fast();
		Scanner k = new Scanner(System.in);
		boolean done = false;
		do {
			System.out.println("WELCOME TO PLINKO!!!");
			System.out.println("");
			System.out.println("Please pick a mode!");
			System.out.print("Slow Mode[1]/Fast Mode[2]/None[0]:: ");
			System.out.print("");
			
			int outcome = k.nextInt();
			if(outcome == 1) {
				System.out.print("How much money do you start with? :: ");
				int mula = k.nextInt();
				Slow s = new Slow(mula);
				s.run();
			}
			else if(outcome == 2) {
				Fast f = new Fast();
				f.run();
			}
			System.out.println("");
			System.out.print("Continue [0,1]:: ");
			done = k.nextInt() == 1;
		}while(done);
		k.close();
		
	}

}
