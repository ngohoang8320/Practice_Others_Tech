package view;

import javax.swing.*;
import java.awt.*;

public class Example extends JFrame {
    public Example() {
        this.setTitle("Example");
        this.setSize(600,
                400);
        this.setLocationRelativeTo(null);

        FlowLayout flowLayout = new FlowLayout();
        this.setLayout(flowLayout);

        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");

        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example();
    }
}
