package uz.pdp.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public interface FileUtil {

    ObjectMapper objectMapper=new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT,true);
    String taskPath="C:\\Users\\user\\IdeaProjects\\Task1_Managment\\src\\main\\resources\\tasks.json";
    String userPath="C:\\Users\\user\\IdeaProjects\\Task1_Managment\\src\\main\\resources\\users.json";

}
