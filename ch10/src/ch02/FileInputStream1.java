package ch02;

public class FileInputStream1 implements AutoCloseable {
	private String file;
	
	//생성자
	public FileInputStream1(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file+"을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file+"을 닫습니다.");
		
	}


}
