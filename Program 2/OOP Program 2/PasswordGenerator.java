
public class PasswordGenerator
{
	private String word1, word2, word3, word4, word5;
	private int n;
	

	public PasswordGenerator(int x, String w1, String w2, String w3, String w4, String w5)
	{
		n = x;
		word1=w1;
		word2=w2;
		word3=w3;
		word4=w4;
		word5=w5;
		
	}
	
	public PasswordGenerator()
	{
		n=0;
		word1="";
		word2="";
		word3="";
		word4="";
		word5="";
	}
	
	public void setPhrase(String w1, String w2, String w3, String w4, String w5)
	{
		word1=w1;
		word2=w2;
		word3=w3;
		word4=w4;
		word5=w5;
	}
	
	public String getPhrase()
	{
		return word1+" "+word2+" "+word3+" "+word4+" "+word5;
	}
	
	public void setN(int x)
	{
		n=x;
	}
	
	public int getN()
	{
		return n;
	}
	
	public String getPassword()
	{
		String word, phrase;
		if(word1.length()>=n)
		{
			word = word1.substring(0,n);
		}
		
		else
		{
			word = word1;
		}
		
		phrase = word;
		
		if(word2.length()>=n)
		{
			word = word2.substring(0,n);
		}
		
		else
		{
			word = word2;
		}
		
		phrase = phrase + word;
		
		if(word3.length()>=n)
		{
			word = word3.substring(0,n);
		}
		
		else
		{
			word = word3;
		}
		
		phrase = phrase + word;
		
		if(word4.length()>=n)
		{
			word = word4.substring(0,n);
		}
		
		else
		{
			word = word4;
		}
		
		phrase = phrase + word;
		
		if(word5.length()>=n)
		{
			word = word5.substring(0,n);
		}
		
		else
		{
			word = word5;
		}
		
		phrase = phrase + word;
		
		return phrase;
	}
	
	public int getPasswordLength()
	{
		return getPassword().length();
	}
	
}
