package com.tt1.test;

import java.util.ArrayList;

public class Repositorio {

    private DBStub db;

    public Repositorio(DBStub db) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
        //this.db = db;
    }

    public ToDo findToDo(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void guardarToDo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean marcarCompletado(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ArrayList<ToDo> getPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void guardarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ArrayList<String> getEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}