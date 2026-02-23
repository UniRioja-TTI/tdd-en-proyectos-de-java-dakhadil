package com.tt1.test;

import java.util.ArrayList;

public class Servicio {

    private Repositorio repo;
    private IEmail emails; // interfaz

    public Servicio(Repositorio repo, IEmail email) {
        this.repo = repo;
        this.emails = email;
    }

    public void crearToDo(String nombre, String descripcion, String fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean marcarFinalizada(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ArrayList<ToDo> listarPendientes() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}