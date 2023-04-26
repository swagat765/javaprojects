import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sort {

    public void SortText() throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("networklog.txt"));
        System.out.print("id");
        System.out.print("\tsource");
        System.out.print("\t\tDestination");
        System.out.print("\tDate");
        System.out.print("\t\t\tStatus");
        System.out.print("\t\tNetwork");
            
        String line = reader.readLine();
        
        String [] id = new String[80];
        String [] source = {};
        String [] Destination = {};
        String [] Date = {};
        String [] Status = {};
        String [] Network = {};
       

        System.out.println();
        while (line != null) {
            if(  line.contains("Id:")){
            id = line.split(":");
            System.out.print(id[1]);
            }
            if(  line.contains("Source")){
             source = line.split(":");
             System.out.print("\t" +source[1]);
            }

             if(  line.contains("Destination")){
             Destination = line.split(":");
             System.out.print("\t"+ Destination[1]);
             }
             if(  line.contains("Date")){
             Date = line.split(":");
             System.out.print("\t" + Date[1]);

             }
            if(line.contains("Status")){
            Status = line.split(":");
            System.out.print("\t\t" + Status[1]);
            }
            if (line.contains("Network")){
             Network = line.split(":");
             System.out.println("\t\t" + Network[1]);   
            }
        line = reader.readLine();
    

    
    }

    


   }
}    
        

        
