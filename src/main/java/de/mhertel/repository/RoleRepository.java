package de.mhertel.repository;

import de.mhertel.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by matthias on 13.05.17.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByname(String name);
}
