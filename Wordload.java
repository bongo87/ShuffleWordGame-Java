import java.util.ArrayList;
import java.util.Random;

public class Wordload 
{
    //create a method loadWord that receives a word and returns a character array list
    public MyArrayList<Wrapper> loadWord(String word)
    {
        //initialise a new arraylist
        MyArrayList<Wrapper> list = new MyArrayList<>();
        
        //input the word trough a loop
        for(int i=0; i<word.length(); i++)
        {
            char Char = word.charAt(i);
            Wrapper wrapper = new Wrapper(Char);
            list.add(list.size(), wrapper);
             
        }
        
        return list;
    }
    
    
    public void shuffleWord(MyArrayList<Wrapper> list) 
    {
        //use the random function to get random words using random indexes
        Random rand = new Random();
        int size = list.size();
        
        //for loop for looping through the elements
        for (int i = 0; i < size; i++) 
        {
            
            int index = rand.nextInt(size);
            
            //Use the swap method from task 4 to swap the words
            list.swap(i, index);
        }
    }
    
}
