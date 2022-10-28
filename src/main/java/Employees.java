public class Employees {
    public static void main(String[] args) {
        int progers = 12;
        int testers = 3;
        int support = 3;
        int totalTesters = (progers * testers);
        int totalSupport = (progers * support);
        int totalEmployees = (progers + totalSupport + totalTesters);
        System.out.println("Общее количесвтво технических специалистов на проекте: " + totalEmployees);
    }
}
