# Manage Users Data

This is the first step into developing the game! In this section you are going to learn how to manage CSV (Comma Separated Values) files and how to process them. we are not going to use objects, we are just going to print the CSV.

## Objective

The objective of this module is to get a general understanding on the following topics:

- Hash Maps
- File input/out
- Exceptions

## Video

later i will insert the video

## Tutorial

### File Input/Output

Remember that in order to work with input from the user our best friend is going to be the **Scanner**, first we have to import it:

```Java
import java.util.Scanner;
```

To declare a scanner is in the following form:

```Java
//for input from the terminal
Scanner input = new Scanner(System.in);
//for input from a file
Scanner input_file = new Scanner(new File("name of the file"));
```

Remember if you are going to read from a file, you have to **import java.io.File;** and of course it is a good practice to implement **IOException**.

Using scanner you can do multiple things:

```Java
//if you want to read only words until hit a space
input_file.next();
// reading until enter
input_file.nextLine();
```

When reading a file of multiple lines with enters, your best friends are going to be loops. you might be thinking "Well, lets use a forloop", the problem with that is that you do not know how many lines that file has. of course you can count them but it is more efficient to use a while.

you can use it in the following form:

```Java
while(File.hasNextLine()){
    //read from the file
}
```

### Exceptions

In the world of exceptions there are a lot of

![link](https://miro.medium.com/v2/resize:fit:720/format:webp/1*_jXNZuPLKMTQ5IKjBzb8jA.png)

This is a helpful image by [Deepti Swanni](https://deeptiswain.medium.com/).

Here we can see all some of the exceptions we can encounter, the one we are going to focus in **IOException**. why? you may ask, well we have to implement exceptions because programs are not perfect all the time! and we have to give a good feedback to the user, in this case you have to:

```Java
import java.io.IOException;
```

and the way to use it is the following:

```Java
 try {
    /**
     * Here goes the code
     * that might throw the exception
     * */
 }catch (IOException e) {
        System.out.print("enter message");
    }
```

### What is a HashMap?

Befor we jump into the code, we have to understand what is a hashmap.

Well, you can think of a HashMap like a box with labeled slots where you can store and quickly find things. Each slot needs a key or the name and it actually holds something inside. You can look up what's in a slot by its name without needing to search through everything, making it really fast e.g. It is like searching a song in spotify, in this case the key is the name of the song and what is has inside is the album cover, the actual song, the duration, etc.

#### Code Example

We are going to be using the java collections HashMap, to import it we can do the following:

```java
import java.util.HashMap;
```

Now, Lets try this example:

```Java
HashMap<String,user> user_records = new HashMap<String,user>();
```

This is the line of code that we are going to be using, I know it seems too complicated but let me replace some words, that way is more readable.

```Java
HashMap<username,user> name = new HashMap<username,user>();
```

In this case we have a HashMap the **key** is going to be the **username** and the **content** is the object **user**. This way you can look very fast the information of a user with only the username.

#### How to use a HashMap

If you want to populate a HashMap you can do it in the following form:

```Java
name.put(KEY, CONTENT);
```

### Activity

For the activity of this module, you are going to create a file **handle_csv.java**. You can use the following code snippet:

```Java
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class handle_csv{
    // Create a global Hashmap
    public static HashMap < , > users_info = new HashMap< , >;

    public static void main(String [] args){

    }

    public static void tokenUser(){

    }
}
```

Inside the method **tokenUser()** you are going to write your own code to handle the file **users.csv**. Also, it is a good practice to use Expection Handling for the file CSV.

Also Remember to put the **Key** and the **Value** for the HashMap.

#### FAQ

**Bug when using Scanner**: to solve one bug you may have in the scanner you can ude the following line of code to clear the input from the scanner.

```Java
System.flush();
```

**Error in main with IOE Excetion** you might encounter a problem when trying to call te function in the main, the problem is that you might be declaring that in your method, but when calling it on to the main it also needs to thor that exception. To fix this you can:

```Java
public static void main(String [] args)throws IOException{
/**
 * your code here
*/
}
```

**Error it reads the header from the csv file** to fix this you can use a variable to read the first line of the code before you implement your loop to read all the file.

```Java
String header = file.nextLine();
```

**Warning: File not closed** this is just a warning, you can use File.close(); and the warning will dissapear.
