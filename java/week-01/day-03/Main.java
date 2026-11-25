public class Main
{
    public static void main(String[] args)
    {
        String employeeName = "Anika";
        int totalLeaves = 20;
        int leavesTaken = 5;

        int remainingLeaves = totalLeaves - leavesTaken;

        final int MAX_LEAVES = 20;

        System.out.println("Employee: " + employeeName);
        System.out.println("Remaining leaves: " + remainingLeaves);
        System.out.println("Maximum leaves: " + MAX_LEAVES);
    }
}
