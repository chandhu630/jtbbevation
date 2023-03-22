 public class main{
	public static void main(String[]args){
	
	     char e = 'e';
        String str = “grass is greener on the other side";
         
        int occurence = 0;
        
        for (int i=0; i < str.length(); i++)
        {
            if (Character.toUpperCase(e) == Character.toUpperCase(str.charAt(i)))
            {
                occurence++;
            }
        }
        
        System.out.println(e+ " occurs " + occurence + " times in " + str);
    }
}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Write a java program to find maximum and minimum occurring character in an string
         //Input : str = “grass is greener on the other side"

