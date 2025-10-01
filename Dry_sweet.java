import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dry_sweet extends JFrame implements ActionListener{
    BascketManager bascketManager = BascketManager.getInstance();
    Product dry1 = new Product("Cupcake",12.00);
    Product dry2 = new Product("Chocolate coconut candy",7.55);
    Product dry3 = new Product("Fruit cookie",9.99);
    Product dry4 = new Product("Cookie",7.25);
    Product dry5 = new Product("Chocolate Biscuits",6.59);
    Product dry6 = new Product("Chocolate fruit biscuit",9.29);


    ImageIcon imageIC = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\toffee_6727796.png");

    //  menupanle-----------------------------------------------------------------------------------------------------------
    ImageIcon buttonmenu = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\icons8-xbox-menu-64 (1).png");
    ImageIcon abut = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\icons8-information-64 (1).png");
    ImageIcon conet = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\icons8-customer-support-64 (1).png");
    ImageIcon exits = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\powerr.png");
    ImageIcon baskets = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\shopping-basket_8415850 (1).png");
    ImageIcon home = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\home (1).png");

    JPanel menupanel = new JPanel();
    JButton toggle = new JButton();
    JLabel menulabel = new JLabel();
    Timer slider;
    int menuwidth = 250;
    boolean isMenuvisible = false;

    JLabel aboutus = new JLabel("ABOUT US");
    JLabel conectus = new JLabel("CONNECT US");
    JLabel exit = new JLabel("EXIT");
    JLabel basket = new JLabel("BASKET");
    JLabel Home = new JLabel("BACK TO HOME");

    JButton about = new JButton();
    JButton conect = new JButton();
    JButton exite = new JButton();
    JButton baskete = new JButton();
    JButton home_but = new JButton();

    //    ------------------------------------------------------------------------------------------------------------------
//  for mainpanel-------------------------------------------------------------------------------------------------------
    JPanel mainpanel = new JPanel();

    Border border = BorderFactory.createLineBorder(Color.ORANGE,5);

    ImageIcon candy1 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pexels-castorlystock-3650438.jpg");
    ImageIcon candy2 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\madison-kaminski-2c6_d8svbkY-unsplash.jpg");
    ImageIcon candy3 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\vicky-ng-EnPlEZI4WfM-unsplash.jpg");
    ImageIcon candy4 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\erwan-nonon-HpAePNFM0RU-unsplash.jpg");
    ImageIcon candy5 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\close-up-up-delicious-alfajores-concept.jpg");
    ImageIcon candy6 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pexels-fotios-photos-1009841.jpg");

    JLabel ph_candy1 = new JLabel();
    JLabel ph_candy2 = new JLabel();
    JLabel ph_candy3 = new JLabel();
    JLabel ph_candy4 = new JLabel();
    JLabel ph_candy5 = new JLabel();
    JLabel ph_candy6 = new JLabel();

    JPanel Candy1 = new JPanel();
    JPanel Candy2 = new JPanel();
    JPanel Candy3 = new JPanel();
    JPanel Candy4 = new JPanel();
    JPanel Candy5 = new JPanel();
    JPanel Candy6 = new JPanel();

    JLabel warning = new JLabel("These prices are for each package of 12 pieces");
    JLabel l_candy1 = new JLabel("PRICE : $12.00");
    JLabel l_candy2 = new JLabel("PRICE : $7.55");
    JLabel l_candy3 = new JLabel("PRICE : $9.99");
    JLabel l_candy4 = new JLabel("PRICE : $7.25");
    JLabel l_candy5 = new JLabel("PRICE : $6.59");
    JLabel l_candy6 = new JLabel("PRICE : $9.29");

    JButton but_candy1 = new JButton("ADD TO BASKET");
    JButton but_candy2 = new JButton("ADD TO BASKET");
    JButton but_candy3 = new JButton("ADD TO BASKET");
    JButton but_candy4 = new JButton("ADD TO BASKET");
    JButton but_candy5 = new JButton("ADD TO BASKET");
    JButton but_candy6 = new JButton("ADD TO BASKET");

    Dry_sweet() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("BOOCOKI");
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setIconImage(imageIC.getImage());

        //for menubar---------------------------------------------------------------------------------------------------
        toggle.setIcon(buttonmenu);
        toggle.setBounds(10, 10, 30, 30);
        add(toggle);

        menupanel.setBackground(Color.white);
        menupanel.setBounds(-menuwidth, 0, menuwidth, getHeight());
        menupanel.setLayout(null);
        add(menupanel);

        aboutus.setFont(new Font("", Font.BOLD, 15));
        aboutus.setForeground(Color.black);
        aboutus.setBounds(75, 50, 100, 100);

        about.setIcon(abut);
        about.setBackground(Color.white);
        about.addActionListener(this);
        about.setBounds(20, 80, 40, 40);

        conectus.setFont(new Font("", Font.BOLD, 15));
        conectus.setForeground(Color.black);
        conectus.setBounds(75, 150, 150, 100);

        conect.setIcon(conet);
        conect.setBackground(Color.white);
        conect.addActionListener(this);
        conect.setBounds(20, 180, 40, 40);

        basket.setFont(new Font("", Font.BOLD, 15));
        basket.setForeground(Color.black);
        basket.setBounds(75, 250, 150, 100);

        baskete.setIcon(baskets);
        baskete.setBackground(Color.white);
        baskete.addActionListener(this);
        baskete.setBounds(20, 280, 40, 40);

        Home.setFont(new Font("", Font.BOLD, 15));
        Home.setForeground(Color.black);
        Home.setBounds(75, 1200, 150, 100);

        home_but.setIcon(home);
        home_but.setBackground(Color.white);
        home_but.addActionListener(this);
        home_but.setBounds(20, 1230, 40, 40);

        exit.setFont(new Font("", Font.BOLD, 15));
        exit.setForeground(Color.black);
        exit.setBounds(75, 1300, 150, 100);

        exite.setIcon(exits);
        exite.setBackground(Color.white);
        exite.addActionListener(this);
        exite.setBounds(20, 1330, 40, 40);

        menulabel.setBounds(20, 20, 100, 30);

        toggle.addActionListener(e -> togglemenu());

        menupanel.add(basket);
        menupanel.add(baskete);
        menupanel.add(exit);
        menupanel.add(exite);
        menupanel.add(conectus);
        menupanel.add(conect);
        menupanel.add(aboutus);
        menupanel.add(about);
        menupanel.add(Home);
        menupanel.add(home_but);
        menupanel.add(menulabel);
        //  ------------------------------------------------------------------------------------------------------------
        mainpanel.setBounds(250, 0, 2293, 1450);
        mainpanel.setLayout(null);
        mainpanel.setBackground(Color.DARK_GRAY);
        mainpanel.setPreferredSize(new Dimension(2293, 2500));
//        -------------------------------------------------------------------------------------------------------------
        warning.setFont(new Font("", Font.BOLD,40));
        warning.setForeground(Color.ORANGE);
        warning.setBounds(700,0,1000,150);
        mainpanel.add(warning);

        //--------------------------------------------------------------------------------------------------------------
        Candy1.setBounds(100,150,500,500);
        Candy1.setLayout(null);
        Candy1.setBackground(Color.white);
        Candy1.setBorder(border);

        ph_candy1.setIcon(candy1);
        ph_candy1.setBounds(0,0,495,400);
        Candy1.add(ph_candy1);

        l_candy1.setFont(new Font("",Font.BOLD,25));
        l_candy1.setForeground(Color.ORANGE);
        l_candy1.setBounds(170,390,200,50);
        Candy1.add(l_candy1);

        but_candy1.setFont(new Font("",Font.BOLD,25));
        but_candy1.addActionListener(this);
        but_candy1.setForeground(Color.ORANGE);
        but_candy1.setBackground(Color.white);
        but_candy1.setBounds(125,460,250,25);
        Candy1.add(but_candy1);

        //-------------------------------------------------------------------
        Candy2.setBounds(100,800,500,500);
        Candy2.setLayout(null);
        Candy2.setBackground(Color.white);
        Candy2.setBorder(border);

        ph_candy2.setIcon(candy2);
        ph_candy2.setBounds(0,0,500,400);
        Candy2.add(ph_candy2);


        l_candy2.setFont(new Font("",Font.BOLD,25));
        l_candy2.setForeground(Color.ORANGE);
        l_candy2.setBounds(170,390,200,50);
        Candy2.add(l_candy2);


        but_candy2.setFont(new Font("",Font.BOLD,25));
        but_candy2.addActionListener(this);
        but_candy2.setForeground(Color.ORANGE);
        but_candy2.setBackground(Color.white);
        but_candy2.setBounds(125,460,250,25);
        Candy2.add(but_candy2);

        //-------------------------------------------------------------------

        Candy3.setBounds(100,1450,500,500);
        Candy3.setLayout(null);
        Candy3.setBackground(Color.white);
        Candy3.setBorder(border);

        ph_candy3.setIcon(candy3);
        ph_candy3.setBounds(0,0,500,400);
        Candy3.add(ph_candy3);

        l_candy3.setFont(new Font("",Font.BOLD,25));
        l_candy3.setForeground(Color.ORANGE);
        l_candy3.setBounds(170,390,200,50);
        Candy3.add(l_candy3);

        but_candy3.setFont(new Font("",Font.BOLD,25));
        but_candy3.setForeground(Color.ORANGE);
        but_candy3.addActionListener(this);
        but_candy3.setBackground(Color.white);
        but_candy3.setBounds(125,460,250,25);
        Candy3.add(but_candy3);

        //-------------------------------------------------------------------

        Candy4.setBounds(1675,150,500,500);
        Candy4.setLayout(null);
        Candy4.setBackground(Color.white);
        Candy4.setBorder(border);

        ph_candy4.setIcon(candy4);
        ph_candy4.setBounds(0,0,500,400);
        Candy4.add(ph_candy4);

        l_candy4.setFont(new Font("",Font.BOLD,25));
        l_candy4.setForeground(Color.ORANGE);
        l_candy4.setBounds(170,390,200,50);
        Candy4.add(l_candy4);

        but_candy4.setFont(new Font("",Font.BOLD,25));
        but_candy4.addActionListener(this);
        but_candy4.setForeground(Color.ORANGE);
        but_candy4.setBackground(Color.white);
        but_candy4.setBounds(125,460,250,25);
        Candy4.add(but_candy4);

//        //-------------------------------------------------------------------

        Candy5.setBounds(1675,800,500,500);
        Candy5.setLayout(null);
        Candy5.setBackground(Color.white);
        Candy5.setBorder(border);

        ph_candy5.setIcon(candy5);
        ph_candy5.setBounds(0,0,500,400);
        Candy5.add(ph_candy5);

        l_candy5.setFont(new Font("",Font.BOLD,25));
        l_candy5.setForeground(Color.ORANGE);
        l_candy5.setBounds(170,390,200,50);
        Candy5.add(l_candy5);

        but_candy5.setFont(new Font("",Font.BOLD,25));
        but_candy5.addActionListener(this);
        but_candy5.setForeground(Color.ORANGE);
        but_candy5.setBackground(Color.white);
        but_candy5.setBounds(125,460,250,25);
        Candy5.add(but_candy5);

//        //-------------------------------------------------------------------

        Candy6.setBounds(1675,1450,500,500);
        Candy6.setLayout(null);
        Candy6.setBackground(Color.white);
        Candy6.setBorder(border);

        ph_candy6.setIcon(candy6);
        ph_candy6.setBounds(0,0,500,400);
        Candy6.add(ph_candy6);

        l_candy6.setFont(new Font("",Font.BOLD,25));
        l_candy6.setForeground(Color.ORANGE);
        l_candy6.setBounds(170,390,200,50);
        Candy6.add(l_candy6);

        but_candy6.addActionListener(this);
        but_candy6.setFont(new Font("",Font.BOLD,25));
        but_candy6.setForeground(Color.ORANGE);
        but_candy6.setBackground(Color.white);
        but_candy6.setBounds(130,460,250,25);
        Candy6.add(but_candy6);
        //-------------------------------------------------------------------

        mainpanel.add(Candy1);
        mainpanel.add(Candy2);
        mainpanel.add(Candy3);
        mainpanel.add(Candy4);
        mainpanel.add(Candy5);
        mainpanel.add(Candy6);


        JScrollPane scrollPane = new JScrollPane(mainpanel);
        scrollPane.setBounds(250, 0, 2308, 1450);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        this.add(scrollPane);
        this.setVisible(true);
    }

    private void togglemenu() {
        if (slider != null && slider.isRunning()) {
            return;
        }
        int step = 10;
        int delay = 5;

        if (!isMenuvisible) {
            slider = new Timer(delay, new ActionListener() {
                int x = -menuwidth;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (x < 0) {
                        x += step;
                        menupanel.setBounds(x, 0, menuwidth, getHeight());
                    } else {
                        menupanel.setBounds(0, 0, menuwidth, getHeight());
                        ((Timer) e.getSource()).stop();
                        isMenuvisible = true;
                    }
                }
            });
        } else {
            slider = new Timer(delay, new ActionListener() {
                int x = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (x > -menuwidth) {
                        x -= step;
                        menupanel.setBounds(x, 0, menuwidth, getHeight()); // تغییرات اینجا
                    } else {
                        menupanel.setBounds(-menuwidth, 0, menuwidth, getHeight());
                        ((Timer) e.getSource()).stop();
                        isMenuvisible = false;
                    }
                }
            });
        }
        slider.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == about) {
            this.dispose();
            new about_us();
        } else if (e.getSource() == conect) {
            this.dispose();
            new about_us();
        } else if (e.getSource() == exite) {
            int result = JOptionPane.showConfirmDialog(null, "Do you want exit ?", "EXIT", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION)
                this.dispose();
        }
        else if (e.getSource() == home_but) {
            this.dispose();
            new Main_page();
        }else if (e.getSource() == baskete) {
            this.dispose();
            new Basket();
        }
        if (e.getSource()==but_candy1){
            bascketManager.addproduct(dry1);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_candy2){
            bascketManager.addproduct(dry2);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_candy3){
            bascketManager.addproduct(dry3);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_candy4){
            bascketManager.addproduct(dry4);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_candy5){
            bascketManager.addproduct(dry5);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_candy6){
            bascketManager.addproduct(dry6);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
    }
}
