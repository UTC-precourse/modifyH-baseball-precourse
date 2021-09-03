package baseball;

import utils.RandomUtils;

import java.util.Arrays;
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
		for(int i = 0;i<userInputNum.length;i++) {
			userInputNum[i] = 0;
		}
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
		for(int i = 0;i<array.length;i++) {
			if(array[i]==keyNum) {
				checkBool = true;
			}
		}
		return checkBool;
	}
}