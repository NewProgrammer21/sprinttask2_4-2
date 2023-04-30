package kz.bitlab.sp_task2.db;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<Items> items=new ArrayList<>();
    private static final ArrayList<Users> users=new ArrayList<>();

    static {
        items.add(new Items(1L, "Item 1", "This is the first item", 10.99));
        items.add(new Items(2L, "Item 2", "This is the second item", 19.99));
        items.add(new Items(3L, "Item 3", "This is the third item", 8.50));
        items.add(new Items(4L, "Item 4", "This is the fourth item", 15.75));
        items.add(new Items(5L, "Item 5", "This is the fifth item", 5.99));
        items.add(new Items(6L, "Item 6", "This is the sixth item", 12.25));
        items.add(new Items(7L, "Item 7", "This is the seventh item", 125.25));
    }
    static {
        users.add(new Users(1L, "admin@example.com", "admin", "Main Admin"));
        users.add(new Users(2L, "user2@example.com", "password2", "User Two"));
        users.add(new Users(3L, "user3@example.com", "password3", "User Three"));
    }

    public static ArrayList<Items> getItems(){
        return items;
    }

    public static boolean login(String email, String password){
        boolean check = false;
        for(Users user:users){
            if(email.equals(user.getEmail())&&password.equals(user.getPassword())){
                check=true;
                break;
            }
        }
        return check;
    }
}
