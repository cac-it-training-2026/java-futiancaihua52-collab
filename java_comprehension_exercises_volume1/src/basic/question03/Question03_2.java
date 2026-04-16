package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		// TODO:ここに実装
		int baseprice = 1200;
		int tickets = 3;
		int reducedPrice= baseprice-200;
		
		int reduseTicket= tickets--;
		int totalprice= reducedPrice*reduseTicket;
		double taxRate=1.1;
		int totalWithTax= (int)(totalprice*taxRate);
				 
		
		System.out.println("購入可能枚数は"+reduseTicket+"です。");
		System.out.println("値下げ後の1枚当たりの料金は"+ totalprice+"です。");
		System.out.println("合計金額（税抜）は"+totalprice+"です。");
		System.out.println("合計金額（税込）は"+totalWithTax +"です。");
		
	}
}
