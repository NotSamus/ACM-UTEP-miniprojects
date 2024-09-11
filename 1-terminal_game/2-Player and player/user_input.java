/**
 * Title : User_input 
 * Author : Jesus Lopez
 */
import java.util.HashMap;

public class user_input{

    public static HashMap<String,user> user_records = new HashMap<String,user>();
    public static void main(String [] args){

    }

    public void tokenTheUser()throws IOException{
        Scanner file = new Scanner(new File("Users.csv"));
        String header = file.nextLine(); //reading header 
        
        while(file.hasNextLine()){
        String holder = file.nextLine();
        String [] a = holder.split(",");
        try {  
            createUser(/*username=*/a[2],a[3],a[5],a[0],a[1],a[4],a[5],a[10],a[8],a[9],a[7]);       
        } catch (IOException ioe) {
            ioe.getMessage();
        }
        System.out.flush();
        } 
    }

    public void createUser(String username, String firstName, String lastName, String state, String lastSignIn, String logInTime, String pin, String dateOfBirth, String city, String zip, String totalPlayTime) throws IOException{
        player p1 = new player();
        user newUser = new user( username,  firstName,  lastName,  state,  lastSignIn,  logInTime,  pin,  dateOfBirth,  city,  zip,  totalPlayTime,p1);
        
        user_records.put(username, newUser);
    }
}