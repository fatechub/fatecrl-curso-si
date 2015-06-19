package PlayerVideo;

abstract public class Video {

	public void rodarVideo(){
		System.out.println("Rodando video... " + this.getClass().getSimpleName());
	}
	
	public void gravarVideoCam(){
		System.out.println("Gravando video cam... " + this.getClass().getSimpleName());
	}

}
