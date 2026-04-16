package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("商品の名前と値段を入力してください。");
		
		String itemname= br.readLine();
		String priceInput = br,readLine();
		
		int itemPrice= Integer.parseInt(priceInput);
		
		System.out.println("商品の名前は"+ itemname +"です");
		System.out.println("商品の値段は"+ itemPrice +"円です");
		
		

	}
}
