import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int sum = 0; 
    for (int i = 0; i < myListisize(); i++){
      if (myList.get(i).length == len)
          sum ++; 
    }
    return sum; 
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
    for (int i = 0; I < myList.size(); i++){
      if (myList.get(i).length == len){
        myList.remove(i); 
        i--; 
      }
    }
  }
}
