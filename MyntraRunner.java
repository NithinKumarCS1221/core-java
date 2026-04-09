 class MyntraRunner 
{
	public static void main(String[] args) 
	{
		// Create an instance of the Myntra class
		Myntra myntraApp = new Myntra();

		String productToBuy = "Headphones";
		int quantity = 3;

		System.out.println("--- Welcome to Myntra Shopping ---");

		// 1. Fetch the price
		double unitPrice = myntraApp.getPriceByProduct(productToBuy);

		if (unitPrice > 0) 
		{
			// 2. Calculate total based on quantity
			double totalAmount = myntraApp.getTotal(unitPrice, quantity);
			
			// 3.