// Program to read the content of a file and print the number of occurrences of each words.

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
public class Count{

       public static void main(String args[]){
             try{

             // Read the file.

             File input = new File("file name");
             FileInputStream fin= new FileInputStream(input);
             byte[] array= new byte[(int)input.length()];
             fin.read(array);
             fin.close();
             String str = new String(array) ;

             // Replace all special characters with space.

             str=str.replaceAll("[^a-zA-Z 0-9-]", "");
 
             // Create a string array to store the words in the string.

             String [] words =str.split(" ");
             HashMap<String,Integer> map = new HashMap<String,Integer>();
      
             // Enter all the words in the array to hashmap.

             for(String word : words) {
 
                 // Convert all words to lowercase.
                 // If the word is a new key initialize the value with one else increment the value.

                 String temp = word.toLowerCase();
                 if(map.containsKey(temp))
                     map.put(temp,map.get(temp) + 1);
                 else
                     map.put(temp, 1);
                }

             // Print all the words and number of occurrences.

             for(String name: map.keySet()){
                 int value = map.get(name);  
                 System.out.println(name + " " + value);  
                } 
             
             } catch(Exception e){System.out.println(e);}    
               
       }

}