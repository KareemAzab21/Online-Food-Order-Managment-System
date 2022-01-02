import javax.swing.*;
import java.awt.*;

public class Guest {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 550);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Online Food Ordering App");
        frame.getContentPane().setBackground(new Color(255,255,255));

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

        ImageIcon i1 = new ImageIcon("Squid.png");
        Image i2 = i1.getImage().getScaledInstance(750, 422, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel ml = new JLabel(i3);
        ml.setBounds(0, 0, 950, 567);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.gray);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel1.setPreferredSize(new Dimension(910,567));

        /////////////////////////////////////////////////////////////

        JLabel title = new JLabel("How can we help you?");
        title.setFont(new Font("Comic Sans",Font.BOLD,25));
        title.setForeground(Color.cyan);
        panel1.add(title, BorderLayout.CENTER);

        ////////////////////////////////////////////////////////////

        ImageIcon review = new ImageIcon("review.jpg");
        JButton b1 = new JButton("Add Review");
        b1.setBounds(100,20,120,120);
        b1.setIcon(review);
        b1.setHorizontalTextPosition(JButton.CENTER);
        b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setFont(new Font("Comic Sans",Font.BOLD,17));
        b1.setForeground(Color.cyan);
        b1.setBackground(Color.gray);
        b1.setBorder(BorderFactory.createEtchedBorder());

        ImageIcon order = new ImageIcon("order.jpg");
        JButton b2 = new JButton("Place Order");
        b2.setBounds(100,150,120,120);
        b2.setIcon(order);
        b2.setHorizontalTextPosition(JButton.CENTER);
        b2.setVerticalTextPosition(JButton.BOTTOM);
        b2.setFont(new Font("Comic Sans",Font.BOLD,17));
        b2.setForeground(Color.cyan);
        b2.setBackground(Color.gray);
        b2.setBorder(BorderFactory.createEtchedBorder());

        ImageIcon show = new ImageIcon("show.jpg");
        JButton b3 = new JButton("Show Order");
        b3.setBounds(100,280,120,120);
        b3.setIcon(show);
        b3.setHorizontalTextPosition(JButton.CENTER);
        b3.setVerticalTextPosition(JButton.BOTTOM);
        b3.setFont(new Font("Comic Sans",Font.BOLD,17));
        b3.setForeground(Color.cyan);
        b3.setBackground(Color.gray);
        b3.setBorder(BorderFactory.createEtchedBorder());

        ml.add(b1);
        ml.add(b2);
        ml.add(b3);


        ////////////////////////////////////////////////////////////////

        panel1.add(ml);
        frame.add(mb, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);


    }
}
