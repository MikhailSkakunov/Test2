package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
        static int count;

        public Counter(int initialCount) {
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(800,300,400,120);
        setAlwaysOnTop(true);
        Font font = new Font("Times New Roman", Font.BOLD, 32);
        JLabel jLabel = new JLabel(String.valueOf(count));
        jLabel.setFont(font);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(jLabel, BorderLayout.CENTER);

        JButton decrementCount = new JButton("<");
        decrementCount.setFont(font);
        add(decrementCount, BorderLayout.LINE_START);

        JButton incrementCount = new JButton(">");
        incrementCount.setFont(font);
        add(incrementCount, BorderLayout.LINE_END);

            JTextField textField = new JTextField(String.valueOf(initialCount));
            add(textField, BorderLayout.AFTER_LAST_LINE);
            textField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Вы ввели число " + textField.getText());
                }
            });
            try {
                initialCount = Integer.parseInt(textField.getText());

            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Введите число!");
            }
            count = initialCount;

        decrementCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                jLabel.setText(String.valueOf(count));
            }
        });
        incrementCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                jLabel.setText(String.valueOf(count));
            }
        });



        setVisible(true);
        }

    public static void main(String[] args) {
        new Counter(count);
    }
}
