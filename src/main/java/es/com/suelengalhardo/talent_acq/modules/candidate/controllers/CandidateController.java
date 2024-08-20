package es.com.suelengalhardo.talent_acq.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.com.suelengalhardo.talent_acq.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
        // TODO: Implement method to create a candidate
        System.out.println("candidate");
        System.out.println(candidateEntity.getEmail());

    }
}
