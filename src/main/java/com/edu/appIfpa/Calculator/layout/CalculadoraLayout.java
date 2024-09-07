package com.edu.appIfpa.Calculator.layout;

import com.edu.appIfpa.Calculator.core.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraLayout extends JFrame {
    final private JButton[] numButtons = new JButton[10];
    final private JButton addButton, subButton, mulButton, divButton;
    final private JButton decButton, equButton;
    private JPanel panel = new JPanel();
    private ActionListener actionListener;

    public CalculadoraLayout(ActionListener actionListener) {
        this.actionListener = actionListener;
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");

        inicializaOperadores();
    }
    public void inicializaOperadores () {
        List <JButton> funcButtons = new ArrayList<>();
        funcButtons.set(0, addButton);
        funcButtons.set(1, subButton);
        funcButtons.set(2, mulButton);
        funcButtons.set(3, divButton);
        funcButtons.set(4, decButton);
        funcButtons.set(5, equButton);
        for (int i = 0; i < 8; i++) {
            funcButtons.get(i).addActionListener(this.actionListener);
            funcButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            funcButtons[i].setFocusable(false);
        }
        funcButtons.stream().map(f -> f.addActionListener(this.actionListener))
    }
    public CalculadoraLayout() {



        // Definindo os botões numéricos
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            numButtons[i].setFocusable(false);
        }

        // Criando um painel para organizar os botões

        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Adiciona os botões ao painel
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addButton);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subButton);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

    }
    public JPanel getPanel() {
        return panel;
    }
}
