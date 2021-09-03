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
        	//여기 부분은 안보이게 함수나 객체 안에 메소드로 넣으면 더 좋았을 것 같습니다.
        	System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
			System.out.print("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���");
        	int restartNum = scanner.nextInt();
        	if(restartNum==2) {
        		break;
        	}
//			continue 없어도 잘 작동할것 같아요
//        	else {
//        		continue;
//        	}
        }
        
    }
}