package com.tt1.test;

import java.util.ArrayList;
import java.util.Set;

/**
 * Gestiona el acceso al almacenamiento de tareas y correos.
 * Actúa como intermediario entre la lógica de negocio y la
 * clase que simula la base de datos en memoria.
 */
public class Repositorio implements IRepositorio {
    private DBStub db;

    /**
     * Crea un repositorio asociado a una base de datos simulada.
     *
     * @param db componente de almacenamiento en memoria
     */
    public Repositorio(DBStub db) {
        this.db = db;
    }

    /**
     * Guarda una tarea en el almacenamiento.
     *
     * @param todo tarea que se desea almacenar
     */
    @Override
    public void guardarToDo(ToDo todo) {
        db.create(todo);
    }

    /**
     * Busca una tarea por su nombre.
     *
     * @param nombre nombre de la tarea
     * @return tarea encontrada, o null si no existe
     */
    @Override
    public ToDo findToDo(String nombre) {
        return db.findByName(nombre);
    }

    /**
     * Marca como completada la tarea con el nombre indicado.
     *
     * @param nombre nombre de la tarea que se desea completar
     * @return true si la operación se realizó correctamente, false en caso contrario
     */
    @Override
    public boolean marcarCompletado(String nombre) {
        ToDo t = db.findByName(nombre);
        if (t == null) return false;
        t.setCompletado(true);
        return db.update(t);
    }

    /**
     * Devuelve la lista de tareas pendientes.
     *
     * @return lista de tareas no completadas
     */
    @Override
    public ArrayList<ToDo> getPendientes() {
        ArrayList<ToDo> res = new ArrayList<ToDo>();
        for (ToDo t : db.readAll()) {
            if (!t.isCompletado()) res.add(t);
        }
        return res;
    }

    /**
     * Guarda una dirección de correo electrónico.
     *
     * @param email dirección que se desea almacenar
     */
    @Override
    public void guardarEmail(String email) {
        db.addEmail(email);
    }

    /**
     * Devuelve el conjunto de correos almacenados.
     *
     * @return conjunto de direcciones de correo
     */
    @Override
    public Set<String> getEmails() {
        return db.getEmails();
    }
}