public class ProjectFactory {
    public static Team createTeam(String name) {
        return new Team(name);
    }

    public static Task createTask(String name, String description, Double price, int quantity, ITaskCostCalculation costCalculation) {
        return new Task(name, description, price, quantity, costCalculation);
    }

    public static Developer createDeveloper(String name) {
        return new Developer(name);
    }
}
