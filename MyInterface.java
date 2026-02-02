import javax.swing.*;
import java.awt.event.*;

public class MyInterface {
    public static void main(String[] args) {
        // 1. Create the frame (the window)
        JFrame frame = new JFrame("GitHub Java Project");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // 2. Add a text label
        JLabel label = new JLabel("Welcome to my App!");
        label.setBounds(80, 30, 150, 30);
        frame.add(label);

        // 3. Add a button
        JButton button = new JButton("Click Me");
        button.setBounds(90, 80, 100, 40);
        frame.add(button);

        // 4. Add action when button is clicked
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello GitHub!");
            }
        });

        // 5. Make it visible
        frame.setVisible(true);
    }
}
