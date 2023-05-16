import java.util.ArrayList;

public class Developer extends BusinessObject {
    private ArrayList<Task> tasks;

    public Developer() {
        super();
        this.tasks = new ArrayList<>();
    }

    public Developer(String name) {
        super(name);
        this.tasks = new ArrayList<>();
    }

    // Добавляем конструктор копирования
    public Developer(Developer developer) {
        super(developer.getName());
        this.tasks = new ArrayList<>(developer.tasks);
    }
    public String getName() {
        return name;
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
