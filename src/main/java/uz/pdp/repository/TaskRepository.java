package uz.pdp.repository;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import uz.pdp.model.task.Task;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static uz.pdp.repository.UserRepository.file;
import static uz.pdp.utils.FileUtil.objectMapper;
import static uz.pdp.utils.FileUtil.taskPath;

public interface TaskRepository {
    default ArrayList<Task> getTaskList(){
        File file=new File(taskPath);

        try {
            return objectMapper.readValue(file, new TypeReference<ArrayList<Task>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    default void writeTasktoFile(ArrayList<Task> taskList){
        try {
            objectMapper.writeValue(file, taskList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
