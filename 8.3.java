import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorChanger {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        String[] colorNames = {"Red", "Blue", "Green", "Yellow"};
        JList<String> colorList = new JList<>(colorNames);
        colorList.setBounds(10, 20, 80, 80);
        panel.add(colorList);
        JButton changeColorButton = new JButton("Change Color");
        changeColorButton.setBounds(100, 20, 150, 25);
        panel.add(changeColorButton);
        changeColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColor = colorList.getSelectedValue();
                switch (selectedColor) {
                    case "Red":
                        panel.setBackground(Color.RED);
                        break;
                    case "Blue":
                        panel.setBackground(Color.BLUE);
                        break;
                    case "Green":
                        panel.setBackground(Color.GREEN);
                        break;
                    case "Yellow":
                        panel.setBackground(Color.YELLOW);
                        break;
                }
            }
        });
    }
}