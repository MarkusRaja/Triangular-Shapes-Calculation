package shapescalculator;

public class EquilateralTriangle extends Triangle {
    private double sidea;
    private double sideb;
    private double sidec;
    private double theight;
    private double tarea;
    private double tperimeter;
    public void setSidea(double sda){
        this.sidea = sda;
    }
    public double getSidea(){
        return this.sidea;
    }
    public double getSideb(){
        return this.sideb;
    }
    public double getSidec(){
        return this.sidec;
    }
    public double getTheight(){
        return this.theight;
    }
    public void setTheight(double inpTheight){
        this.theight = inpTheight;
    }
    public EquilateralTriangle(double inpSidea, double inpSideb, double inpSidec, double inpTheight){
        super(inpSidea, inpSideb, inpSidec, inpTheight);
        this.sidea = inpSidea;
        this.sideb = inpSideb;
        this.sidec = inpSidec;
        this.theight = inpTheight;
    }
    public void setSidec(double inpSidec){
        this.sidec = inpSidec;
    }
    public void setTheightzero(){
        this.theight = 0;
    }
    public double pythatheight(double inpSideb){
        this.theight = Math.sqrt(Math.pow(sidec, 2) - Math.pow((inpSideb/2), 2));        
        return theight;
    }
    public void area(){
        this.tarea = 0.5 * sideb * theight;
    }
    public double getArea(){
        this.area();
        return this.tarea;
    }
    public void perimeter(){
        this.tperimeter = sidea * 3;
    }
    public double getPerimeter(){
        this.perimeter();
        return this.tperimeter;
    }
}
