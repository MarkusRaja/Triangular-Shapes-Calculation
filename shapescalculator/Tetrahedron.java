package shapescalculator;

public class Tetrahedron extends EquilateralTriangle {
    private double edge;
    private double tperimeter;
    private double tharea;
    private double thvolume;
    private double thperimeter;
    public Tetrahedron(double inpSidea, double inpSideb, double inpSidec, double inpTheight){
        super(inpSidea, inpSideb, inpSidec, inpTheight);
        this.edge = inpSideb;
    }

    public void area(){
        this.tharea = Math.pow(edge, 2) * Math.sqrt(3);
    }
    public double getTharea(){
        this.area();
        return tharea;
    }
    public void volume(){
        this.thvolume = (Math.pow(edge, 3) * Math.sqrt(2))/12;
    }
    public double getThvolume(){
        this.volume();
        return this.thvolume;
    }
    public double getPerimeter(){
        this.tperimeter = super.getPerimeter();
        this.thperimeter = tperimeter * 2;
        return thperimeter;
    }
}
