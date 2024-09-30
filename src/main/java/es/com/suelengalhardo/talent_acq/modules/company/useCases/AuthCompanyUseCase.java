package es.com.suelengalhardo.talent_acq.modules.company.useCases;

import java.time.Instant;
import java.time.Duration;


import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import es.com.suelengalhardo.talent_acq.modules.company.dto.AuthCompanyDTO;
import es.com.suelengalhardo.talent_acq.modules.company.repositories.CompanyRepository;

@Service
public class AuthCompanyUseCase {

    @Value("${security.token.secret}")
    private String secretKey;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public String execute(AuthCompanyDTO authCompanyDTO) throws AuthenticationException {
        var company = this.companyRepository.findByUsername(authCompanyDTO.getUsername()).orElseThrow(
                () -> {
                    throw new UsernameNotFoundException("Username/password incorrect");

                });

        // verificar si las contraseñas son iguales

        var passwordMatches = this.passwordEncoder.matches(authCompanyDTO.getPassword(), company.getPassword());

        // si no son igualer -> Erro
        if (!passwordMatches) {
            throw new AuthenticationException();
        }

        // Si son iguales -> Generar el token
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        var token = JWT.create().withIssuer("javagas")
                 .withExpiresAt(Instant.now().plus(Duration.ofHours(2)))
                .withSubject(company.getId().toString()).sign(algorithm);
        return token;

    }

}
