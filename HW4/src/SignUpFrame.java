import exceptions.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class SignUpFrame extends JFrame implements ActionListener {

    JTextField firstNameField;
    JTextField lastNameField;
    JTextField emailField;
    JPasswordField passwordField;

    public SignUpFrame() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("Social Networking App");
        this.setLayout(null);
        this.setResizable(false);

        JLabel signUpLabel = new JLabel();
        signUpLabel.setText("Sign Up Form");
        signUpLabel.setVerticalTextPosition(JLabel.CENTER);
        signUpLabel.setHorizontalTextPosition(JLabel.CENTER);
        signUpLabel.setBounds(200, 10, 200, 100);
        signUpLabel.setFont(new Font("Roboto", Font.BOLD, 15));

        this.add(signUpLabel);

        JLabel warningLabel = new JLabel();
        warningLabel.setText("All fields with (*) must be entered.");
        warningLabel.setVerticalTextPosition(JLabel.CENTER);
        warningLabel.setHorizontalTextPosition(JLabel.CENTER);
        warningLabel.setBounds(150, 50, 300, 100);

        this.add(warningLabel);

        JLabel firstNameLabel = new JLabel();
        JLabel lastNameLabel = new JLabel();
        JLabel emailLabel = new JLabel();
        JLabel passwordLabel = new JLabel();

        firstNameLabel.setText("First Name (*)");
        firstNameLabel.setHorizontalTextPosition(JLabel.CENTER);
        firstNameLabel.setBounds(100, 100, 200, 100);

        lastNameLabel.setText("Last Name (*)");
        lastNameLabel.setHorizontalTextPosition(JLabel.CENTER);
        lastNameLabel.setBounds(100, 150, 200, 100);

        emailLabel.setText("Email (*)");
        emailLabel.setHorizontalTextPosition(JLabel.CENTER);
        emailLabel.setBounds(100, 200, 200, 100);

        passwordLabel.setText("Password (*)");
        passwordLabel.setHorizontalTextPosition(JLabel.CENTER);
        passwordLabel.setBounds(100, 250, 200, 100);

        this.add(firstNameLabel);
        this.add(lastNameLabel);
        this.add(emailLabel);
        this.add(passwordLabel);

        firstNameField = new JTextField();
        lastNameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        firstNameField.setBounds(200, 135, 250, 30);
        lastNameField.setBounds(200, 185, 250, 30);
        emailField.setBounds(200, 235, 250, 30);
        passwordField.setBounds(200, 285, 250, 30);

        this.add(firstNameField);
        this.add(lastNameField);
        this.add(emailField);
        this.add(passwordField);

        JButton submit = new JButton();
        submit.setText("Submit");
        submit.setBounds(150, 350, 200, 30);
        submit.addActionListener(this);

        this.add(submit);

        JButton backBtn = new JButton();
        backBtn.setText("Go Back");
        backBtn.setBounds(20, 20, 80, 20);
        backBtn.addActionListener(this);

        this.add(backBtn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String password = String.valueOf(passwordField.getPassword());
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();

        if(e.getActionCommand().equals("Submit")) {
            try {
                if(!isEmpty(firstName)
                        && !isEmpty(lastName)
                        && !isEmpty(email)
                        && !isEmpty(password)
                        && isAStrongPassword(password)) {

                    String username = generateId();
                    String newUser = firstName + "," + lastName + "," + username + "," + email + "," + password;
                    try {
                        accessData(newUser);
                        Common.addNewUser(username, firstName, lastName, email, password);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    JOptionPane.showMessageDialog(this, "Your username is " + username);

                    // erase all fields after successfully sign up
                    firstNameField.setText("");
                    lastNameField.setText("");
                    emailField.setText("");
                    passwordField.setText("");
                }
            } catch (PasswordException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        } else {
            this.setVisible(false);
            new WelcomeFrame();
        }

    }

    private void accessData(String newUser) throws IOException {
        String jarDir = Common.getJarCurrentDir();
        FileWriter fileWriter = new FileWriter(jarDir + "/data.txt", true);
        fileWriter.write(newUser + "\n");
        fileWriter.close();
    }


    private boolean isAStrongPassword(String password) throws PasswordException {
        if (Minimum8CharactersRequired.hasLessThan8Characters(password)) {
            throw new Minimum8CharactersRequired();
        }

        if (NumberCharacterMissing.hasNoNumber(password)) {
            throw new NumberCharacterMissing();
        }

        if (SpecialCharacterMissing.hasNoSpecialCharacter(password)) {
            throw new SpecialCharacterMissing();
        }

        if (UpperCaseCharacterMissing.hasNoUpperCaseCharacter(password)) {
            throw new UpperCaseCharacterMissing();
        }

        if (LowerCaseCharacterMissing.hasNoLowerCaseCharacter(password)) {
            throw new LowerCaseCharacterMissing();
        }

        return true;
    }

    private boolean isEmpty(String input) {
        return input.length() == 0;
    }

    private String generateId() {
        StringBuilder builder = new StringBuilder();
        Random r = new Random();
        builder.append(firstNameField.getText().toUpperCase().charAt(0)).append(lastNameField.getText().toUpperCase().charAt(0)).append('-');
        for (int i = 0; i < 4; i++) {
            builder.append(r.nextInt(10));
        }

        return builder.toString();

    }


}
