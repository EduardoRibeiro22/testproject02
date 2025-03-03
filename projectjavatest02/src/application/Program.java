package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int rents = sc.nextInt();
		sc.nextLine();
		Student[] rent = new Student[10];

		for (int i = 0; i < rents; i++) {
			System.out.println();
			System.out.print("Rent #" + (i + 1));
			System.out.printf("%nEnter student name: ");
			String name = sc.nextLine();
			System.out.printf("Enter student E-mail: ");
			String eMail = sc.nextLine();
			System.out.print("Enter the room number of the rented room 0 - 9: ");
			int room = sc.nextInt();
			sc.nextLine();
			while (rent[room] != (null)) {
				System.out.println("This room is occupied!");
				 System.out.println("enter another: ");
				room = sc.nextInt();
				sc.nextLine();
				
			}
			rent[room] = new Student(name, eMail);

		}
		
		System.out.println("Busy rooms");
		for(int i = 0; i < rent.length; i++) {
			if(rent[i]!= (null)) {
				System.out.println("Room "+ i +": " + rent[i].getNome()+", " + rent[i].geteMail() );	
			}
			else {
				
			}
			
		}
			

		sc.close();
	}
}
