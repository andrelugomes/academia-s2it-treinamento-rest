package br.com.s2it.exception;

public class TodoNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public TodoNotFoundException(String id) {
    super(String.format("No todo entry found with id: <%s>", id));
  }

}
