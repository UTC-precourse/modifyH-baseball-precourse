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
        	System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
			System.out.print("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���");
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