import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class ProfileFrame extends JFrame implements ActionListener {
    public ProfileFrame(String username) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 450);
        this.setVisible(true);
        this.setTitle("Social Networking App");
        this.setLayout(null);
        this.setResizable(false);

        JLabel frameLabel = new JLabel();
        frameLabel.setText("User Information");
        frameLabel.setVerticalTextPosition(JLabel.CENTER);
        frameLabel.setHorizontalTextPosition(JLabel.CENTER);
        frameLabel.setBounds(130, 5, 200, 100);
        frameLabel.setFont(new Font("Roboto", Font.BOLD, 15));

        this.add(frameLabel);

        JLabel usernameLabel = new JLabel();
        JLabel firstNameLabel = new JLabel();
        JLabel lastNameLabel = new JLabel();
        JLabel emailLabel = new JLabel();
        JLabel passwordLabel = new JLabel();

        usernameLabel.setText("Username:");
        usernameLabel.setHorizontalTextPosition(JLabel.CENTER);
        usernameLabel.setBounds(100, 80, 200, 100);

        firstNameLabel.setText("First Name:");
        firstNameLabel.setHorizontalTextPosition(JLabel.CENTER);
        firstNameLabel.setBounds(100, 130, 200, 100);

        lastNameLabel.setText("Last Name:");
        lastNameLabel.setHorizontalTextPosition(JLabel.CENTER);
        lastNameLabel.setBounds(100, 180, 200, 100);

        emailLabel.setText("Email:");
        emailLabel.setHorizontalTextPosition(JLabel.CENTER);
        emailLabel.setBounds(100, 230, 200, 100);

        passwordLabel.setText("Password:");
        passwordLabel.setHorizontalTextPosition(JLabel.CENTER);
        passwordLabel.setBounds(100, 280, 200, 100);

        this.add(usernameLabel);
        this.add(firstNameLabel);
        this.add(lastNameLabel);
        this.add(emailLabel);
        this.add(passwordLabel);

        JLabel usernameField = new JLabel();
        JLabel firstNameField = new JLabel();
        JLabel lastNameField = new JLabel();
        JLabel emailField = new JLabel();
        JLabel passwordField = new JLabel();

        Map<String, String> userData = Common.userMap.get(username);

        usernameField.setText(username);
        usernameField.setHorizontalTextPosition(JLabel.CENTER);
        usernameField.setBounds(200, 80, 300, 100);

        firstNameField.setText(userData.get("FirstName"));
        firstNameField.setHorizontalTextPosition(JLabel.CENTER);
        firstNameField.setBounds(200, 130, 300, 100);

        lastNameField.setText(userData.get("LastName"));
        lastNameField.setHorizontalTextPosition(JLabel.CENTER);
        lastNameField.setBounds(200, 180, 300, 100);

        emailField.setText(userData.get("Email"));
        emailField.setHorizontalTextPosition(JLabel.CENTER);
        emailField.setBounds(200, 230, 300, 100);

        passwordField.setText(userData.get("Password"));
        passwordField.setHorizontalTextPosition(JLabel.CENTER);
        passwordField.setBounds(200, 280, 300, 100);

        this.add(firstNameField);
        this.add(lastNameField);
        this.add(emailField);
        this.add(passwordField);
        this.add(usernameField);

        JButton signOutBtn = new JButton();
        signOutBtn.setText("Sign Out");
        signOutBtn.setBounds(300, 20, 80, 20);
        signOutBtn.addActionListener(this);

        this.add(signOutBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new WelcomeFrame();
    }
}
