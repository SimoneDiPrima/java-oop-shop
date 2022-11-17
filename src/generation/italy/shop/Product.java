package generation.italy.shop;

public class Product {
		
		String name;
		String description;
		int price;

		
		public Product(String name,String description,int price){
			this.name = name;
			this.description = description;
			this.price = price;
		}

		public int tax() {
		
		return price = price -(price*20/100);
	}
		public String toString() {

			return "il nome del Prodotto è: " + name + "\nCosa c è da sapere:" + description
					+ "\nprezzo: " + tax() + "€";
				
		}
	}


