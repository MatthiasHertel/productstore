package de.mhertel.repository;

import de.mhertel.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by matthias on 13.05.17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
