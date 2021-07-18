package com.encore.relation.test;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame{
	public static void main(String[] args) {		
		DrawShape win = new DrawShape("도형 그리기");
	}	
	public void paint(Graphics g){
		Point[ ] p = {new Point(100,100),
				new Point(140,50),
				new Point(200,100)
				
		};
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150), 50);
		
		g.drawOval(c.center.x,c.center.y, c.r, c.r);
		
		g.drawLine(t.p[0].x,t.p[0].y, t.p[1].x, t.p[1].y);
		g.drawLine(t.p[1].x,t.p[1].y, t.p[2].x, t.p[2].y);
		g.drawLine(t.p[2].x,t.p[2].y, t.p[0].x, t.p[0].y);
	}
	
	public DrawShape(String title) {
		super(title);
		setSize(500,300);//Frame
		setBackground(Color.YELLOW);
		setVisible(true);//Frame
	}
}

class Point{//점을 의미하는 클래스
	int x;
	int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		this(0,0); //또 다른 생성자로 호출이 들어가므로 위의 Point클래스로 들어감
		
	}	
}

class Circle{
	//1) extends Point  ? //Circle is a point가 말이 안됨. 추상화를 만족시키지 않음.
	//2) Point p   ? //Hasing  사용해야함. 수평적 관계
	
	Point center;
	int r;
	
	public Circle() {
		this(new Point(0,0),100); //생성자 오버로딩
	}
	
	public Circle(Point center, int r) {
		//super();//super는 object. 무조건 존재. 생략가능
		this.center = center;
		this.r = r;
	}
	
}

class Triangle{
	Point[ ] p = new Point[3];

	public Triangle(Point[] p) {
		super();
		this.p = p;
	}
	public Triangle(Point p1,Point p2,Point p3 ) {
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
	}	
}






