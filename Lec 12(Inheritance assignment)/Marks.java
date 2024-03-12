class Marks{
    int roll_no;
    public String name;
    int tot_marks;

    void setRollNo(){
        roll_no = (int)Math.floor(Math.random()*100);
    }
    void setRollNo(int a){
        roll_no = a;
    }
    Marks(){
        roll_no = 0;
        name="";
        tot_marks=0;
    }
}
