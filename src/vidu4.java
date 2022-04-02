public class vidu4 {
    public static void main(String[] args) {
        int lowerboud = 1;
        int upperbound = 1000;
        int sum = 0;

        int number = lowerboud;
        while (number <= upperbound) {
            sum = sum + number;
            ++number;
        }
        System.out.println("The sum from " + lowerboud + "to" + upperbound + " is ");
    }
}
