class ApplephoneRunner{

    public static void main(String[] args) {
        
        Applephone.refInt = 12345;
        Applephone.refFloat = 453.54f;       
        Applephone.refByte = 44;             
        Applephone.refDouble = 45.6780000;
        Applephone.refLong = 7564894321L;
        Applephone.refBoolean = true;
        Applephone.refString = "iphone";     
        Applephone.refChar = '5';            

        
        System.out.println("Int value : " + Applephone.refInt);
        System.out.println("Byte : " + Applephone.refByte);
        System.out.println("Short : " + Applephone.refShort);
        System.out.println("Float : " + Applephone.refFloat);
        System.out.println("Double : " + Applephone.refDouble);
        System.out.println("Long : " + Applephone.refLong);
        System.out.println("Boolean : " + Applephone.refBoolean);
        System.out.println("String : " + Applephone.refString);
        System.out.println("Char : " + Applephone.refChar);
    }
}