package shapescalculator;

public class Triangularprism extends Pyramid {
    private double tpheight;
    private double rarea;
    private double rarea1;
    private double tarea;
    private double tperimeter;
    private double theight;
    private double sideb;
    private double sideac;
    private double tparea;
    private double tpvolume;
    private double tpperimeter;
    public void setTpheight(double inpTpheight){
        this.tpheight = inpTpheight;
    }
    public Triangularprism(double inpSidea, double inpSideb, double inpSidec, double inpTheight){
        super(inpSidea, inpSideb, inpSidec, inpTheight);
        this.sideb = inpSideb;
        this.sideac = inpSidec;
        this.theight = inpTheight;
    }
    public double pythatheight(double inpSideb){
        this.theight = super.pythatheight(inpSideb);
        return theight;
    }
    public double pythatsideac(double inpSideb){
        this.sideac = super.pythatsideac(inpSideb);
        return sideac;
    }
    public double getRarea(){
        super.rarea(sideb, tpheight);
        this.rarea = super.getRarea();
        return rarea;
    }
    public double getRarea1(){
        super.rarea(sideac, tpheight);
        this.rarea1 = super.getRarea();
        return rarea1;
    }
    public double getTparea(){
        this.tparea = rarea + (rarea1 * 2) + (tarea * 2);
        return tparea;
    }
    public double getTarea(){
        this.tarea = super.getArea1(tarea, sideb, theight);
        return tarea;
    }
    public double getTpvolume(){
        this.getTarea();
        this.tpvolume = tarea * tpheight;
        return tpvolume;
    }
    public double getTpperimeter(){
        super.perimeter(sideac, sideb);
        this.tperimeter = super.getItperimeter1();
        this.tpperimeter = (tperimeter * 2) + (tpheight * 3);
        return tpperimeter;
    }
}
