
public class NRoute {
	private String idTraffic;
    private String NRoute;
    private String idTrucks;
    private String idTrailers;
    

    public NRoute(
            String idTraffic, String NRoute, String idTrucks, String idTrailers) {
        this.idTraffic = idTraffic;
        this.NRoute = NRoute;
        this.idTrucks = idTrucks;
        this.idTrailers = idTrailers;
    }

    public String getidTraffic() {
        return idTraffic;
    }

    public void setidTraffic(String idTraffic) {
        this.idTraffic = idTraffic;
    }

    public String getNRoute() {
        return NRoute;
    }

    public void setNRoute(String NRoute) {
        this.NRoute = NRoute;
    }

    public String getidTrucks() {
        return idTrucks;
    }

    public void setidTrucks(String idTrucks) {
        this.idTrucks = idTrucks;
    }
    
    public String getidTrailers() {
        return idTrailers;
    }

    public void setidTrailers(String idTrailers) {
        this.idTrailers = idTrailers;
    }
}
