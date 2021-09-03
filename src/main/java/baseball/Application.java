package baseball;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		while(true) {
			BaseballGame BBG = new BaseballGame();
			do{
				BBG.userInput(scanner);
			}while((!BBG.compareNum()));
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
			System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
			int restartNum = scanner.nextInt();   // 입력값에 대한 예외처리 하기
			if(restartNum==2) {  // 상수 하드코딩 하지 말기
				break;
			}
			else {
				continue;
			}
		}

	}
}