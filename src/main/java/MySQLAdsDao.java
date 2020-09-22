import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
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
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
