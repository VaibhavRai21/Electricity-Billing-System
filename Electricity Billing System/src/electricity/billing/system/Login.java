package electricity.billing.system;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField usertext;
    JTextField passtext;
    Choice loginasCho;

    JButton loggin,signup,cancel;

    Login(){
        super("Login");
        getContentPane().setBackground(new Color(106, 145, 120));


        JLabel username = new JLabel( "UserName");
       // username.setForeground(Color.white);
        username.setBounds(300,20,100,50);
        add(username);

        usertext = new JTextField();
        usertext.setBounds(400,35,150,20);
        add(usertext);

        JLabel password = new JLabel("Password");
       // password.setForeground(Color.white);
        password.setBounds(300,60,70,50);
        add(password);

        passtext = new JTextField();
        passtext.setBounds(400,80,150,20);
        add(passtext);

        JLabel logginas = new JLabel( "Login As");
        // username.setForeground(Color.white);
        logginas.setBounds(300,100,100,50);
        add(logginas);

        loginasCho = new Choice();
        loginasCho.add("Admin");
        loginasCho.add("Customer");
        loginasCho.setBounds(300,120,200,20);
        add(loginasCho);

        loggin = new JButton("Log In");
        loggin.setBounds(280,170,100,20);
        loggin.addActionListener(this);
        add(loggin);

        signup = new JButton("Sign Up");
        signup.setBounds(450,170,100,20);
        signup.addActionListener(this);
        add(signup);

        cancel = new JButton("Cancel");
        cancel.setBounds(360,220,110,20);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon profile = new ImageIcon(ClassLoader.getSystemResource("icon/profile2.jpg"));
        Image profileone = profile.getImage().getScaledInstance( 250 , 300 ,Image.SCALE_DEFAULT);
        ImageIcon profiletwo = new ImageIcon(profileone);
        JLabel profilelabel = new JLabel(profiletwo);
        profilelabel.setBounds(-30,0,300,300);
        add(profilelabel);

        setSize(600 , 300);
        setLocation(450,250);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancel) {
            setVisible(false);

        } else if (e.getSource() == loggin){
            loggin.setVisible(false);
            new MainScreen();
            String user = usertext.getText();
            String pass = passtext.getText();
            String suser = loginasCho.getSelectedItem();

            try{
                DataBase c = new DataBase();
                String query = "select * from signup where username = '"+user+"', and password = '"+pass+"' and usertype = '"+suser+"'";
                ResultSet resultset= c.statement.executeQuery(query);

                if(resultset.next()){
                    setVisible(false);
                    new MainScreen();}
                else {
                    JOptionPane.showMessageDialog(null,"Invalid Login");

                }

            }catch (Exception E){
                E.printStackTrace();
            }

    }
        else if (e.getSource()==signup){
            setVisible(false);
            new Signup();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
