package toDoList.classes;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {

    private JLabel index;
    private JTextField taskName;
    private JButton done;
    private boolean checked;

    //Constructor
    Task() {
        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.red);

        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(40,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Your Task Here");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setPreferredSize(new Dimension(40,20));
        taskName.setBackground(Color.red);
        this.add(taskName, BorderLayout.CENTER);

        done = new JButton("Done");
        done.setBorder(BorderFactory.createEtchedBorder(2, Color.gray, Color.darkGray));
        this.add(done, BorderLayout.EAST);
    }

    public JButton getDone() {
        return done;
    }

    public void changeIndex(int num) {
        this.index.setText(num + "");
        this.revalidate();
    }

    public void changeState() {
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        checked = true;
    }

    public boolean getState() {
        return checked;
    }
}
