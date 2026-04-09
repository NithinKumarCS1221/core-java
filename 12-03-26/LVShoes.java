class LVShoes
{
    static String shoeNames[] = {"LV Trainer","LV Run Away","LV Archlight","LV Frontrow","LV Beverly Hills","LV Luxembourg",
"LV Tattoo Sneaker","LV Rivoli Sneaker"};
    static float shoePrice[] = {120000.0f,110000.0f,130000.0f,90000.0f,95000.0f,100000.0f,115000.0f,125000.0f};
    static double shoeRatings[] = {4.6,4.5,4.7,4.4,4.5,4.6,4.5,4.7};
    static String shoeBrand[] = {"Louis Vuitton","Louis Vuitton","Louis Vuitton","Louis Vuitton","Louis Vuitton","Louis Vuitton","Louis Vuitton","Louis Vuitton"};

    public static void getShoeDetails()
    {
        for(int i=0;i<shoeNames.length;i++)
        {
            System.out.println("LVShoesName:"+lvshoesName[i]);
			System.out.println("LVShoesPrice:"+lvshoesPrice[i]);
			System.out.println("LVShoesRatings:"+lvshoesRatings[i]);
			System.out.println("LVShoesBrand:"+lvshoesBrand[i]);
        }
    }
}