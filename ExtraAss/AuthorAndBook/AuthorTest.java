package AuthorAndBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthorTest {
    public static void main(String[] args) {
        Author teck = new Author("Tan Ah Teck","teck@gmail.com",'m');
        System.out.println(teck);
        teck.SetEmail("teck@nowhere.com");
        System.out.println(teck);
    }
}

//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static boolean flag = true;
//
//    static Author[] autherarray = new Author[100];
//    public static void main(String[] args) throws IOException {
//        do{
//            display();
//            System.out.print("Do you want to countinue : ");
//            String con = br.readLine();
//            if(con.equalsIgnoreCase("yes")){
//                flag= true;
//            } else  {
//                flag = false;
//            }
//        }while(flag==true);
//        for (int i = 0; i < Author.count; i++) {
//            System.out.println(autherarray[i]);
//        }
//
//    }
//    public static void display() throws IOException {
//            System.out.print("Enter Name: ");
//            String name = br.readLine();
//            System.out.print("Enter gmail: ");
//            String mail = br.readLine();
//            System.out.print("Enter gender: ");
//            char gender = br.readLine().charAt(0);
//            if(gender == 'f' || gender == 'm' || gender=='u'){
//                autherarray[Author.count] = new Author(name,mail,gender);
//                flag=true;
//            }else {
//                flag = false;
//            }
//        }

//}
