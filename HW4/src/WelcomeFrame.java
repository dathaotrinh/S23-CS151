import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class WelcomeFrame extends JFrame implements ActionListener {
    JButton signUp;
    JButton logIn;

    public WelcomeFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Social Networking App");
        this.setSize(500, 500);
        this.setLayout(null);
        this.setResizable(false);

        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setText("Welcome To Social Networking App");
        welcomeLabel.setVerticalTextPosition(JLabel.TOP);
        welcomeLabel.setHorizontalTextPosition(JLabel.CENTER);
        welcomeLabel.setBounds(120, 100, 300, 100);
        welcomeLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        this.add(welcomeLabel);

        signUp = new JButton();
        logIn = new JButton();

        signUp.setText("Sign Up");
        signUp.setBounds(200, 200, 100, 50);
        signUp.addActionListener(this);
        logIn.setText("Log In");
        logIn.setBounds(200, 270, 100, 50);
        logIn.addActionListener(this);

        this.add(signUp);
        this.add(logIn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        if(e.getActionCommand().equals("Sign Up")) {
            new SignUpFrame();
        } else {
            new LogInFrame();
        }
    }
}
