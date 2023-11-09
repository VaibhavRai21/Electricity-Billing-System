package electricity.billing.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.concurrent.ConcurrentHashMap;

public class Signup extends JFrame implements ActionListener {

    Choice loginasCho;
    JTextField metertext,employertext,displaytext,nametext,passtext;

    JButton create,back;

    Signup(){
        super("Create Account");
        getContentPane().setBackground(new Color(132, 165, 186));

        JLabel loginchoice = new JLabel( "Create Account As*");
        loginchoice.setBounds(25,30,120,20);
        add(loginchoice);

        loginasCho = new Choice();
        loginasCho.add("Admin");
        loginasCho.add("Customer");
        loginasCho.setBounds(150,30,150,20);
        add(loginasCho);


        JLabel meternum = new JLabel( "Meter No./Cust ID*");
        meternum.setBounds(25,80,120,20);
        meternum.setVisible(false);
        add(meternum);

        metertext = new JTextField();
        metertext.setBounds(150,80,150,20);
        metertext.setVisible(false);
        add(metertext);

        JLabel employee = new JLabel( "Employee ID");
        employee.setBounds(25,80,120,20);
        employee.setVisible(true);
        add(employee);

        employertext = new JTextField();
        employertext.setBounds(150,80,150,20);
        employertext.setVisible(true);
        add(employertext);

        JLabel displayName = new JLabel( "DisplayName*");
        displayName.setBounds(50,140,100,20);
        add(displayName);

        displaytext = new JTextField();
        displaytext.setBounds(150,140,150,20);
        add(displaytext);

        JLabel name = new JLabel( "Name*");
        name.setBounds(50,200,100,20);
        add(name);

        nametext = new JTextField();
        nametext.setBounds(150,200,150,20);
        add(nametext);

        JLabel password = new JLabel( "Password*");
        password.setBounds(50,260,100,20);
        add(password);

        passtext = new JTextField();
        passtext.setBounds(150,260,150,20);
        add(passtext);

        loginasCho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String user = loginasCho.getSelectedItem();
                if(user.equals("Customer")){
                    employee.setVisible(false);
                    employertext.setVisible(false);
                    meternum.setVisible(true);
                    metertext.setVisible(true);
                }else {
                    employee.setVisible(true);
                    employertext.setVisible(true);
                    meternum.setVisible(false);
                    metertext.setVisible(false);
                }
            }
        });

        create = new JButton("Create");
        create.setBounds(70,320,80,20);
        create.addActionListener(this);
        add(create);

        back = new JButton("Back");
        back.setBounds(200,320,80,20);
        back.addActionListener(this);
        add(back);

        ImageIcon signupprofile = new ImageIcon(ClassLoader.getSystemResource("icon/splash/signup.png"));
        Image signupprofileone = signupprofile.getImage().getScaledInstance( 300, 250 ,Image.SCALE_DEFAULT);
        ImageIcon signupprofiletwo = new ImageIcon(signupprofileone);
        JLabel signuplabel = new JLabel(signupprofiletwo);
        signuplabel.setBounds(350,20,300,300);
        add(signuplabel);

        setSize(700,400);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == create){
            String sloginas = loginasCho.getSelectedItem();
            String susername = displaytext.getText();
            String sname = nametext.getText();
            String spassword = passtext.getText();
            String smeter = metertext.getText();

            try{
                DataBase c = new DataBase();
                String query = null;
                query = "insert into signup value('"+sloginas+"','"+susername+"','"+sname+"','"+spassword+"','"+smeter+"')";
                c.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Great Success!");
                setVisible(false);
                new Login();

            }catch (Exception E){
                E.printStackTrace();
            }
        }
        else if (e.getSource()== back){
            setVisible(false);
            new Login();

        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
