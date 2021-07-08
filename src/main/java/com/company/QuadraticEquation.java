package com.company;

public class QuadraticEquation {
    private double root1;
    private double root2;


    public double[] searchRoot(double a,double b,double c)
    {
        double Diskriminant = b*b - 4*a*c;
        double root[] = new double[2];
        if (Diskriminant > 0)
        {
            root1 = (-b + Math.sqrt(Diskriminant))/(2*a);
            root2 = (-b - Math.sqrt(Diskriminant))/(2*a);
            root[0] = root1;
            root[1] = root2;
        }
        if(Diskriminant == 0)
        {
            root1 = (-b + Math.sqrt(Diskriminant))/(2*a);
            root[0] = root1;
        }

        return root;
    }

    public double getRoot1()
    {
        return root1;
    }
    public double getRoot2()
    {
        return root2;
    }

}
