public class Student {

    //defining fields
    int id;
    String name;

    void setRecord(int a, String n){
        id = a;
        name=n;
    }
    void displayRecord(){
        System.out.println(id +" " + name);
    }
}
