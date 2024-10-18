package lk.dep12.ijse.appinitializer.service;


import jakarta.transaction.Transactional;
import lk.dep12.ijse.appinitializer.dto.UserDTO;
import lk.dep12.ijse.appinitializer.entity.User;
import lk.dep12.ijse.appinitializer.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
//here we are using interface injection
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
}
