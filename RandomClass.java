import java.util.Random;
public class RandomClass{
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        System.out.println(rand.nextFloat());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextBoolean());
        System.out.println((byte)rand.nextInt());
        System.out.println(rand.nextLong());
        System.out.println((short)rand.nextInt());
        System.out.println((int)rand.nextInt(6)+1);
         System.out.println((byte)rand.nextInt());
        
        //otp using random class
        Random r = new Random();
        String otp = "";
        for(int  i=1; i<=4;i++){
            int digit = r.nextInt(10);
            otp = digit + otp;

        }
                System.out.println("4 digit otp is:"+otp);
      
      String upperCase = "";
      for( int i=1;i<=6;i++){
        char upper = (char)(r.nextInt(26)+65);
        upperCase = upperCase+upper;
      }
      System.out.println("6 digit otp is:"+upperCase);
  
//2 ways to print otp in lower and uper case;

  //////1 way---------------------
  String upperLowerotp = "";
      for( int i=1;i<=6;i++){
       
       int assciUpperLower ;
       if(r.nextBoolean()){
        assciUpperLower = r.nextInt(26)+65;
       }else{
        assciUpperLower = r.nextInt(26)+97;
       }
       char ch = (char)assciUpperLower;
       upperLowerotp = ch+upperLowerotp;
      }
      System.out.println("6 digit otp is:"+upperLowerotp);
  //2 way
      String upperLowerotp2 = "";
       for( int i=1;i<=6;i++){
       int assciUpperLower = r.nextBoolean()?((char)(r.nextInt(26)+65)):((char)(r.nextInt(26)+65));
        upperLowerotp2 = assciUpperLower+upperLowerotp2;
       }
       System.out.println("6 digit otp is:"+upperLowerotp2);

    
    // upercase lowercase and numeric value print 
    String upperLowerNumeric = "";
     for (int i = 0; i <= 4; i++) {
            if (r.nextInt(2) == 0) {
                int asciUpperLowerDigit = r.nextBoolean() ? ((char) r.nextInt(26) + 65): ((char)(r.nextInt(26) + 97)); 
                upperLowerNumeric = (char)asciUpperLowerDigit + upperLowerNumeric;
            }
            upperLowerNumeric = r.nextInt(10) + upperLowerNumeric; 
        }

        System.out.println("6 digit otp is:" + upperLowerNumeric);



  
    
    } 
}