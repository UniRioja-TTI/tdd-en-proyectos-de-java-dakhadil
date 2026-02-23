package com.tt1.test;

import java.util.ArrayList;

public class DBStub {

    private ArrayList<ToDo> todos;
    private ArrayList<String> emails;

    public DBStub() {

        throw new UnsupportedOperationException("Clase aún no implementada.");
        // “Base de datos” en memoria
        // this.todos = new ArrayList<ToDo>();
        // this.emails = new ArrayList<String>();
    }

    // CRUD ToDos
    public void create(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ArrayList<ToDo> readAll() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo findByName(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean update(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean deleteByName(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    // Agenda emails
    public void addEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ArrayList<String> getEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}