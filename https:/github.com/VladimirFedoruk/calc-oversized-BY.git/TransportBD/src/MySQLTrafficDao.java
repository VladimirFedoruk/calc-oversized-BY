import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class MySQLTrafficDao implements DaoTraffic{
	@Override
    public Collection<NRoute> findAllTraffic() {
        return null;
    }

    @Override
    public NRoute findNRouteByidTraffic(NRoute NRoute) {
        return null;
    }

    @Override
    public void create(NRoute NRoute) {
        String url = "jdbc:mysql://localhost:3306/TransportDB";
        String user = "root";
        String pwd = "fDcbkbQ2017!";
        try {
            Connection conn =
                    DriverManager.getConnection(url, user, pwd); // GetConnection
            System.out.println("work");
            Statement stmt = ((java.sql.Connection) conn).createStatement(); // Create Statement
            stmt.executeUpdate("insert into Traffic (idTraffic, NRoute, idTrucks, idTrailers) values ('"+NRoute.getidTraffic()+"', '"+NRoute.getNRoute()+"', '"+NRoute.getidTrucks()+"', '"+NRoute.getidTrailers()+"');");


        } catch (SQLException se) {
            System.out.println(se);
        }

    }

    @Override
    public void delete(NRoute NRoute) {

    }

    @Override
    public void update(NRoute NRoute) {

    }
}
