import javax.swing.*;

class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        JLabel commentLabel = new JLabel("Comment");
        commentLabel.setBounds(10, 80, 80, 25);
        panel.add(commentLabel);
        JTextArea commentText = new JTextArea();
        commentText.setBounds(100, 80, 165, 75);
        panel.add(commentText);
        JCheckBox agreeCheck = new JCheckBox("Agree Terms and Conditions");
        agreeCheck.setBounds(10, 170, 200, 25);
        panel.add(agreeCheck);
        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(10, 200, 70, 25);
        panel.add(maleRadio);
        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(80, 200, 70, 25);
        panel.add(femaleRadio);
        ButtonGroup group = new ButtonGroup();
        group.add(maleRadio);
        group.add(femaleRadio);
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(10, 230, 80, 25);
        panel.add(registerButton);
    }
}