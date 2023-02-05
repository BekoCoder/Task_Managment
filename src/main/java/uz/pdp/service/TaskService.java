package uz.pdp.service;

import uz.pdp.model.task.Task;
import uz.pdp.repository.TaskRepository;

import java.util.ArrayList;

public class TaskService implements TaskRepository {
    public boolean addTask(Task task){
        ArrayList<Task> taskArrayList=new ArrayList<>();
        if(checkTask(taskArrayList, task.getName() )){
            return false;
        }
        taskArrayList.add(task);
        writeTasktoFile(taskArrayList);
        return true;
    }



    public boolean checkTask(ArrayList<Task> tasks, String name){
        for (Task task:getTaskList()) {
            if(task.getName().equals(name)){
                return true;
            }
        }
        return false;
    }


}
