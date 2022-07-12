public class ReverseWordsInAString {
    public static String reverseString(String str) 
	{
		//Write your code here
        int n = str.length();
		StringBuffer ans = new StringBuffer("");
		int i = 0;

		while (i < n) 
		{
			int j = i;

			// Skip multiple spaces
			while (j < n && str.charAt(j) == ' ') 
			{
				j++;
			}

			StringBuffer currentWord = new StringBuffer("");

			// Get the current word
			while (j < n && str.charAt(j) != ' ') 
			{
				currentWord.append(str.charAt(j));
				j++;
			}

			// add current word in the ans with a space
			if (currentWord.length() != 0) 
			{
				ans.insert(0, currentWord + " ");
			}

			i = j + 1;
		}

		if (ans.length() == 0) 
		{
			return ans.toString();
		}

		// remove the last space
		return ans.substring(0, ans.length() - 1).toString();

	}
}
