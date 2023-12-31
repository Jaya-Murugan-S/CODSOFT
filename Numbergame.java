package codesoft;

import java.util.Random;
import java.util.Scanner;



public class Numbergame {

	public static void clues(int n) {
		Function[] func= {
				(paramValue)->func1(paramValue),
				(paramValue)->func2(paramValue),
				(paramValue)->func3(paramValue)
		};
		int randindex=new Random().nextInt(func.length);
		func[randindex].apply(n);
	}
	interface Function{
		void apply(int n);
	}
	private static void func1(int n) {
		if(n%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
	}
private static void func2(int n) {
		System.out.println("last digit of the number is "+n%10);
	}
private static void func3(int n) {
	System.out.println("First digit of the number is "+n/10);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("\t\t\tWelcome to the NUMBER GAME\t\t\t");
			System.out.println("RULES:");
			System.out.println("1.Your task is to guess the random number between 1 to 100.\n2.You want to guess within 10 attempts.\n3.You will have clues to find it.But you have only one chance to use it.\n4.Based on the number of attempts,your score will be determined. ");
			int no_of_attempt=10;
			int random=rand.nextInt(1,101);
			int num_life=0;
			boolean find=false;
			int i=1;
			while(i<=no_of_attempt) {
				System.out.println("Guess the Number between 1 to 100:");
				int guess=sc.nextInt();
				if(guess==random) {
					find=true;
					String ans=num_life==1?" by using lifeline":" without using lifeline";
					String suffix=i==1?"st":i==2?"nd":i==3?"rd":"th";
					System.out.println("Congrats😁😁😎!you have guessed the number. "+guess+"in "+i+suffix+" time"+ans+".\nYour score is "+(100-(i-1)*10));
					break;
				}
				else {
					String accur=guess>random?"higher":"lower";
					System.out.println("Your guess is "+accur+" than original number.\nDont worry,you have remaining "+(10-i)+" chances.");
					if(num_life==0) {
					System.out.println("Do you want to use your lifeline.\nenter 1 for yes and enter 2 for no");
					int life=sc.nextInt();
					
					if(life==1) {
						num_life++;
						clues(random);
					}
					else{
						System.out.println("ok,You continue.");}
					}}
				
				i++;
			}
			if(find==false) {
				System.out.println("Sorry😔,you didn't guess it.The number is "+random);
			}
			System.out.println("do you want to play again?yes or no");
			String resp=sc.next();
			if(resp.equals("no")) break;
			
			
		}
	}

}
