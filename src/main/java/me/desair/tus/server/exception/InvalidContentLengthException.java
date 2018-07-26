package me.desair.tus.server.exception;

import javax.servlet.http.HttpServletResponse;

public class InvalidContentLengthException extends TusException {
    public InvalidContentLengthException(String message) {
        super(HttpServletResponse.SC_BAD_REQUEST, message);
    }
}
