import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class sortColumns{

	public List<Integer> minDeletionSize(String[] a)
	{
		List<Integer> indices = new ArrayList<Integer>();
		boolean cont = true;

		for(int i = 0; i < a[0].length(); i++) //checks each string
		{
			if(cont)
			{
				for(int col = 0; col < a.length - 1; col++) //checks each column in that string
				{
					if(a[col].length() == a[col+1].length()) //checks the length of the string to make sure it's equal
					{
						if(a[col].charAt(i) > a[col+1].charAt(i)) //checks if characters are not in order
						{
							if(!indices.contains(i)) //sees if that index is already in the arraylist
							{
								indices.add(i);	//adds indices to arraylist 
							}
						}
					}
					else
					{
						cont = false;
					}
				}
			}
			else
			{
				indices.add(-1); //adds -1 if strings are not the same length
				break;
			}
		}
		return indices;
	}

	public static void main(String args[])
	{
		String[] a = {"zyx", "wvu", "tsr"};
		String[] b = {"Captain", "Marvel", "saved", "the", "Avengers"};
		String[] c = {"cba", "daf", "ghi"};
		String[] d = {"a", "b"};
		sortColumns sc = new sortColumns();
		System.out.println(sc.minDeletionSize(a));
		System.out.println(sc.minDeletionSize(b));
		System.out.println(sc.minDeletionSize(c));
		System.out.println(sc.minDeletionSize(d));


	}

}
