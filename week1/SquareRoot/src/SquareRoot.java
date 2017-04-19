/**
 * Created by User on 23/02/2017.
 */
public class SquareRoot {

    public static void main (String args[]) {

        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double x1= 0.0;
        double x2 = 0.0;



        if(a == 0 && b == 0) {
            System.out.println("x1=\n" + "x2=");
        } else if (a == 0 && b != 0 && c == 0) {
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }else if(a == 0 && b == 0 && c == 0) {
            System.out.println("x1=\n" + "x2=");
        }
        else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant < 0) {
                System.out.println("x1=\n" + "x2=");
            }

            else if(discriminant > 0) {
                x2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
                x1 =((-b) + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
            else {
                x1 = (-b) / (2 * a);
                x2 = x1;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }


        }

    }

}




