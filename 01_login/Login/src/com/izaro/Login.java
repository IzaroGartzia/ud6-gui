package com.izaro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class Login {
    private JPanel login;
    private JPanel inicioSesion;
    private JPasswordField password;
    private JButton boton;
    private JTextField usuario;
    private JLabel contrasena;

    private Verificador verificador;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Login() {

        verificador = new Verificador("izaro", "isabel");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            // Botón Acceso al Sistema pulsado
                String usuarioa = usuario.getText();
                String contra = new String(password.getPassword()); // Para quitar el getText tachado

                if(verificador.comprobar(usuarioa, contra))
                {
                    // OK
                    JOptionPane.showMessageDialog(login, "Acceso al sistema correcto.", "ACCEDIENDO...", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    // ERROR
                    JOptionPane.showMessageDialog(login, "Usuario o contraseña incorrecto.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                // Para que salga como si el usuario no hubiera escrito ni el nombre ni la contraseña
                usuario.setText("");
                password.setText("");

                // Para que salga el curso en el campo de usuario
                usuario.requestFocus();

            }
        });


    }}