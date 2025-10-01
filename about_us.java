import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class about_us extends JFrame implements ActionListener {

    ImageIcon imageIC = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\toffee_6727796.png");

    JLabel Title = new JLabel("ABOUT US");
    JLabel about = new JLabel("About us : we don't have information for you");
    JLabel Branchesinperson = new JLabel("our Branches in person : don't have Branches in person yet");
    JLabel github = new JLabel("our git hub : DRFUNNYBALL");

    JButton backbutton = new JButton("BACK");

    about_us(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.getContentPane().setBackground(Color.darkGray);
        this.setIconImage(imageIC.getImage());
        this.setTitle("BOOCOKI");
        this.setLayout(null);


        Title.setForeground(Color.ORANGE);
        Title.setFont(new Font("",Font.BOLD,25));
        Title.setBounds(175,10,200,150);


        about.setForeground(Color.white);
        about.setFont(new Font("",Font.BOLD,15));
        about.setBounds(50,60,500,150);


        Branchesinperson.setForeground(Color.white);
        Branchesinperson.setFont(new Font("",Font.BOLD,15));
        Branchesinperson.setBounds(50,110,500,150);


        github.setForeground(Color.white);
        github.setFont(new Font("",Font.BOLD,15));
        github.setBounds(50,160,500,150);


        backbutton.setBounds(150,350,200,25);
        backbutton.setForeground(Color.ORANGE);
        backbutton.addActionListener(this);


        this.add(Title);
        this.add(about);
        this.add(Branchesinperson);
        this.add(github);
        this.add(backbutton);
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

