import javax.swing.*;
import java.awt.*;

public class SignIn {
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

        ImageIcon i1 = new ImageIcon("rest3.jpg");
        Image i2 = i1.getImage().getScaledInstance(910, 567, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel ml = new JLabel(i3);
        ml.setBounds(0, 0, 950, 567);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.darkGray);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel1.setPreferredSize(new Dimension(910,567));

        /////////////////////////////////////////////////////////////

        JLabel title = new JLabel("Sign up or Log in");
        title.setFont(new Font("Comic Sans",Font.BOLD,25));
        title.setForeground(Color.ORANGE);
        panel1.add(title, BorderLayout.CENTER);

        ////////////////////////////////////////////////////////////

        JLabel title1 = new JLabel("Already have an account? log in");
        title1.setFont(new Font("Comic Sans",Font.BOLD,13));
        title1.setForeground(Color.black);
        title1.setBackground(Color.orange);
        title1.setOpaque(true);
        title1.setBounds(100,40,220,30);
        ml.add(title1);

        JLabel l1 = new JLabel("Username: ");
        l1.setFont(new Font("Comic Sans",Font.BOLD,13));
        l1.setForeground(Color.black);
        l1.setBackground(Color.orange);
        l1.setOpaque(true);
        l1.setBounds(100,100,200,30);

        JTextField t1 = new JTextField();
        t1.setBounds(170,100,200,30);

        JLabel l2 = new JLabel("Password: ");
        l2.setFont(new Font("Comic Sans",Font.BOLD,13));
        l2.setForeground(Color.black);
        l2.setBackground(Color.orange);
        l2.setOpaque(true);
        l2.setBounds(100,170,200,30);

        JPasswordField t2 = new JPasswordField(10);
        t2.setBounds(170,170,200,30);

        JButton bl = new JButton("Log in");
        bl.setBounds(100,220,100,30);

        ml.add(l1);
        ml.add(t1);
        ml.add(l2);
        ml.add(t2);
        ml.add(bl);

        ////////////////////////////////////////////////////////////////

        JLabel title2 = new JLabel("New? Sign up");
        title2.setFont(new Font("Comic Sans",Font.BOLD,13));
        title2.setForeground(Color.black);
        title2.setBackground(Color.orange);
        title2.setOpaque(true);
        title2.setBounds(500,40,170,30);
        ml.add(title2);

        JLabel l11 = new JLabel("First name: ");
        l11.setFont(new Font("Comic Sans",Font.BOLD,13));
        l11.setForeground(Color.black);
        l11.setBackground(Color.orange);
        l11.setOpaque(true);
        l11.setBounds(500,100,210,30);

        JTextField t11 = new JTextField();
        t11.setBounds(570,100,200,30);

        JLabel l12 = new JLabel("last name: ");
        l12.setFont(new Font("Comic Sans",Font.BOLD,13));
        l12.setForeground(Color.black);
        l12.setBackground(Color.orange);
        l12.setOpaque(true);
        l12.setBounds(500,170,210,30);

        JTextField t12 = new JTextField();
        t12.setBounds(570,170,200,30);

        JLabel l13 = new JLabel("Email: ");
        l13.setFont(new Font("Comic Sans",Font.BOLD,13));
        l13.setForeground(Color.black);
        l13.setBackground(Color.orange);
        l13.setOpaque(true);
        l13.setBounds(500,240,200,30);

        JTextField t13 = new JTextField();
        t13.setBounds(570,240,200,30);

        JLabel l22 = new JLabel("Create Password: ");
        l22.setFont(new Font("Comic Sans",Font.BOLD,13));
        l22.setForeground(Color.black);
        l22.setBackground(Color.orange);
        l22.setOpaque(true);
        l22.setBounds(500,310,200,30);

        JPasswordField t22 = new JPasswordField();
        t22.setBounds(570,310,200,30);

        JButton bs = new JButton("Sign up");
        bs.setBounds(500,370,100,30);

        ml.add(l11);
        ml.add(t11);
        ml.add(l12);
        ml.add(t12);
        ml.add(l13);
        ml.add(t13);
        ml.add(l22);
        ml.add(t22);
        ml.add(bs);

        ////////////////////////////////////////////////////////////////

        panel1.add(ml);
        frame.add(mb, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);


    }
}
