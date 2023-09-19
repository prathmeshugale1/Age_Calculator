package Age;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class main_class extends JFrame implements ActionListener {

    JLabel label1, label2, label3,label4,label5,label6,label7,label8,label9;
     JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextField textField7;
    JButton button1, button2, button3;

    main_class() {
        super("Age Calculator");
        //for adding  of card image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/cake.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(252, 6, 190, 130);
        add(image);
        //for adding of card image

        label1 = new JLabel("AGE CALCULATOR");
        label1.setForeground(Color.YELLOW);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(170, 140, 400, 35);
        add(label1);
        label2 = new JLabel("Date_Of_Birth");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label2.setBounds(210, 185, 300, 32);
        add(label2);

        label3 = new JLabel("Day:");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.BLACK);
        label3.setBounds(90, 237, 180, 32);
        add(label3);

        textField2 = new JTextField(15);
        textField2.setBounds(170, 240, 40, 22);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        label4 = new JLabel("Month: ");
        label4.setFont(new Font("Ralway", Font.BOLD, 28));
        label4.setForeground(Color.BLACK);
        label4.setBounds(250, 237, 180, 25);
        add(label4);

        textField3 = new JTextField(15);
        textField3.setBounds(360, 240, 40, 22);
        textField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField3);

        label5 = new JLabel("Year: ");
        label5.setFont(new Font("Ralway", Font.BOLD, 28));
        label5.setForeground(Color.BLACK);
        label5.setBounds(450, 237, 180, 25);
        add(label5);

        textField4 = new JTextField(15);
        textField4.setBounds(560, 240, 40, 22);
        textField4.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField4);

        label6 = new JLabel("Current Date");
        label6.setForeground(Color.BLACK);
        label6.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label6.setBounds(217, 270, 300, 33);
        add(label6);

        label7 = new JLabel("Day:");
        label7.setFont(new Font("Ralway", Font.BOLD, 28));
        label7.setForeground(Color.BLACK);
        label7.setBounds(90, 316, 180, 32);
        add(label7);

        textField5 = new JTextField(15);
        textField5.setBounds(170, 319, 40, 22);
        textField5.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField5);

        label8 = new JLabel("Month: ");
        label8.setFont(new Font("Ralway", Font.BOLD, 28));
        label8.setForeground(Color.BLACK);
        label8.setBounds(250, 316, 180, 25);
        add(label8);

        textField6 = new JTextField(15);
        textField6.setBounds(360, 319, 40, 22);
        textField6.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField6);

        label9 = new JLabel("Year: ");
        label9.setFont(new Font("Ralway", Font.BOLD, 28));
        label9.setForeground(Color.BLACK);
        label9.setBounds(450, 316, 180, 25);
        add(label9);

        textField7 = new JTextField(15);
        textField7.setBounds(560, 319, 40, 22);
        textField7.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField7);


        button3 = new JButton("Calculate");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.BLACK);
        button3.setBackground(Color.white);
        button3.setBounds(260, 386, 150, 30);
        button3.addActionListener(this);
        add(button3);

        //background img
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(700, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 700, 480);
        add(iiimage);


        setLayout(null);
        setSize(700, 480);
        setLocation(450, 200);     // for frame setting / show
        setVisible(true);   //this is use for visibility
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String day = textField2.getText();
        String month = textField3.getText();
        String year = textField4.getText();
        String day_current = textField5.getText();
        String month_current = textField6.getText();
        String year_current = textField7.getText();

        try{
            if (textField2.getText().equals("") && textField3.getText().equals("")&& textField4.getText().equals("")&& textField5.getText().equals("")&& textField6.getText().equals("")&& textField7.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                int Day,Month,Year;
                if (Integer.parseInt(day_current) >=Integer.parseInt(day)) {
                    Day = Integer.parseInt(day_current) -Integer.parseInt(day) ;
                    if (Integer.parseInt(month_current) >= Integer.parseInt( month)) {
                        Month =  Integer.parseInt(month_current)-Integer.parseInt( month) ;
                        Year = Integer.parseInt(year_current) - Integer.parseInt(year);
                        JOptionPane.showMessageDialog(null," YOUR AGE IS\n\n"+"Year:-\s"+Year+" \n Month:-\s"+Month+"\n Day:- \s"+Day);
                    } else {
                        Month = (12 + Integer.parseInt(month_current)) - Integer.parseInt(month);
                        Year = (Integer.parseInt(year_current) - 1) - Integer.parseInt(year);
                        JOptionPane.showMessageDialog(null," YOUR AGE IS\n\n"+"Year:-\s"+Year+" \n Month:-\s"+Month+"\n Day:- \s"+Day);
                    }
                } else {
                    Day = (30 + Integer.parseInt(day_current)) - Integer.parseInt(day);
                    int a =Integer.parseInt(month_current);
                     a--;
                    if (a >= Integer.parseInt( month)) {
                        Month =  a-Integer.parseInt( month) ;
                        Year = Integer.parseInt(year_current) - Integer.parseInt(year);
                        JOptionPane.showMessageDialog(null," YOUR AGE IS\n\n"+"Year:-\s"+Year+" \n Month:-\s"+Month+"\n Day:- \s"+Day);
                    } else {
                        Month = (12 + a) - Integer.parseInt(month);
                        Year = (Integer.parseInt(year_current) - 1) - Integer.parseInt(year);
                        JOptionPane.showMessageDialog(null," YOUR AGE IS\n\n"+"Year:-\s"+Year+" \n Month:-\s"+Month+"\n Day:- \s"+Day);
                    }

                }
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[]args) {
        new main_class();
    }
}