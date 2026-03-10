import java.util.Scanner;

public class mars{
    static float  earthgravityAbdurasulov;// 1float
    static float  marsgravityAbdurasulov=0.38f;// 2float
    static double marsgravitydoubleAbdurasulov;// 1double
    static int    marsgravityintAbdurasulov;// 1 int
    static char   marsgravitycharAbdurasulov;// 1char
    static float  marsgravity2floatAbdurasulov;// 3float
    static int    marsgravity2intAbdurasulov;// 2 integer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// input
        System.out.print("Enter the weight ");// just print out for user
        earthgravityAbdurasulov = sc.nextFloat(); // convert user input to float earth weight
        System.out.println("converting input to float "+earthgravityAbdurasulov);// converting user input to float
        marsgravityAbdurasulov = earthgravityAbdurasulov*marsgravityAbdurasulov;// multiply user  value to 0.38 mars gravity
        marsgravitydoubleAbdurasulov = marsgravityAbdurasulov;// converting value to double
        System.out.println("converting value to double ");//print out for double
        System.out.printf("Your weight on Mars: %.4f\n",marsgravitydoubleAbdurasulov);// the double  value
        marsgravityintAbdurasulov=(int) marsgravitydoubleAbdurasulov;// converting double to  int
        System.out.println("converting value to int "+  marsgravityintAbdurasulov);// print out  int
        marsgravitycharAbdurasulov=(char) marsgravitydoubleAbdurasulov;// converting int to char
        System.out.println("converting value to char but output as in integer "+  (int)marsgravitycharAbdurasulov);// print out  char as in integer
        System.out.println("your weight on mars as in integer "+  (int)marsgravitycharAbdurasulov);// print out 2 integer
        marsgravity2floatAbdurasulov= earthgravityAbdurasulov / marsgravitycharAbdurasulov*marsgravityAbdurasulov;//float calculation to factor user input
        marsgravity2intAbdurasulov =  (int)marsgravity2floatAbdurasulov ; //the final value
        System.out.println("final value your input "+  marsgravity2intAbdurasulov );// final value the same as in user input but after  calculations


    }
}