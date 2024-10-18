package lk.dep12.ijse.appinitializer.repo;

import lk.dep12.ijse.appinitializer.dto.UserDTO;
import lk.dep12.ijse.appinitializer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM USER WHERE ID = ?1", nativeQuery = true)
    User getUserById(String id);

    @Query(value = "SELECT * FROM USER WHERE ID = ?1 AND ADDRESS = ?2", nativeQuery = true)
    User getUserByIdAndAddress(String id, String address);
}
