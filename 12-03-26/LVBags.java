class LVBags
{
    static String bagNames[] = {"LV Speedy","LV Neverfull","LV Alma","LV Capucines","LV Twist",
        "LV Dauphine","LV Pochette","LV Petite Malle"};
    static float bagPrice[] = {150000.0f, 180000.0f, 210000.0f, 450000.0f, 300000.0f, 280000.0f, 95000.0f, 500000.0f};
    static double bagRatings[] = {4.8,4.7,4.9,4.8,4.6,4.7,4.5,4.9};
	static String bagBrand[] = {"Louis Vuitton","Louis Vuitton","Louis Vuitton","Louis Vuitton",
        "Louis Vuitton","Louis Vuitton","Louis Vuitton","Louis Vuitton"};
    public static void getBagDetails()
    {
        for(int i=0;i<bagNames.length;i++)
		 {
            System.out.println("LVBagsName:"+lvbagsName[i]);
			System.out.println("LVBagsPrice:"+lvbagsPrice[i]);
			System.out.println("LVBagsRatings:"+lvbagsRatings[i]);
			System.out.println("LVBagsBrand:"+lvbagsBrand[i]);
         }
    }
}