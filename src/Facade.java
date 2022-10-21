import java.util.*;

import static java.lang.System.exit;

public class Facade {
	private final Scanner ioscanner = new Scanner(System.in);
	public Facade(){
		System.out.println("**********************************************************");
		System.out.println("                      Facade Pattern                            ");
		System.out.println("**********************************************************");
		BeginFacade();

	}

	private void BeginFacade() {
		System.out.println("Facade is Initiated");
		boolean Islogin = login();
		if(!Islogin)
		{
			System.out.println("Login unsuccessfully");
			exit(0);
		}else{
			System.out.println("Login successful");
			System.out.println("\nEnter 1 for MeatProductMenu \n  Enter 2 for ProduceProductMenu\n");
			String selectedMenu = ioscanner.next();
			if(selectedMenu.equals("1")){
				MeatProductMenu meat =new MeatProductMenu();
				meat.showMenu();
			}
			if(selectedMenu.equals("2")){
				ProduceProductMenu produce =new ProduceProductMenu();
				produce.showMenu();
			}


		}
	}


	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() {
		Login loginobj = new Login();
		int user = loginobj.selectedUserType();
		setusertype(user);
		return loginobj.Authenticate();

	}

	private void setusertype(int user) { this.UserType=user;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoitem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}
}
