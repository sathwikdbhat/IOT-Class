public class employee {
    int id;
    String name;
    double salary;
    employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(" ID:"+ id+"\n NAME:" + name+"\n SALARY:"+ salary);
    }
    public static void main(String[] args) {
        employee emp=new employee(101, "Sathwik", 50000);
        emp.display();
    }
}