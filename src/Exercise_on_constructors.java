class cylinder{
    int radius;
    int height;

    public void setRadius(int l){
        radius = l;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int k){
        height = k;
    }
    public int getHeight(){
        return height;
    }

    public double surfacearea(){
        return 2*22/7*radius*(height+radius);

    }
}

public class Exercise_on_constructors {
    public static void main(String[] args) {

        /*
        cylinder cl = new cylinder();
        cl.setHeight(6);
        cl.setRadius(2);
        System.out.println(cl.getHeight());
        System.out.println(cl.getRadius());
        */

        cylinder se = new cylinder();
        se.setRadius(9);
        se.setHeight(12);
        se.surfacearea();


    }
}
