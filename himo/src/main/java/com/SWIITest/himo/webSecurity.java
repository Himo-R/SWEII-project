package com.SWIITest.himo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class webSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder authBuilder) throws Exception
    {
        authBuilder.inMemoryAuthentication()
                .withUser("himo369")
                .password("123")
                .roles("USER")
                .and()
                .withUser("fooo")
                .password("fooo")
                .roles("ADMIN");
    }
@Bean
public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
}
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login").hasAnyRole("ADMIN","USER")
                .antMatchers("/listAllUsers").hasRole("ADMIN")
                .antMatchers("/signUp").permitAll()
                .antMatchers("/User").hasRole("USER")
                .antMatchers("/").permitAll()
                .antMatchers("/**").authenticated()
                .and().formLogin()
                .and()
                .csrf().disable();//this for error when post request

    }




}

