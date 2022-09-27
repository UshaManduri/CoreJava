package com.inter;

public class Painter {
	
	public static void main(String[] args) {
		Rectangle_111 r = new Rectangle_111(10.1 , 20.2);
		r.area();
		r.perimeter();
		r.printlb();

	Square_112 s = new Square_112(10);
	s.area();
	s.perimeter();
	s.printS();

	Circle_112 c = new Circle_112(10);
	c.area();
	c.perimeter();
	c.printRadius();
	}
}
