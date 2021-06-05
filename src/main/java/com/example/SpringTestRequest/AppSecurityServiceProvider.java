/*
package com.example.SpringTestRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

*/
/*@Configuration
@EnableWebSecurity*//*

public class AppSecurityServiceProvider extends WebSecurityConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
     */
/*   http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();*//*


        */
/*http
                .csrf().configure()
                .authorizeRequests()
                .antMatchers("/","Index","/css/*","/js/*").permitAll()
                .antMatchers("/api/**").hasRole(String.valueOf(ApplicationUserRoles.STUDENT.name()))
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();*//*


        http.csrf() .disable()
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                    .addFilter(new JwtAuthenticationServiceFilter(authenticationManager()))
                    .authorizeRequests()
                    .antMatchers("/api/**").hasRole(String.valueOf(ApplicationUserRoles.STUDENT))
                    .anyRequest()
                    .authenticated();

    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails sammSmith = User.builder()
                .username("samm")
                .password(passwordEncoder.encode("samm"))
                .roles(String.valueOf(ApplicationUserRoles.STUDENT)).build();

        UserDetails linda=User.builder()
                .username("linda")
                .password(passwordEncoder.encode("linda"))
                .roles(String.valueOf(ApplicationUserRoles.ADMIN))
                .build();

        UserDetails tomUser=User.builder()
                .username("tom")
                .password(passwordEncoder.encode("tom"))
                .roles(String.valueOf(ApplicationUserRoles.ADMINTRAINEE))
                .build();

        return  new InMemoryUserDetailsManager(sammSmith,linda,tomUser);


    }

}
*/
