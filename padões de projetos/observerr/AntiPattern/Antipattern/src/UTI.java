import java.util.ArrayList;
import java.util.List;

public class UTI {
     private double pressao;
    private double batimento;
    private double oxigenacao;
    private List<Dashboard> dashboards;

    public UTI() {
        dashboards = new ArrayList<>();
    }

    public void addDashboard(Dashboard dashboard) {
        dashboards.add(dashboard);
    }

    public void removeDashboard(Dashboard dashboard) {
        dashboards.remove(dashboard);
    }

    public void setMeasurements(double pressao, double batimento, double oxigenacao) {
        this.pressao = pressao;
        this.batimento = batimento;
        this.oxigenacao = oxigenacao;
        notifyDashboards();
    }

    private void notifyDashboards() {
        for (Dashboard dashboard : dashboards) {
            dashboard.update(pressao, batimento, oxigenacao);
        }
    }
    
}
