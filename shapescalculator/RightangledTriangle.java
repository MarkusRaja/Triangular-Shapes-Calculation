package shapescalculator;

public class RightangledTriangle extends IsoscelesTriangle{
    private double sidea;
    private double sideb;
    private double sidec;
    private double tarea;
    private double tperimeter;
    private double sidebclone;
    public RightangledTriangle(double inpSidea, double inpSideb, double inpSidec, double inpTheight){
        super(inpSidea, inpSideb, inpSidec, inpTheight);
        this.sidea = inpTheight;
        this.sideb = inpSideb;
        this.sidec = inpSidec;
    }
    public double pythatheight(double inpSideb){
        sidebclone = inpSideb * 2;
        sidea = super.pythatheight(sidebclone);
        sidebclone = sidebclone / 2;
        return sidea;
    }
    public double getSidea(){
        return sidea;
    }
    public double pythatsideac(double inpSideb){
        sidebclone = inpSideb * 2;
        this.sidec = super.pythatsideac(sidebclone);
        sidebclone = sidebclone / 2;
        return this.sidec;
    }
    public double getArea(){
        this.tarea = super.getArea();
        return tarea;
    }
    public void perimeter(){
        this.tperimeter = sidea + sideb + sidec;
    }
    public double getPerimeter(){
        this.perimeter();
        return tperimeter;
    }
}
