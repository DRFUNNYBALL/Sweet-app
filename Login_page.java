import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login_page extends JFrame implements ActionListener , MouseListener {

    //for images:
    ImageIcon imageIC = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\toffee_6727796.png");//for Icon
    ImageIcon imagebg = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\papa.jpg");
    ImageIcon happy = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\happiness (1).png");
    ImageIcon eyes = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\rolling-eyes (1) (1).png");
    ImageIcon angry = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\angry (2) (1).png");
    ImageIcon con = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\confused (1).png");
    ImageIcon laugh  = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\laugh (1).png");
    ImageIcon IDICon = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\avatar_9341409 (1).png");
    ImageIcon Passw = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\password (1).png");


    JCheckBox Nbot = new JCheckBox("I'M NOT ROBOT");


    JPanel panel= new JPanel();

    Border border = BorderFactory.createLineBorder(Color.white,2);


    JButton Log_but = new JButton("LOGIN");
    JButton RE_but = new JButton("REGISTER");

    JTextField ID = new JTextField();
    JPasswordField Password = new JPasswordField();

    JLabel Pass = new JLabel();
    JLabel IDIc = new JLabel();
    JLabel photo = new JLabel();
    JLabel Log_lab = new JLabel("ENTER YOUR FIRST NAME");
    JLabel PASS_lab = new JLabel("ENTER YOUR PASSWORD");
    JLabel bg_image = new JLabel();
    JLabel Welcome_lab = new JLabel("WELCOME TO BOOCOKI");


    Login_page(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setTitle("BOOCOKI");
        this.setIconImage(imageIC.getImage());
        this.setLayout(null);
        bg_image.setIcon(imagebg);
        bg_image.setBounds(0,0,2560,1440);

        panel.setBackground(Color.black);
        panel.setBounds(900,300,550,550);
        panel.setBorder(border);
        panel.setLayout(null);

        Welcome_lab.setFont(new Font(" ", Font.BOLD, 15));
        Welcome_lab.setForeground(Color.white);
        Welcome_lab.setBounds(175, 0, 200, 30);

        Log_lab.setFont(new Font(" ", Font.BOLD, 15));
        Log_lab.setForeground(Color.white);
        Log_lab.setBounds(175, 300, 200, 30);

        IDIc.setIcon(IDICon);
        IDIc.setBounds(135,300,200,30);

        ID.setBounds(375,300,150,30);
        ID.setForeground(new Color(152, 59, 227));

        PASS_lab.setFont(new Font(" ", Font.BOLD, 15));
        PASS_lab.setForeground(Color.white);
        PASS_lab.setBounds(175, 370, 200, 30);

        Pass.setIcon(Passw);
        Pass.setBounds(135,365,200,30);

        Password.setBounds(375,370,150,30);
        Password.setForeground(new Color(152, 59, 227));

        Log_but.setBounds(375, 450,150,30);
        Log_but.addActionListener(this);
        RE_but.setBounds(20,450,150,30);
        RE_but.addActionListener(this);


        Nbot.setBounds(200,510,150,30);
        Nbot.setFont(new Font(" ",Font.BOLD, 15));
        Nbot.setForeground(Color.white);
        Nbot.setBackground(Color.black);


        photo.setIcon(happy);
        photo.setBounds(175,50,200,200);
        photo.addMouseListener(this);

        panel.add(photo);
        panel.add(Nbot);
        panel.add(RE_but);
        panel.add(Log_but);
        panel.add(Pass);
        panel.add(Password);
        panel.add(ID);
        panel.add(IDIc);
        panel.add(PASS_lab);
        panel.add(Welcome_lab);
        panel.add(Log_lab);
        this.add(panel);
        this.add(bg_image);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Log_but) {
                if (!Nbot.isSelected()) {
                    JOptionPane.showMessageDialog(null, "First make sure you are not a robot", "Check box error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String userEmail = ID.getText().trim();
                String userPass = new String(Password.getPassword());

                if (userEmail.isEmpty() || userPass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Make sure you fill in all the blanks", "INPUT ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try (Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/Boocokidb", "postgres", "1234")) {

                    String sql = "SELECT * FROM users WHERE first_name  = ? AND password = ?";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, userEmail);
                    pst.setString(2, userPass);

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        this.dispose();
                        new Main_page();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Email or Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "DB ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (e.getSource() == RE_but) {
                if (Nbot.isSelected()) {
                    this.dispose();
                    new REGISTER();
                } else {
                    JOptionPane.showMessageDialog(null, "First make sure you are not a robot", "Check box error", JOptionPane.ERROR_MESSAGE);
                }
            }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            Thread.sleep(500);
            photo.setIcon(angry);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        try {
            Thread.sleep(500);
            photo.setIcon(con);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        try {
            Thread.sleep(500);
            photo.setIcon(laugh);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        try {
            Thread.sleep(500);
            photo.setIcon(eyes);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        try {
            Thread.sleep(500);
            photo.setIcon(happy);
        }catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
