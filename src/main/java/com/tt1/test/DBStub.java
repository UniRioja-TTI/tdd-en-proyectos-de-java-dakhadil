package com.tt1.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Simula una base de datos en memoria para almacenar tareas y correos.
 * Se utiliza como sustituto de un sistema de persistencia real durante
 * el desarrollo y las pruebas de la aplicación.
 */
public class DBStub {
    private ArrayList<ToDo> todos;
    private Set<String> emails;

    /**
     * Crea una base de datos simulada vacía.
     */
    public DBStub() {
        todos = new ArrayList<ToDo>();
        emails = new HashSet<String>();
    }

    /**
     * Guarda una nueva tarea en memoria.
     *
     * @param todo tarea que se desea almacenar
     */
    public void create(ToDo todo) {
        todos.add(todo);
    }

    /**
     * Devuelve todas las tareas almacenadas.
     *
     * @return lista completa de tareas
     */
    public ArrayList<ToDo> readAll() {
        return todos;
    }

    /**
     * Busca una tarea por su nombre.
     *
     * @param nombre nombre de la tarea
     * @return tarea encontrada, o null si no existe
     */
    public ToDo findByName(String nombre) {
        for (ToDo t : todos) {
            if (t.getNombre().equals(nombre)) return t;
        }
        return null;
    }

    /**
     * Actualiza una tarea ya existente.
     *
     * @param todo tarea con la información actualizada
     * @return true si la tarea existía y fue actualizada, false en caso contrario
     */
    public boolean update(ToDo todo) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getNombre().equals(todo.getNombre())) {
                todos.set(i, todo);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina una tarea a partir de su nombre.
     *
     * @param nombre nombre de la tarea que se desea eliminar
     * @return true si la tarea se eliminó, false si no existía
     */
    public boolean deleteByName(String nombre) {
        ToDo t = findByName(nombre);
        if (t == null) return false;
        todos.remove(t);
        return true;
    }

    /**
     * Guarda una dirección de correo electrónico.
     *
     * @param email dirección que se desea almacenar
     */
    public void addEmail(String email) {
        emails.add(email);
    }

    /**
     * Devuelve el conjunto de correos almacenados.
     *
     * @return conjunto de direcciones de correo
     */
    public Set<String> getEmails() {
        return emails;
    }
}