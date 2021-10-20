package ch03;

import java.io.File;

//파일정보 클래스 File
public class FileEx {
public static void main(String[] args) {
//파일 정보 얻기 File 변수 = new File(경로\\파일명);
File f1 = new File("c:\\windows\\system.ini");
//파일경로 getPath(), 디렉토리 경로 getParent(), 파일명 getName()
 System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
String res = "";
//파일인지 여부 확인 isFile()
if(f1.isFile()) res="파일";
//디렉토리인지 여부 확인 isDirectory()
else if(f1.isDirectory()) res="디렉토리";
System.out.println(f1.getPath() + "은 " + res + "입니다.");

System.out.println("------- 디렉토리 내용 출력 ----------------");
File f2 = new File("c:\\temp\\java_sample");//디렉토리
//파일 존재여부 확인 exists()
if(!f2.exists()) {//파일 정보가 없으면 
	f2.mkdir();//생성 - 디렉토리로 생성 mkdir()
}
//내용 출력
listDirectory(new File("c:\\temp"));

//디렉토리명 변경 - 파일명 변경 renameTo(새로운 파일 정보);
f2.renameTo(new File("c:\\temp\\javasample"));

}
public static void listDirectory(File dir) {
	System.out.println("----------" + dir.getPath() + "의 서브디렉토리입니다.");
	File[] subFiles = dir.listFiles();//디렉토리내 파일 리스트를 File배열로 리턴
	for(int i=0; i<subFiles.length; i++) {
		File f = subFiles[i];
		long t = f.lastModified();//생성된 일시 리턴(수정된 일시), 1970,1,1,0,0,0
		System.out.print(f.getName());//파일명
		System.out.print("\t파일 크기:" + f.length());//파일사이즈
		System.out.printf("\t수정한 시간:%tb %tb %ta %tT\n",t,t,t,t);//%tb:월 %tb:일 %ta:요일 %tT:시간
	}
}
}
