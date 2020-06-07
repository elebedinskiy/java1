package ru.elebedinskiy.java1;

import javax.swing.*;
import java.awt.*;
import java.awt.dnd.Autoscroll;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(){
        setTitle("Java1: Урок 8. Создание окна");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300,400,300);

        // Добавили кнопки и новые слои
        JButton button1 = new JButton("Что-то делать ...");
        JButton button2 = new JButton("Новое окно");
        JButton button3 = new JButton("Выход");
        JButton button4 = new JButton("Заполнить соглашение");
        JButton button5 = new JButton("Регистрация");
        JButton button6 = new JButton("Отказаться");
        JButton button7 = new JButton("Закрыть");
        JPanel panelButtons = new JPanel();
        JPanel panelTextInOut = new JPanel();
        JLabel label1 = new JLabel("Введите ваше ФИО");
        JTextField field1 = new JTextField("", 30);
        JTextArea textArea1 = new JTextArea(8,30);

        textArea1.setLineWrap(true); // перенос возможен
        textArea1.setWrapStyleWord(true); // перенос по словам

        // установили компоновщики для слоёв
        setLayout(new BorderLayout());
        panelButtons.setLayout(new GridLayout());
        panelTextInOut.setLayout(new FlowLayout());

        // добавили слови на основной слой
        add(panelButtons, BorderLayout.SOUTH);
        add(panelTextInOut);

        // Добавили кнопки на новый слой
        panelButtons.add(button1);
        panelButtons.add(button2);
        panelButtons.add(button3);
        panelTextInOut.add(label1);
        panelTextInOut.add(field1);
        panelTextInOut.add(new JScrollPane(textArea1)); // многострочное поле будет с полосой прокрутки
        panelTextInOut.add(button4);

        setVisible(true);

        // Обрабочтик события нажатия на кнопку 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("\nЧто-то делать ... ");
            }
        });

        // Обрабочтик события нажатия на кнопку 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Запускаем такое же новое окно
                Window window2 = new Window();
            }
        });

        // Обрабочтик события нажатия на кнопку 3
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // завершаем работу приложения
                System.exit(0);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("Уважаемый, " + field1.getText() + ", регистрируясь в программе Вы принимаете это соглашение.");
                button4.setVisible(false);
                panelTextInOut.add(button5);
                panelTextInOut.add(button6);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append("\nРегистрация успешно завершена");
                button5.setVisible(false);
                button6.setVisible(false);
                panelTextInOut.add(button7);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
