package de.mhertel.domain.security;

/**
 * Created by matthias on 13.05.17.
 */
import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{
    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}