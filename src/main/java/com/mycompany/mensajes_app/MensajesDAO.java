/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        Conexion db_connect = new Conexion(); //coneccion a la base de datos
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_connect.get_Connection()) {
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("id_mensajes"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println(" ");
            }

        } catch (SQLException e) {
            System.out.println("No se puedo recuperar mensajes");
            System.out.println(e);
        }

    }

    public static void borrarMensajeDB(int id_mensaje) {
        Conexion db_connect = new Conexion(); //coneccion a la base de datos
        try (Connection conexion = db_connect.get_Connection()) {
            PreparedStatement ps = null;
            try {
                String query ="DELETE FROM mensajes WHERE id_mensajes = ?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.execute();
                System.out.println("EL MENSAJE FUE BORRADO!");
                
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No se pudo borrar el mensaje");
            }

            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);

        } catch (SQLException e) {

            System.out.println(e);
        }

    }

    public static void actualizarMensajeDB(Mensajes mensaje) {

    }

}
