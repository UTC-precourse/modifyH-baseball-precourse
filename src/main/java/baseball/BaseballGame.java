package baseball;

import utils.RandomUtils;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class BaseballGame {
	private int[] gameRandomNum = new int [3];
	private int[] userInputNum = new int [3];
	public BaseballGame() {
		int Rnum=0;
		while(gameRandomNum[0]==gameRandomNum[1]||gameRandomNum[1]==gameRandomNum[2]||gameRandomNum[0]==gameRandomNum[2]) {
			for(int i = 0;i<gameRandomNum.length;i++) {
				Rnum = RandomUtils.nextInt(1, 9);
				gameRandomNum[i] = Rnum;
			}
		}

		//이런 부분은 다른게 바꿀수 있지 않을까요. 인텔리 제이를 사용하면 alt + enter를 누르면 코드를 자동으로 수정할수 있어요 나중에 꼭 사용해보세요
		Arrays.fill(userInputNum, 0);
	}
	
	public void userInput(Scanner sc) {
		String input;
		System.out.print("숫자를 입력해주세요 : ");
		input = sc.next();
		if(input.length()==3) {
			for(int i = 0;i<userInputNum.length;i++) {
				userInputNum[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
			}
		}
		else {
			throw new IllegalArgumentException("잘못된 입력입니다. 다시 입력하세요.");
		}
	}
	
	
	public boolean compareNum() {
		int strike = 0, ball = 0;
		for(int i = 0; i<gameRandomNum.length;i++) {
			if(userInputNum[i]==gameRandomNum[i]) {
				strike++;
			}
			if(compareArray(userInputNum,gameRandomNum[i])) {
				ball++;
			}
		}
		ball-=strike;
		if(strike==3) {
			System.out.println(strike+"스트라이크");
			return true;
		}
		else if(strike!=0||ball!=0){
			System.out.println(ball+"볼 "+strike+"스트라이크");
			return false;
		}
		else {
			System.out.println("낫싱");
			return false;
		}
	}
	
	public boolean compareArray(int[] array,int keyNum) {
		boolean checkBool = false;

		//stream을 사용하면 더 좋지 않았을까 싶어요
		OptionalInt res = Arrays.stream(array).filter(a -> a == keyNum).findAny();
		//밑에 코드를 이렇게 줄일수 있어요

//		for(int i = 0;i<array.length;i++) {
//			if(array[i]==keyNum) {
//				checkBool = true;
//			}
//		}
		return res.orElse(0) != 0;
	}
	//새로운 랜덤 숫자를 생성해야할 때는 매번 새로운 객체를 다시 생성해야하는데 좀더 재사용 가능한 객체로 만들어보는것도 좋을 것 같다는 생각이들어요

}
