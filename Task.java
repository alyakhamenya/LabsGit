public class Task {
    private String name;
    private String description;
    private boolean completed;
    private Developer assignedDeveloper;

    public Task() {
        this.name = "Default Task Name";
        this.description = "Default Task Description";
        this.completed = false;
        this.assignedDeveloper = null;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.completed = false;
        this.assignedDeveloper = null;
    }

    // Добавляем конструктор копирования
    public Task(Task task) {
        this.name = task.name;
        this.description = task.description;
        this.completed = task.completed;
        this.assignedDeveloper = task.assignedDeveloper;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted() {
        this.completed = true;
    }

    public Developer getAssignedDeveloper() {
        return assignedDeveloper;
    }

    public void setAssignedDeveloper(Developer developer) {
        this.assignedDeveloper = developer;
    }
}
