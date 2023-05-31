import java.time.temporal.TemporalAdjuster;

public class Start {
    public static void main(String[] args) {
        Team team = ProjectFactory.createTeam("Team 1");
        Developer developer1 = ProjectFactory.createDeveloper("John");
        Developer developer2 = ProjectFactory.createDeveloper("Jane");
        Task task1 = ProjectFactory.createTask("Task 1", "Description of Task 1", 200.0, 4, new RegularCustomerTaskCostCalculation());
        Task task2 = ProjectFactory.createTask("Task 2", "Description of Task 2", 400.0, 120, new NormalCustomerTaskCostCalculation());

        team.addDeveloper(developer1);
        team.addDeveloper(developer2);
        team.addTask(task1);
        team.addTask(task2);

        team.assignTask(task1, developer1);
        team.assignTask(task2, developer2);
        System.out.println(task1.calculateCost());
        System.out.println(task2.calculateCost());
        System.out.println("Team name: " + team.getName());
        System.out.println("Developer 1 name: " + developer1.getName());
        System.out.println("Developer 2 name: " + developer2.getName());
        System.out.println("Task 1 name: " + task1.getName());
        System.out.println("Task 2 name: " + task2.getName());
        System.out.println("Task 1 assigned to: " + task1.getAssignedDeveloper().getName());
        System.out.println("Task 2 assigned to: " + task2.getAssignedDeveloper().getName());
    }
}

