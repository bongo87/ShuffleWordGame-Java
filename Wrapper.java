
public class Wrapper
{
    //a field to store the letter
    private char letter;
    //the additional Boolean data field
    private boolean isDisplayed;
    
    //non-parameterized constructor
    public Wrapper()
    {
        
    }
    
    public Wrapper(char letter)
    {
        this.letter = letter;
        this.isDisplayed = false;
    }
    
    //a parameterized constructor for if the user provide parameters
    public Wrapper(char letter, boolean isDisplayed)
    {
        this.letter = letter;
        this.isDisplayed = false;
    }
    
    //a getter for letter
    public char getLetter()
    {
        return letter;
    }
    
    //a getter for isDisplayed
    public boolean isDisplayed()
    {
        return isDisplayed;
    }
    
    //a setter for letter
    public void setLetter(char letter)
    {
        this.letter = letter;
    }
    
    //a setter for isDisplayed
    public void setDisplayed(boolean isDisplayed)
    {
        this.isDisplayed = isDisplayed;
    }
    
    //ToString method to display the letter
    @Override
    public String toString()
    {
        //check if isDisplay is true or not
        if(isDisplayed == true)
        {
            return "The letter is "+ letter;
        }
        else
        {
            return "_";
        }
    }
    
}