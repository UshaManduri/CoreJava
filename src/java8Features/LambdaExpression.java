package java8Features;

public class LambdaExpression {

	public static void main(String[] args) {
		int width = 10;
	
		//without lambda
		Drawble d = new Drawble() {

			@Override
			public void draw() {
				System.out.println("drawing: "+width);
			}
		};
		d.draw();
	
		//with lambda
		Drawble d1 = () -> {
			System.out.println("drawing using labmda: "+width);
		};
		d1.draw();
	}
}
