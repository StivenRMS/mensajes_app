/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

/**
 *
 * Estructura basica para las operaciones
 */
public class Mensajes {
    int id_mesnajes;
    String mensaje;
    String autor_mensaje;
    String fecha_mensaje;
    
    //Constructor por defeto para operaciones
    public Mensajes(){
        
    }
    //Constructor que envia los datos a la BD

    public Mensajes(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }
    

    public int getId_mesnajes() {
        return id_mesnajes;
    }

    public void setId_mesnajes(int id_mesnajes) {
        this.id_mesnajes = id_mesnajes;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
    
}
