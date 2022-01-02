import javax.swing.*;
import java.awt.*;

public class HomePage {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(910,700);
        frame.setResizable(true);
        frame.setVisible(true);
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

        ImageIcon i1 = new ImageIcon("online_ordering1.jpg");
        Image i2 = i1.getImage().getScaledInstance(910, 567, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel ml = new JLabel(i3);
        ml.setBounds(0, 0, 910, 567);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.YELLOW);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel1.setPreferredSize(new Dimension(910,567));

        /////////////////////////////////////////////////////////////

        JLabel title = new JLabel("Welcome to our Online food Application");
        title.setFont(new Font("Comic Sans",Font.BOLD,25));
        panel1.add(title, BorderLayout.CENTER);

        ////////////////////////////////////////////////////////////

        JLabel quote = new JLabel("Where we bring the Restaurants through your screen, with a bit of salt");
        quote.setFont(new Font("Comic Sans",Font.ITALIC,20));
        quote.setForeground(Color.YELLOW);
        quote.setBounds(150,1,900,50);
        ml.add(quote);

        JLabel choose = new JLabel("Select how would you like to continue:");
        choose.setFont(new Font("Comic Sans",Font.BOLD,20));
        choose.setForeground(Color.YELLOW);
        choose.setBounds(460,100,700,50);
        ml.add(choose);

        ImageIcon admin = new ImageIcon("admin.png");
        JButton b1 = new JButton("Admin");
        b1.setBounds(420,170,120,150);
        b1.setIcon(admin);
        b1.setHorizontalTextPosition(JButton.CENTER);
        b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setFont(new Font("Comic Sans",Font.BOLD,20));
        b1.setForeground(Color.cyan);
        b1.setBackground(Color.darkGray);
        b1.setBorder(BorderFactory.createEtchedBorder());


        ImageIcon Guest = new ImageIcon("guest.png");
        JButton b2 = new JButton("Guest");
        b2.setBounds(580,170,120,150);
        b2.setIcon(Guest);
        b2.setHorizontalTextPosition(JButton.CENTER);
        b2.setVerticalTextPosition(JButton.BOTTOM);
        b2.setFont(new Font("Comic Sans",Font.BOLD,20));
        b2.setForeground(Color.cyan);
        b2.setBackground(Color.darkGray);
        b2.setBorder(BorderFactory.createEtchedBorder());

        ImageIcon Register = new ImageIcon("register.jpg");
        JButton b3 = new JButton("Register");
        b3.setBounds(740,170,120,150);
        b3.setIcon(Register);
        b3.setHorizontalTextPosition(JButton.CENTER);
        b3.setVerticalTextPosition(JButton.BOTTOM);
        b3.setFont(new Font("Comic Sans",Font.BOLD,20));
        b3.setForeground(Color.cyan);
        b3.setBackground(Color.darkGray);
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
