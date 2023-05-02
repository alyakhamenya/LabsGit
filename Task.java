public class Task {
    private String name;
    private String description;
    private boolean completed;
    private Developer assignedDeveloper;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.completed = false;
        this.assignedDeveloper = null;
    }

    public void setCompleted() {
        this.completed = true;
    }

    public void setAssignedDeveloper(Developer developer) {
        this.assignedDeveloper = developer;
    }
}