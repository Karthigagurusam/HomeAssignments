package homeassignment;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "love to do programming coding from test leaf programming sesion";
		int i, j;
		
		String[] words = text.split(" ");
		
		for(i=0; i<words.length; i++)
		{
			for(j=i+1; j<words.length; j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))
				{
					words[i] = " ";
				}
				else
				{
					continue;
				}
			}
		}
		for(i=0; i<words.length; i++)
		{
			System.out.print(words[i]+" ");
		}
	}
}

