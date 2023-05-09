package GugudanMVC;

public class GugudanControl {
	
	private GugudanModel model;
	private GugudanView view;
	
	public GugudanControl(GugudanModel model, GugudanView view) {
		this.model = model;
		this.view = view;
	}
	
	public GugudanModel getModel() {
		return model;
	}

	public void setModel(GugudanModel model) {
		this.model = model;
	}

	public GugudanView getView() {
		return view;
	}

	public void setView(GugudanView view) {
		this.view = view;
	}

}
