import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class gui extends JFrame implements ActionListener {
    public JButton button;
    public JButton button2;
    public JTextField t1;
    public JTextField t2;
    public JTextField t3;
    gui(){
        this.setLocation(400, 350);
        this.setTitle("Πρόγραμμα Επίλυσης της Δευτεροβάθμιας Εξίσωσης");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.NORMAL);

        lib.t1 = new JTextField("Δώσε α");
        lib.t1.setEditable(false);
        lib.t1.setBackground(null);
        lib.t1.setForeground(Color.BLACK);
        lib.t1.setSelectedTextColor(Color.RED);
        lib.t1.setSelectionColor(Color.cyan);
        lib.t1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        lib.t2 = new JTextField("Δώσε β");
        lib.t2.setEditable(false);
        lib.t2.setBackground(null);
        lib.t2.setForeground(Color.BLACK);
        lib.t2.setSelectedTextColor(Color.RED);
        lib.t2.setSelectionColor(Color.cyan);
        lib.t2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        lib.t3 = new JTextField("Δώσε γ");
        lib.t3.setEditable(false);
        lib.t3.setBackground(null);
        lib.t3.setForeground(Color.BLACK);
        lib.t3.setSelectedTextColor(Color.RED);
        lib.t3.setSelectionColor(Color.cyan);
        lib.t3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        lib.t4 = new JTextField("");
        lib.t4.setEditable(true);
        lib.t4.setBackground(null);
        lib.t4.setForeground(Color.BLACK);
        lib.t4.setSelectedTextColor(Color.BLUE);
        lib.t4.setSelectionColor(Color.cyan);
        lib.t4.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        lib.t5 = new JTextField("");
        lib.t5.setEditable(true);
        lib.t5.setBackground(null);
        lib.t5.setForeground(Color.BLACK);
        lib.t5.setSelectedTextColor(Color.BLUE);
        lib.t5.setSelectionColor(Color.cyan);
        lib.t5.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        lib.t6 = new JTextField("");
        lib.t6.setEditable(true);
        lib.t6.setBackground(null);
        lib.t6.setForeground(Color.BLACK);
        lib.t6.setSelectedTextColor(Color.BLUE);
        lib.t6.setSelectionColor(Color.cyan);
        lib.t6.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        button = new JButton("");
        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        button.setText("Συνέχεια");
        button.addActionListener(this);

        button2 = new JButton("");
        button2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        button2.setText("Κλείσιμο");
        button2.addActionListener(this);
        this.add(lib.t1);
        this.add(lib.t4);
        this.add(lib.t2);
        this.add(lib.t5);
        this.add(lib.t3);
        this.add(lib.t6);
        this.add(button2);
        this.add(button);
        this.setLayout(new GridLayout(4, 2));
        this.setMinimumSize(new Dimension(355, 200));
        this.setPreferredSize(new Dimension(624,351));
        this.setMaximumSize(new Dimension(1920,1080));
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            int exc = 0;
            if (!Objects.equals(lib.t4.getText(), "") && !Objects.equals(lib.t5.getText(), "") && !Objects.equals(lib.t6.getText(), "")) {
                try {
                    lib.a = Double.parseDouble(lib.t4.getText());
                    lib.b = Double.parseDouble(lib.t5.getText());
                    lib.c = Double.parseDouble(lib.t6.getText());
                }catch (NumberFormatException el){
                    exc = exc+1;
                    System.out.println("Exception: " + el);
                    this.setVisible(false);
                    new gui();
                }
                if(exc == 0){
                    this.setVisible(false);
                    func.deut();
                    new result();
                }
            }
        }else if(e.getSource() == button2){
            System.exit(0);
        }
    }
}
