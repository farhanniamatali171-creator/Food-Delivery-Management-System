import javax.swing.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Login Form");

        // Username Label
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);

        // Username Field
        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);

        // Password Label
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);

        // Password Field
        JPasswordField passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 160, 100, 40);

        // Event Handling (Button Click)
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = userText.getText();
                String password = new String(passText.getPassword());

                // Simple check
                if(username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                }
            }
        });

        // Add components to frame
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}