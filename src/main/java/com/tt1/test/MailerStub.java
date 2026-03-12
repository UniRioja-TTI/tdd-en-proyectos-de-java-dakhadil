package com.tt1.test;

/**
 * Implementación simulada del servicio de correo.
 * Se utiliza durante el desarrollo y las pruebas para representar
 * el envío de mensajes sin depender de un servidor real.
 */
public class MailerStub implements IEmail {

    /**
     * Crea una instancia del servicio de correo simulado.
     */
    public MailerStub() {
    }

    /**
     * Envía un mensaje de prueba a una dirección de correo.
     *
     * @param email dirección de destino
     * @param message contenido del mensaje
     * @return true si la operación simulada se considera correcta
     */
    @Override
    public boolean send(String email, String message) {
        return true;
    }
}