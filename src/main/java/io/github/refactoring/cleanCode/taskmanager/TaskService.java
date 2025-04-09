package io.github.refactoring.cleanCode.taskmanager;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task t) {
        tasks.add(t);
    }

    public List<Task> getAll() {
        return tasks;
    }

    public void updateTask(Integer id, String name) {
        for (Task t : tasks) {
            if (t.getId().equals(id)) {
                t.setName(name);
            }
        }
    }

    public void deleteTask(Integer id) {
        tasks.removeIf(t -> t.getId().equals(id));
    }

    public Task getTaskById(Integer id) {
        for (Task t : tasks) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }
}