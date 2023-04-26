public class test2 {
    public static void main (String [] args) {
        int [] arr = new int [] {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        int temp = 0;
        System.out.println("Original array: " );

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr [i] + " ");
            temp = temp + arr [i];
    
        }
        for ( int i = 0; i<arr.length; i++){
            for ( int j = 0; j<arr.length; j++){
                if (arr [i] < arr [j]) {
                    temp = arr [i];
                    arr [i] = arr [j];
                    arr [j] = temp;

                }
            }
         
        }

    System.out.println();
    System.out.println("Result : ");
    for (int i = 0; i < arr.length; i++) {
       System.out.println(arr[i] + " ");



    }
    
    }

}    