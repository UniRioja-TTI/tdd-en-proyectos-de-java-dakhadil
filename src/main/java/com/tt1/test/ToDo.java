package com.tt1.test;

/**
 * Representa una tarea de la aplicación.
 * Contiene la información básica de un elemento pendiente,
 * incluyendo su nombre, descripción, fecha límite y estado.
 */
public class ToDo {
    private String nombre;
    private String descripcion;
    private String fechaLimite; // YYYY-MM-DD
    private boolean completado;

    /**
     * Crea una tarea vacía.
     * Este constructor se incluye para mantener el formato JavaBean.
     */
    public ToDo() {
        this.nombre = "";
        this.descripcion = "";
        this.fechaLimite = "";
        this.completado = false;
    }

    /**
     * Crea una tarea con los datos indicados.
     *
     * @param nombre nombre de la tarea
     * @param descripcion descripción de la tarea
     * @param fechaLimite fecha límite en formato YYYY-MM-DD
     */
    public ToDo(String nombre, String descripcion, String fechaLimite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.completado = false;
    }

    /**
     * Devuelve el nombre de la tarea.
     *
     * @return nombre de la tarea
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la tarea.
     *
     * @param nombre nuevo nombre de la tarea
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la descripción de la tarea.
     *
     * @return descripción de la tarea
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción de la tarea.
     *
     * @param descripcion nueva descripción de la tarea
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve la fecha límite de la tarea.
     *
     * @return fecha límite en formato YYYY-MM-DD
     */
    public String getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Modifica la fecha límite de la tarea.
     *
     * @param fechaLimite nueva fecha límite en formato YYYY-MM-DD
     */
    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * Indica si la tarea está completada.
     *
     * @return true si la tarea está completada, false en caso contrario
     */
    public boolean isCompletado() {
        return completado;
    }

    /**
     * Modifica el estado de finalización de la tarea.
     *
     * @param completado nuevo estado de la tarea
     */
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}