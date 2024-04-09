import java.util.*;

public class Line {
    int m , c ,x1,y1,x2,y2;
    
    Line(int m, int c){ //Constructor with 2 parameters
        this.m = m;
        this.c = c;
        genEqn(m, c);
    }

    Line(int m, int x1, int y1){ //Constructor with 3 parameters
        this.m=m;
        this.y1 = y1;
        this.x1=x1;
        genEqn(m, x1, y1);
    }
    Line(int m ,int x1, int y1, int x2, int y2){ //Constructor with 5 parameters
        this.m=m;
        this.y1 = y1;
        this.x1=x1;
        this.y2 = y2;
        this.x2=x2;
        genEqn(m, x1, y1, x2, y2);
    }
    void genEqn(int m, int c){//To show in slope-intercept form
        System.out.println("y=" + m+ "x + " + c);
    }
    void genEqn(int m ,int x1, int y1){ //To show in point-slope form
        System.out.println("(y - "+y1+") = "+m+"(x - " + x1+" )");
    }
    void genEqn(int m ,int x1, int y1, int x2, int y2){
        System.out.println("(y - " + y1+") / " + "(" + y1 + " - " + y2+") = " + m + "(x - " + x1 + ") / (" + x1 + " - " + x2+")");
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.For slope-intercept form enter m and c\n 2.For point-slope form enter m, x1 and y1\n 3.For two-point form enter m,x1,y1,x2 and y2\n PLEASE ENTER CHOICE FIRST");
        int ch=sc.nextInt();
        Line ob;
        if(ch == 1)
        ob=new Line(sc.nextInt(), sc.nextInt() );
        else if(ch == 2)
        ob = new Line(sc.nextInt(), sc.nextInt(),sc.nextInt());
        else if(ch == 3)
        ob = new Line(sc.nextInt(), sc.nextInt(),sc.nextInt(), sc.nextInt(),sc.nextInt());
    }
}
