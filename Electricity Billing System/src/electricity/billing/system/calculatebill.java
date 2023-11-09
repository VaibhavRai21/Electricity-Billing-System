package electricity.billing.system;



import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.sql.ResultSet;

public class calculatebill extends JFrame {
    JLabel nametext,addresstext;

    Choice meternoCho;
    calculatebill(){


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(149, 126, 185));
        add(panel);

        JLabel heading = new JLabel( "Calculate Electricity Bill");
        heading.setBounds(120,-5,230,50);
        heading.setFont(new Font("Thomae",Font.BOLD,20));
        panel.add(heading);

        JLabel meter= new JLabel( "Meter Number");
        meter.setBounds(80,70,100,50);
        meter.setFont(new Font("Algerian",Font.PLAIN,13));
        panel.add(meter);

        meternoCho = new Choice();
        try {

            DataBase c = new DataBase();
            ResultSet resultSet = c.statement.executeQuery("select * from new_customer");
            while (resultSet.next()){
               meternoCho.add(resultSet.getString("meterno"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        meternoCho.setBounds(200,85,100,50);
        panel.add(meternoCho);

        JLabel name= new JLabel( "Name : ");
        name.setBounds(80,140,100,20);
        name.setFont(new Font("Algerian",Font.PLAIN,13));
        panel.add(name);

        nametext = new JLabel("");
        nametext.setBounds(200,155,150,20);
        panel.add(nametext);

        JLabel address= new JLabel( "Address :");
        address.setBounds(80,190,150,20);
        address.setFont(new Font("Algerian",Font.PLAIN,13));
        panel.add(address);

        addresstext = new JLabel("");
        addresstext.setBounds(200,205,150,20);
        panel.add(addresstext);

        try {
            DataBase c = new DataBase();
            ResultSet resultSet = c.statement.executeQuery("select * from new_customer where meterno = '"+meternoCho.getSelectedItem());
            while(resultSet.next()){
                nametext.setText(resultSet.getString("name"));
                addresstext.setText(resultSet.getString("address"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }


        setSize(650,400);
        setLocation(470,200);
        setVisible(true);


    }

    public static void main(String[] args) {
        new calculatebill();
    }
}
