package base.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**")
                .hasRole("USER")
                .anyRequest()
                .permitAll()
//                .authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/authenticateTheUser")
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }*/

   /* @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**").hasRole("USER")
                // Any URL that starts with "/" will be restricted to users who have the role "ROLE_USER". You will notice that since we are invoking the hasRole method we do not need to specify the "ROLE_" prefix.
                .anyRequest().authenticated()
                // Any URL that has not already been matched on only requires that the user be authenticated.
                .and()
                .formLogin()
// The below method defaultSuccessUrl sets the URL to go to after successful login
//                .defaultSuccessUrl("/about", true)
//                .loginProcessingUrl("/authenticateTheUser")
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/tellme**", "/about**").hasRole("USER")
                // Any URL that starts with /tellme** o /about** will be restricted to users who have the role "ROLE_USER". You will notice that since we are invoking the hasRole method we do not need to specify the "ROLE_" prefix.
                .anyRequest().authenticated()
                // Any URL that has not already been matched on only requires that the user be authenticated.
                .and()
                .formLogin()
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/")
                .permitAll()
//                .and()
//                .httpBasic()
                .and()
                .csrf().disable();
    }
}
