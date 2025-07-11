import java.util.Random;
public class RandomClassUse{
	public static void main(String[]args){
		Random r = new Random();
		String otp = "";
        for(int  i=1; i<=4;i++){
            int digit = r.nextInt(10);
            otp = digit + otp;

		}
		 System.out.println("4 digit otp is:"+otp);
      
      String upperCase = "";
       for( int i=0;i<=6;i++){
        int upper = (char)r.nextInt(26)+65;
        upperCase = upper+upperCase;
		}
		System.out.println("6 digit otp is:"+upperCase);

	}
}
