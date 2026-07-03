public class logical {
    public static void main (String args[]){


        int a = 10;
        int  b = 5;
        int x= 30;
        int y = 20;

        // && -> And Operator
        // used for Both the conditions are true if one false it will print false 
        boolean result1 = a > b && x> y;  //True
        boolean result2 = a<b && x < y ; // False
        boolean result3 = a>b && x < y ; // False

        // || -> ORT Used for if one conditiobn true it will print true if both the condition are false it will print false

        boolean result4 = a > b || x> y;  //True
        boolean result5 = a<b || x< y ; // False
        boolean result6 = a>b || x < y ; // True

        // ! -> Not use for reverse the resule If the result is true use the not symbol it will print false 

        boolean result7 = !result1; // False
        boolean result8 = !result2; // True
        System.out.println("And &&");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(" || OR");
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println("! NOT ");
        System.out.println(result7);
        System.out.println(result8);
    }
}
