package com.izaro;

import javax.swing.*;
import java.util.List;

public class Listita {
    private JPanel listaAlumnos;
    private JTextArea AlumosTodos;
    private JLabel titulo;

    public Listita(List<Alumno> alumnos) {
        JFrame frame = new JFrame("Listita");
        frame.setContentPane(AlumosTodos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // RECOGER Y MOSTRAR TODOS LOS ALUMNOS
        for (int i = 0; i < alumnos.size(); i++) {

            AlumosTodos.append(alumnos.get(i).toString()+"\n");

        }

    }

}



