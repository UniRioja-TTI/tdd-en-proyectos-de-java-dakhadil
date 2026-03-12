package com.tt1.test;

import java.util.ArrayList;
import java.util.Set;

/**
 * Define las operaciones de acceso al almacenamiento de tareas y correos.
 * Esta interfaz abstrae la capa de persistencia utilizada por la lógica
 * principal de la aplicación.
 */
public interface IRepositorio {

    /**
     * Guarda una tarea en el repositorio.
     *
     * @param todo tarea que se desea almacenar
     */
    void guardarToDo(ToDo todo);

    /**
     * Busca una tarea por su nombre.
     *
     * @param nombre nombre de la tarea
     * @return tarea encontrada, o null si no existe
     */
    ToDo findToDo(String nombre);

    /**
     * Marca como completada una tarea existente.
     *
     * @param nombre nombre de la tarea que se desea marcar
     * @return true si la operación se realizó correctamente, false en caso contrario
     */
    boolean marcarCompletado(String nombre);

    /**
     * Devuelve la lista de tareas pendientes.
     *
     * @return lista de tareas no completadas
     */
    ArrayList<ToDo> getPendientes();

    /**
     * Guarda una dirección de correo electrónico.
     *
     * @param email dirección que se desea almacenar
     */
    void guardarEmail(String email);

    /**
     * Devuelve el conjunto de correos registrados.
     *
     * @return conjunto de direcciones de correo
     */
    Set<String> getEmails();
}