package es.com.suelengalhardo.talent_acq.modules.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.com.suelengalhardo.talent_acq.modules.company.dto.AuthCompanyDTO;
import es.com.suelengalhardo.talent_acq.modules.company.useCases.AuthCompanyUseCase;

@RestController
@RequestMapping("/auth")

public class AuthCompanyController {


  @Autowired
  private AuthCompanyUseCase authCompanyUseCase;

  
  @PostMapping("/company")
  public ResponseEntity<Object> create(@RequestBody AuthCompanyDTO authCompanyDTO) {
    try {
      var result = authCompanyUseCase.execute(authCompanyDTO);
      return ResponseEntity.ok(result);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }
  }
}