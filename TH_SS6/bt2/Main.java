package bt2;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(1,"Nguyen văn a",true,"JV-01",16,"Hà Nội");
        Student student2=new Student(2, "Nguyen van b",false, "JV-02", 18, "HCM");

        System.out.println("hiển thị thông tin SV1");
        student.display();
        System.out.println("------------------------------");
        System.out.println("hiển thị thông tin SV 2");
        student2.display();
    }

}
