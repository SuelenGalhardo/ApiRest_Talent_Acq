package es.com.suelengalhardo.talent_acq.modules.candidate;


import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data 
@Entity(name= "candidate")
public class CandidateEntity {
    

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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


    @CreationTimestamp
    private LocalDateTime createdAt;
  }
    

