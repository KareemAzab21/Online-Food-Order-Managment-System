import javax.swing.*;
import java.awt.*;

public class Admin {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(910,700);
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

        ImageIcon i1 = new ImageIcon("office5.png");
        Image i2 = i1.getImage().getScaledInstance(910, 570, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel ml = new JLabel(i3);
        ml.setBounds(0, 0, 950, 567);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.GRAY);
        //panel1.setBackground(new Color(92,57,3));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel1.setPreferredSize(new Dimension(910,567));

        /////////////////////////////////////////////////////////////

        JLabel title = new JLabel("Admin Homepage");
        title.setFont(new Font("Comic Sans",Font.BOLD,25));
        title.setForeground(Color.white);
        panel1.add(title, BorderLayout.CENTER);

        ////////////////////////////////////////////////////////////

        JLabel title1 = new JLabel("Food Categories: ");
        title1.setFont(new Font("Comic Sans",Font.BOLD,17));
        title1.setForeground(Color.BLACK);
        title1.setBackground(Color.LIGHT_GRAY);
        title1.setOpaque(true);
        title1.setBounds(380,40,145,50);
        ml.add(title1);

        JButton b1 = new JButton("Add food category");
        b1.setBounds(350,100,200,50);
        JButton b2 = new JButton("Add food information");
        b2.setBounds(350,160,200,50);
        ml.add(b1);
        ml.add(b2);

        ////////////////////////////////////////////////////////////////

        JLabel title2 = new JLabel("Contracts: ");
        title2.setFont(new Font("Comic Sans",Font.BOLD,17));
        title2.setForeground(Color.BLACK);
        title2.setBackground(Color.LIGHT_GRAY);
        title2.setOpaque(true);
        title2.setBounds(410,220,90,50);
        ml.add(title2);

        JButton b5 = new JButton("Add a new Restaurant");
        b5.setBounds(350,280,200,50);
        JButton b7 = new JButton("Add a menu to a Restaurant");
        b7.setBounds(350,340,200,50);
        ml.add(b5);
        ml.add(b7);

        ////////////////////////////////////////////////////////////////

        panel1.add(ml);
        frame.add(mb, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);


    }
}
