class RamenNoodles
{
    static String ramenNoodlesNames[] = {"Nissin Ramen","Samyang Spicy Ramen","Maggi Ramen","Top Ramen Curry","Koka Chicken Ramen","Indomie Mi Goreng","Ottogi Jin Ramen","Mama Shrimp Ramen"};

    static float ramenNoodlesPrice[] = { 120.0f, 180.0f, 90.0f, 110.0f, 150.0f, 140.0f, 170.0f, 130.0f};

    static double ramenNoodlesRatings[] = {4.3,4.6,4.2,4.1,4.4,4.5,4.3,4.2};

    static String ramenNoodlesBrand[] = {"Nissin","Samyang","Maggi","Nissin","Koka","Indomie","Ottogi","Mama"};

    public static void getRamenNoodlesDetails()
    {
        for(int i=0;i<ramenNoodlesNames.length;i++)
        {
            System.out.println("RamenNoodelsNames:"+ramennoodlesName[i]);
			System.out.println("RamenNoodelsPrice:"+ramennoodlesPrice[i]);
			System.out.println("RamenNoodelsRating:"+ramennoodlesRatings[i]);
			System.out.println("RamenNoodlesBrand:"+ramennoodlesBrand[i]);
        }
    }
}