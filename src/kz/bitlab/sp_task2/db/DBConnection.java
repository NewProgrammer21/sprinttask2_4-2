package kz.bitlab.sp_task2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBConnection {
    private static Connection connection;

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sprinttask2",
                    "root",
                    "");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Items> getItems(){
        ArrayList<Items> items=new ArrayList<>();
        try{
            PreparedStatement statement=connection.prepareStatement(
                    "select * from items"
            );
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                Items item=new Items();
                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice(resultSet.getDouble("price"));

                items.add(item);
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return items;
    }

    public static boolean login(String email, String password){
        boolean check=false;

        try{
            PreparedStatement statement=connection.prepareStatement(
                    "SELECT * FROM users WHERE email=? and password=?");
            statement.setString(1,email);
            statement.setString(2,password);
            ResultSet resultSet=statement.executeQuery();
            check = resultSet.next();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }
}
