package ch02;

public class RunAnimalsExam {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Bird bird = new Bird();
		Dog dog = new Dog();
		
		System.out.println(fish.name);//fish
		System.out.println(bird.name);//��
		System.out.println(dog.name);//�����
		fish.run();//fish�� ���Ĩ�ϴ�.
		bird.run();//���� ���󰩴ϴ�.
		dog.run();//����̰� �پ�ϴ�.

	}

}
