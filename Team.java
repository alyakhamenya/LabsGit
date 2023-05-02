import java.util.ArrayList;

// Добавляем конструктор по умолчанию
public class Team {
    private String name;
    private ArrayList<Developer> developers;
    private ArrayList<Task> tasks;

    public Team() {
        this.name = "Default Team Name";
        this.developers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public Team(String name) {
        this.name = name;
        this.developers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    // Добавляем конструктор копирования
    public Team(Team team) {
        this.name = team.name;
        this.developers = new ArrayList<>(team.developers);
        this.tasks = new ArrayList<>(team.tasks);
    }

    // Добавляем блок инициализации
    {
        System.out.println("New team created!");
    }

    public void addDeveloper(Developer developer) {
        this.developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        this.developers.remove(developer);
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    public void assignTask(Task task, Developer developer) {
        task.setAssignedDeveloper(developer);
        developer.addTask(task);
    }

    // Добавляем статическую переменную и статический блок инициализации
    public static int maxNumberOfDevelopers = 5;

}
