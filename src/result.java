import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class result extends JFrame implements ActionListener {
    public JButton button;
    public JTextField t;
    result(){
        this.setLocation(400, 350);
        this.setTitle("Πρόγραμμα Επίλυσης της Δευτεροβάθμιας Εξίσωσης");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.NORMAL);

        t = new JTextField("");
        t.setEditable(false);
        t.setBackground(null);
        t.setForeground(Color.BLACK);
        t.setSelectedTextColor(Color.RED);
        t.setSelectionColor(Color.cyan);
        t.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        t.setText(lib.outcome);

        button = new JButton("");
        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        button.setText("Πίσω");
        button.addActionListener(this);

        this.add(t);
        this.add(button);
        this.setLayout(new GridLayout(2, 2));
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            this.setVisible(false);
            new gui();
        }
    }
}
