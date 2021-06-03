
public class Day2_10 {	
  public static void main(String[] args) {  
      String string = "I love listening to music.";  
      System.out.println(wordcount(string) + " words in your sentence.");   
  }  
  static int wordcount(String string)  
  {  
    int count=0;  
    char[] arr = new char[string.length()];     
    for(int i = 0; i < string.length(); i++){  
    	arr[i]= string.charAt(i);  
        if( ((i > 0) && (arr[i] != ' ') && (arr[i-1] == ' ')) || ((arr[0] != ' ') && (i==0)) )  
           count++;  
      	}  
      	return count;  
  	}  
}