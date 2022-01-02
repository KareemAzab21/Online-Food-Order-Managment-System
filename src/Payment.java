import javax.swing.*;
import java.awt.*;

public class Payment {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(830,720);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Online Food Ordering App");
        frame.getContentPane().setBackground(new Color(255, 255, 255));

        ImageIcon icon = new ImageIcon("KrabbyPatty.jpg");
        frame.setIconImage(icon.getImage());

        frame.setLayout(new BorderLayout());

        //////////////////////////////////////////////////////

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);

        //Menu items and options
        JMenuItem m11 = new JMenuItem("EXIT");
        m1.add(m11);

        /////////////////////////////////////////////////////////////////////////

        ImageIcon i1 = new ImageIcon("pay1.png");
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel ml = new JLabel(i3);
        ml.setBounds(0, 0, 900, 500);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel1.setPreferredSize(new Dimension(800, 600));

        /////////////////////////////////////////////////////////////

        JLabel title = new JLabel("Payment");
        title.setFont(new Font("Comic Sans", Font.TRUETYPE_FONT, 25));
        title.setForeground(Color.cyan);
        panel1.add(title, BorderLayout.CENTER);

        ////////////////////////////////////////////////////////////

        JLabel title1 = new JLabel("Credit Card Details");
        title1.setFont(new Font("Comic Sans",Font.TRUETYPE_FONT,20));
        title1.setForeground(Color.white);
        title1.setBackground(Color.blue);
        title1.setOpaque(true);
        title1.setBounds(100,40,170,30);
        ml.add(title1);

        JLabel l1 = new JLabel("Name");
        l1.setFont(new Font("Comic Sans",Font.ITALIC,13));
        l1.setForeground(Color.white);
        l1.setBackground(Color.blue);
        l1.setOpaque(true);
        l1.setBounds(100,100,150,30);

        JTextField t1 = new JTextField();
        t1.setBounds(140,100,150,30);

        JLabel l2 = new JLabel("Card Number");
        l2.setFont(new Font("Comic Sans",Font.ITALIC,13));
        l2.setForeground(Color.white);
        l2.setBackground(Color.blue);
        l2.setOpaque(true);
        l2.setBounds(100,170,150,30);

        JTextField t2 = new JTextField(10);
        t2.setBounds(180,170,150,30);

        JLabel l3 = new JLabel("MM");
        l3.setFont(new Font("Comic Sans",Font.ITALIC,13));
        l3.setForeground(Color.white);
        l3.setBackground(Color.blue);
        l3.setOpaque(true);
        l3.setBounds(100,240,40,30);

        JTextField t3 = new JTextField(2);
        t3.setBounds(130,240,40,30);

        JLabel l4 = new JLabel("YYYY");
        l4.setFont(new Font("Comic Sans",Font.ITALIC,13));
        l4.setForeground(Color.white);
        l4.setBackground(Color.blue);
        l4.setOpaque(true);
        l4.setBounds(200,240,40,30);

        JTextField t4 = new JTextField(4);
        t4.setBounds(240,240,50,30);

        JLabel l5 = new JLabel("CSV");
        l5.setFont(new Font("Comic Sans",Font.ITALIC,13));
        l5.setForeground(Color.white);
        l5.setBackground(Color.blue);
        l5.setOpaque(true);
        l5.setBounds(100,310,40,30);

        JTextField t5 = new JTextField(3);
        t5.setBounds(130,310,40,30);

        JButton bl = new JButton("Pay with Credit Card");
        bl.setBounds(100,360,300,30);

        ml.add(l1);
        ml.add(t1);
        ml.add(l2);
        ml.add(t2);
        ml.add(l3);
        ml.add(t3);
        ml.add(l4);
        ml.add(t4);
        ml.add(l5);
        ml.add(t5);
        ml.add(bl);

        ////////////////////////////////////////////////////////////////

        panel1.add(ml);
        frame.add(mb, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);


    }
}
