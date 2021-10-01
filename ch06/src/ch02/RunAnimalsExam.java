package ch02;

public class RunAnimalsExam {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Bird bird = new Bird();
		Dog dog = new Dog();
		
		System.out.println(fish.name);//fish
		System.out.println(bird.name);//»õ
		System.out.println(dog.name);//´ó´óÀÌ
		fish.run();//fish°¡ Çì¾öÄ¨´Ï´Ù.
		bird.run();//»õ°¡ ³¯¶ó°©´Ï´Ù.
		dog.run();//´ó´óÀÌ°¡ ¶Ù¾î°©´Ï´Ù.

	}

}
