/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rakesh
 */
public class Airliner {
    private String airlinerName;
    private Fleet FleetCatalog;
    private FlightSchedule fSCatalog;
    private AirlinerDirectory airlinerdirectory;

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public Fleet getFleetCatalog() {
        return FleetCatalog;
    }

    public void setFleetCatalog(Fleet FleetCatalog) {
        this.FleetCatalog = FleetCatalog;
    }

    public FlightSchedule getFSCatalog() {
        return fSCatalog;
    }

    public void setFSCatalog(FlightSchedule fSCatalog) {
        this.fSCatalog = fSCatalog;
    }

    @Override
    public String toString() {
        return airlinerName;
    }

 
}
