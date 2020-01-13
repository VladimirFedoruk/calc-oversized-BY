import java.util.Collection;

public interface DaoTraffic {
	Collection<NRoute>findAllTraffic();
	NRoute findNRouteByidTraffic(NRoute NRoute);
    void create(NRoute NRoute);
    void delete(NRoute NRoute);
    void update(NRoute NRoute);
}

