import java.util.ArrayList;

public class Developer {
    private String name;
    private ArrayList<Task> tasks;

    public Developer() {
        this.name = "Default Developer Name";
        this.tasks = new ArrayList<>();
    }

    public Developer(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    // Добавляем конструктор копирования
    public Developer(Developer developer) {
        this.name = developer.name;
        this.tasks = new ArrayList<>(developer.tasks);
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
