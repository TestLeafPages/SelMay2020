package challenges;

import org.testng.annotations.Test;

public class FindingAll  extends BaseTestNg {
	String test = "$$ Welcome to 1st Automation Interview $$ ";
	char[] ch = test.toCharArray();
	//public  int  letter = 0, space = 0, num = 0, specialChar = 0;
	@Test(priority=1)
	public void findingAll() {
		for(int i = 0; i < test.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				specialChar ++;
			}}
		System.out.println("$$ Welcome to 1st Automation Interview $$ ");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}
	@Test(priority=2)
	public void findAllCharactesInString() {
		for (int j = 0; j < ch.length; j++) {
			if (((int)ch[j] >= 65 && (int)ch[j] <= 122)){				
				if (!((int)ch[j] >= 91 && (int)ch[j] <= 96)) {
					letter = letter+1;
				}
			}else if (((int)ch[j] >= 48 && (int)ch[j] <= 57)) {
				num = num+1;
			}else {
				specialChar ++;
			}
		}
		System.out.println("letter count: " +letter);
        System.out.println("number count:" + num );
        System.out.println(" special character count:" +specialChar);
		}
	@Test()
	public void usingRegx() {
		
	}
	}









