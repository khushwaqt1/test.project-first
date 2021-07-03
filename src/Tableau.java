public class Tableau {
    public static void main(String[] args) {

        double[] myList=new double[]{1.9,2.9,3.4,3.5};
        // print all elements
        for (int i=0;i< myList.length;i++){
            System.out.println(myList[i]);
        }
        // summing all elements
        double total;
        total=0;
        for (int i=0;i< myList.length;i++){
            total+=myList[i];
        }
        System.out.println("total of summing:" +total);

        // finding the largest elements
        double max;
        max=myList[0];
        for (int i=0;i<myList.length;i++){
            if (myList[i]>max)max=myList[i];

        }
        System.out.println("max is :"+max);

        // finding the miner elements
        double min;
        min=myList[0];
        for (int i=0;i<myList.length;i++){
            if (min>myList[i])min=myList[i];

        }
        System.out.println("min number is :"+min);
        for (double element:myList){
            System.out.println(element);
        }
    }
}
