
public class Main {
    
    public static void main(String[] args)
    {
        
        KString kstr;

        // For the homework!!
        
        // KHyphen2()
        kstr = new KString("Hello");
        System.out.println(kstr +" hyphened2 is " + kstr.KHyphen2());

        kstr = new KString("ABC");
        System.out.println(kstr +" hyphened2 is " + kstr.KHyphen2());

        kstr = new KString("AB");
        System.out.println(kstr +" hyphened2 is " + kstr.KHyphen2());
        
        kstr = new KString("A");
        System.out.println(kstr +" hyphened2 is " + kstr.KHyphen2());
        
        kstr = new KString("");
        System.out.println(kstr +" hyphened2 is " + kstr.KHyphen2());
        
        // Palindrome
        
        kstr = new KString("AbA");
        System.out.println(kstr +"  is a palindrome:  " + kstr.isPalindrome());
        kstr = new KString("AbbA");
        System.out.println(kstr +"  is a palindrome:  " + kstr.isPalindrome());
        kstr = new KString("A");
        System.out.println(kstr +"  is a palindrome:  " + kstr.isPalindrome());
        kstr = new KString("Ab");
        System.out.println(kstr +"  is a palindrome:  " + kstr.isPalindrome());
        kstr = new KString("Abb");
        System.out.println(kstr +"  is a palindrome:  " + kstr.isPalindrome());
        kstr = new KString("");
        System.out.println(kstr +"  is a palindrome:  " + kstr.isPalindrome());

                
        
    }
    
}
