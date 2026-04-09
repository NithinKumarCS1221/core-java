class AmazonProducts
{
    static String productNames[] = {"HP Razon Laptop","kawasakiMobile i2","vivio5g",
"Samsang Washing Machine","Sony Speaker","Rolex Smart Watch",Rotater camera"
  };
static float productPrice[] = {65999.5f, 58999.9f, 24999.0f, 32999.8f, 8999.5f, 4999.9f, 74999.0f
  };
static double productRatings[] = {3.5, 5.7, 4.4, 2.3, 3.6, 4.2, 5.8
    };
public static void getAmazonProductDetails()
    {
        for(int i = 0; i < productNames.length; i++)
        {
            System.out.println("Product Name : " + productNames[i]);
            System.out.println("Product Price : " + productPrice[i]);
			System.out.println("Product Rating : " + productRatings[i]);
            System.out.println();
        }
    }
}