package ly.assignment;

import java.util.Scanner;
import static ly.assignment.AdminPart.*;
import static ly.assignment.AdminQuery.*;
import static ly.assignment.LoginPart.*;
import static ly.assignment.UserPart.*;


/**
 *
 * @author sherwynd
 */
public class LYAssignment {
    public static Database db;
    public static User user;
    public static boolean admin = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        init();
        while(true){
            if(!admin&&user==null){
                char welcome_choice = welcome(sc);
                    switch(welcome_choice){
                        case 'a':
                            customerRegister(sc);
                            break;
                        case 'b':
                            adminLogin(sc);
                            break;
                        case 'c':
                            customerLogin(sc);
                            break;
                        case 'd':
                            forgetPassword(sc);
                            break;
                        case 'e':
                            System.out.println("Thank you and Come again!");
                            System.exit(0);
                        default:
                            break;
                    }
            }
            if(admin){
                char choice = admin_choice(sc);
                switch(choice){
                        case 'a':
                            addRoom(sc);
                            break;
                        case 'b':
                            editRoom(sc);
                            break;
                        case 'c':
                            showRoomQuery(db);
                            break;
                        case 'd':
                            System.out.println("Thank you and Come again!");
                            System.exit(0);
                        default:
                            break;
                    }
            }
            if(user!=null){
                char choice = user_choice(sc);
                switch(choice){
                    case 'a':
                        makeBooking();
                        break;
                    case 'b':
                        showBooking();
                        break;
                    case 'c':
                        getTransaction(sc);
                        break;
                    case 'd':
                        giveReview(sc);
                        break;
                    case 'e':
                        user = null;
                        System.out.println("log out successfully");
                        break;
                    case 'f':
                        changePassword(sc);
                        break;
                    case 'g':
                        viewRoomDetail(sc);
                        break;
                    case 'h':
                        makeTransaction(sc);
                        break;
                    case 'i':
                        System.out.println("Thank you and Come again!");
                        System.exit(0);
                    default:
                        break;
                }
            }
        }
    }
    
    public static void init(){
        try{
            db = new Database();
            db.connect();
        }catch(Exception e){
            System.out.println("connection error");
        }
        
    }
    
}