package electricity.billing.system;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class meterinfo extends JFrame implements ActionListener {
    JLabel meternoloc;
    Choice meterloccho,metertypecho,phasecodecho,billtypecho;
    JButton submit;
    String meternumber;

    meterinfo(String meternumber){
        this.meternumber = meternumber;
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.yellow);
        add(panel);

        JLabel heading = new JLabel( "Meter Information");
        heading.setBounds(180,0,200,50);
        heading.setFont(new Font("Thomae",Font.BOLD,20));
        panel.add(heading);

        JLabel meterno= new JLabel( "Meter Number : ");
        meterno.setBounds(40,60,100,20);
        panel.add(meterno);

        JLabel meternotext= new JLabel(meternumber);
        meternotext.setBounds(150,60,100,20);
        panel.add(meternotext);

        meternoloc= new JLabel( "Meter No. Location");
        meternoloc.setBounds(40,100,120,20);
        panel.add(meternoloc);

        metertypecho = new Choice();
        metertypecho.add("Outside");
        metertypecho.add("Inside");
        metertypecho.setBounds(170,100,100,20);
        panel.add(metertypecho);

        JLabel metertype= new JLabel( "Meter Type");
        metertype.setBounds(40,140,100,20);
        panel.add(metertype);

        meterloccho = new Choice();
        meterloccho.add("Electric Motor");
        meterloccho.add("Solar Meter");
        meterloccho.add("Smart Meter");
        meterloccho.setBounds(170,140,100,20);
        panel.add(meterloccho);

        JLabel phasecode= new JLabel( "Phase Code");
        phasecode.setBounds(40,200,100,20);
        panel.add(phasecode);

        phasecodecho = new Choice();
        phasecodecho.add("011");
        phasecodecho.add("022");
        phasecodecho.add("033");
        phasecodecho.add("044");
        phasecodecho.add("055");
        phasecodecho.add("066");
        phasecodecho.add("077");
        phasecodecho.setBounds(170,200,100,20);
        panel.add(phasecodecho);

        JLabel billtype= new JLabel( "Bill Type");
        billtype.setBounds(40,240,100,20);
        panel.add(billtype);

        billtypecho = new Choice();
        billtypecho.add("Normal");
        billtypecho.add("Industrial");
        billtypecho.setBounds(170,240,100,20);
        panel.add(billtypecho);

        JLabel cycle= new JLabel( "30 Days Billing Time....");
        cycle.setBounds(40,300,200,20);
        panel.add(cycle);

        JLabel note= new JLabel( "Note-"+ "\n" +"Pay Your Bill on Time to avoid Panelty");
        note.setBounds(40,360,300,20);
        panel.add(note);

        submit = new JButton("Submit");
        submit.setBounds(40,410,100,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        panel.add(submit);


        ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("icon/details.png"));
        Image d2 = d1.getImage().getScaledInstance( 230 , 200 ,Image.SCALE_DEFAULT);
        ImageIcon d3 = new ImageIcon(d2);
        JLabel imglabel = new JLabel(d3);
        add( imglabel,"East");




        setSize(600 , 500);
        setLocation(450,180);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String smeterno = meternumber;
            String smeterloc = meterloccho.getSelectedItem();
            String smetertype = metertypecho.getSelectedItem();
            String spahsecode = phasecodecho.getSelectedItem();
            String sbilltype = billtypecho.getSelectedItem();
            String sday = "30";


            String query_meter = "Insert into meter_info values('"+smeterno+"','"+smeterloc+"','"+smetertype+"','"+spahsecode+"','"+sbilltype+"','"+sday+"')";

            try {
                DataBase c = new DataBase();
                c.statement.executeUpdate(query_meter);

                JOptionPane.showMessageDialog(null, "You registered successfully!");
                setVisible(false);
                new MainScreen();
            }
            catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new meterinfo("");
    }
}





