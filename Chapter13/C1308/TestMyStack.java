package PackageChapter13;

public class TestMyStack {

	public static void main(String[] args) throws CloneNotSupportedException {

		MyStack stack1 = new MyStack();

		stack1.push(3);
		stack1.push(4);
		stack1.push(5);

		MyStack stack2 = (MyStack) stack1.clone();

		stack1.pop();

		System.out.println("Stack1 --> " + stack1);
		System.out.println("Stack2 --> " + stack2);
		System.out.println("Are they equal? --> " + (stack1 == stack2));
	}
}
