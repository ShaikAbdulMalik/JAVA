public class math {
    public static void main(String[] args){
        double x = 3.14;
        double y = -10;
        double c = 144;

        double z = Math.max(x,y);//this will show the which number is greaater than the other one
        double w = Math.min(x,y);//this will show the which number is lesser than the other one
        double a = Math.abs(y);//This will show us the absolute value of the number i.e additive inverse
        double b = Math.sqrt(c);//this will show the sqrt of the number given 
        double d = Math.round(x);//This is used to round of the number
        double e = Math.ceil(x);//This is used to round up the number
        double f = Math.floor(x);//This is used to round down the number
        
        System.out.println(z);
        System.out.println(w);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}

