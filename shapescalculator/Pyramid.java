package shapescalculator;

public class Pyramid extends IsoscelesTriangle {
    private double sidec;
    private double length;
    private double height;
    private double tarea;
    private double pperimeter;
    private double theight;
    private double theight1;
    private double pheight;
    private double tarea1;
    private double parea;
    private double pvolume;
    private double rarea;
    private double inpSidebclone;
    private double rdiagonal;
    public Pyramid(double inpSidea, double inpSideb, double inpSidec, double inpTheight){
        super(inpSidea, inpSideb, inpSidec, inpTheight);
        this.theight = inpTheight;
        this.length = inpSideb;
        this.sidec = inpSidec;
    }
    public void setHeight(double inpHeight){
        height = inpHeight;
    }
    public double pythatheight(double inpLength){
        this.theight = super.pythatheight(inpLength);
        return this.theight;
    }
    public double getTheight(){
        theight = super.getTheight();
        return theight;
    }
    public double getTheight1(){
        return theight1;
    }
    public double pythatsideac(double inpSideb){
        this.sidec = super.pythatsideac(inpSideb);
        super.setSidec(sidec);
        return this.sidec;
    }
    public double pythatheight1(double inpHeight){
        this.theight1 = super.pythatheight(inpHeight);
        return this.theight1;
    }
    public double getTarea(){
        this.tarea = super.getArea1(tarea, length, theight);
        return this.tarea;
    }
    public double getTarea1(){
        this.tarea1 = super.getArea1(tarea1, height, theight1);
        return this.tarea1;
    }
    public void rarea(double length, double height){
        rarea = length * height;
    }
    public double getRarea(){
        return this.rarea;
    }
    public void area(double length, double height){
        this.rarea(length, height);
        parea = (tarea * 2) + (tarea1 * 2) + rarea;
    }
    public double getParea(){
        this.area(length, height);
        return parea;
    }
    public void rdiagonal(double inpSideb){
        inpSidebclone = inpSideb * 2;
        rdiagonal = super.pythatsideac(inpSidebclone);
        inpSidebclone = inpSideb / 2;
    }
    public double getPheight(double inpSideb, double inpHeight){
        super.setTheight(inpHeight);
        this.rdiagonal(inpSideb);
        pheight = super.pythatheight(rdiagonal);
        return pheight;
    }
    public double pythatsideacpheightver(double inpSideb, double inpHeight){
        super.setTheight(inpHeight);
        this.rdiagonal(inpSideb);
        super.setTheight(pheight);
        this.sidec = super.pythatsideac(rdiagonal);
        super.setSidec(sidec);
        return this.sidec;
    }
    public double getRdiagonal(){
        return rdiagonal;
    }
    public void volume(){
        pvolume = (rarea * pheight)/3;
    }
    public double getPvolume(){
        this.volume();
        return this.pvolume;
    }
    public void setPheight(double inpPheight){
        this.pheight = inpPheight;
    }
    public void perimeter(){
        this.pperimeter = (this.sidec * 4) + (2 * (length + height));
    }
    public double getPperimeter(){
        this.perimeter();
        return this.pperimeter;
    }
    public double getLength(){
        this.length = super.getSideb();
        return length;
    }
}
