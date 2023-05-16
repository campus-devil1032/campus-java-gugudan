package NewGugudan;


public class NewGugudanMain {
	
	    public static void main(String[] args) {
	    	 NewGugudanModel model = new  NewGugudanModel();
	    	 NewGugudanView view = new  NewGugudanView();
	    	 NewGugudanController controller = new NewGugudanController(model, view);
	        controller.run();
	    }
	}