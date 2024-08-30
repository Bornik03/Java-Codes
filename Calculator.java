import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    // create a frame
    static JFrame f;

    // create a textfield
    static JTextField l;

    // store operator and operand
    String s0, s1, s2;

    // default constructor
    Calculator() {
        s0 = s1 = s2 = "";
    }

    // main function
    public static void main(String args[]) {
        // create a frame
        f = new JFrame("calculator");

        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // create a object of class
        Calculator c = new Calculator();

        // create a textfield
        l = new JTextField(16);

        // create number buttons and some operators
        JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, equ, add, sub, mul, div;

        // create number buttons
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");

        // equals button
        equ = new JButton("=");

        // create operator buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        // create a panel
        JPanel p = new JPanel();

        // add action listeners
        button0.addActionListener(c);
        button1.addActionListener(c);
        button2.addActionListener(c);
        button3.addActionListener(c);
        button4.addActionListener(c);
        button5.addActionListener(c);
        button6.addActionListener(c);
        button7.addActionListener(c);
        button8.addActionListener(c);
        button9.addActionListener(c);
        equ.addActionListener(c);
        add.addActionListener(c);
        sub.addActionListener(c);
        mul.addActionListener(c);
        div.addActionListener(c);

        // add elements to panel
        p.add(l);
        p.add(add);
        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(sub);
        p.add(button4);
        p.add(button5);
        p.add(button6);
        p.add(mul);
        p.add(button7);
        p.add(button8);
        p.add(button9);
        p.add(div);
        p.add(equ);
        p.add(button0);


        // add panel to frame
        f.add(p);

        f.setSize(200, 220);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

            // set the value of text
            l.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '=') {

            double te;

            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            // set the value of text
            l.setText(s0 + s1 + s2 + "=" + te);

            // convert it to string
            s0 = Double.toString(te);

            s1 = s2 = "";
        } else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            // else evaluate
            else {
                double te;

                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                // convert it to string
                s0 = Double.toString(te);

                // place the operator
                s1 = s;

                // make the operand blank
                s2 = "";
            }

            // set the value of text
            l.setText(s0 + s1 + s2);
        }
    }
}
