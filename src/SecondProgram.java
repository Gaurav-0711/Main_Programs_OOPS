import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;
class address{
    int street_num;
    String city,state,country;
    address(int street_num,String city,String state, String country){
        this.street_num=street_num;
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
class student{
    String usn,name;
    address addr;
    student(String usn,String name, address addr ){
        this.usn=usn;
        this.name=name;
        this.addr=addr;
    }
}
class college{
    String name;
    address addr;
    college(String name,address addr){
        this.name=name;
        this.addr=addr;
    }

}
class employee{
    String emp_id,name;
    address addr;
    employee(String emp_id,String name, address addr){
        this.emp_id=emp_id;
        this.name=name;
        this.addr=addr;
    }
}

public class SecondProgram {
    public static void main(String[] args){
        int i;
        System.out.println("enter the number of students");
        Scanner obj=new Scanner(System.in);
        i=obj.nextInt();
        address[] add=new address[i];
        student[] std=new student[i];
        college[] clg=new college[i];
        employee[] emp=new employee[i];
        for(int n=0;n<i;n++){
            System.out.println("\n enter the address details\n");
            add[n]=new address(obj.nextInt(),obj.next(),obj.next(),obj.next());
            System.out.println("\nenter the student details "+(n+1));
            std[n]= new student(obj.next(),obj.next(),add[n]);
            System.out.println("\nenter the college details of "+(n+1));
            clg[n]=new college(obj.next(),add[n]);
            System.out.println("\nenter the employee details of "+(n+1));
            emp[n]=new employee(obj.next(),obj.next(),add[n]);
        }


        for(int m=0;m<i;m++)
        {
            System.out.println();
            System.out.print(std[m].name+"\t"+std[m].usn+"\t"+clg[m].name+"\t"+std[m].addr.street_num+"\t"+std[m].addr.city+"\t"+std[m].addr.state+"\t"+std[m].addr.country);
            System.out.print("\n"+emp[m].name+"\t"+emp[m].emp_id+"\t"+clg[m].name+"\t"+std[m].addr.street_num+"\t"+std[m].addr.city+"\t"+std[m].addr.state+"\t"+std[m].addr.country);
        }


    }
}