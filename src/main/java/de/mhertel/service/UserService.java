package de.mhertel.service;

import de.mhertel.domain.User;
import de.mhertel.domain.security.UserRole;

import java.util.Set;

/**
 * Created by matthias on 13.05.17.
 */
public interface UserService {
    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);
}
