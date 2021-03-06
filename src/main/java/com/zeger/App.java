package com.zeger;

import com.zeger.httphandler.HttpCodeHandler;

/**
 * @author Pavel Zeger
 * @implNote http-code-handler
 * @since 06/03/2021
 */
public class App {

    public static void main(String[] args) {
        HttpCodeHandler infoHttpCodeHandler = HttpCode.INFO.getHttpCodeHandler();
        infoHttpCodeHandler.handle();

        HttpCodeHandler successHttpCodeHandler = HttpCode.SUCCESS.getHttpCodeHandler();
        successHttpCodeHandler.handle();

        HttpCodeHandler redirectionHttpCodeHandler = HttpCode.REDIRECTION.getHttpCodeHandler();
        redirectionHttpCodeHandler.handle();

        HttpCodeHandler clientErrorHttpCodeHandler = HttpCode.CLIENT_ERROR.getHttpCodeHandler();
        clientErrorHttpCodeHandler.handle();

        HttpCodeHandler serverErrorHttpCodeHandler = HttpCode.SERVER_ERROR.getHttpCodeHandler();
        serverErrorHttpCodeHandler.handle();
   }
}
