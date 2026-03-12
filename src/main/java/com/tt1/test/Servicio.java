package com.tt1.test;

import java.util.ArrayList;
import java.util.Set;

/**
 * Implementa la lógica principal de la aplicación de tareas.
 * Utiliza un repositorio para almacenar la información y un
 * servicio de correo para enviar avisos cuando una tarea está vencida.
 */
public class Servicio {

    private IRepositorio repo;
    private IEmail emailer;

    /**
     * Crea un servicio utilizando un repositorio y un gestor de correo.
     *
     * @param repo repositorio utilizado para almacenar y consultar tareas
     * @param emailer componente encargado del envío de correos
     */
    public Servicio(IRepositorio repo, IEmail emailer) {
        this.repo = repo;
        this.emailer = emailer;
    }

    /**
     * Crea una nueva tarea y la guarda en el repositorio.
     * Si el nombre o la fecha límite no son válidos, la operación no se realiza.
     *
     * @param nombre nombre de la tarea
     * @param descripcion descripción de la tarea
     * @param fechaLimite fecha límite en formato YYYY-MM-DD
     */
    public void crearToDo(String nombre, String descripcion, String fechaLimite) {
        if (nombre == null || nombre.trim().isEmpty()) return;
        if (fechaLimite == null || fechaLimite.trim().isEmpty()) return;

        ToDo t = new ToDo(nombre, descripcion, fechaLimite);
        repo.guardarToDo(t);
    }

    /**
     * Guarda una dirección de correo para recibir avisos.
     * Si el correo no es válido, no se almacena.
     *
     * @param email dirección de correo electrónico
     */
    public void agregarEmail(String email) {
        if (email == null || email.trim().isEmpty()) return;
        if (email.indexOf('@') < 0) return;

        repo.guardarEmail(email);
    }

    /**
     * Marca una tarea como finalizada.
     *
     * @param nombre nombre de la tarea que se desea completar
     * @return true si la tarea se marcó correctamente, false si no existía
     */
    public boolean marcarFinalizada(String nombre) {
        return repo.marcarCompletado(nombre);
    }

    /**
     * Devuelve la lista de tareas pendientes.
     *
     * @return lista de tareas no completadas
     */
    public ArrayList<ToDo> listarPendientes() {
        return repo.getPendientes();
    }

    /**
     * Devuelve la lista de tareas pendientes tomando como referencia
     * una fecha proporcionada manualmente. Antes de devolver la lista,
     * comprueba si existen tareas vencidas y envía avisos.
     *
     * @param hoyYYYYMMDD fecha actual en formato YYYY-MM-DD
     * @return lista de tareas no completadas
     */
    public ArrayList<ToDo> listarPendientesConHoy(String hoyYYYYMMDD) {
        comprobarVencidasYAlertar(hoyYYYYMMDD);
        return repo.getPendientes();
    }

    /**
     * Comprueba qué tareas pendientes están vencidas respecto a la fecha indicada
     * y envía un mensaje de aviso a todos los correos registrados.
     *
     * @param hoyYYYYMMDD fecha actual en formato YYYY-MM-DD
     */
    private void comprobarVencidasYAlertar(String hoyYYYYMMDD) {
        ArrayList<ToDo> pendientes = repo.getPendientes();
        Set<String> emails = repo.getEmails();

        for (ToDo t : pendientes) {
            String limite = t.getFechaLimite();
            if (limite != null && hoyYYYYMMDD != null) {
                if (limite.compareTo(hoyYYYYMMDD) < 0) {
                    String msg = "ALERTA: tarea vencida -> " + t.getNombre();
                    for (String e : emails) {
                        emailer.send(e, msg);
                    }
                }
            }
        }
    }
}