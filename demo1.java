import java.util.Random;
public class SpecialSymbolOtp{
	public static void main(String[]args){
		Random rand = new Random();
		String upperLowerDigitSpecialSym = "";
		int specialSymbolRange[] = {33, 47, 58, 64, 91, 96, 123, 126};
		for(int i=0;i<=5;i++){
			 if (r.nextInt(4) == 0) {
                int asciUpperLowerDigit = r.nextBoolean() ? ((char) r.nextInt(26) + 65): ((char)(r.nextInt(26) + 97)); 
                upperLowerNumeric = (char)asciUpperLowerDigit + upperLowerNumeric;
            }else if{
            upperLowerNumeric = r.nextInt(10) + upperLowerNumeric;
			}else{
				int ascii = specials[r.nextInt(specials.length)];
              upperLowerDigitSpecialSym = (char) ascii + upperLowerDigitSpecialSym;
			}
			System.out.println("Special Symbol 6-digit otp is: "+upperLowerDigitSpecialSym);
		}
	}
}