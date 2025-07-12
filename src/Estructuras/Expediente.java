/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sebas
 */

public class Expediente {
    public static int counter = 0;
    private int id;
    private String Prioridad;
    private String Asunto;
    private String Tipo;
    private Documento documento;
    private String fechaingreso;
    private String estado;
    private String fechatermino;
    private String dependencia;
    private String acta;
    public Expediente(String Prioridad, String Asunto, String Tipo, Documento documento) {
        counter += 1;
        this.id = counter;
        this.Prioridad = Prioridad;
        this.Asunto = Asunto;
        this.Tipo = Tipo;
        this.documento = documento;
        this.fechaingreso = "-";
        this.estado = "Sin Procesar";
        this.fechatermino = "-";
        this.dependencia = "-";
        this.acta = "-";
    }
    public static String CalcularFecha(){
        LocalDateTime Fecha = LocalDateTime.now();

        DateTimeFormatter Formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return Fecha.format(Formato);
    }
    
    public Expediente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getFechatermino() {
        return fechatermino;
    }

    public void setFechatermino(String fechatermino) {
        this.fechatermino = fechatermino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getActa() {
        return acta;
    }

    public void setActa(String acta) {
        this.acta = acta;
    }
    
    
} 