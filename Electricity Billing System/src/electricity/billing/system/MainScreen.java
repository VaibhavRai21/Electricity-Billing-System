package electricity.billing.system;
import java.applet.*;
import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame {
    MainScreen(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new FlowLayout());

        JLabel text = new JLabel( "Welcome to Vaibhav Anish Ayman Electricity Billing System");
        text.setFont(new Font("GreatVibes",Font.BOLD,20));
        text.setForeground(Color.black);
        text.setBounds(30,110,200,20);
        add(text);

        ImageIcon mainimage = new ImageIcon(ClassLoader.getSystemResource("icon/pay-advance-electricity-bill.jpg"));
        Image mainimageone = mainimage.getImage().getScaledInstance( 1530, 730 ,Image.SCALE_SMOOTH);
        ImageIcon mainimagetwo = new ImageIcon(mainimageone);
        JLabel mainlabel = new JLabel(mainimagetwo);
        add(mainlabel);

        JMenuBar menuBar =new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,20));
        menuBar.add(menu);

        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon customer = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image customerone = customer.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(customerone));
        menu.add(newcustomer);

//        JMenuItem lines = new JMenuItem("----------------------");
//        lines.setFont(new Font("serif",Font.PLAIN,20));
//        menu.add(lines);

        JMenuItem cusdetails = new JMenuItem("Customer Details");
        cusdetails.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon detailsone = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image detailstwo = detailsone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        cusdetails.setIcon(new ImageIcon(detailstwo));
        menu.add( cusdetails);

        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon depositone = new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
        Image deposittwo = depositone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(deposittwo));
        menu.add(depositdetails);

        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon calbillone = new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image callbilltwo = calbillone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(callbilltwo));
        menu.add(calculatebill);

        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif",Font.PLAIN,20));
        menuBar.add(info);

        JMenuItem updateinfo = new JMenuItem("Update Information");
        updateinfo.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon updateinfoone = new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image updateinfotwo = updateinfoone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        updateinfo.setIcon(new ImageIcon(updateinfotwo));
        info.add(updateinfo);

        JMenuItem viewinfo = new JMenuItem("View Information");
        viewinfo.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon viewinfooone = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
        Image viewinfotwo = viewinfooone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(viewinfotwo));
        info.add(viewinfo);

        JMenu user = new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,20));
        menuBar.add(user);

        JMenuItem billpay = new JMenuItem("Pay Bill");
        billpay.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon billpayone = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image billpaytwo = billpayone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        billpay.setIcon(new ImageIcon(billpaytwo));
        user.add(billpay);

        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon billdetailsone = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image billdetailstwo = billdetailsone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailstwo));
        user.add(billdetails);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,20));
        menuBar.add(utility);

        JMenuItem notepad = new JMenuItem("notepad");
        notepad.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon notepadone = new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image notepadtwo = notepadone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadtwo));
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon  calculatorone= new ImageIcon(ClassLoader.getSystemResource("icon/calculator.png"));
        Image calculatortwo = calculatorone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatortwo));
        utility.add(calculator);

        JMenuItem genbill = new JMenuItem("Generate Bill");
        genbill.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon genbillimg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image genbillimgnew = genbillimg.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        genbill.setIcon(new ImageIcon(genbillimgnew));
        menuBar.add(genbill);

        JMenuItem exit = new JMenuItem("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,20));
        ImageIcon exitone = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image exittwo = exitone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(exittwo));
        menuBar.add(exit);














//        JMenuItem dontpress = new JMenuItem("The Buster Call");
//        dontpress.setAlignmentX(Box.RIGHT_ALIGNMENT);
//        dontpress.setFont(new Font("serif",Font.PLAIN,20));
//        AudioClip ac = getTitle(getCodeBase(), soundFile);
//        ac.play();   //play once
//        ac.stop();   //stop playing
//        ac.loop();   //play continuously
//        ImageIcon dontpressone = new ImageIcon(ClassLoader.getSystemResource("icon/dontpress.png"));
//        Image dontpresstwo = dontpressone.getImage().getScaledInstance( 20, 20,Image.SCALE_DEFAULT);
//        dontpress.setIcon(new ImageIcon(dontpresstwo));
//        menuBar.add(dontpress);
//
        setVisible(true);


        try{

        }catch (Exception e){
           e.printStackTrace();
       }
    }


    public static void main(String[] args) {
        new MainScreen();
    }

}
