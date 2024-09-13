package lesson12_api;

import java.text.DecimalFormat;
import java.text.ParseException;
//보통 DB나 JS에서 처리함..
public class DecimalFormatEx{
	public static void main(String[] args) throws ParseException {
		//format : 원시 > 문자열
		//parse : 문자열 > 원시
		double[] scores = {9999990.555, 888888880.6666, 700.7777, 6000.66666666, 50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(double d : scores) {
			System.out.println(df.format(d));
		}
		
		Number number = df.parse("99a.99a99");
		double dou = number.doubleValue();
		System.out.println(dou);
	}

}
