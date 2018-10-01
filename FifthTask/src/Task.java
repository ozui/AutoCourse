public class Task implements Comparable<Task> {
    private String name;
    private Priority priority;
    private Complexity complexity;

    @Override
    public int compareTo(Task task) {
        return priority.compareTo(task.getPriority());
    }

    public Task(String name, Priority priority, Complexity complexity) {
        this.name = name;
        this.priority = priority;
        this.complexity = complexity;
    }

    public String getName() {
        return name;
    }

    public Priority getPriority() {
        return priority;
    }

    public Complexity getComplexity() {
        return complexity;
    }

    @Override
    public String toString() {
        return "Task name " + name + "\tpriority " + priority + "\tcomplexity " + complexity;
    }
}
