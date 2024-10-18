package lk.dep12.ijse.appinitializer.controller;


import lk.dep12.ijse.appinitializer.dto.UserDTO;
import lk.dep12.ijse.appinitializer.repo.UserRepo;
import lk.dep12.ijse.appinitializer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUsers")
    public List<UserDTO> getUsers(){
        return userService.getAllUsers();
    }
    @PostMapping(value = "/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        userService.saveUser(userDTO);
        return userDTO;
    }
    @PutMapping(value = "/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){userService.updateUeer(userDTO);
        return userDTO;
    }
    @DeleteMapping(value = "/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        userService.deleteUser(userDTO);
        return true;
    }
    //Get user by id
    @GetMapping(value = "/getUserById/{userId}")
    public UserDTO getUserById(@PathVariable String userId){
        return userService.getUserById(userId);
    }
    //Get user by id and address
    @GetMapping(value = "/getUserByIdAndAddress/{userId}/{address}")
    public UserDTO getUserByIdAndAddress(@PathVariable String userId, @PathVariable String address){
        return userService.getUserByIdAndAddress(userId, address);
    }


}
