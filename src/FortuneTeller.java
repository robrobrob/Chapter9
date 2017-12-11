import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FortuneTeller extends JFrame
        implements ActionListener
{
    private static final EasySound ding = new EasySound("ding.wav");

    // Declare an array of "fortunes" (strings):
    ArrayList<String> fortunes = new ArrayList<String>();

    private JTextField display;

    public FortuneTeller()
    {
        super("Fortune Teller");
        fortunes.add("You will meet a beautiful duck.");
        fortunes.add("You will die a lonely human.");
        fortunes.add("The end of times has come.");
        fortunes.add("I am not a fortune teller");
        fortunes.add("You have a bright future ahead of you. Truly blinding.");
        fortunes.add("I expect great things. You might not achieve great things, but I expect you to.");
        fortunes.add("Kachinga is your future. Cars everywhere.");
        fortunes.add("Death is a favorable alternative to communism");
        fortunes.add("My yah hee, My yah ha, My yah ha, My yah ha ha.");
        display = new JTextField("  Press \"Next\" to see your fortune...", 25);
        display.setBackground(Color.WHITE);
        display.setEditable(false);

        JButton go = new JButton("Next");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setLayout(new BoxLayout(c,1));
        c.add(display);
        c.add(go);
    }

    public void actionPerformed(ActionEvent e)
    {
        // Pick and display a random fortune:

        Random random  = new Random();

        display.setText("  " + fortunes.get(random.nextInt(fortunes.size())));
        ding.play();
    }

    public static void main(String[] args)
    {
        JFrame window = new FortuneTeller();
        window.setBounds(300, 300, 600, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
    }
}

