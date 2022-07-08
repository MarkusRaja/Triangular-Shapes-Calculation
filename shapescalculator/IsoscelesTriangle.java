package shapescalculator;

public class IsoscelesTriangle extends EquilateralTriangle {
    private double tsideac;
    private double sideb;
    private double tarea;
    private double tperimeter;
    private double theight;
    private double l;
    private double th;
    public IsoscelesTriangle(double inpSidea, double inpSideb, double inpSidec, double inpTheight){
        super(inpSidea, inpSideb, inpSidec, inpTheight);
        this.tarea = super.getArea();
        this.theight = inpTheight;
        this.tsideac = inpSidec;
        this.sideb = inpSideb;
    }
    public double getTsideac(){
        return tsideac;
    }
    public double pythatheight(double inpSideb){
        this.theight = super.pythatheight(inpSideb);
        return this.theight;
    }
    public void setTheight(double inpTheight){
        this.theight = inpTheight;
    }
    public double pythatsideac(double inpSideb){
        tsideac = Math.sqrt(Math.pow(theight, 2) + Math.pow((inpSideb/2), 2));
        return tsideac;
    }
    @Override
    public double getArea(){
        this.tarea = super.getArea();
        return this.tarea;
    }
    public double getArea1(double tarea1, double length, double theight){
        l = length;
        th = theight;
        tarea1 = 0.5 * l * th;
        return tarea1;
    }
    public void setSideb(double height){
        this.sideb = height;
    }
    public void perimeter(double tsideac, double sideb){
        this.tperimeter = (tsideac * 2) + sideb;
    }
    public double getItperimeter(){
        this.perimeter(tsideac, sideb);
        return this.tperimeter;
    }
    public double getItperimeter1(){
        return this.tperimeter;
    }
}
