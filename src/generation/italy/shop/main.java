package generation.italy.shop;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name: ");
		String name = sc.nextLine();
		
		System.out.print("description: ");
		String description = sc.nextLine();
		System.out.print("price: ");
		int price = sc.nextInt();
		
		Product p = new Product(name,description,price);
		System.out.println(p);

}
}
