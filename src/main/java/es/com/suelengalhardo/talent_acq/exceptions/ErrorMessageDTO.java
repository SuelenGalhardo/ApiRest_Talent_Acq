package es.com.suelengalhardo.talent_acq.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    private String message;
    private String field;

}
