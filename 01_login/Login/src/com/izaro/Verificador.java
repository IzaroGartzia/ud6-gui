package com.izaro;

public class Verificador {

    private String usuario;
    private String contrasena;

    public Verificador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean comprobar(String usuario, String contrasena)
    {
        return this.usuario.equalsIgnoreCase(usuario) && this.contrasena.equals(contrasena);

        // Contraseña es equals porque si no, el usuario no diferenciaría entre mayus y minus.
    }
}
