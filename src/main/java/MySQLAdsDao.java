import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
//        connecting to a database
//        Driver is the implementation of mysql driver and there is a Driver interface in the java.sql package
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();
//        creating and executing
        Statement statement = connection.createStatement();

//        handling result sets
//        rs is the instance of resultset
        ResultSet rs = statement.executeQuery("SELECT * FROM ads");
        while (rs.next()) { //return the next results(loop)
            Ad ad = new Ad(rs.getLong("id"),rs.getLong("user_id"), rs.getString("title")
                    ,rs.getString("description"));
            ads.add(ad);
//            System.out.println("Here's an ads:");
//            System.out.println("  id: " + rs.getLong("id"));
//            System.out.println("  user_id: " + rs.getLong("user_id"));
//            System.out.println("  title: " + rs.getString("title"));
//            System.out.println("  description: " + rs.getString("description"));
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = String.format("INSERT INTO ads(user_id, title, description) VALUES(%d, '%s', '%s')",
                ad.getUserId(), ad.getTitle(), ad.getDescription());
//        creating and executing
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
       // System.out.println(rs);
        if (rs.next()) {
            System.out.println("Inserted a new Ads! New id: " + rs.getLong(1));
        }
        return ad.getId();
    }

}
