import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cakepage extends JFrame implements ActionListener {
    BascketManager basketManager = BascketManager.getInstance();
    Product sweet1 = new Product("Three layer cake",57.00);
    Product sweet2 = new Product("flower cake",15.50);
    Product sweet3 = new Product("Chocolate cake",16.25);
    Product sweet4 = new Product("Cappuccino cake",25.00);
    Product sweet5 = new Product("Chocolate topping cake",22.00);
    Product sweet6 = new Product("Strawberry ice cream cake",18.99);


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

    ImageIcon cake1 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pexels-brent-keane-181485-1702373.jpg");
    ImageIcon cake2 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\jasmine-bartel-8LtrMQfeDkQ-unsplash.jpg");
    ImageIcon cake3 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\jacob-thomas-6jHpcBPw7i8-unsplash.jpg");
    ImageIcon cake4 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\kaouther-djouada-hcEDfkiVmMI-unsplash.jpg");
    ImageIcon cake5 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\american-heritage-chocolate-vdx5hPQhXFk-unsplash.jpg");
    ImageIcon cake6 = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\katie-rosario-QNyRp21hb5I-unsplash.jpg");

    JLabel ph_cake1 = new JLabel();
    JLabel ph_cake2 = new JLabel();
    JLabel ph_cake3 = new JLabel();
    JLabel ph_cake4 = new JLabel();
    JLabel ph_cake5 = new JLabel();
    JLabel ph_cake6 = new JLabel();

    JPanel Cake1 = new JPanel();
    JPanel Cake2 = new JPanel();
    JPanel Cake3 = new JPanel();
    JPanel Cake4 = new JPanel();
    JPanel Cake5 = new JPanel();
    JPanel Cake6 = new JPanel();

    JLabel l_cake1 = new JLabel("PRICE : $57.00");
    JLabel l_cake2 = new JLabel("PRICE : $15.50");
    JLabel l_cake3 = new JLabel("PRICE : $16.25");
    JLabel l_cake4 = new JLabel("PRICE : $25.00");
    JLabel l_cake5 = new JLabel("PRICE : $22.00");
    JLabel l_cake6 = new JLabel("PRICE : $18.99");

    JButton but_cake1 = new JButton("ADD TO BASKET");
    JButton but_cake2 = new JButton("ADD TO BASKET");
    JButton but_cake3 = new JButton("ADD TO BASKET");
    JButton but_cake4 = new JButton("ADD TO BASKET");
    JButton but_cake5 = new JButton("ADD TO BASKET");
    JButton but_cake6 = new JButton("ADD TO BASKET");

    Cakepage() {
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
        //  ----------------------------------------------------------------------------------------------------------------
        mainpanel.setBounds(250, 0, 2293, 1450);
        mainpanel.setLayout(null);
        mainpanel.setBackground(Color.DARK_GRAY);
        mainpanel.setPreferredSize(new Dimension(2293, 2500));

        //---------------------------------------------------------------------------------------------------------------
        Cake1.setBounds(100,150,500,500);
        Cake1.setLayout(null);
        Cake1.setBackground(Color.white);
        Cake1.setBorder(border);

        ph_cake1.setIcon(cake1);
        ph_cake1.setBounds(0,0,495,400);
        Cake1.add(ph_cake1);

        l_cake1.setFont(new Font("",Font.BOLD,25));
        l_cake1.setForeground(Color.ORANGE);
        l_cake1.setBounds(170,390,200,50);
        Cake1.add(l_cake1);

        but_cake1.setFont(new Font("",Font.BOLD,25));
        but_cake1.addActionListener(this);
        but_cake1.setForeground(Color.ORANGE);
        but_cake1.setBackground(Color.white);
        but_cake1.setBounds(125,460,250,25);
        Cake1.add(but_cake1);

        //-------------------------------------------------------------------
        Cake2.setBounds(100,800,500,500);
        Cake2.setLayout(null);
        Cake2.setBackground(Color.white);
        Cake2.setBorder(border);

        ph_cake2.setIcon(cake2);
        ph_cake2.setBounds(0,0,500,400);
        Cake2.add(ph_cake2);


        l_cake2.setFont(new Font("",Font.BOLD,25));
        l_cake2.setForeground(Color.ORANGE);
        l_cake2.setBounds(170,390,200,50);
        Cake2.add(l_cake2);


        but_cake2.setFont(new Font("",Font.BOLD,25));
        but_cake2.addActionListener(this);
        but_cake2.setForeground(Color.ORANGE);
        but_cake2.setBackground(Color.white);
        but_cake2.setBounds(125,460,250,25);
        Cake2.add(but_cake2);

        //-------------------------------------------------------------------

        Cake3.setBounds(100,1450,500,500);
        Cake3.setLayout(null);
        Cake3.setBackground(Color.white);
        Cake3.setBorder(border);

        ph_cake3.setIcon(cake3);
        ph_cake3.setBounds(0,0,500,400);
        Cake3.add(ph_cake3);

        l_cake3.setFont(new Font("",Font.BOLD,25));
        l_cake3.setForeground(Color.ORANGE);
        l_cake3.setBounds(170,390,200,50);
        Cake3.add(l_cake3);

        but_cake3.setFont(new Font("",Font.BOLD,25));
        but_cake3.setForeground(Color.ORANGE);
        but_cake3.addActionListener(this);
        but_cake3.setBackground(Color.white);
        but_cake3.setBounds(125,460,250,25);
        Cake3.add(but_cake3);

        //-------------------------------------------------------------------

        Cake4.setBounds(1675,150,500,500);
        Cake4.setLayout(null);
        Cake4.setBackground(Color.white);
        Cake4.setBorder(border);

        ph_cake4.setIcon(cake4);
        ph_cake4.setBounds(0,0,500,400);
        Cake4.add(ph_cake4);

        l_cake4.setFont(new Font("",Font.BOLD,25));
        l_cake4.setForeground(Color.ORANGE);
        l_cake4.setBounds(170,390,200,50);
        Cake4.add(l_cake4);

        but_cake4.setFont(new Font("",Font.BOLD,25));
        but_cake4.addActionListener(this);
        but_cake4.setForeground(Color.ORANGE);
        but_cake4.setBackground(Color.white);
        but_cake4.setBounds(125,460,250,25);
        Cake4.add(but_cake4);

//        //-------------------------------------------------------------------

        Cake5.setBounds(1675,800,500,500);
        Cake5.setLayout(null);
        Cake5.setBackground(Color.white);
        Cake5.setBorder(border);

        ph_cake5.setIcon(cake5);
        ph_cake5.setBounds(0,0,500,400);
        Cake5.add(ph_cake5);

        l_cake5.setFont(new Font("",Font.BOLD,25));
        l_cake5.setForeground(Color.ORANGE);
        l_cake5.setBounds(170,390,200,50);
        Cake5.add(l_cake5);

        but_cake5.setFont(new Font("",Font.BOLD,25));
        but_cake5.addActionListener(this);
        but_cake5.setForeground(Color.ORANGE);
        but_cake5.setBackground(Color.white);
        but_cake5.setBounds(125,460,250,25);
        Cake5.add(but_cake5);

//        //-------------------------------------------------------------------

        Cake6.setBounds(1675,1450,500,500);
        Cake6.setLayout(null);
        Cake6.setBackground(Color.white);
        Cake6.setBorder(border);

        ph_cake6.setIcon(cake6);
        ph_cake6.setBounds(0,0,500,400);
        Cake6.add(ph_cake6);


        l_cake6.setFont(new Font("",Font.BOLD,25));
        l_cake6.setForeground(Color.ORANGE);
        l_cake6.setBounds(170,390,200,50);
        Cake6.add(l_cake6);

        but_cake6.addActionListener(this);
        but_cake6.setFont(new Font("",Font.BOLD,25));
        but_cake6.setForeground(Color.ORANGE);
        but_cake6.setBackground(Color.white);
        but_cake6.setBounds(130,460,250,25);
        Cake6.add(but_cake6);
        //-------------------------------------------------------------------

        mainpanel.add(Cake1);
        mainpanel.add(Cake2);
        mainpanel.add(Cake3);
        mainpanel.add(Cake4);
        mainpanel.add(Cake5);
        mainpanel.add(Cake6);


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
        if (e.getSource()==but_cake1){
            basketManager.addproduct(sweet1);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_cake2){
            basketManager.addproduct(sweet2);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_cake3){
            basketManager.addproduct(sweet3);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_cake4){
            basketManager.addproduct(sweet4);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_cake5){
            basketManager.addproduct(sweet5);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }
        if (e.getSource()==but_cake6){
            basketManager.addproduct(sweet6);
            JOptionPane.showMessageDialog(this, "Added to basket!");
        }

    }
}