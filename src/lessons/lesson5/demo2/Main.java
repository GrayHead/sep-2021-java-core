package lessons.lesson5.demo2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sep_2021_core_base", "root", "rootroot");

//            PreparedStatement preparedStatement = connection.prepareStatement("insert into user (name) values('vasya'),('petya')");
//            preparedStatement.executeUpdate();

            PreparedStatement selectPreparedStatement = connection.prepareStatement("select  * from user");
            ResultSet resultSet = selectPreparedStatement.executeQuery();

            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                users.add(new User(resultSet.getInt("id"), resultSet.getString(2)));
            }

            System.out.println(users);

            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
