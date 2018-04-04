package mypersons.persontest;
import mypersons.Person;
import java.util.Scanner;
import mypersons.Child;
import mypersons.Adult;
public class Running {

	public static void main(String[] args) {
		Person person1;
		Person person2;
		
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("name:");
		name = input.nextLine();
		age = input.nextInt(); input.nextLine();

		if (age < 18) {
			System.out.println("school:");
			String school = input.nextLine();
			person1 = new Child(name, age, school);
		} else {
			System.out.println("workplace: ");
			String workplace = input.nextLine();
			person1 = new Adult(name, age, workplace);
		}
		System.out.println(person1);
		System.out.println(person1.getClass());
		System.out.println(person1 instanceof Person);
		System.out.println(person1 instanceof Child);
		System.out.println(person1 instanceof Adult);
		
		input.close();
	}

}
