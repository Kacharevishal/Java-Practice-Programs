public class ProfitLoss {

	public static void main(String[] args) {

		double sellingPrice = 2500;
		double costPrice = 2000;
		double remaningPrice = sellingPrice - costPrice;

		if (sellingPrice > costPrice) {
			System.out.println("Yor are profitable with: " + remaningPrice);
		} else if (sellingPrice < costPrice) {
			System.out.println("You are Lossable With: " + remaningPrice);

		} else {
			System.out.println("No Profit Or No Loss");

		}
	}
}
