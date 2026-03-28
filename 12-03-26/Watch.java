class Watch
{
    static String watchNames[] = {"Rolex Submariner","Casio G-Shock","Fossil Grant","Titan Neo","Apple Watch SE","Samsung Galaxy Watch","Timex Expedition","Michael Kors Watch"};
    static float watchPrice[] = {750000.0f, 8999.0f, 12999.0f, 5999.0f, 29999.0f, 24999.0f, 4999.0f, 18999.0f};
    static double watchRatings[] = {4.9, 4.5, 4.4, 4.3, 4.7, 4.6, 4.2, 4.5};
    static String watchBrand[] = {"Rolex","Casio","Fossil","Titan","Apple","Samsung","Timex","Michael Kors"};
public static void getWatchDetails()
    {
        for(int i=0;i<watchNames.length;i++)
        {
            System.out.println("WatchNames:"+watchNames[i]);
			System.out.println("WatchPrice:"+watchPrice[i]);
			System.out.println("WatchRatings:"+watchRatings[i]);
			System.out.println("WatchBrand:"+watchBrand[i]);
        }
    }
}