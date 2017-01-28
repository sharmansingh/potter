package com.potter.game;
import java.util.ArrayList;
import java.util.List;
/***
 * 
 * @author Sharman Singh Sengar
 * @version 1.0.
 * @description:This class is written for Potter game
 *
 */
public class PotterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PotterGame tt = new PotterGame();
		List ls = new ArrayList<Integer>();
		ls.add(1);  //2 copies of the first book
		ls.add(1);
		ls.add(2);  //2 copies of the second book
		ls.add(2);
		ls.add(3);  //2 copies of the third book
		ls.add(3);
		ls.add(4);  // 1 copy of the fourth book
		ls.add(5);  //1 copy of the fifth book

		// Double dl=(Double)tt.calculatePrice(ls);
		System.out.println(tt.calculatePrices(ls)+" EUR");

	}

	double[] discntRates = { 1, 0.95, 0.90, 0.80, 0.75 };
	int[] discount = new int[5];
/**
 * 
 * @param order
 * @return double
 * @method calculatePrices
 * @description this method is used to calculate price of order
 * 
 */
	public Double calculatePrices(List<Integer> order) {
		if (order == null || order.isEmpty())
			return 0.0;
		int[] booksInOrder = calculateBooksInOrders(order);
		calculateDiscount(booksInOrder);
		optimizeDiscount();
		double price = 0.0;
		for (int i = 0; i < discount.length; i++)
			price += (8 * (i + 1) *

					discount[i]) * discntRates[i];
		return price;
	}
/**
 * @method This method is written for optimized discount
 * @return void
 */
	protected void optimizeDiscount() {
		while (discount[2] > 0 && discount[4] > 0) {
			discount[2]--;
			discount[4]--;
			discount[3] += 2;
		}
	}
/**
 * @method calculateDiscount
 * @param booksInOrder
 * @description :This method is used to calculate discounts on bookorder
 */
	protected void calculateDiscount(int[] booksInOrder) {
		if (booksInOrder == null)
			return;

		int differentFromZero = 0;
		for (int i = 0; i < booksInOrder.length; i++) {
			if (booksInOrder[i] > 0) {
				differentFromZero++;
				booksInOrder[i]--;
			}
		}
		if (differentFromZero > 0) {
			discount[differentFromZero - 1] += 1;
			calculateDiscount(booksInOrder);
		}
	}
/**
 * 
 * @param order
 * @return
 */
	private int[] calculateBooksInOrders(List<Integer> order) {
		int[] result = new int[5];
		for (int book : order)
			result[book - 1]++;
		return result;
	}

}
