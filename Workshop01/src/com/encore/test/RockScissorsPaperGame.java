package com.encore.test;

import java.util.Scanner;

public class RockScissorsPaperGame {

	public static int game() { 
		// ���������� ���� �޼ҵ� 
		System.out.println("����(1)����(2)��(3) �ϳ� �� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt(); // ����ڰ� "����", "����", "��" �� �Է�
		int com = (int) (Math.random() * 3 +1); // ��ǻ�Ͱ� 1~3 ���� ����
		
		if (user == com) { // ��� ��� 0�� ����
			System.out.println("�����ϴ�!!!");
			return 0;
		} else if ((user==1&& com==3) || (user==2&&com==1) || (user==3&&com==2)) { // ����ڰ� �̱� ��� 1�� ����
			System.out.println("����ڰ� �̰���ϴ�!!!");
			return 1;
		} else { // ����ڰ� �� ��� -1�� ����
			System.out.println("����ڰ� �����ϴ�.!!");
			return -1;
		}
	}
	
	public static void printFinalResult(int userWin, int comWin, int draw) {
		// ���� ��� ����Ʈ �޼ҵ� (��, �ºΰ� ���� ���� ��� �ٽ� �����Ѵ�)
		if (userWin == comWin) { 
			System.out.println("�ºΰ� ���� �ʾ� ������ �̱� ������ ������ ����մϴ�.");
			while (userWin == comWin) { // ����� �¸��� ��ǻ�� �¸��� �޶����� �ݺ��� ����
				int score = game();
				switch (score) {
				case 0 : draw += 1; break; 
				case 1: userWin += 1; break; 
				case -1: comWin += 1; break; 
				}
			}
		}
		if (userWin > comWin) {
			System.out.println("### ����� ��!!!");
			System.out.println("�̱� Ƚ�� : " + userWin + " ȸ");
			System.out.println("�� Ƚ�� : " + comWin + " ȸ");
			System.out.println("��� Ƚ�� : " + draw + " ȸ");
		}
		if (userWin < comWin) {
			System.out.println("### ��ǻ�� ��!!!");
			System.out.println("�̱� Ƚ�� : " + userWin + " ȸ");
			System.out.println("�� Ƚ�� : " + comWin + " ȸ");
			System.out.println("��� Ƚ�� : " + draw + " ȸ");
		}
	}

	public static void main(String[] args) {
		// ���� �޼ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3�� 2��");
		System.out.println("3. 1�� 1��");
		int choice = sc.nextInt(); // 1~3������ ���������� ��� ����
		int userWin = 0; // ����ڰ� �̱� Ƚ��
		int comWin = 0; // ��ǻ�Ͱ� �̱� Ƚ��
		int draw = 0; // ��� Ƚ��
		
		int [ ] gameCycle = {5, 3, 1}; // 5��, 3��, 1��
		int [ ] fastWin = {3, 2, 1}; // 3��, 2��, 1��
			for (int i = 0; i < gameCycle[choice-1]; i++) { 
				// choice(1~3��)�� -1 �ؼ� �迭�� �ε����� Ȱ�� // �̿� ���� �ݺ��� 5��, 3��, 1�� ����
				int score = game();
				switch (score) {
				case 0: draw += 1; break;
				case 1: userWin += 1; break;
				case -1: comWin += 1; break;
				}
				if(userWin == fastWin[choice-1] || comWin == fastWin[choice-1]) break;
				// 5��, 3��, 1�� ���ӿ��� 3��, 2��, 1�� ���� ��� ���� ���� ����
			}
		printFinalResult(userWin, comWin, draw);
		}
	}