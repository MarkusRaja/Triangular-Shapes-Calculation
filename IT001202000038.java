import shapescalculator.EquilateralTriangle;
import shapescalculator.IsoscelesTriangle;
import shapescalculator.RightangledTriangle;
import shapescalculator.Pyramid;
import shapescalculator.Tetrahedron;
import shapescalculator.Triangularprism;

import java.util.Scanner;
class IT001202000038{
    public static void main(String[]args){
        Scanner myInp = new Scanner(System.in);
        System.out.print("1. Equilateral Triangle\n2. Isosceles Triangle\n3. Right-angled Triangle\n4. Pyramid\n5. Tetrahedron (Triangular Pyramid)\n6. Triangular prism\nPlease choose one shape by number will you calculate for area, perimeter, and volume if 3D shape: ");
        int choosen = myInp.nextInt();
        if(choosen == 1){
            System.out.print("\nWelcome to Equilateral Triangle calculation\nPlease input your side of triangle in cm: ");
            double inpSideb = myInp.nextDouble();
            EquilateralTriangle myEt = new EquilateralTriangle(inpSideb, inpSideb, inpSideb, 0);
            double inpTheight = myEt.pythatheight(inpSideb);
            double area = myEt.getArea();
            double perimeter = myEt.getPerimeter();
            System.out.format("\nYour Triangle Side: %f cm\nYour Triangle Height: %f cm\nThe Area: %f cm^2\nThe perimeter: %f cm", inpSideb, inpTheight, area, perimeter);    
        }
        else if(choosen == 2){
            System.out.print("\nWelcome to Isosceles Triangle calculation\nDo you have the triangle height (type 1 for yes or 0 for no)? ");
            int thq = myInp.nextInt();
            if(thq == 1){
                System.out.print("Please input your side B (The base) of triangle in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your height of triangle in cm: ");
                double inpTheight = myInp.nextDouble();
                IsoscelesTriangle myIt = new IsoscelesTriangle(0, inpSideb, 0, inpTheight);
                double inpSideac = myIt.pythatsideac(inpSideb);
                double area = myIt.getArea();
                double perimeter = myIt.getItperimeter();
                System.out.format("\nYour Triangle Side AC: %f cm\nYour Triangle Side B: %f cm\nYour Triangle Height: %f cm\nThe Area: %f cm^2\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, area, perimeter);
            }
            else if(thq == 0){
                System.out.print("Please input your side B (The base) of triangle in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your side AC (The foot) of triangle in cm: ");
                double inpSideac = myInp.nextDouble();
                IsoscelesTriangle myIt = new IsoscelesTriangle(0, inpSideb, inpSideac, 0);
                double inpTheight = myIt.pythatheight(inpSideb);
                double area = myIt.getArea();
                double perimeter = myIt.getItperimeter();
                System.out.format("\nYour Triangle Side AC: %f cm\nYour Triangle Side B: %f cm\nYour Triangle Height: %f cm\nThe Area: %f cm^2\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, area, perimeter);
            }
        }
        else if(choosen == 3){
            System.out.print("\nWelcome to Right-angled Triangle calculation\nDo you have the triangle height (type 1 for yes or 0 for no)? ");
            int thq = myInp.nextInt();
            if(thq == 1){
                System.out.print("Please input your side B (The base) of triangle in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your side A (The height) of triangle in cm: ");
                double inpTheight = myInp.nextDouble();
                RightangledTriangle myRt = new RightangledTriangle(0, inpSideb, 0, inpTheight);
                double inpSideac = myRt.pythatsideac(inpSideb);
                double area = myRt.getArea();
                double perimeter = myRt.getPerimeter();
                System.out.format("\nYour Triangle Side C: %f cm\nYour Triangle Side B: %f cm\nYour Side A: %f cm\nThe Area: %f cm^2\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, area, perimeter);
            }
            else if(thq == 0){
                System.out.print("Please input your side B (The base) of triangle in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your side C (The Slope) of triangle in cm: ");
                double inpSideac = myInp.nextDouble();
                RightangledTriangle myRt = new RightangledTriangle(0, inpSideb, inpSideac, 0);
                double inpTheight = myRt.pythatheight(inpSideb);
                double area = myRt.getArea();
                double perimeter = myRt.getPerimeter();
                System.out.format("\nYour Triangle Side C: %f cm\nYour Triangle Side B: %f cm\nYour Side A: %f cm\nThe Area: %f cm^2\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, area, perimeter);
            }
        }
        else if(choosen == 4){
            System.out.print("\nWelcome to Pyramid calculation\nDo you have the Pyramid height or the triangle height of one of triangle (type 2 for pyramid height or 1 for Triangle height or 0 for nothing)? ");
            int thq = myInp.nextInt();
            if(thq == 2){
                System.out.print("Please input your Length of rectangle side in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your Height of rectangle side in cm: ");
                double inpHeight = myInp.nextDouble();
                System.out.print("Please input your height of the pyramid in cm: ");
                double inpPheight = myInp.nextDouble();
                Pyramid myPyra = new Pyramid(0, inpSideb, 0, 0);
                myPyra.setHeight(inpHeight);
                myPyra.setPheight(inpPheight);
                double inpSideac = myPyra.pythatsideacpheightver(inpSideb, inpHeight);
                double inpTheight = myPyra.pythatheight(inpSideb);
                myPyra.getTarea();
                double inpTheight1 = myPyra.pythatheight1(inpHeight);
                myPyra.getTarea1();
                double area = myPyra.getParea();
                double volume = myPyra.getPvolume();
                double perimeter = myPyra.getPperimeter();
                System.out.format("\nYour Top Lateral (side C of triangle): %f cm\nYour Length of Rectangle Side: %f cm\nYour height of the Front and Back triangle of The Pyramid: %f cm\nYour height of the Left and Right triangle of The Pyramid: %f cm\nYour height of The Pyramid: %f cm\nThe Surface Area: %f cm^2\nThe Volume: %f cm^3\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, inpTheight1, inpPheight, area, volume, perimeter);
            }
            else if(thq == 1){
                System.out.print("Please input your Length of rectangle side in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your Height of rectangle side in cm: ");
                double inpHeight = myInp.nextDouble();
                System.out.print("Please input your height of the front and back triangle of the pyramid in cm: ");
                double inpTheight = myInp.nextDouble();
                Pyramid myPyra = new Pyramid(0, inpSideb, 0, inpTheight);
                myPyra.setHeight(inpHeight);
                double inpSideac = myPyra.pythatsideac(inpSideb);
                myPyra.getTarea();
                double inpTheight1 = myPyra.pythatheight1(inpHeight);
                myPyra.getTarea1();
                double area = myPyra.getParea();
                double pheight = myPyra.getPheight(inpSideb, inpHeight);
                double volume = myPyra.getPvolume();
                double perimeter = myPyra.getPperimeter();
                System.out.format("\nYour Top Lateral (side C of triangle): %f cm\nYour Length of Rectangle Side: %f cm\nYour height of the Front and Back triangle of The Pyramid: %f cm\nYour height of the Left and Right triangle of The Pyramid: %f cm\nYour height of The Pyramid: %f cm\nThe Surface Area: %f cm^2\nThe Volume: %f cm^3\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, inpTheight1, pheight, area, volume, perimeter);
            }
            else if(thq == 0){
                System.out.print("Please input your Length of rectangle side in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your Height of rectangle side in cm: ");
                double inpHeight = myInp.nextDouble();
                System.out.print("Please input your side AC (The foot) of the front and back triangle of the pyramid in cm: ");
                double inpSideac = myInp.nextDouble();
                Pyramid myPyra = new Pyramid(0, inpSideb, inpSideac, 0);
                myPyra.setHeight(inpHeight);
                double inpTheight = myPyra.pythatheight(inpSideb);
                myPyra.getTarea();
                double inpTheight1 = myPyra.pythatheight1(inpHeight);
                myPyra.getTarea1();
                double area = myPyra.getParea();
                double pheight = myPyra.getPheight(inpSideb, inpHeight);
                double volume = myPyra.getPvolume();
                double perimeter = myPyra.getPperimeter();
                System.out.format("\nYour Top Lateral (side C of triangle): %f cm\nYour Length of Rectangle Side: %f cm\nYour height of the Front and Back triangle of The Pyramid: %f cm\nYour height of the Left and Right triangle of The Pyramid: %f cm\nYour height of The Pyramid: %f cm\nThe Surface Area: %f cm^2\nThe Volume: %f cm^3\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, inpTheight1, pheight, area, volume, perimeter);
            }
        }
        else if(choosen == 5){
            System.out.print("\nWelcome to Tetrahedron calculation\nPlease input your edge of tetrahedron: ");
            double edge = myInp.nextDouble();
            Tetrahedron myTh = new Tetrahedron(edge, edge, 0, 0);
            double area = myTh.getTharea();
            double volume = myTh.getThvolume();
            double perimeter = myTh.getPerimeter();
            System.out.format("\nYour Edge: %f cm\nThe Surface Area: %f cm^2\nThe Volume: %f cm^3\nThe perimeter: %f cm", edge, area, volume, perimeter);
        }
        else if(choosen == 6){
            System.out.print("\nWelcome to Triangular prism calculation\nDo you have the triangle height of one of triangle (type 1 for yes or 0 for no)? ");
            int thq = myInp.nextInt();
            if(thq == 1){
                System.out.print("Please input your Side B (The base) of triangle side in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your triangle height in cm: ");
                double inpTheight = myInp.nextDouble();
                System.out.print("Please input your height of Triangular prism in cm: ");
                double inpTpheight = myInp.nextDouble();
                Triangularprism myTp = new Triangularprism(0, inpSideb, 0, inpTheight);
                myTp.setTpheight(inpTpheight);
                double inpSideac = myTp.pythatsideac(inpSideb);
                double volume = myTp.getTpvolume();
                myTp.getRarea();
                myTp.getRarea1();
                double area = myTp.getTparea();
                double perimeter = myTp.getTpperimeter();
                System.out.format("\nYour Side AC (The foot) of Triangle Side: %f cm\nYour Side B (The base) of Triangle Side: %f cm\nYour triangle height of Triangle Side: %f cm\nYour height of The Triangular prism: %f cm\nThe Surface Area: %f cm^2\nThe Volume: %f cm^3\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, inpTpheight, area, volume, perimeter);
            }
            else if(thq == 0){
                System.out.print("Please input your Side B (The base) of triangle side in cm: ");
                double inpSideb = myInp.nextDouble();
                System.out.print("Please input your side AC (The foot) of triangle side in cm: ");
                double inpSideac = myInp.nextDouble();
                System.out.print("Please input your height of Triangular prism in cm: ");
                double inpTpheight = myInp.nextDouble();
                Triangularprism myTp = new Triangularprism(0, inpSideb, inpSideac, 0);
                myTp.setTpheight(inpTpheight);
                double inpTheight = myTp.pythatheight(inpSideb);
                double volume = myTp.getTpvolume();
                myTp.getRarea();
                myTp.getRarea1();
                double area = myTp.getTparea();
                double perimeter = myTp.getTpperimeter();
                System.out.format("\nYour Side AC (The foot) of Triangle Side: %f cm\nYour Side B (The base) of Triangle Side: %f cm\nYour triangle height of Triangle Side: %f cm\nYour height of The Triangular prism: %f cm\nThe Surface Area: %f cm^2\nThe Volume: %f cm^3\nThe perimeter: %f cm", inpSideac, inpSideb, inpTheight, inpTpheight, area, volume, perimeter);
            }
        }
        myInp.close();
    }
}