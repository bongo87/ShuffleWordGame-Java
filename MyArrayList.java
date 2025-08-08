 
public class MyArrayList<E> 
{
  private int size; // Number of elements in the list
  private E[] data;
  /** Create an empty list */
  public MyArrayList() {
       data = (E[])new Object[100];// cannot create array of generics
       size = 0; // Number of elements in the list
  }
  
  public void add(int index, E e) {   
    // Ensure the index is in the right range
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size); 
    // Move the elements to the right after the specified index
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];
    // Insert new element to data[index]
    data[index] = e;
    // Increase size by 1
    size++;
  }

  public boolean contains(Object e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return true;
    return false;
  }

  public E get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    return data[index];
  }
  
  public E remove(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    E e = data[index];
    // Shift data to the left
    for (int j = index; j < size - 1; j++)
      data[j] = data[j + 1];
    data[size - 1] = null; // This element is now null
    // Decrement size
    size--;
    return e;
  }

  public String toString() {
    String result=" ";
    for (int i = 0; i < size; i++) {
      result+= data[i];
      if (i < size - 1) result+=", ";
    }
    return result.toString() + "]";
  }

  
  public int size() {
    return size;
  }
  
 public boolean sortList()
 {
    E hold;
    for (int i = 0; i < size-1; i++)
     {
       for (int j = 0; j<size-1; j++)
        {       
         if(((Comparable)data[j]).compareTo(data[j+1])>0)
          {
           hold= data[j+1];
           data[j+1]=data[j];
           data[j]=hold;
          }       
       }
     } 
     return true;          
  }
  
  
  
  
  
  
  


  //task 4: the swap method
  public void swap(int index1, int index2) 
  {
      //check the validity of the indexes first
      if (index1 < 0 || index2 < 0)
      {
          System.out.println("Negative indexes not allowed");
          return;
      } 
      else 
      {
          if (index1 >= size || index2 >= size) 
          {
              System.out.println("Error!!! Check the indexes again");
              return;
          }
          else
          {
              //swap the indexes
              E temp = data[index1];
              data[index1] = data[index2];
              data[index2] = temp;
          }
      }
  }
  
  
  
  //task 6: VerifyWord method
  public boolean verifyWord(String guessWord) 
  {
      //Check for invalid inputs
      if (guessWord == null || this.size() != guessWord.length()) 
      {
          return false;
      }
      
      boolean isMatch = true;
      
      //compare each character in the list
      for (int i = 0; i < this.size(); i++) 
      {
          Wrapper wrapper = (Wrapper) this.get(i);
          char originalChar = wrapper.getLetter();
          char guessCh = guessWord.charAt(i);

          //Compare characters
          if (Character.toLowerCase(originalChar) == Character.toLowerCase(guessCh)) 
          {
              wrapper.setDisplayed(true);
          } 
          else 
          {
              isMatch = false;
          }
      }
      
      return isMatch;
      
  }
  
  
 
}