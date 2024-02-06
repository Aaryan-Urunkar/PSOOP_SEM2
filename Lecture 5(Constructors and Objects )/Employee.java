public class Employee{
    String name;
    int age;
    int salary;

    Employee(){
        name= "unknown";
        age=19;
        salary = 20000;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getSalary(){
        return salary;
    }
    void display(){
        System.out.println("DISPLAYING DETAILS: \n NAME:" + name + "\nAGE:" + age+"\nSALARY:"+salary+"\n");
    }
}