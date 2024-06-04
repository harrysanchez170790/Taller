package ubilapaz.edu.bo.template.repository;

import org.springframework.stereotype.Repository;
import ubilapaz.edu.bo.template.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
