# Manage Users Data

This is the first step into developing the game! In this section you are going to learn how to manage CSV (Comma Separated Values) files and how to process them. we are not going to use objects, we are just going to print the CSV.

## Objective

The objective of this module is to get a general understanding on the following topics:

- Hash Maps
- File input/out
- Exceptions

## Tutorial

### File Input/Output

<!-- Explain how to read a fle -->

### What is a HashMap?

Befor we start coding we have to understand what is a hashmap.

Well, a HashMap is like a box with labeled slots where you can store and quickly find things. Each slot needs a key or the name and it actually holds something inside. You can look up what's in a slot by its name without needing to search through everything, making it really fast e.g. It is like searching a song in spotify, in this case the key is the name of the song and what is has inside is the album cover, the actual song, the duration, etc.

#### Code Example

Now, Lets try this example:

```Java
HashMap<String,user> user_records = new HashMap<String,user>();
```

This is the line of code that we are going to be using, I know it seems too complicated but let me replace some words, that way is more readable.

```Java
HashMap<username,user> user_records = new HashMap<username,user>();
```

In this case we have a HashMap the **key** is going to be the **username** and the **content** is the object **user**. This way you can look very fast the information of a user with only the username.

<!-- Missing how to use the hashmap -->

#### How to use a HashMap

### Exceptions

<!-- Explain what kinds of exceptions we have  -->

### Activity

For the activity of this module, you are going to create a file **handle_csv.java**. You can use the following code snippet:

```Java
import java.util.HashMap;
public class handle_csv{
    // Create a global Hashmap
    public static HashMap < , > users_info = new HashMap< , >;

    public static void main(String [] args){

    }

    public static void tokenUser(){

    }
}
```

Inside the method **tokenUser()** you are going to write your own code to handle the file **users.csv** that is under the folder users.

Also Remember the **Key** and the **Value** for the HashMap.
