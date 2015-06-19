package PlayerVideo;

public class SomVideoAdapter implements VideoTarget {	
	private Som som;
	
	public SomVideoAdapter(Som som){ 
		// setSom()
		this.som = som;
	}

	@Override
	public void rodarVideo(){
		som.rodarSom();
	}
	
	@Override
	public void gravarVideoCam(){
		som.gravarSom();
	}

}
