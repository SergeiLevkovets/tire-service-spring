package by.stormnet.levkovets.domains;

import org.springframework.security.core.GrantedAuthority;

/**
 * Simple object representing the role of users
 * */

public enum Role implements GrantedAuthority {
    ROLE_USER,
    ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
