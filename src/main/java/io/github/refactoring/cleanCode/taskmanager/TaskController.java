package io.github.refactoring.cleanCode.taskmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping("/createTask")
    public String newTask(@RequestBody Task t) {
        if (t.getName() != null && t.getName().length() > 0) {
            service.addTask(t);
            return "Task Created";
        }
        return "Error";
    }

    @GetMapping("/getTasks")
    public List<Task> getAllTasks() {
        List<Task> tasks = service.getAll();
        if (tasks != null && tasks.size() > 0) {
            return tasks;
        }
        return new ArrayList<>();
    }

    @PutMapping("/updateTask")
    public String updateTask(@RequestBody Task task) {
        if (task.getId() != null && task.getName() != null) {
            service.updateTask(task.getId(), task.getName());
            return "Task Updated";
        }
        return "Error";
    }

    @DeleteMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable Integer id) {
        if (id != null) {
            service.deleteTask(id);
            return "Task Deleted";
        }
        return "Error";
    }

    @GetMapping("/getTask/{id}")
    public Task getTask(@PathVariable Integer id) {
        return service.getTaskById(id);
    }
}