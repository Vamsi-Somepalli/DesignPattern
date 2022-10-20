import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Loginpage extends JFrame implements ActionListener {


    private JPanel panel1;
    private JTextField Usenametext;


    private JPasswordField passwordtext;
    private JButton loginButton;
    private JRadioButton buyerButton;
    private JRadioButton sellerButton;

    private JFrame frame;

    public Loginpage(){

        ButtonGroup group = new ButtonGroup();
        group.add(buyerButton);
        buyerButton.setSelected(true);
        group.add(sellerButton);
        frame = new JFrame("Login" );
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setSize(350,250);
        frame.add(panel1);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        loginButton.addActionListener(this::actionPerformed);

    }
    public void actionPerformed(ActionEvent e) {
        Boolean buyerauthenticated = false;
        Boolean sellerauthenticated = false;
        String Username = Usenametext.getText();
        String password = String.valueOf(passwordtext.getPassword());
        Boolean Buyyer = buyerButton.isSelected();

        if (Buyyer){
            File file = new File("TextFiles/BuyerInfo.txt");
            Scanner sc = null;
            try {
                sc = new Scanner(file);
                while (sc.hasNextLine())
                {
                    String str =  sc.nextLine();
                    String[] creds =str.split(":");
                    if(Username.equals(creds[0]) && password.equals(creds[1])) buyerauthenticated=true;
                }
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }else{
            File file = new File("TextFiles/SellerInfo.txt");
            Scanner sc = null;
            try {
                sc = new Scanner(file);
                while (sc.hasNextLine())
                {
                    String str =  sc.nextLine();
                    String[] creds =str.split(":");
                    if(Username.equals(creds[0]) && password.equals(creds[1])) sellerauthenticated=true;
                }
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }

        if(sellerauthenticated) {

        } else if (buyerauthenticated) {
            
        } else{
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
        }
        frame.dispose();

    }
}
