package uz.pdp.service;

import uz.pdp.model.user.Users;
import uz.pdp.repository.UserRepository;

import java.util.ArrayList;
import java.util.UUID;

public class UserService implements UserRepository {

    public boolean checkEmail(ArrayList<Users> users, String email){
        for (Users users1: getUserList()) {
            if(users1.getEmail().equals(email)){
                return true;
            }
        }
        return  false;
    }

    public boolean add(Users user){
        ArrayList<Users> usersArrayList=new ArrayList<>();
        if(checkEmail(usersArrayList, user.getEmail())){
            return  false;
        }
        usersArrayList.add(user);
        writeUsertoFile(usersArrayList);
        return true;
    }

    public Users getbyId(UUID id){
        for (Users users: getUserList()) {
            if(users.getId().equals(id)){
                return users;
            }
        }
        return null;
    }

}
