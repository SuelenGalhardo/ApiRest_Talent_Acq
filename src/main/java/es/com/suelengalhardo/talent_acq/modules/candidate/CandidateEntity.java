package es.com.suelengalhardo.talent_acq.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data 
public class CandidateEntity {

    private UUID id;
    
    private String name;

    @Pattern(regexp = "^[^\\s]+$", message = " en campo [username no debe contener espacios]")
    private String username;
    
    @Email(message = "el campo de [email] debe tener un email valido")
    private String email;
    
    @Length(min = 10, max = 20, message = "la contraseña debe tener entre (10) y (20) caracteres")
    private String password;
    private String description;
    private String curriculum;

    
}
