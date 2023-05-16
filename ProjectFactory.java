public class ProjectFactory {
    public static Team createTeam(String name) {
        return new Team(name);
    }

    public static Task createTask(String name, String description) {
        return new Task(name, description);
    }

    public static Developer createDeveloper(String name) {
        return new Developer(name);
    }
}
