public class DebugAverageCalculation {
    public static void main(String[] args) {
        System.out.println("Average calculation ");
        int[] inputNumberArray={10,20,30};
        double average= calculationAverage(inputNumberArray);
        System.out.println("the average is: "+average);


    }
    private static double calculationAverage(int[] input){
        double result=0;
        for ( int element:input){
            result += element;
        }result=result/input.length;
        return result;
    }
}
