
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class student {

        // public void CreateStudent() throws IOException {
        //     FileWriter writer = new FileWriter( "student.txt");
        //     writer.write( "Student id :123\n");
        //     writer.write(" Student name : Raj\n");
        //     writer.write(" Student Grade: A\n");
        //     System.out.println("completed");
        //     writer.close();

        

        public void GetStudent() throws IOException {

            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();

            }
            reader.close();
            System.out.println("completed");


            


        }

        public void CreatDetails() {
        }
        
}
    

