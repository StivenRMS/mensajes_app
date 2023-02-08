/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * capa intermedia entre la capa intermedia entre la inciciar y la de acceso
 */
public class mensajesService {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Escrine tu Nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
        
    }

    public static void listarMensajes() {
        MensajesDAO.leerMnesajesDB();
        
    }

    public static void borrarMensajes() {
          Scanner sc = new Scanner(System.in);
          System.out.println("Indica el mensaje a Borrar :");
          int id_mensajes = sc.nextInt();
          MensajesDAO.borrarMensajeDB(id_mensajes);
    }

    public static void editarMensajes() {
        
    }
    
}
