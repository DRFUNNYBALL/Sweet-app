import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JCheckBox;

public class REGISTER extends JFrame implements ActionListener {

    ImageIcon icon = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\toffee_6727796.png");
    ImageIcon bgImage = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\3d-miniature-bakery-product.jpg");
    ImageIcon Name = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\icons8-profile-64 (1).png");
    ImageIcon Family = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\icons8-profile-64 (1).png");
    ImageIcon Email = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\icons8-at-sign-64 (1).png");
    ImageIcon Number = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\dial-code_10040476 (1).png");
    ImageIcon Password = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pin-code_8200533 (1).png");
    ImageIcon repassword = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pin-code_8200533 (1).png");

    JPanel panel = new JPanel();

    Border border = BorderFactory.createLineBorder(Color.WHITE, 2);

    JLabel bgimage = new JLabel();
    JLabel name = new JLabel("Enter your name");
    JLabel family = new JLabel("Enter your family");
    JLabel email = new JLabel("Enter your Email");
    JLabel number = new JLabel("Enter your number");
    JLabel password = new JLabel("Enter your Password");
    JLabel rePassword = new JLabel("Repeat your Password");
    JLabel Iconnam = new JLabel();
    JLabel IconFa = new JLabel();
    JLabel IconEma = new JLabel();
    JLabel IonNum = new JLabel();
    JLabel Iconpass = new JLabel();
    JLabel Iconrepass = new JLabel();

    JTextField neme = new JTextField();
    JTextField Femely = new JTextField();
    JTextField emeil = new JTextField();
    JTextField num = new JTextField();
    JTextField passw = new JTextField();
    JTextField rePassw = new JTextField();

    JButton Submit = new JButton("SUBMIT");
    JButton cancel = new JButton("CANCEL");

    JCheckBox Nbot = new JCheckBox("I'm not robot");

    REGISTER() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(icon.getImage());
        this.setSize(1460, 1000);
        this.setResizable(false);
        this.setTitle("BOOCOKI");
        this.setLayout(null);
        bgimage.setIcon(bgImage);
        bgimage.setBounds(0, 0, 1500, 1000);
        bgimage.setBorder(border);

        panel.setBackground(Color.black);
        panel.setBorder(border);
        panel.setLayout(null);
        panel.setBounds(490, 250, 450, 450);

        name.setFont(new Font(" ", Font.BOLD, 15));
        name.setForeground(Color.white);
        name.setBounds(45, 15, 200, 25);

        neme.setBounds(210, 15, 150, 25);


        family.setFont(new Font(" ", Font.BOLD, 15));
        family.setForeground(Color.white);
        family.setBounds(45, 65, 200, 25);

        Femely.setBounds(210, 65, 150, 25);

        email.setFont(new Font(" ", Font.BOLD, 15));
        email.setForeground(Color.white);
        email.setBounds(45, 115, 200, 25);

        emeil.setBounds(210, 115, 150, 25);

        number.setFont(new Font(" ", Font.BOLD, 15));
        number.setForeground(Color.white);
        number.setBounds(45, 165, 200, 25);

        num.setBounds(210, 165, 150, 25);

        password.setFont(new Font(" ", Font.BOLD, 15));
        password.setForeground(Color.white);
        password.setBounds(45, 215, 200, 25);

        passw.setBounds(210, 215, 150, 25);

        rePassword.setFont(new Font(" ", Font.BOLD, 15));
        rePassword.setForeground(Color.white);
        rePassword.setBounds(45, 265, 200, 25);

        rePassw.setBounds(210, 265, 150, 25);

        Submit.setBounds(280, 365, 150, 25);
        Submit.addActionListener(this);
        cancel.setBounds(20, 365, 150, 25);
        cancel.addActionListener(this);

        Nbot.setBackground(Color.black);
        Nbot.setForeground(Color.white);
        Nbot.setFont(new Font(" ", Font.BOLD, 15));
        Nbot.setBounds(170, 400, 115, 25);


        Iconnam.setIcon(Name);
        Iconnam.setBounds(5, 12, 30, 30);

        IconFa.setIcon(Family);
        IconFa.setBounds(5, 63, 30, 30);

        IconEma.setIcon(Email);
        IconEma.setBounds(5, 112, 30, 30);

        IonNum.setIcon(Number);
        IonNum.setBounds(5, 163, 30, 30);

        Iconpass.setIcon(Password);
        Iconpass.setBounds(5, 212, 30, 30);

        Iconrepass.setIcon(repassword);
        Iconrepass.setBounds(5, 262, 30, 30);

        panel.add(name);
        panel.add(neme);
        panel.add(Iconnam);
        panel.add(family);
        panel.add(Femely);
        panel.add(IconFa);
        panel.add(email);
        panel.add(emeil);
        panel.add(IconEma);
        panel.add(number);
        panel.add(num);
        panel.add(IonNum);
        panel.add(Iconpass);
        panel.add(password);
        panel.add(passw);
        panel.add(rePassword);
        panel.add(Iconrepass);
        panel.add(rePassw);
        panel.add(Submit);
        panel.add(cancel);
        panel.add(Nbot);
        this.add(panel);
        this.add(bgimage);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Submit) {
            if (!Nbot.isSelected()) {
                JOptionPane.showMessageDialog(null, "First make sure you are not a robot", "Check box error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String firstName = neme.getText().trim();
            String lastName = Femely.getText().trim();
            String email = emeil.getText().trim();
            String phone = num.getText().trim();
            String password = passw.getText().trim();
            String rePassword = rePassw.getText().trim();


            if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty() || rePassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the blanks", "INPUT ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }


            if (!password.equals(rePassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match", "PASSWORD ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Boocokidb", "postgres", "1234")) {

                String checkQuery = "SELECT * FROM users WHERE email = ? OR phone = ?";
                PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
                checkStmt.setString(1, email);
                checkStmt.setString(2, phone);

                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Email or Phone already exists", "DUPLICATE ENTRY", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String insertQuery = "INSERT INTO users (first_name, last_name, email, phone, password) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                insertStmt.setString(1, firstName);
                insertStmt.setString(2, lastName);
                insertStmt.setString(3, email);
                insertStmt.setString(4, phone);
                insertStmt.setString(5, password);

                insertStmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Your registration was successful", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new Login_page();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "DB ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == cancel) {
            this.dispose();
            new Login_page();
        }
    }
}
