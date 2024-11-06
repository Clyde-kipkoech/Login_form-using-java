import java.awt.*;
import java.awt.event.*;

public class LoginFormAWT extends Frame implements ActionListener {
    Label labelUsername, labelPassword, labelMessage;
    TextField textUsername, textPassword;
    Button buttonLogin;

    public LoginFormAWT() {
        // Frame title
        setTitle("Login Form");

        // Username Label
        labelUsername = new Label("Username:");
        labelUsername.setBounds(50, 50, 80, 30);
        add(labelUsername);

        // Username TextField
        textUsername = new TextField();
        textUsername.setBounds(150, 50, 150, 30);
        add(textUsername);

        // Password Label
        labelPassword = new Label("Password:");
        labelPassword.setBounds(50, 100, 80, 30);
        add(labelPassword);

        // Password TextField
        textPassword = new TextField();
        textPassword.setEchoChar('*');
        textPassword.setBounds(150, 100, 150, 30);
        add(textPassword);

        // Login Button
        buttonLogin = new Button("Login");
        buttonLogin.setBounds(150, 150, 80, 30);
        buttonLogin.addActionListener(this);
        add(buttonLogin);

        // Message Label
        labelMessage = new Label();
        labelMessage.setBounds(50, 200, 250, 30);
        add(labelMessage);

        // Frame settings
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String username = textUsername.getText();
        String password = textPassword.getText();

        // Simple check for demonstration
        if (username.equals("Clyde") && password.equals("2005")) {
            labelMessage.setText("Login successful! WELCOME MR.Clyde");
            
        } else {
            labelMessage.setText("Invalid credentials. Try again.");
        }
    }

    public static void main(String[] args) {
        new LoginFormAWT();
    }
}