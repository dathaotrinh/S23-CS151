import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInFrame extends JFrame implements ActionListener {

    JTextField usernameField;
    JPasswordField passwordField;

    public LogInFrame() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setVisible(true);
        this.setTitle("Social Networking App");
        this.setLayout(null);
        this.setResizable(false);

        JLabel logInLabel = new JLabel();
        logInLabel.setText("Log In Form");
        logInLabel.setVerticalTextPosition(JLabel.CENTER);
        logInLabel.setHorizontalTextPosition(JLabel.CENTER);
        logInLabel.setBounds(200, 0, 200, 100);
        logInLabel.setFont(new Font("Roboto", Font.BOLD, 15));

        this.add(logInLabel);

        JLabel usernameLabel = new JLabel();
        JLabel passwordLabel = new JLabel();

        usernameLabel.setText("Username");
        usernameLabel.setVerticalTextPosition(JLabel.TOP);
        usernameLabel.setHorizontalTextPosition(JLabel.CENTER);
        usernameLabel.setBounds(100, 50, 200, 100);

        passwordLabel.setText("Password");
        passwordLabel.setVerticalTextPosition(JLabel.TOP);
        passwordLabel.setHorizontalTextPosition(JLabel.CENTER);
        passwordLabel.setBounds(100, 100, 200, 100);

        this.add(usernameLabel);
        this.add(passwordLabel);

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        usernameField.setBounds(170, 85, 250, 30);
        passwordField.setBounds(170, 135, 250, 30);

        this.add(usernameField);
        this.add(passwordField);

        JButton logInBtn = new JButton();
        logInBtn.setText("Submit");
        logInBtn.setBounds(150, 190, 200, 30);
        logInBtn.addActionListener(this);

        this.add(logInBtn);

        JButton backBtn = new JButton();
        backBtn.setText("Go Back");
        backBtn.setBounds(20, 20, 80, 20);
        backBtn.addActionListener(this);

        this.add(backBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Submit")) {
            authenticateUser();
        } else {
            this.setVisible(false);
            new WelcomeFrame();
        }
    }

    private void authenticateUser() {
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if(Common.userMap.containsKey(username)
            && Common.userMap.get(username).get("Password").equals(password)) {
            this.setVisible(false);
            new ProfileFrame(username);
        } else {
            JOptionPane.showMessageDialog(this, "Please check your username and password.");
        }

    }
}
