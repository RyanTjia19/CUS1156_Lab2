import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list) {
	   
	   //Changed this variable to the size of the array list
	   int count = list.size();
	  
	   for (int i = 0; i < list.size(); i++) {
    	  
		   /* Changed this for loop so that it will compare the first word with the next word
		      that is to the right of the first word and not to the left */
		   /* Ex: First word is blackboard and it will be compared to the second orange not to
		      to the first orange */
		   for (int j = i + 1; j < list.size(); j++) {
			   
			   /* This is so that if there are words that aren't unique it won't count towards
			      the final count */
			   //This can be done by subtracting the final count by one
			   if (list.get(i).equalsIgnoreCase(list.get(j))) {
				
				   count--;
			   }
		   }
	   }
      
	  return count;
}

   public static void main(String[] args) {
	  ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
