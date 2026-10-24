package br.com.dev.projeto.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found exception. Id: " + id);
    }
}
