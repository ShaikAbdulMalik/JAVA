public class mix {
    public static void main (String[] args)
    {
        String x = "Water";
        String y = "Tang";
        String temp;

        temp = x;
        x = y;
        y = temp; //This changed the values of x and y respectivley
        // x = y; both gives Tang
        // y = x; both gives Water

        System.out.println("x : "+x);
        System.out.println("y : "+y);

    }
}
