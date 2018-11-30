package by.tut.kaa.alexander.bbp.user.repository;

import by.tut.kaa.alexander.bbp.user.repository.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByUserId(Long id);
    List<User> findAll();
}
