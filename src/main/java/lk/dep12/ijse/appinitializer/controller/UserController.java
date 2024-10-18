package lk.dep12.ijse.appinitializer.controller;


import lk.dep12.ijse.appinitializer.dto.UserDTO;
import lk.dep12.ijse.appinitializer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUser")
    public String getUser(){
        return "GetUser method is working!";
    }
    @PostMapping(value = "/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        userService.saveUser(userDTO);
        return userDTO;
    }
    @PutMapping(value = "/updateUser")
    public String updateUser(){
        return "Update User method is working!";
    }
    @DeleteMapping(value = "/deleteUser")
    public String deleteUser(){
        return "Delete User method is working!";
    }
}
