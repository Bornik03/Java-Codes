import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RGBColorChanger {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RGB Color Changer");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JLabel redLabel = new JLabel("Red");
        redLabel.setBounds(10, 20, 80, 25);
        panel.add(redLabel);
        JComboBox<Integer> redComboBox = new JComboBox<>();
        for (int i = 0; i <= 255; i++) {
            redComboBox.addItem(i);
        }
        redComboBox.setBounds(100, 20, 80, 25);
        panel.add(redComboBox);
        JLabel greenLabel = new JLabel("Green");
        greenLabel.setBounds(10, 60, 80, 25);
        panel.add(greenLabel);
        JComboBox<Integer> greenComboBox = new JComboBox<>();
        for (int i = 0; i <= 255; i++) {
            greenComboBox.addItem(i);
        }
        greenComboBox.setBounds(100, 60, 80, 25);
        panel.add(greenComboBox);
        JLabel blueLabel = new JLabel("Blue");
        blueLabel.setBounds(10, 100, 80, 25);
        panel.add(blueLabel);
        JComboBox<Integer> blueComboBox = new JComboBox<>();
        for (int i = 0; i <= 255; i++) {
            blueComboBox.addItem(i);
        }
        blueComboBox.setBounds(100, 100, 80, 25);
        panel.add(blueComboBox);
        JButton changeColorButton = new JButton("Show Output");
        changeColorButton.setBounds(10, 140, 120, 25);
        panel.add(changeColorButton);
        changeColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int red = (int) redComboBox.getSelectedItem();
                int green = (int) greenComboBox.getSelectedItem();
                int blue = (int) blueComboBox.getSelectedItem();
                panel.setBackground(new Color(red, green, blue));
            }
        });
    }
}