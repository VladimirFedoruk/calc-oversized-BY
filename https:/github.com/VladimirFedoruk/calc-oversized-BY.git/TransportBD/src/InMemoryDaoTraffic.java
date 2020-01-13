import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDaoTraffic implements DaoTraffic{
	private static Map<String, NRoute> NRoutestore = new HashMap<String, NRoute>();

    public Collection<NRoute> findAllTraffic() {
        return NRoutestore.values();

    }

    public NRoute findNRouteByidTraffic(NRoute NRoute) {
        return NRoutestore.get(NRoute.getidTraffic());
    }

    public void create(NRoute NRoute){
    	NRoutestore.put(NRoute.getidTraffic(),NRoute);
    }
    public void delete(NRoute NRoute){
    	NRoutestore.remove(NRoute.getidTraffic());
    }
    public void update(NRoute NRoute){
    	NRoutestore.equals(NRoute.getidTraffic());
    }
}
