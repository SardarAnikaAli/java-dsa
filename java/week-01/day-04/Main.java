public class Main
{
    public static void main(String[] args)
    {
        int totalMarks=100;
        int marksObtained=75;
        int remainingMarks=totalMarks-marksObtained;

        int bonusMarks=5;
        marksObtained+=bonusMarks;

        System.out.println("Total marks obtained: " + marksObtained);
        System.out.println("Marks obtained: " + marksObtained);
        System.out.println("Remaining marks: " + remainingMarks);
    }
}