package com.qestion2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app extends JFrame {


    public JPanel mainbody;
    public  int burger = 0;
    public  int burgerp = 0;
    public int pizza = 0;
    public int pizzap = 0;
    public  int pasta =0;
    public  int pastap =0;
    private JTextField textField1;
    private JButton BURGERButton;
    private JButton a2XButton;
    private JButton PIZZAButton;
    private JButton a2XButton1;
    private JButton PASTAButton;
    private JButton a2XButton2;
    private JButton orderButton;
    private JButton a1XButton;
    private JButton a1XButton1;
    private JButton a1XButton2;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton clearButton;

    public app() {
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(" BURGER : " + burger +"X"+"\n PIZZA : "+pizza+"X"+"\n PIZZA : "+pasta+"X" );
                if(burger != 0 || pizza != 0 || pasta != 0 )
                {textField2.setText(" Your Order ill be served soon ");}
                else
                {
                    textField2.setText("You haven't order anything let the menu helps you to find your food ");
                }
                textField3.setText(burger+"*"+" 220 _"+pizza+"*"+" 320 _"+pasta+"*"+" 240 ");
                int fare = 0 ;
                fare = ((burger)*220)+(pizza*320)+(pasta*240);
                textField4.setText("  "+fare+"/=");
                pastap=0;
                pizzap=0;
                burgerp=0;
                burger = 0;
                pizza = 0;
                pasta =0;
            }
        });
        BURGERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                burger++;
                textField1.setText("");
                textField2.setText(" BURGER : " + burger +"X"+"\n PIZZA : "+pizza+"X"+"\n PIZZA : "+pasta+"X" );
                textField3.setText(burger+"*"+" 220 _"+pizza+"*"+" 320 _"+pasta+"*"+" 240 ");
            }
        });
        PIZZAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizza++;
                textField1.setText("");
                textField2.setText(" BURGER : " + burger +"X"+"\n PIZZA : "+pizza+"X"+"\n PIZZA : "+pasta+"X" );
                textField3.setText(burger+"*"+" 220 _"+pizza+"*"+" 320 _"+pasta+"*"+" 240 ");
            }
        });
        PASTAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasta++;
                textField1.setText("");
                textField2.setText(" BURGER : " + burger +"X"+"\n PIZZA : "+pizza+"X"+"\n PIZZA : "+pasta+"X" );
                textField3.setText(burger+"*"+" 220 _"+pizza+"*"+" 320 _"+pasta+"*"+" 240 ");
            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(burger > 0) {
                    burger--;
                    textField1.setText("");
                    textField2.setText(" BURGER : " + burger + "X" + "\n PIZZA : " + pizza + "X" + "\n PIZZA : " + pasta + "X");
                    textField3.setText(burger + "*" + " 220 _" + pizza + "*" + " 320 _" + pasta + "*" + " 240 ");
                }
                else {
                    JOptionPane.showMessageDialog(null,"!!! Invalid Input !!!","Error Massage",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        a1XButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pizza > 0) {
                    pizza--;
                    textField1.setText("");
                    textField2.setText(" BURGER : " + burger + "X" + "\n PIZZA : " + pizza + "X" + "\n PIZZA : " + pasta + "X");
                    textField3.setText(burger + "*" + " 220 _" + pizza + "*" + " 320 _" + pasta + "*" + " 240 ");
                }
                else {
                    JOptionPane.showMessageDialog(null,"!!! Invalid Input !!!","Error Massage",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        a1XButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pasta > 0) {
                    pasta--;
                    textField1.setText("");
                    textField2.setText(" BURGER : " + burger + "X" + "\n PIZZA : " + pizza + "X" + "\n PIZZA : " + pasta + "X");
                    textField3.setText(burger + "*" + " 220 _" + pizza + "*" + " 320 _" + pasta + "*" + " 240 ");
                }
                else {
                    JOptionPane.showMessageDialog(null,"!!! Invalid Input !!!","Error Massage",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        a2XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                burger+=2;
                textField1.setText("");
                textField2.setText(" BURGER : " + burger +"X"+"\n PIZZA : "+pizza+"X"+"\n PIZZA : "+pasta+"X" );
                textField3.setText(burger+"*"+" 220 _"+pizza+"*"+" 320 _"+pasta+"*"+" 240 ");
            }
        });
        a2XButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizza+=2;
                textField1.setText("");
                textField2.setText(" BURGER : " + burger +"X"+"\n PIZZA : "+pizza+"X"+"\n PIZZA : "+pasta+"X" );
                textField3.setText(burger+"*"+" 220 _"+pizza+"*"+" 320 _"+pasta+"*"+" 240 ");
            }
        });
        a2XButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasta+=2;
                textField1.setText("");
                textField2.setText(" BURGER : " + burger +"X"+"\n PIZZA : "+pizza+"X"+"\n PIZZA : "+pasta+"X" );
                textField3.setText(burger+"*"+" 220 _"+pizza+"*"+" 320 _"+pasta+"*"+" 240 ");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                burger = 0 ;
                pizza = 0;
                pasta = 0;
            }
        });
    }
}
