import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class SLRAgent extends Agent {


    protected void setup() {
        // Create and show the GUI
        InputDialogBox myGui = new InputDialogBox(this);
        myGui.showGui();
        System.out.println("Hello world! I'm a OneShot Linear Regression agent!");
        System.out.println("My local name is " + getAID().getLocalName());

    }

    public void getX(final String x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                SimpleDataSet data = new SimpleDataSet();
                LinearRegression SLR = new LinearRegression(data.getX(),data.getY());
                System.out.println("Regression model equation:\nY = "+SLR.getB0()+" + "+SLR.getB1()+"X");
                System.out.print("Proyected Value of Y:");
                System.out.print(SLR.getB0()+SLR.getB1()*Double.parseDouble(x));
                myAgent.doDelete();
            }
        });
//matar al agente
    }
}
