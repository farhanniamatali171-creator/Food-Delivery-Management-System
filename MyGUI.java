import javax.swing.*;
import java.awt.event.*;
public class MyGUI {
 public static void main(String[] args){

    JFrame frame=new JFrame("My Window");
    JButton button=new JButton("Click me");
           button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");
            }
        });
    button.setBounds(100,100,100,40);
    frame.add(button);
    frame.setSize(300,300);
    frame.setLayout(null);
    frame.setVisible(true);
 }   
}
