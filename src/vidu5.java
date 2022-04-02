public class vidu5 {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sum0dd = 0 ;
        int sumEven = 0;
        int number = lowerbound;
        while (number <= upperbound) {
            if (number % 2 ==0) {
                sumEven += number;
            } else  {
                sum0dd += number;
            }
            ++number;
        }
        System.out.println("The sum of even numbers form " + lowerbound + " to " + upperbound + " is " + sum0dd);
        System.out.println("The sum of even number from" + lowerbound + "to" + upperbound + " is " + sumEven);
        System.out.println("The difference between the two sums is " + (sum0dd - sumEven));
    }
}
