/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Metodos que permiten la conexion con la base de datos
 */
public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_Connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensajes ( mensaje, autor_mensaje ) VALUES (?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("El mensaje fue Creado");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerMnesajesDB() {

    }

    public static void borrarMensajeDB(int id_mensaje) {

    }

    public static void actualizarMensajeDB(Mensajes mensaje) {

    }

}
