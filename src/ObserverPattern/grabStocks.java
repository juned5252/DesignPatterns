package ObserverPattern;

public class grabStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     stockGrabber stockGrabber = new stockGrabber();
     
     StockObserver observe1 = new StockObserver(stockGrabber);
     
     stockGrabber.setIBMPrice(197.00);
     stockGrabber.setAAPLEPrice(456.00);
     stockGrabber.setGOOGLEPrice(677.00);
     
	}

}
