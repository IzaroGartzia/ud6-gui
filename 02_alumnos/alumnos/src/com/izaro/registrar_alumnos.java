package com.izaro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class registrar_alumnos {
    private JTextField nombreAlumno;
    private JTextField apellidosAlumno;
    private JTextField telefonoAlumno;
    private JTextField emailAlumno;
    private JButton botonLista;
    private JButton botonGuardar;
    private JLabel nombre;
    private JLabel apellidos;
    private JLabel telefono;
    private JLabel email;
    private JPanel panelBoton;
    private JPanel registrarAlumno;

    private List<Alumno> alumnos = new ArrayList<>();

    public registrar_alumnos() {
        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // RECOGER LOS DATOS DEL USUARIO
                String nomAlum = nombreAlumno.getText();
                String apeAlum = apellidosAlumno.getText();
                String tfno = telefonoAlumno.getText();
                String email = emailAlumno.getText();

                // AQUÍ DEBERÍAMOS DE VALIDAR LOS DATOS

                // CREAR EL ALUMNO
                Alumno alumno = new Alumno(nomAlum, apeAlum, tfno, email);

                // METER LOS DATOS EN LA LISTA
                alumnos.add(alumno);

                // MENSAJE OK
                JOptionPane.showMessageDialog(registrarAlumno,"OK", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);

                // PARA QUE SALGAN LOS CAMPOS VACÍOS
                nombreAlumno.setText("");
                apellidosAlumno.setText("");
                telefonoAlumno.setText("");
                emailAlumno.setText("");


                // PARA QUE EL CURSOR SALGA EN EL NOMBRE
                nombreAlumno.requestFocus();

            }
        });


        botonLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Listita listaAlumnos = new Listita(alumnos);


            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("registrar_alumnos");
        frame.setContentPane(new registrar_alumnos().registrarAlumno);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}


