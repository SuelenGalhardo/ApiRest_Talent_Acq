package es.com.suelengalhardo.talent_acq.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
      super("Usuario ya exist");
    }
}
