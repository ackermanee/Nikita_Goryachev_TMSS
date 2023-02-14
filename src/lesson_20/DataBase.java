package lesson_20;

import java.sql.*;
public class DataBase {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "nikita13";
    public static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/zxc_gull_invoker";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);
                Statement statement = connection.createStatement()
        ) {
            statement.executeUpdate("create table user (" +
                    "id int not null auto_increment," +
                    "first_name varchar(30) not null," +
                    "last_name varchar(30) not null," +
                    "username varchar(30) not null," +
                    "password varchar(30) not null," +
                    "location varchar(30) not null," +
                    "gender varchar(30) not null," +
                    "primary key (id))");


            statement.executeUpdate(
                    "insert into users (first_name, last_name, username, password, location, gender) " +
                            "values ('Nikita', 'Grachev', 'nickrograch', 'admin', 'Minsk', 'male')"
            );
            statement.executeUpdate(
                    "insert into users (first_name, last_name, username, password, location, gender) " +
                            "values ('Masha', 'Massani', 'kami', 'admin', 'Minsk', 'female')"
            );
            statement.executeUpdate(
                    "insert into users set " +
                            "first_name = 'Aleksander'," +
                            "last_name = 'Sech', " +
                            "username = 'JohnRay'," +
                            "password = 'admin'," +
                            "location = 'Minsk'," +
                            "gender = 'male'"
            );
            // Получем все данные из таблицы users и выводим все данные на экран по очереди
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString(5));
                System.out.println(resultSet.getString(6));
                System.out.println(resultSet.getString(7));
                System.out.println("-----------");
            }
//            // Получаем только имя и фамилию тех у кого gender = male (пол = мужской) и выводим на экран
            ResultSet resultSet1 = statement.executeQuery(
                    "select first_name, last_name from users " +
                            "where gender = 'male'"
            );
            while (resultSet1.next()){
                System.out.println(resultSet1.getString(1) + " " + resultSet1.getString(2) +
                        " мущинка");
//                System.out.println(resultSet1.getString(1));
//                System.out.println(resultSet1.getString(2));
//                System.out.println("-------------");
            }
//        }
        }
    }
}
