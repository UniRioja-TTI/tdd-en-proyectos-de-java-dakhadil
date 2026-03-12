package com.tt1.test;

/**
 * Define el servicio de envío de correos utilizado por la aplicación.
 */
public interface IEmail {

    /**
     * Envía un mensaje a una dirección de correo electrónico.
     *
     * @param email dirección de destino
     * @param message contenido del mensaje
     * @return true si el envío se realiza correctamente, false en caso contrario
     */
    boolean send(String email, String message);
}