package com.zeger.httphandler;

/**
 * @author Pavel Zeger
 * @implNote http-code-handler
 * @since 06/03/2021
 */
public class RedirectionHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle() {
        System.out.println("REDIRECTION code handled");
    }
}
