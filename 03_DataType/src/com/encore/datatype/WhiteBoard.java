package com.encore.datatype;

/*
 * 1. �ʵ�
 * 	  int ������, char �÷�, float ����, String ���� ȸ��, String ����
 *    ��ũ��ġ ���θ� �� �� �ִ� �ʵ� �߰�
 * 
 * 2. �޼ҵ�
 *    2�� ����
 *    - ���� Test Ŭ�������� �޾Ƽ� �ʵ忡 �Է��ϴ� ���
 *    - �ʵ忡 �Էµ�, ����� ���� �ܼ�â���� ����ϴ� ���
 *    
 *  1. ���� (Variable�� ���Ǵ� ��ġ�� ���� ������ �����ǰ� Field�� Local ������ ���еȴ�)
 *     �ʵ� --> Ŭ���� ���� �ٷ� ��, �޼ҵ� block �ٱ�
 *     local ����(���� ����) --> �޼ҵ� �ȿ��� ����
 *  2. 
 */
public class WhiteBoard {
	public int size;
	public char color;
	public float price;
	public String company;
	public String material;
	public boolean scratch;//�������(Ŭ���� ��ü���� ���)
	
	public void setInfo(int size, char color, float price, String company, String material, boolean scratch){
		//�ʵ�� ���ú����� �̸��� ���� ��, �����ϱ� ���� �ʵ� �� this ���δ�.
		//this�� �ش� Ŭ���� �ڱ� �ڽ�..������ �ؼ�
		this.size = size;
		this.color = color;
		this.price = price;
		this.company = company;
		this.material = material;
		this.scratch = scratch;//���ú���(�ش� ���������� ���)
	}
	
	
	public void printInfo() {
		System.out.println(size+"\t"+color+"\t"+price+"\t"+company +"\t"+ material+"\t"+scratch);
		
	}

}
