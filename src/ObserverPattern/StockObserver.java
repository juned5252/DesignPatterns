package ObserverPattern;

public class StockObserver implements Observer{

	private double ibm;
	private double aapl;
	private double google;
	
	private static int observerIDTracker = 0;
	private int ObserverID;
	private Subject stockGrabber;
	
	
	
	public StockObserver(Subject stockGrabber) {
		super();
		this.stockGrabber = stockGrabber;
		this.ObserverID = ++observerIDTracker;
		System.out.println("New Observer " + this.ObserverID);
		stockGrabber.register(this);
	}



	@Override
	public void update(double ibm, double aaple, double google) {
		// TODO Auto-generated method stub
		this.ibm = ibm;
		this.aapl =aaple;
		this.google = google;
		System.out.println(ObserverID + "\nIBM " + ibm + "\nAAPl: " + aapl + "\nGOOGLE: " + google);
	}

}
