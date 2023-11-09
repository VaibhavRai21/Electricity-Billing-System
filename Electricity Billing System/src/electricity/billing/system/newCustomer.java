package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class newCustomer extends JFrame implements ActionListener {
    JTextField nametext,addresstext,citytext,statetext,emailtext,phonetext;
    JLabel meternotext;
    JButton next,cancel;

    newCustomer(){
        super("New Customer");
        getContentPane().setBackground(new Color(215, 202, 44));


        JLabel newname= new JLabel( "Customer Name");
        newname.setBounds(280,50,100,50);
        add(newname);


        nametext = new JTextField();
        nametext.setBounds(400,70,150,20);
        add(nametext);

        JLabel meter= new JLabel( "Meter No.");
        meter.setBounds(280,100,100,50);
        add(meter);

        meternotext = new JLabel();
        meternotext.setBounds(400,115,150,20);
        add(meternotext);

        Random ran = new Random();
        long number = ran.nextLong() % 1000000;
        meternotext.setText(""+Math.abs(number));

        JLabel address= new JLabel( "Address");
        address.setBounds(280,150,100,50);
        add(address);

        addresstext = new JTextField();
        addresstext.setBounds(400,165,150,20);
        add(addresstext);


        JLabel city= new JLabel( "City");
        city.setBounds(280,200,100,50);
        add(city);

        citytext = new JTextField();
        citytext.setBounds(400,215,150,20);
        add(citytext);

        JLabel state= new JLabel( "State");
        state.setBounds(280,250,100,50);
        add(state);

        statetext = new JTextField();
        statetext.setBounds(400,270,150,20);
        add(statetext);

        JLabel email= new JLabel( "Email");
        email.setBounds(280,300,100,50);
        add(email);

        emailtext = new JTextField();
        emailtext.setBounds(400,315,150,20);
        add(emailtext);

        JLabel phone= new JLabel( "Phone No.");
        phone.setBounds(280,350,100,50);
        add(phone);

        phonetext = new JTextField();
        phonetext.setBounds(400,365,150,20);
        add(phonetext);


        next = new JButton("Next");
        next.setBounds(280,410,100,30);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add( next);

        cancel = new JButton("Cancel");
        cancel.setBounds(420,410,110,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon nprofile = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image profileone = nprofile.getImage().getScaledInstance( 230 , 200 ,Image.SCALE_DEFAULT);
        ImageIcon profiletwo = new ImageIcon(profileone);
        JLabel profilelabel = new JLabel(profiletwo);
        profilelabel.setBounds(-30,100,300,200);
        add(profilelabel);





        setLayout(null);
        setSize(600 , 500);
        setLocation(450,180);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String sname = nametext.getText();
            String smeter = meternotext.getText();
            String saddress = addresstext.getText();
            String scity = citytext.getText();
            String sstate = statetext.getText();
            String eemail = emailtext.getText();
            String ephone = phonetext.getText();

            try {
                DataBase c = new DataBase();
                String query_customer = "insert into new_customer values('"+sname+"','"+smeter+"','"+saddress+"','" +scity+"','"+sstate+"','" +eemail+"','"+ephone+"')";
                String query_signup = "insert into signup values('"+smeter+"','','"+sname+"','','')";

                c.statement.executeUpdate(query_customer);
                c.statement.executeUpdate(query_signup);

                JOptionPane.showMessageDialog(null, "You are a Customer");
                setVisible(false);
                new meterinfo(smeter);
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new newCustomer();
    }
}
