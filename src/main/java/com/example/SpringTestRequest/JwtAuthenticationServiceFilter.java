/*
package com.example.SpringTestRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.client.config.IClientConfigKey;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class JwtAuthenticationServiceFilter  extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public JwtAuthenticationServiceFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        try {
            UserNameAndPasswordRequest userNameAndPasswordRequest=new ObjectMapper()
                    .readValue(request.getInputStream(),UserNameAndPasswordRequest.class);

            Authentication authentication=new UsernamePasswordAuthenticationToken(userNameAndPasswordRequest.getUsername(),userNameAndPasswordRequest.getPassword());

            return  authentication;

        } catch (IOException e) {
           throw  new RuntimeException(e);
        }

    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

        String secretKey="securemyapplicationatanycostsecuremyapplicationatanycostsecuremyapplicationatanycostsecuremyapplicationatanycost";
        SecretKey sharedSecret = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));
        String token= Jwts.builder()
                        .setSubject(authResult.getName())
                        .claim("authorities",authResult.getAuthorities())
                        .setIssuedAt(new Date())
                        .setExpiration(java.sql.Date.valueOf(LocalDate.now().plusDays(1)))
                        .signWith(sharedSecret)
                        .setId(String.valueOf(UUID.randomUUID()))
                        .compact();

        response.addHeader("Authorization","Bearer "+token);



//        super.successfulAuthentication(request, response, chain, authResult);
    }
}
*/
