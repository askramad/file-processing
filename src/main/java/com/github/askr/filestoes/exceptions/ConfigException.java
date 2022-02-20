package com.github.askr.filestoes.exceptions;

/**
 * Config Exception 
 * 
 * @author askr
 * 
 */
public class ConfigException extends Exception {

    /** Serial UID */
    private static final long serialVersionUID = -1169104237151649103L;

    public ConfigException() {
        super();
    }

    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigException(String message) {
        super(message);
    }

    public ConfigException(Throwable cause) {
        super(cause);
    }
}
