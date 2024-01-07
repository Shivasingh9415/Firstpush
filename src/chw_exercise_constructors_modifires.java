class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius ){
        radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int height){
        height = height;
    }

    public int getHeight(){
        return height;
    }


}

public class chw_exercise_constructors_modifires {
    public static void main(String[] args) {
        Cylinder mycylinder = new Cylinder();
        mycylinder.setHeight(34);
        System.out.println(mycylinder.getHeight());

    }
}
