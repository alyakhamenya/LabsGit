import java.util.ArrayList;

public class Developer {
    private String name;
    private ArrayList<Task> tasks;

    public Developer(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }
}
