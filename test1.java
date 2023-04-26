public class test1 {
  public static void main (String [] args){

    int [] arr = new int [] {1, 4, 17, 7, 25, 3, 100};
    int sum = 0;
    System.out.println("Original array: " );

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr [i] + " ");
        sum = sum + arr [i];

    }
    long average = sum / arr.length;
    System.out.println("The average of the said array is: " + average);

    System.out.println("The numbers in said the array that are greater than the average are: ");
    
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] > average) {
           if (arr[i] %2==0){
          System.out.println(arr[i]);
            }

        }
    
    }

  }  

}    

