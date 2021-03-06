package com.zeger;

import com.zeger.httphandler.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Pavel Zeger
 * @implNote http-code-handler
 * @since 06/03/2021
 */
@RequiredArgsConstructor
@Getter
public enum HttpCode {

    INFO(100, 199, new InfoHttpCodeHandler()),
    SUCCESS(200, 299, new SuccessHttpCodeHandler()),
    REDIRECTION(300, 399, new RedirectionHttpCodeHandler()),
    CLIENT_ERROR(400, 499, new ClientErrorHttpCodeHandler()),
    SERVER_ERROR(500, 599, new ServerErrorHttpCodeHandle());

    private final int min;
    private final int max;
    private final HttpCodeHandler httpCodeHandler;

    public void handle() {
        httpCodeHandler.handle();
    }

    private HttpCodeHandler getHttpCodeHandler(int code) {
        HttpCode[] httpCodes = HttpCode.values();
        for (HttpCode httpCode : httpCodes) {
            return httpCode.getHttpCodeHandler(code);
        }
        throw new IllegalArgumentException(String.format("The provided HTTP code %s isn't supported", code));
    }

}
