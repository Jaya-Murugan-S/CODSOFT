package codesoft;

import java.util.Scanner;

public class gradecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\tSTUDENT GRADE CALCULATOR\t\t\t");
		System.out.println("enter the student\'s name");
		String name=sc.nextLine();
		System.out.println("enter the number of subjects:");
		int num_sub=sc.nextInt();
		int marks[]=new int[num_sub];
		int sum=0;
		for(int i=0;i<num_sub;i++) {
			System.out.print("Enter the mark of subject"+(i+1));
			marks[i]=sc.nextInt();
			sum+=marks[i];
		}
		double average=sum/(num_sub);
		System.out.print(name+", ");
		if(average>=90) {
			System.out.println("WOWWW!✨,Your average is "+(Math.round(average*100)/100)+" and your grade is \"S\"");
		}
		else if(average>=80&&average<90) {
			System.out.println("Superb!,Your average is "+(Math.round(average*100)/100)+" and your grade is \"A\"");
		}
		else if(average>=70&&average<80) {
			System.out.println("Good!,Your average is "+(Math.round(average*100)/100)+" and your grade is \"B\"");
		}
		else if(average>=60&&average<70) {
			System.out.println("Your average is "+(Math.round(average*100)/100)+" and your grade is \"C\".Need improvements in studies");
		}
		else if(average>=40&&average<60) {
			System.out.println("Your average is "+(Math.round(average*100)/100)+" and your grade is \"D\".Need improvements in studies");
		}
		else {
			
				System.out.println("Your average is "+(Math.round(average*100)/100)+" and your grade is \"F\".Sorry you have failed😔😔");
			
		}
	}

}
