package ru.elebedinskiy.java1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(){
        setTitle("Java1: Урок 8. Создание окна");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300,400,300);

        // Добавили кнопки и новый слой
        JButton button1 = new JButton("Что-то делать ...");
        JButton button2 = new JButton("Выход");
        JPanel panelButtons = new JPanel();

        // установили для основного слоя компоновщик
        setLayout(new BorderLayout());

        // Добавили новый слой для расположения кнопок в положение юг
        add(panelButtons, BorderLayout.SOUTH);

        // установили для нового слоя кнопок другой компоновщик
        panelButtons.setLayout(new GridLayout());

        // Добавили кнопки на новый слой
        panelButtons.add(button1);
        panelButtons.add(button2);

        setVisible(true);

        // Обрабочтик события нажатия на кнопку 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Что-то делать ...");
            }
        });

        // Обрабочтик события нажатия на кнопку 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
