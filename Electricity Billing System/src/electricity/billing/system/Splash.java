package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash(){
        super("Welcome !");
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/ebs.png"));
        Image imageone = imageIcon.getImage().getScaledInstance( 1530 , 800 ,Image.SCALE_DEFAULT);
        ImageIcon imagetwo = new ImageIcon(imageone);
        JLabel imageLabel = new JLabel(imagetwo);
        add(imageLabel);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

        try {
            Thread.sleep(4000);
            setVisible(false);

            new Login();
        }catch(Exception e){
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new Splash();

    }
}
