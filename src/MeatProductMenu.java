import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {



	public void showMenu() {
		System.out.println("**********************************************************");
		System.out.println("                      Bridge Pattern                            ");
		System.out.println("**********************************************************");


		File file =new File("TextFiles/ProductInfo.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine())
			{
				String str =  sc.nextLine();
				String[] ary =str.split(":");
				String meatORproduce = ary[0];
				String value = ary[1];
				if(meatORproduce.equals("Meat"))
					System.out.println("Meat : "+value);

			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}


	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
