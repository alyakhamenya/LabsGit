import java.time.temporal.TemporalAdjuster;

public class Start {
    public static void main(String[] arg) {
        Task task = new Task("1", "abc");
        Team team = new Team("Lab1");
        Developer developer = new Developer("Sasha");
        team.addDeveloper(developer);
        developer.addTask(task);
        team.addTask(task);
        task.setCompleted();
        for(Task item : developer.getTasks())
            System.out.println(item);
    }
}

