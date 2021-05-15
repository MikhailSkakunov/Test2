package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    static class AppForm extends JFrame {
        public AppForm() {
            setTitle("TestWindow");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(300,300,500,400);
//            JButton button2 = new JButton("SimpleButton#2");
//            JButton button1 = new JButton("SimpleButton#1");
//            add(button1, BorderLayout.NORTH);
//            add(button2, BorderLayout.SOUTH);
//            setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//            for (int i = 1; i <= 10; i++) {
//                add(new JButton("#" + i));}
//            setLayout(new FlowLayout());
//            setLayout(new GridLayout(3, 0));
//            for (int i = 1; i <= 10; i++) {
//                add(new JButton("#" + i));}
            setLayout(null);
            JTextField textField = new JTextField();
            textField.setBounds(30,30,150,40);
            add(textField);
            JButton button = new JButton("Нажмите сюда!");
            button.setBounds(30, 80, 150, 35);
            add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setText("Вы нажали!");
                }
            });
            setVisible(true);
            JTextField text = new JTextField();
            add(text, BorderLayout.EAST);
            text.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(text.getText());
                }
            });
        }
    }
    public static void main(String[] args) {
        new AppForm();

    }

}
