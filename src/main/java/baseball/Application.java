package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        while(true) {
        	BaseballGame BBG= new BaseballGame();
        	do{
        		BBG.userInput(scanner);
        	}while((!BBG.compareNum()));
        	System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
			System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        	int restartNum = scanner.nextInt();
        	if(restartNum==2) {
        		break;
        	}
        	else {
        		continue;
        	}
        }
        
    }
}