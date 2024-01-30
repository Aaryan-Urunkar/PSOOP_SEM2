public class Method_overloading1 {
    
    //sum() which takes two parameters 
    int sum(int x, int y) {
    return x+y;
    }

    //sum() which takes three parameters
    int sum(int x,int y,int z){
            return x+y+z;
    }
    
    int sum(int[] arr){
        int s=0;
        for(int n:arr){
            s = sum(s,n);
        }
        return s;
    }
}

