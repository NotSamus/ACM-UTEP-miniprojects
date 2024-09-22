/**
 * Title : Handle_csv
 * Author : Jesus Lopez
 */
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class game_utilities{

    public static HashMap<String,String> user_records = new HashMap<String,String>();
    public static void main(String [] args)throws IOException{
        tokenTheUser();
        //testing
        System.out.print(user_records.get("laura76"));
    }

    public static void tokenTheUser()throws IOException{
        try {   
        //read the CSV file
        Scanner file = new Scanner(new File("users.csv"));
        
        //remove the first line
        String header = file.nextLine(); //reading header 
        // System.out.println(header);
        while(file.hasNextLine()){
            String holder = file.nextLine();
            String [] a = holder.split(",");
            user_records.put(a[0], holder);  
            System.out.flush();
        }

        file.close();
    }catch (IOException e) {
        System.out.print("The file does not exist");
    }
    }
}