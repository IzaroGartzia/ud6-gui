import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TresEnRaya {
    private JPanel panel1;
    private JPanel panel2;
    private JButton b01;
    private JButton b02;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b20;
    private JButton b21;
    private JButton b22;
    private JButton b00;

    // CREAR EL TABLERO (MATRIZ)
    private int[][] tablero = new int[3][3];

    private int turno = 0;

    public TresEnRaya() {

        // HAY QUE INICIALIZAR LA MATRIZ, SI NO TODOS LOS BOTONES ESTARÁN CON EL VALOR 0, Y ENTONCES GANARÁ SIEMPRE
        // LA PRIMERA VEZ QUE PULSE EN ALGÚN BOTÓN
        for (int i = 0; i <tablero.length ; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 5;
            }

        }

        b00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tablero[0][0] = turno;
               if( comprobarGanador(tablero, turno)== true){
                   JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
               }

                if( turno == 0){
                    b00.setText("0");
                    turno = 1;
                }
                else
                {
                    b00.setText("X");
                    turno = 0;
                }

            }
        });
        b01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                tablero[0][1] = turno;
                if( comprobarGanador(tablero, turno)== true){
                    JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
                }

                if( turno == 0){
                    b01.setText("0");
                    turno = 1;
                }
                else
                {
                    b01.setText("X");
                    turno = 0;
                }
            }
        });
        b02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tablero[0][2] = turno;
                if( comprobarGanador(tablero, turno)== true){
                    JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
                }


                if( turno == 0){
                    b02.setText("0");
                    turno = 1;
                }
                else
                {
                    b02.setText("X");
                    turno = 0;
                }
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tablero[1][0] = turno;
                if( comprobarGanador(tablero, turno)== true){
                    JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
                }


                if( turno == 0){
                    b10.setText("0");
                    turno = 1;
                }
                else
                {
                    b10.setText("X");
                    turno = 0;
                }

            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tablero[1][1] = turno;

                if( comprobarGanador(tablero, turno)== true){
                    JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
                }


                if( turno == 0){
                    b11.setText("0");
                    turno = 1;
                }
                else
                {
                    b11.setText("X");
                    turno = 0;
                }

            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tablero[1][2] = turno;
                if( comprobarGanador(tablero, turno)== true) {
                    JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
                }



                if( turno == 0){
                    b12.setText("0");
                    turno = 1;
                }
                else
                {
                    b12.setText("X");
                    turno = 0;
                }

            }
        });
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tablero[2][0] = turno;
                if( comprobarGanador(tablero, turno)== true) {
                    JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
                }


                if( turno == 0){
                    b20.setText("0");
                    turno = 1;
                }
                else
                {
                    b20.setText("X");
                    turno = 0;
                }

            }
        });
        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tablero[2][1] = turno;
                if( comprobarGanador(tablero, turno)== true) {
                    JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
                }


                if( turno == 0){
                    b21.setText("0");
                    turno = 1;
                }
                else
                {
                    b21.setText("X");
                    turno = 0;
                }

            }
        });
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tablero[2][2] = turno;
                if( comprobarGanador(tablero, turno)== true) {
                    JOptionPane.showMessageDialog(panel2, "¡Enhorabuena, has ganado!", "", JOptionPane.INFORMATION_MESSAGE);
                }


                if( turno == 0){
                    b22.setText("0");
                    turno = 1;
                }
                else
                {
                    b22.setText("X");
                    turno = 0;
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TresEnRaya");
        frame.setContentPane(new TresEnRaya().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private boolean comprobarGanador(int[][] t, int turno) {

        boolean comprobarGanador = false;

        // FILAS
        if (t[0][0] == turno && t[0][1] == turno && t[0][2] == turno) {
            comprobarGanador = true;
        }

        if (t[1][0] == turno && t[1][1] == turno && t[1][2] == turno) {
            comprobarGanador = true;
        }

        if (t[2][0] == turno && t[2][1] == turno && t[2][2] == turno) {
            comprobarGanador = true;
        }

        // COLUMNAS
        if (t[0][0] == turno && t[1][0] == turno && t[2][0] == turno) {
            comprobarGanador = true;
        }

        if (t[0][1] == turno && t[1][1] == turno && t[2][1] == turno) {
            comprobarGanador = true;
        }

        if (t[0][2] == turno && t[1][2] == turno && t[2][2] == turno) {
            comprobarGanador = true;
        }

        // DIAGONALES
        if (t[0][0] == turno && t[1][1] == turno && t[2][2] == turno) {
            comprobarGanador = true;
        }

        if (t[0][2] == turno && t[1][1] == turno && t[2][0] == turno) {
            comprobarGanador = true;
        }

        return comprobarGanador;

    }



}
