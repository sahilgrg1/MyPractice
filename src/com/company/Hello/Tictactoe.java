package com.company.Hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Tictactoe extends JFrame implements ActionListener
{
    public static int BOARD_SIZE = 3;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton  clickbutton = (JButton) e.getSource();
        makemove(clickbutton);

    }
    GameStatus gs = this.getGameStatus();

    private GameStatus getGameStatus() {
        String text1 = "";
        String text2 = "";
        int row = 0 ;
        int col = 0 ;
        return getGameStatus();
    }

    private void makemove(JButton clickbutton) {
        String btntxt = clickbutton.getText();
        if(btntxt.length()>0)
        {
            JOptionPane.showMessageDialog(this,"INVALID MOVE");

        }
        else
        {
            if(crossturn)
            {
                clickbutton.setText("X");
            }
            else
            {
                clickbutton.setText("O");
            }
            crossturn =! crossturn;
        }
    }

    public static enum GameStatus{
        Incompleted , Xwins, Zwins,Tie

    }
    private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
    boolean crossturn = true;
    public Tictactoe()
    {
        super.setTitle("TICTACTOE");
        super.setSize(800,800);
        GridLayout grid = new GridLayout(BOARD_SIZE,BOARD_SIZE);
        super.setLayout(grid);
        super.setResizable(false);
        Font font = new Font("Comic Sans",1,150);
        for (int row = 0; row < BOARD_SIZE ; row++) {
            for (int i = 0; i < BOARD_SIZE ; i++) {
                JButton button = new JButton("");
                buttons[row][i] = button ;
                button.setFont(font);
                button.addActionListener(this);
                super.add(button);
                
            }
            
        }
        super.setVisible(true);

    }

    public static void main(String[] args) {
        Tictactoe obj = new Tictactoe();
    }
}