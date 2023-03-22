    
    
   public class main{
public static void main(String[]args){
    char a= 'a';
        String str = "grass is greener on the other side";
        int occurence = 0;
        
        for (int i=0; i < str.length(); i++)
        {
            if (!Character.toUpperCase(a) == Character.toUpperCase(str.charAt(i)))
            {
                occurence++;
            }
        }
        
        System.out.println(a + " occurs " + occurence + " times in " + str);
    }
}
