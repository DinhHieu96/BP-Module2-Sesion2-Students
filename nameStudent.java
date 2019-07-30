import java.util.Scanner;

public class nameStudent {
    public static void main(String[] args) {
        String[] students={"Nam","Hoang","Hung","Duc","Hong","Hanh"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name=scanner.nextLine();
        boolean isExits=false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Posision of students in the list "+input_name+" is "+(i+1));
                isExits=true;
                break;
            }
        }
        if (!isExits){
            System.out.println("Not found "+input_name+"in the list. ");
        }
    }
    }