import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wet_sweet extends JFrame implements ActionListener{
    BascketManager bascketManager = BascketManager.getInstance();
    Product wet1 = new Product("Chocolate head cake",12.00);
    Product wet2 = new Product("sponge cake",5.50);
    Product wet3 = new Product("Chocolate cake",7.25);
    Product wet4 = new Product("Chocolate almond brain cake",10.60);
    Product wet5 = new Product("Chocolate hazelnut cake",11.20);
    Product wet6 = new Product("Peanut butter cake with strawberry sauce",13.99);

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

    ImageIcon sweet1 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\1.jpg");
    ImageIcon sweet2 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\2.jpg");
    ImageIcon sweet3 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\3.jpg");
    ImageIcon sweet4 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\4.jpg");
    ImageIcon sweet5 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\5.jpg");
    ImageIcon sweet6 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\6.jpg");

    JLabel ph_sweet1 = new JLabel();
    JLabel ph_sweet2 = new JLabel();
    JLabel ph_sweet3 = new JLabel();
    JLabel ph_sweet4 = new JLabel();
    JLabel ph_sweet5 = new JLabel();
    JLabel ph_sweet6 = new JLabel();

    JPanel Sweet1 = new JPanel();
    JPanel Sweet2 = new JPanel();
    JPanel Sweet3 = new JPanel();
    JPanel Sweet4 = new JPanel();
    JPanel Sweet5 = new JPanel();
    JPanel Sweet6 = new JPanel();

    JLabel warning = new JLabel("The prices are per kilo");
    JLabel l_sweet1 = new JLabel("PRICE : $12.00");
    JLabel l_sweet2 = new JLabel("PRICE : $5.50");
    JLabel l_sweet3 = new JLabel("PRICE : $7.25");
    JLabel l_sweet4 = new JLabel("PRICE : $10.60");
    JLabel l_sweet5 = new JLabel("PRICE : $11.20");
    JLabel l_sweet6 = new JLabel("PRICE : $13.99");

    JButton but_sweet1 = new JButton("ADD TO BASKET");
    JButton but_sweet2 = new JButton("ADD TO BASKET");
    JButton but_sweet3 = new JButton("ADD TO BASKET");
    JButton but_sweet4 = new JButton("ADD TO BASKET");
    JButton but_sweet5 = new JButton("ADD TO BASKET");
    JButton but_sweet6 = new JButton("ADD TO BASKET");

    Wet_sweet() {
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
        warning.setBounds(925,0,1000,150);
        mainpanel.add(warning);

        //--------------------------------------------------------------------------------------------------------------
        Sweet1.setBounds(100,150,500,500);
        Sweet1.setLayout(null);
        Sweet1.setBackground(Color.white);
        Sweet1.setBorder(border);

        ph_sweet1.setIcon(sweet1);
        ph_sweet1.setBounds(0,0,495,400);
        Sweet1.add(ph_sweet1);

        l_sweet1.setFont(new Font("",Font.BOLD,25));
        l_sweet1.setForeground(Color.ORANGE);
        l_sweet1.setBounds(170,390,200,50);
        Sweet1.add(l_sweet1);

        but_sweet1.setFont(new Font("",Font.BOLD,25));
        but_sweet1.addActionListener(this);
        but_sweet1.setForeground(Color.ORANGE);
        but_sweet1.setBackground(Color.white);
        but_sweet1.setBounds(125,460,250,25);
        Sweet1.add(but_sweet1);

        //-------------------------------------------------------------------
        Sweet2.setBounds(100,800,500,500);
        Sweet2.setLayout(null);
        Sweet2.setBackground(Color.white);
        Sweet2.setBorder(border);

        ph_sweet2.setIcon(sweet2);
        ph_sweet2.setBounds(0,0,500,400);
        Sweet2.add(ph_sweet2);


        l_sweet2.setFont(new Font("",Font.BOLD,25));
        l_sweet2.setForeground(Color.ORANGE);
        l_sweet2.setBounds(170,390,200,50);
        Sweet2.add(l_sweet2);


        but_sweet2.setFont(new Font("",Font.BOLD,25));
        but_sweet2.addActionListener(this);
        but_sweet2.setForeground(Color.ORANGE);
        but_sweet2.setBackground(Color.white);
        but_sweet2.setBounds(125,460,250,25);
        Sweet2.add(but_sweet2);

        //-------------------------------------------------------------------

        Sweet3.setBounds(100,1450,500,500);
        Sweet3.setLayout(null);
        Sweet3.setBackground(Color.white);
        Sweet3.setBorder(border);

        ph_sweet3.setIcon(sweet3);
        ph_sweet3.setBounds(0,0,500,400);
        Sweet3.add(ph_sweet3);

        l_sweet3.setFont(new Font("",Font.BOLD,25));
        l_sweet3.setForeground(Color.ORANGE);
        l_sweet3.setBounds(170,390,200,50);
        Sweet3.add(l_sweet3);

        but_sweet3.setFont(new Font("",Font.BOLD,25));
        but_sweet3.setForeground(Color.ORANGE);
        but_sweet3.addActionListener(this);
        but_sweet3.setBackground(Color.white);
        but_sweet3.setBounds(125,460,250,25);
        Sweet3.add(but_sweet3);

        //-------------------------------------------------------------------

        Sweet4.setBounds(1675,150,500,500);
        Sweet4.setLayout(null);
        Sweet4.setBackground(Color.white);
        Sweet4.setBorder(border);

        ph_sweet4.setIcon(sweet4);
        ph_sweet4.setBounds(0,0,500,400);
        Sweet4.add(ph_sweet4);

        l_sweet4.setFont(new Font("",Font.BOLD,25));
        l_sweet4.setForeground(Color.ORANGE);
        l_sweet4.setBounds(170,390,200,50);
        Sweet4.add(l_sweet4);

        but_sweet4.setFont(new Font("",Font.BOLD,25));
        but_sweet4.addActionListener(this);
        but_sweet4.setForeground(Color.ORANGE);
        but_sweet4.setBackground(Color.white);
        but_sweet4.setBounds(125,460,250,25);
        Sweet4.add(but_sweet4);

//        //-------------------------------------------------------------------

        Sweet5.setBounds(1675,800,500,500);
        Sweet5.setLayout(null);
        Sweet5.setBackground(Color.white);
        Sweet5.setBorder(border);

        ph_sweet5.setIcon(sweet5);
        ph_sweet5.setBounds(0,0,500,400);
        Sweet5.add(ph_sweet5);

        l_sweet5.setFont(new Font("",Font.BOLD,25));
        l_sweet5.setForeground(Color.ORANGE);
        l_sweet5.setBounds(170,390,200,50);
        Sweet5.add(l_sweet5);

        but_sweet5.setFont(new Font("",Font.BOLD,25));
        but_sweet5.addActionListener(this);
        but_sweet5.setForeground(Color.ORANGE);
        but_sweet5.setBackground(Color.white);
        but_sweet5.setBounds(125,460,250,25);
        Sweet5.add(but_sweet5);

//        //-------------------------------------------------------------------

        Sweet6.setBounds(1675,1450,500,500);
        Sweet6.setLayout(null);
        Sweet6.setBackground(Color.white);
        Sweet6.setBorder(border);

        ph_sweet6.setIcon(sweet6);
        ph_sweet6.setBounds(0,0,500,400);
        Sweet6.add(ph_sweet6);

        l_sweet6.setFont(new Font("",Font.BOLD,25));
        l_sweet6.setForeground(Color.ORANGE);
        l_sweet6.setBounds(170,390,200,50);
        Sweet6.add(l_sweet6);

        but_sweet6.addActionListener(this);
        but_sweet6.setFont(new Font("",Font.BOLD,25));
        but_sweet6.setForeground(Color.ORANGE);
        but_sweet6.setBackground(Color.white);
        but_sweet6.setBounds(130,460,250,25);
        Sweet6.add(but_sweet6);
        //-------------------------------------------------------------------

        mainpanel.add(Sweet1);
        mainpanel.add(Sweet2);
        mainpanel.add(Sweet3);
        mainpanel.add(Sweet4);
        mainpanel.add(Sweet5);
        mainpanel.add(Sweet6);


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
        if (e.getSource()==but_sweet1){
            bascketManager.addproduct(wet1);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_sweet2){
            bascketManager.addproduct(wet2);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_sweet3){
            bascketManager.addproduct(wet3);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_sweet4){
            bascketManager.addproduct(wet4);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_sweet5){
            bascketManager.addproduct(wet5);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_sweet6){
            bascketManager.addproduct(wet6);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
    }
}
