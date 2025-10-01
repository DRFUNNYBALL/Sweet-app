import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_page extends JFrame implements ActionListener{
    //for menu----------------------------------------------------------------------------------------------------------
    ImageIcon imageIC = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\toffee_6727796.png");//for Icon
    ImageIcon buttonmenu = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\icons8-xbox-menu-64 (1).png");
    ImageIcon abut = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\icons8-information-64 (1).png");
    ImageIcon conet = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\icons8-customer-support-64 (1).png");
    ImageIcon exits = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\powerr.png");
    ImageIcon baskets = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\shopping-basket_8415850 (1).png");
    ImageIcon bot = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\icons8-bot-64.png");
    ImageIcon Log = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\logout (1).png");
    //------------------------------------------------------------------------------------------------------------------
    //for Main_panel----------------------------------------------------------------------------------------------------
    ImageIcon Candyphoto = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pexels-suju-1693027 (1).jpg");
    ImageIcon Cakephoto = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pexels-quang-nguyen-vinh-222549-2144112 (1).jpg");
    ImageIcon Drinkphoto = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\nathan-dumlao-pMW4jzELQCw-unsplash (1).jpg");
    ImageIcon Dryphoto = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\kiko-camaclang-RkwpBigY0y4-unsplash (1).jpg");
    ImageIcon Wetphoto = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pexels-valeriya-827513 (1).jpg");
    ImageIcon Tartphoto = new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\baked-rustic-blueberry-pie-wooden-table-generated-by-ai (1).jpg");


    //for menupanel---------------------------------------------------------------------------------------------------------
    JPanel menupanel = new JPanel();
    JButton toggle = new JButton();
    Timer slider;
    JLabel menulabel = new JLabel();
    int menuwidth = 250;
    boolean isMenuvisabel = false;

    JLabel aboutus = new JLabel("ABOUT US");
    JLabel conectus = new JLabel("CONNECT US");
    JLabel exit = new JLabel("EXIT");
    JLabel Bot = new JLabel("OUR BOT");
    JLabel basket = new JLabel("BASKET");
    JLabel Log_out = new JLabel("LOG OUT");

    JButton Logout = new JButton();
    JButton about = new JButton();
    JButton conect = new JButton();
    JButton but_but = new JButton();
    JButton exite = new JButton();
    JButton baskete = new JButton();
    //----------------------------------------------------------------------------------------------------------------------
//for slidebar----------------------------------------------------------------------------------------------------------
    ImageIcon[] images ={
            new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\jacob-thomas-6jHpcBPw7i8-unsplash_2286x345.png"),
            new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pexels-valeriya-827513_2286x345.png"),
            new ImageIcon("D:\\Papp\\intlij\\IntelliJ IDEA Community Edition 2025.1\\PICS\\pexels-mcore-89690_2286x345.png")
    };
    int currentIndex = 0;

    JLabel imageLabel = new JLabel();
    Timer autoTimer;
    int sliderSpeed = 20;
    int sliderDelay = 5000;

    JPanel slidbar = new JPanel();

    //----------------------------------------------------------------------------------------------------------------------
    JPanel Mainpanel = new JPanel();
    JPanel candypanel= new JPanel();
    JPanel cakepanel = new JPanel();
    JPanel drinkpanel = new JPanel();
    JPanel drysweets = new JPanel();
    JPanel Wetcandy = new JPanel();
    JPanel tartcandy = new JPanel();

    Border border = BorderFactory.createLineBorder(Color.orange,5);

    JLabel candy = new JLabel();
    JLabel cake = new JLabel();
    JLabel drink = new JLabel();
    JLabel dry = new JLabel();
    JLabel wet = new JLabel();
    JLabel tart = new JLabel();

    JLabel candyphoto = new JLabel();
    JLabel cakephoto = new JLabel();
    JLabel drinkphoto = new JLabel();
    JLabel dryphoto = new JLabel();
    JLabel wetphoto = new JLabel();
    JLabel tartphoto = new JLabel();

    JButton candybut = new JButton();
    JButton cakebut = new JButton();
    JButton drinkbut = new JButton();
    JButton drybut = new JButton();
    JButton wetbut = new JButton();
    JButton tartbut = new JButton();

    Main_page(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//for all resolotions
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("BOOCOKI");
        this.setSize(screenSize.width, screenSize.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.darkGray);
        this.setLayout(null);
        this.setIconImage(imageIC.getImage());

        //for menubar---------------------------------------------------------------------------------------------------
        toggle.setIcon(buttonmenu);
        toggle.setBounds(10,10,30,30);
        add(toggle);

        menupanel.setBackground(Color.white);
        menupanel.setBounds(-menuwidth,0,menuwidth,getHeight());
        menupanel.setLayout(null);
        add(menupanel);

        aboutus.setFont(new Font("",Font.BOLD,15));
        aboutus.setForeground(Color.black);
        aboutus.setBounds(75,50,100,100);

        about.setIcon(abut);
        about.setBackground(Color.white);
        about.addActionListener(this);
        about.setBounds(20,80,40,40);

        conectus.setFont(new Font("",Font.BOLD,15));
        conectus.setForeground(Color.black);
        conectus.setBounds(75,150,150,100);

        conect.setIcon(conet);
        conect.setBackground(Color.white);
        conect.addActionListener(this);
        conect.setBounds(20,180,40,40);

        basket.setFont(new Font("",Font.BOLD,15));
        basket.setForeground(Color.black);
        basket.setBounds(75,250,150,100);

        baskete.setIcon(baskets);
        baskete.setBackground(Color.white);
        baskete.addActionListener(this);
        baskete.setBounds(20,280,40,40);

        Bot.setFont(new Font("",Font.BOLD, 15));
        Bot.setForeground(Color.BLACK);
        Bot.setBounds(75,350,150,100);

        but_but.setIcon(bot);
        but_but.setBackground(Color.white);
        but_but.addActionListener(this);
        but_but.setBounds(20,380,40,40);

        Log_out.setFont(new Font("",Font.BOLD,15));
        Log_out.setForeground(Color.black);
        Log_out.setBounds(75,1200,150,100);

        Logout.setIcon(Log);
        Logout.setBackground(Color.white);
        Logout.addActionListener(this);
        Logout.setBounds(20,1230,40,40);

        exit.setFont(new Font("",Font.BOLD,15));
        exit.setForeground(Color.black);
        exit.setBounds(75,1300,150,100);

        exite.setIcon(exits);
        exite.setBackground(Color.white);
        exite.addActionListener(this);
        exite.setBounds(20,1330,40,40);

        menulabel.setBounds(20,20,100,30);

        toggle.addActionListener(e -> togglemenu());

        menupanel.add(basket);
        menupanel.add(baskete);
        menupanel.add(exit);
        menupanel.add(exite);
        menupanel.add(Bot);
        menupanel.add(but_but);
        menupanel.add(conectus);
        menupanel.add(conect);
        menupanel.add(aboutus);
        menupanel.add(about);
        menupanel.add(Log_out);
        menupanel.add(Logout);
        menupanel.add(menulabel);
        //--------------------------------------------------------------------------------------------------------------
        //for slidebar--------------------------------------------------------------------------------------------------
        slidbar.setBounds(3,0,2286,345);
        slidbar.setBackground(Color.WHITE);
        slidbar.setLayout(null);

        imageLabel.setBounds(0,0,slidbar.getWidth(),slidbar.getHeight());
        imageLabel.setIcon(resizeIcon(images[0]));
        slidbar.add(imageLabel);

        JButton nextBtn = new JButton(">");
        nextBtn.setBounds(slidbar.getWidth() - 60, slidbar.getHeight() - 50, 50, 30);
        nextBtn.addActionListener(e -> showNextImage());
        slidbar.add(nextBtn);

        JButton prevBtn = new JButton("<");
        prevBtn.setBounds(10, slidbar.getHeight() - 50, 50, 30);
        prevBtn.addActionListener(e -> showPrevImage());
        slidbar.add(prevBtn);


        autoTimer = new Timer(sliderDelay, e -> showNextImage());
        autoTimer.start();
    //------------------------------------------------------------------------------------------------------------------
    //for Jpanels-------------------------------------------------------------------------------------------------------
        Mainpanel.setBounds(250,0,2293,1400);
        Mainpanel.setLayout(null);
        Mainpanel.setBackground(Color.DARK_GRAY);
        Mainpanel.setPreferredSize(new Dimension(2293, 2500));//for scroll

       //---------------------------------------------------------------------------------------------------------------
        cakepanel.setBounds(100,500,500,500);
        cakepanel.setLayout(null);
        cakepanel.setBackground(Color.white);
        cakepanel.setBorder(border);

        cakephoto.setIcon(Cakephoto);
        cakephoto.setBounds(0,0,500,400);
        cakepanel.add(cakephoto);

        cake.setText("CAKES");
        cake.setFont(new Font("",Font.BOLD,25));
        cake.setForeground(Color.ORANGE);
        cake.setBounds(200,390,200,50);
        cakepanel.add(cake);

        cakebut.setText("View all models");
        cakebut.setFont(new Font("",Font.BOLD,25));
        cakebut.addActionListener(this);
        cakebut.setForeground(Color.ORANGE);
        cakebut.setBackground(Color.white);
        cakebut.setBounds(125,460,250,25);
        cakepanel.add(cakebut);

        //-------------------------------------------------------------------
        candypanel.setBounds(100,1200,500,500);
        candypanel.setLayout(null);
        candypanel.setBackground(Color.white);
        candypanel.setBorder(border);

        candyphoto.setIcon(Candyphoto);
        candyphoto.setBounds(0,0,500,400);
        candypanel.add(candyphoto);

        candy.setText("chocolate");
        candy.setFont(new Font("",Font.BOLD,25));
        candy.setForeground(Color.ORANGE);
        candy.setBounds(180,390,200,50);
        candypanel.add(candy);

        candybut.setText("View all models");
        candybut.setFont(new Font("",Font.BOLD,25));
        candybut.addActionListener(this);
        candybut.setForeground(Color.ORANGE);
        candybut.setBackground(Color.white);
        candybut.setBounds(125,460,250,25);
        candypanel.add(candybut);

        //-------------------------------------------------------------------

        drysweets.setBounds(100,1900,500,500);
        drysweets.setLayout(null);
        drysweets.setBackground(Color.white);
        drysweets.setBorder(border);

        dryphoto.setIcon(Dryphoto);
        dryphoto.setBounds(0,0,500,400);
        drysweets.add(dryphoto);

        dry.setText("Dry sweets");
        dry.setFont(new Font("",Font.BOLD,25));
        dry.setForeground(Color.ORANGE);
        dry.setBounds(180,390,200,50);
        drysweets.add(dry);

        drybut.setText("View all models");
        drybut.setFont(new Font("",Font.BOLD,25));
        drybut.setForeground(Color.ORANGE);
        drybut.addActionListener(this);
        drybut.setBackground(Color.white);
        drybut.setBounds(125,460,250,25);
        drysweets.add(drybut);

        //-------------------------------------------------------------------

        Wetcandy.setBounds(1675,500,500,500);
        Wetcandy.setLayout(null);
        Wetcandy.setBackground(Color.white);
        Wetcandy.setBorder(border);

        wetphoto.setIcon(Wetphoto);
        wetphoto.setBounds(0,0,500,400);
        Wetcandy.add(wetphoto);

        wet.setText("Wet sweets");
        wet.setFont(new Font("",Font.BOLD,25));
        wet.setForeground(Color.ORANGE);
        wet.setBounds(180,390,200,50);
        Wetcandy.add(wet);

        wetbut.setText("View all models");
        wetbut.setFont(new Font("",Font.BOLD,25));
        wetbut.addActionListener(this);
        wetbut.setForeground(Color.ORANGE);
        wetbut.setBackground(Color.white);
        wetbut.setBounds(125,460,250,25);
        Wetcandy.add(wetbut);

        //-------------------------------------------------------------------

        tartcandy.setBounds(1675,1200,500,500);
        tartcandy.setLayout(null);
        tartcandy.setBackground(Color.white);
        tartcandy.setBorder(border);

        tartphoto.setIcon(Tartphoto);
        tartphoto.setBounds(0,0,500,400);
        tartcandy.add(tartphoto);

        tart.setText("Tart sweets");
        tart.setFont(new Font("",Font.BOLD,25));
        tart.setForeground(Color.ORANGE);
        tart.setBounds(180,390,200,50);
        tartcandy.add(tart);

        tartbut.setText("View all models");
        tartbut.setFont(new Font("",Font.BOLD,25));
        tartbut.addActionListener(this);
        tartbut.setForeground(Color.ORANGE);
        tartbut.setBackground(Color.white);
        tartbut.setBounds(125,460,250,25);
        tartcandy.add(tartbut);

        //-------------------------------------------------------------------

        drinkpanel.setBounds(1675,1900,500,500);
        drinkpanel.setLayout(null);
        drinkpanel.setBackground(Color.white);
        drinkpanel.setBorder(border);

        drinkphoto.setIcon(Drinkphoto);
        drinkphoto.setBounds(0,0,500,400);
        drinkpanel.add(drinkphoto);

        drink.setText("Drinks");
        drink.setFont(new Font("",Font.BOLD,25));
        drink.setForeground(Color.ORANGE);
        drink.setBounds(210,390,200,50);
        drinkpanel.add(drink);

        drinkbut.setText("View all models");
        drinkbut.addActionListener(this);
        drinkbut.setFont(new Font("",Font.BOLD,25));
        drinkbut.setForeground(Color.ORANGE);
        drinkbut.setBackground(Color.white);
        drinkbut.setBounds(130,460,250,25);
        drinkpanel.add(drinkbut);
        //-------------------------------------------------------------------

        Mainpanel.add(slidbar);
        Mainpanel.add(cakepanel);
        Mainpanel.add(candypanel);
        Mainpanel.add(drysweets);
        Mainpanel.add(Wetcandy);
        Mainpanel.add(tartcandy);
        Mainpanel.add(drinkpanel);

        JScrollPane scrollPane = new JScrollPane(Mainpanel);
        scrollPane.setBounds(250, 0, 2308, 1450);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane);

        this.setVisible(true);
    }

    private void  showNextImage(){
        int nextIndex = (currentIndex + 1) % images.length;
        animateSlide(images[currentIndex], images[nextIndex], true);
        currentIndex = nextIndex;
    }
    private void showPrevImage() {
        int prevIndex = (currentIndex - 1 + images.length) % images.length;
        animateSlide(images[currentIndex], images[prevIndex], false);
        currentIndex = prevIndex;
    }


    private void animateSlide(ImageIcon from, ImageIcon to, boolean leftToRight) {
        JLabel fromLabel = new JLabel(resizeIcon(from));
        JLabel toLabel = new JLabel(resizeIcon(to));

        int width = slidbar.getWidth();
        int height = slidbar.getHeight();
        fromLabel.setBounds(0, 0, width, height);
        toLabel.setBounds(leftToRight ? width : -width, 0, width, height);

        slidbar.removeAll();
        slidbar.add(fromLabel);
        slidbar.add(toLabel);
        slidbar.repaint();
        slidbar.revalidate();

        Timer animTimer = new Timer(10, null);
        animTimer.addActionListener(new ActionListener() {
            int x = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                x += sliderSpeed;
                int offset = leftToRight ? -x : x;
                fromLabel.setLocation(offset, 0);
                toLabel.setLocation(offset + width, 0);

                if (Math.abs(offset) >= width) {
                    animTimer.stop();
                    slidbar.removeAll();
                    imageLabel.setIcon(resizeIcon(to));
                    imageLabel.setBounds(0, 0, width, height);
                    slidbar.add(imageLabel);

                    JButton nextBtn = new JButton(">");
                    nextBtn.setBounds(width - 60, height - 50, 50, 30);
                    nextBtn.addActionListener(ev -> showNextImage());
                    slidbar.add(nextBtn);

                    JButton prevBtn = new JButton("<");
                    prevBtn.setBounds(10, height - 50, 50, 30);
                    prevBtn.addActionListener(ev -> showPrevImage());
                    slidbar.add(prevBtn);

                    slidbar.repaint();
                    slidbar.revalidate();
                }
            }
        });
        animTimer.start();
    }

    private ImageIcon resizeIcon(ImageIcon icon) {
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(slidbar.getWidth(), slidbar.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }

    private void togglemenu(){
        if (slider != null && slider.isRunning())
            return;
        int step = 10;
        int delay = 5;

        if (!isMenuvisabel){
            slider = new Timer(delay, new ActionListener() {

                int x = -menuwidth;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (x < 0){
                        x += step;
                        menupanel.setBounds(x,0,menuwidth,getHeight());
                    }else {
                        menupanel.setBounds(0,0,menuwidth,getHeight());
                        ((Timer) e.getSource()).stop();
                        isMenuvisabel = true;
                    }
                }
            });

        }else {
            slider = new Timer(delay, new ActionListener() {
                int x = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (x > -menuwidth){
                        x -= step;
                        menupanel.setBounds(x,0,menuwidth,getHeight());
                    }else {
                        menupanel.setBounds(-menuwidth,0,menuwidth,getHeight());
                        ((Timer) e.getSource()).stop();
                        isMenuvisabel = false;
                    }
                }
            });
        }
        slider.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==about){
            this.dispose();
            new about_us();
        }
        if (e.getSource()==conect){
            this.dispose();
            new conect_us();
        }
        if (e.getSource()==baskete){
            this.dispose();
            new Basket();
        }
        if (e.getSource()==exite){
            int result = JOptionPane.showConfirmDialog(null,"Do you want exit ?","EXIT",JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){
                this.dispose();
            }
        }
        if (e.getSource()==Logout){
            this.dispose();
            new Login_page();
        }
        if (e.getSource()==cakebut){
            this.dispose();
            new Cakepage();
        }
        if (e.getSource()==candybut){
            this.dispose();
            new Chocolate();
        }
        if (e.getSource()==drybut){
            this.dispose();
            new Dry_sweet();
        }
        if (e.getSource()==wetbut){
            this.dispose();
            new Wet_sweet();
        }
        if (e.getSource()==tartbut){
            this.dispose();
            new Tart();
        }
        if (e.getSource()==drinkbut){
            this.dispose();
            new Drink();
        }
        if (e.getSource()==but_but){
            this.dispose();
            new Bot_page();
        }
    }
}
