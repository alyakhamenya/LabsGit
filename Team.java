import java.util.ArrayList;

// Добавляем конструктор по умолчанию
public class Team extends BusinessObject {

    private ArrayList<Developer> developers;
    private ArrayList<Task> tasks;
    private static final int MAX_NUMBER_OF_DEVELOPERS = 5;
    public Team() {
        super();
        this.developers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public Team(String name) {
        super(name);
        this.developers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    // Добавляем конструктор копирования
    public Team(Team team) {
        super(team.getName());;
        this.developers = new ArrayList<>(team.developers);
        this.tasks = new ArrayList<>(team.tasks);
    }

    // Добавляем блок инициализации
    {
        System.out.println("New team created!");
    }

    public void addDeveloper(Developer developer) {
        if (this.developers.size() < MAX_NUMBER_OF_DEVELOPERS) {
            this.developers.add(developer);
        } else {
            throw new IllegalStateException("Team is full.");
        }
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

    public ArrayList<Developer> getAllDevelopers() {
        return this.developers;
    }

    public ArrayList<Task> getTasksByDeveloper(Developer developer) {
        ArrayList<Task> assignedTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.getAssignedDeveloper() == developer) {
                assignedTasks.add(task);
            }
        }
        return assignedTasks;
    }
    // Добавляем статическую переменную и статический блок инициализации
    public static int maxNumberOfDevelopers = 5;

}
