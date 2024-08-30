import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JLabel firstNumberLabel = new JLabel("Enter the First Number");
        firstNumberLabel.setBounds(10, 20, 150, 25);
        panel.add(firstNumberLabel);
        JTextField firstNumberText = new JTextField(20);
        firstNumberText.setBounds(160, 20, 100, 25);
        panel.add(firstNumberText);
        JLabel secondNumberLabel = new JLabel("Enter the Second Number");
        secondNumberLabel.setBounds(10, 50, 150, 25);
        panel.add(secondNumberLabel);
        JTextField secondNumberText = new JTextField(20);
        secondNumberText.setBounds(160, 50, 100, 25);
        panel.add(secondNumberText);
        JLabel resultLabel = new JLabel("Result");
        resultLabel.setBounds(10, 80, 80, 25);
        panel.add(resultLabel);
        JTextField resultText = new JTextField(20);
        resultText.setBounds(160, 80, 100, 25);
        panel.add(resultText);
        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 110, 60, 25);
        panel.add(addButton);
        JButton subButton = new JButton("Sub");
        subButton.setBounds(80, 110, 60, 25);
        panel.add(subButton);
        JButton mulButton = new JButton("Multiply");
        mulButton.setBounds(150, 110, 80, 25);
        panel.add(mulButton);
        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(240, 110, 80, 25);
        panel.add(resetButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(firstNumberText.getText());
                int num2 = Integer.parseInt(secondNumberText.getText());
                int sum = num1 + num2;
                resultText.setText(Integer.toString(sum));
            }
        });
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(firstNumberText.getText());
                int num2 = Integer.parseInt(secondNumberText.getText());
                int diff = num1 - num2;
                resultText.setText(Integer.toString(diff));
            }
        });
        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(firstNumberText.getText());
                int num2 = Integer.parseInt(secondNumberText.getText());
                int product = num1 * num2;
                resultText.setText(Integer.toString(product));
            }
        });
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumberText.setText("");
                secondNumberText.setText("");
                resultText.setText("");
            }
        });
    }
}