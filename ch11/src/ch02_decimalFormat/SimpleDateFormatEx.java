package ch02_decimalFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일은 올해의 D째일 이고"
    		            + ",올해의 w째주에 속하고, 이달의 W째주입니다.");
    String strDate = sdf.format(new Date());
    System.out.println(strDate);
}
}