import javax.swing.*;
class WebsitePicButton {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Website Pic Button");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton button = new JButton("Website Pic");
    frame.add(button);
    frame.pack();
    frame.setVisible(true);}}