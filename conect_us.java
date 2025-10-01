import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class conect_us extends JFrame implements ActionListener {
    ImageIcon imageIC = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\toffee_6727796.png");

    JLabel Title = new JLabel();
    JLabel email = new JLabel();
    JLabel IDt = new JLabel();
    JLabel whatsapp  = new JLabel();
    JLabel insideapp = new JLabel();

    JButton backbutton = new JButton("BACK");

    conect_us(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("BOOCOKI");
        this.setIconImage(imageIC.getImage());
        this.setLayout(null);
        this.getContentPane().setBackground(Color.darkGray);

        Title.setText("CONNECT US");
        Title.setForeground(Color.ORANGE);
        Title.setFont(new Font("",Font.BOLD,25));
        Title.setBounds(150,10,200,150);

        email.setText("our Email : drfunnyball.mrs@gmail.com");
        email.setForeground(Color.white);
        email.setFont(new Font("",Font.BOLD,15));
        email.setBounds(150,60,500,150);

        IDt.setText("our Telegram ID : @");
        IDt.setForeground(Color.white);
        IDt.setFont(new Font("",Font.BOLD,15));
        IDt.setBounds(150,110,500,150);

        whatsapp.setText("our Whatsapp : 0910****101");
        whatsapp.setForeground(Color.white);
        whatsapp.setFont(new Font("",Font.BOLD,15));
        whatsapp.setBounds(150,160,500,150);

        insideapp.setText("our inside app : we don't have inside app yet");
        insideapp.setForeground(Color.white);
        insideapp.setFont(new Font("",Font.BOLD,15));
        insideapp.setBounds(150,210,500,150);

        backbutton.setBounds(150,350,200,25);
        backbutton.setForeground(Color.ORANGE);
        backbutton.addActionListener(this);

        this.add(backbutton);
        this.add(Title);
        this.add(email);
        this.add(IDt);
        this.add(whatsapp);
        this.add(insideapp);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==backbutton){
            this.dispose();
            new Main_page();
        }
    }
}
