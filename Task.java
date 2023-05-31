public class Task extends BusinessObject {

    private String description;
    private boolean completed;
    private Developer assignedDeveloper;
    private double price;
    private int quantity;
    private ITaskCostCalculation costCalculation;

    public Task() {
        super();
        this.description = "Default Task Description";
        this.completed = false;
        this.assignedDeveloper = null;
        this.price = 500;
        this.quantity = 1;
        this.costCalculation = new NormalCustomerTaskCostCalculation();
    }

    public Task(String name, String description, Double price, int quantity, ITaskCostCalculation costCalculation) {
        super(name);
        this.description = description;
        this.completed = false;
        this.assignedDeveloper = null;
        this.price = price;
        this.quantity = quantity;
        this.costCalculation = costCalculation;
    }

    // Добавляем конструктор копирования
    public Task(Task task) {
        super(task.getName());
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

    public double calculateCost() {
        return costCalculation.calculate(this);
    }
    public double getBasePrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
