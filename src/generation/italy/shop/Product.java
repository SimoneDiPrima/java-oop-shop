package generation.italy.shop;

import java.util.Random;
public class Product {
		
		String name;
		String description;
		int price;

		
		public Product(String name,String description,int price){
			this.name = name;
			this.description = description;
			this.price = price;
		}
		public int price() {
			return price;
		}

		public int tax() {
		
		return price = price +(price*20/100);
	}
		public static String getRandomNumberString() {
		    Random rnd = new Random();
		    int number = rnd.nextInt(99999);
		    return String.format("%05d", number);
		}
		
		public String toString(){

			return "il nome del Prodotto è: " + name + "\nCosa c è da sapere:" + description
					+ "\nprezzo: " + tax() + "€" + "\nEan:"+ getRandomNumberString();
			
	}
}


