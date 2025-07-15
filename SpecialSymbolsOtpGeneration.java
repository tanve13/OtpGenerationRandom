import java.util.Random;
public class SpecialSymbolsOtpGeneration{
	public static void main(String[]args){
		Random rand = new Random();
		String upperLowerDigitSpecialSym = "";
		int specialSymbolRange[] = {  33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,  
                                         58,59,60,61,62,63,64,                          
                                           91,92,93,94,95,96,                               
                                           123,124,125,126};
		for(int i=1;i<=6;i++){
			 if (rand.nextInt(4) ==0) {
                int asciUpperLowerDigit = rand.nextBoolean()?((char)(rand.nextInt(26)+65)):((char)(rand.nextInt(26)+97)); 
                upperLowerDigitSpecialSym = (char)asciUpperLowerDigit+upperLowerDigitSpecialSym;
            }else if(rand.nextInt(2)==0){
            upperLowerDigitSpecialSym =rand.nextInt(10)+upperLowerDigitSpecialSym;
			}else{
				int asciiSymbol =specialSymbolRange[rand.nextInt(specialSymbolRange.length)];
              upperLowerDigitSpecialSym =(char)asciiSymbol+upperLowerDigitSpecialSym;
			}
		}
					System.out.println("Special Symbol 6-digit otp is: "+upperLowerDigitSpecialSym);

	}
}