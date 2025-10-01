import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Basket extends JFrame implements ActionListener {
    ImageIcon imageIC = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\toffee_6727796.png");
    ImageIcon bg_image = new ImageIcon("D:\\Papp\\VSCODE\\python\\image\\Ada.png.jpeg");

    Border border = BorderFactory.createLineBorder(Color.WHITE, 3);
    JPanel itempanel = new JPanel();
    JLabel image = new JLabel();
    JLabel welc = new JLabel("YOUR ORDERS");
    JButton buy = new JButton("Buy");
    JButton cancel = new JButton("Back");

    List<Product> basketitem = BascketManager.getInstance().getBasket();

    Basket() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Boocoki");
        this.setSize(screenSize.width, screenSize.height);
        this.setResizable(false);
        this.setIconImage(imageIC.getImage());

        image.setBounds(0, 0, screenSize.width, screenSize.height);
        image.setIcon(new ImageIcon(bg_image.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_SMOOTH)));

        itempanel.setLayout(null);
        itempanel.setBounds(1010, 250, 500, 1000);
        itempanel.setBorder(border);
        itempanel.setBackground(Color.black);

        welc.setFont(new Font("Arial", Font.BOLD, 20));
        welc.setBounds(180, 10, 200, 40);
        welc.setForeground(Color.ORANGE);
        itempanel.add(welc);

        buy.setBounds(5, 900, 150, 30);
        buy.addActionListener(this);
        itempanel.add(buy);

        cancel.setBounds(345, 900, 150, 30);
        cancel.addActionListener(this);
        itempanel.add(cancel);

        double totalPrice = 0;

        if (basketitem.isEmpty()) {
            JLabel empty = new JLabel("YOUR BASKET IS EMPTY");
            empty.setForeground(Color.ORANGE);
            empty.setFont(new Font("", Font.BOLD, 25));
            empty.setBounds(100, 50, 400, 50);
            itempanel.add(empty);
        } else {
            int yPosition = 50;

            for (Product product : basketitem) {
                JLabel productName = new JLabel("NAME: " + product.getName());
                productName.setFont(new Font("",Font.BOLD,20));
                productName.setForeground(Color.white);
                productName.setBounds(10, yPosition, 400, 30);
                yPosition += 35;

                JLabel productPrice = new JLabel("PRICE: " + product.getPrice());
                productPrice.setFont(new Font("",Font.BOLD,20));
                productPrice.setForeground(Color.white);
                productPrice.setBounds(10, yPosition, 400, 30);
                yPosition += 35;

                JButton remove = new JButton("REMOVE");
                remove.setBounds(10, yPosition, 150, 30);
                remove.addActionListener(e -> removeproduct(product));
                yPosition += 35;

                itempanel.add(productName);
                itempanel.add(productPrice);
                itempanel.add(remove);

                totalPrice += product.getPrice();
            }
        }
        JLabel totalLabel = new JLabel("Total: $" + totalPrice);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        totalLabel.setForeground(Color.ORANGE);
        totalLabel.setBounds(200, 850, 400, 30);
        itempanel.add(totalLabel);

        itempanel.setPreferredSize(new Dimension(500,+ 50));

        this.add(itempanel);
        this.add(image);
        this.setVisible(true);
    }

    private void removeproduct(Product product) {
        BascketManager.getInstance().removeProduct(product);
        JOptionPane.showMessageDialog(null, product.getName() + " has been removed from your basket.");
        new Basket();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancel) {
            this.dispose();
            new Main_page();
        }
        if (e.getSource() == buy) {
            int result = JOptionPane.showConfirmDialog(null, "Do you want to buy these items?", "BUY", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "YOUR BUYING WAS SUCCESSFUL", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                BascketManager.getInstance().clearBasket();
                new Basket();
            }
        }
    }
}
