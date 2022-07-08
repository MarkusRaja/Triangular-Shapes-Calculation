package shapescalculator;
public abstract class Triangle{
    double sidea;
    double sideb;
    double sidec;
    double theight;
    double tarea;
    double tperimeter;
    public Triangle(double inpSidea, double inpSideb, double inpSidec, double inpTheight){
        this.sidea = inpSidea;
        this.sideb = inpSideb;
        this.sidec = inpSidec;
        this.theight = inpTheight;
    }
    public abstract double pythatheight(double inpSideb);
    public abstract double getSidea();
    public abstract double getSideb();
    public abstract double getSidec();
    public abstract double getTheight();
    public abstract double getArea();
    public abstract double getPerimeter();
}