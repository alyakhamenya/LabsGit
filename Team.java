import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Developer> developers;
    private ArrayList<Task> tasks;

    public Team(String name) {
        this.name = name;
        this.developers = new ArrayList<>();
        this.tasks = new ArrayList<>();
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
}
