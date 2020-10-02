import config.Config;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(new Config()); //running constructor and automatically creates objects
        }
        return adsDao;
    }
}
