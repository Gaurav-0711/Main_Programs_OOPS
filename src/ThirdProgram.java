import java.util.Scanner;

public class ThirdProgram
{
    public static void main(String[] args)
    {
        Boolean t;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter height , radius and colour");
        cylinder c1=new cylinder(obj.nextFloat(),obj.nextFloat(),obj.next());
        System.out.println("Enter height , radius and colour");
        cylinder c2=new cylinder(obj.nextFloat(),obj.nextFloat(),obj.next());
        t=c1.equals(c2);
        if(t==true){
            System.out.println("similar");
            System.out.println("the area of cylinder="+c1.get_area()+"\t"+c2.get_area()+"\nthe volume of cylinder="+c1.get_Volume()+"\t"+c2.get_Volume()+"\narea of a circle="+ c1.get_superarea()+"\t"+c2.get_superarea()+"\nColour = "+c1.colour+"\t"+c2.colour);
        }
        else{
            System.out.println("not similar");
            System.out.println("the area of cylinder="+c1.get_area()+"\t"+c2.get_area()+"\nthe volume of cylinder="+c1.get_Volume()+"\t"+c2.get_Volume()+"\narea of a circle="+ c1.get_superarea()+"\t"+c2.get_superarea()+"\nColour = "+c1.colour+"\t"+c2.colour);
        }
    }


}

class circle
{
    double radius;
    String colour;
    circle()
    {
        radius = 1.0;
        colour = "red";
    }
    circle(double radius , String colour)
    {
        this.radius =radius;
        this.colour=colour;
    }
    double getRadius()
    {
        return radius;
    }
    double get_area()
    {
        return (radius*radius*Math.PI);
    }
}

class cylinder extends circle
{
    double height;
    cylinder()
    {
        super();
        height = 1;
    }
    cylinder(double height,double radius,String colour)
    {
        super(radius,colour);
        this.height=height;
    }
    double getHeight()
    {
        return  height;
    }
    double get_area()
    {
        return 2*Math.PI*radius*height+2*super.get_area();
    }
    double get_Volume()
    {
        return super.get_area()*height;
    }
    double get_superarea()
    {
        return super.get_area();
    }
    public Boolean equals(cylinder c){
        if(c.get_Volume()==this.get_Volume()&& c.get_area()==this.get_area()&& c.colour.equals(this.colour)){
            return true;
        }
        return false;
    }
}