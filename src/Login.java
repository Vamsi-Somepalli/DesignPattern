import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {


    private int Usertype;
    private final Scanner ioscanner = new Scanner(System.in);

    public int selectedUserType() {
        boolean validentry = false;
        while (!validentry) {
            System.out.println("Please Select Login Type \n0. Buyer\n1.Seller");
            Usertype = ioscanner.nextInt();
            if (Usertype == 0 || Usertype == 1) {
                validentry = true;
            }
        }
        return Usertype;
    }

    public boolean Authenticate() {
        System.out.println("Please enter your username : "); // Scans the username
        String Username = ioscanner.next();
        System.out.println("Please enter your password : "); // Scans the password
        String Passcode = ioscanner.next();
        File file;
        if (Usertype == 0) {
            file = new File("TextFiles/BuyerInfo.txt");
        } else {
            file = new File("TextFiles/SellerInfo.txt");
        }
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] creds = sc.nextLine().split(":");
                if (Username.equals(creds[0]) && Passcode.equals(creds[1])) {
                    System.out.println("Login successful");
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}

