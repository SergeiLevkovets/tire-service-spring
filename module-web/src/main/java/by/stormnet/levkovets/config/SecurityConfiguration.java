package by.stormnet.levkovets.config;


import by.stormnet.levkovets.security.AuthProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Import(ServiceConfiguration.class)

@Configuration
@EnableWebSecurity
@ComponentScan("by.stormnet.levkovets.security")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthProviderImpl provider;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(provider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/index", "/index.html", "/", "/login", "/registration").anonymous()
                .anyRequest().authenticated()
                .and().csrf().disable()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("email")
                .and()
                .logout()
                .logoutSuccessUrl("/logout");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }
}
