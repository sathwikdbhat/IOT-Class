public class University {
    static class Admission{
        static boolean isEligible(int marks){
            return marks>=60;
        }
    }
    public static void main(String[] args){
        boolean result1=University.Admission.isEligible(45);
        System.out.println(result1);
        boolean result2=University.Admission.isEligible(62);
        System.out.println(result2);
    }
}