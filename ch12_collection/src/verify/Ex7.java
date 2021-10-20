package verify;

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
public static void main(String[] args) {
	BoardDao dao = new BoardDao();
	//인스턴스의 메소드 호출 - 참조변수.메소드명(); 리턴값 -리턴 타입
	List<Board> list = dao.getBoardList();
	for(Board board:list) {
		System.out.println(board.getTitle()+"-"+board.getContent());
	}
 }
}
class BoardDao{
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		return list;
	}
}