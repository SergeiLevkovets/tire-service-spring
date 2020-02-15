package by.stormnet.levkovets.security;

import by.stormnet.levkovets.dto.UserDTO;
import by.stormnet.levkovets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class AuthenticationProviderImpl implements AuthenticationProvider {

    @Autowired
    private UserService userService;



    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        UserDTO userDTO = userService.getByEmail(email);
        if (userDTO == null) {
            throw new UsernameNotFoundException("User not found");
        }
        String password = authentication.getCredentials().toString();
        if (!password.equals(userDTO.getPassword())) {
            throw new BadCredentialsException("Bad Credentials");
        }

        Set<SimpleGrantedAuthority> grantedAuthorities = userDTO.getRole().stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());


        return new UsernamePasswordAuthenticationToken(userDTO, password, grantedAuthorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
