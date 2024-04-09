public class table {
    
    int Hcf(int m,int n){//To calculate hcf
        if(m<n){
            return Hcf(n,m);
        } else if(n != 0){
            return Hcf(n,m%n);
        } else {
            return m;
        }
    }

    void generateTable(numAndDen1 frac){
        numAndDen1[][] fracs = new numAndDen1[frac.den][frac.den];
        numAndDen1 curr = new numAndDen1();
        int hcf;
        //Initializing row 0
        for(int i=1;i<=frac.den -1 ; i++){
            int denm = frac.den;
            hcf = Hcf(i, denm);
            denm = denm/hcf;
            curr = new numAndDen1();
            curr.num = i/hcf;
            curr.den = denm;
            fracs[0][i] = curr;
        }

        //Initializing column 0
        for(int i=1;i<=frac.den -1 ; i++){
            int denm = frac.den;
            hcf = Hcf(i, denm);
            denm = denm/hcf;
            curr = new numAndDen1();
            curr.num = i/hcf;
            curr.den = denm;
            fracs[i][0] = curr;
        }
        
        /*for(int i=1;i<=frac.den-1;i++){
            if(i == 1) System.out.print("___");
            System.out.print(fracs[0][i].num + "/" + fracs[0][i].den+"   ");
        }
        for(int i=0;i<=frac.den-1;i++){
            if(i<1){ 
                System.out.println();
                continue;
            }
            System.out.println(fracs[i][0].num + "/" + fracs[0][i].den+"   ");
        }*/

        for(int i=1;i<= frac.den-1;i++){
            for(int j=1;j<=frac.den-1;j++){
                numAndDen1 f1 = new numAndDen1();
                f1.num = fracs[0][j].num;
                f1.den = fracs[0][j].den;

                numAndDen1 f2 = new numAndDen1();
                f2.num = fracs[i][0].num;
                f2.den = fracs[i][0].den;
                
                numAndDen1 f =new numAndDen1();
                f.num = f1.num * f2.num;
                f.den = f1.den * f2.den;

                hcf = Hcf(f.den, f.num);
                f.num = f.num / hcf;
                f.den = f.den/hcf;
                fracs[i][j] = f;
            }
        }

        for(int i=0;i<frac.den;i++){
            for(int j=0;j<frac.den;j++){
                if(i == 0 && j==0) {
                    System.out.print("___       ");
                    continue;
                }
                String msg = fracs[i][j].num +"/" + fracs[i][j].den;
                while(msg.length() != 10) msg+=" ";
                System.out.print(msg);
                //System.out.print(fracs[i][j].num + "/" + fracs[i][j].den + "   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        table ob=new table();
        numAndDen1 f=new numAndDen1();
        f.num=1;
        f.den = 6;
        ob.generateTable(f);
    }
}
class numAndDen1{
    int num;
    int den;
    numAndDen1(){
        num = den=1;
    }
}
