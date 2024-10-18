package lk.dep12.ijse.appinitializer.repo;

import lk.dep12.ijse.appinitializer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
