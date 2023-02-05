package uz.pdp.repository;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import uz.pdp.model.user.Users;
import uz.pdp.utils.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static uz.pdp.utils.FileUtil.objectMapper;
import static uz.pdp.utils.FileUtil.userPath;

public interface UserRepository  {
    File file=new File(userPath);
   default ArrayList<Users> getUserList(){
        try {
            return  objectMapper.readValue(file, new TypeReference<ArrayList<Users>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
   }

        default void writeUsertoFile(ArrayList<Users> userList){

            try {
                objectMapper.writeValue(file, userList);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }



}
