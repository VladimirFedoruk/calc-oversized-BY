public class Traffic {

	public static void main(String[] args) {
        MySQLTrafficDao DaoTraffic= new MySQLTrafficDao();
        NRoute NRoute = new NRoute("1", "1000001", "1","1");
        DaoTraffic.create(NRoute);
        NRoute.setNRoute("Update");
        DaoTraffic.update(NRoute);
        DaoTraffic.delete(NRoute);
        DaoTraffic.findAllTraffic(); // переписать базу данных в коллекцию и из коллекции выводить на консоль

	}

}
