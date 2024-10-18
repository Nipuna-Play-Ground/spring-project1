package lk.dep12.ijse.appinitializer.service;


import jakarta.transaction.Transactional;
import lk.dep12.ijse.appinitializer.dto.UserDTO;
import lk.dep12.ijse.appinitializer.entity.User;
import lk.dep12.ijse.appinitializer.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public List<UserDTO> getAllUsers(){
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUeer(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return true;
    }

    public UserDTO getUserById(String userId){
        User user = userRepo.getUserById(userId);
        return modelMapper.map(user, UserDTO.class);
    }

    public UserDTO getUserByIdAndAddress(String id, String address){
        User user = userRepo.getUserByIdAndAddress(id, address);
        return modelMapper.map(user, UserDTO.class);
    }

}
