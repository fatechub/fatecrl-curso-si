package PlayerVideo;

public class Main {
	
	public static void main(String[] args) {
		
		Avi videoAvi = new Avi();
		videoAvi.rodarVideo();

		SomVideoAdapter somMidAdaptadoVideo = new SomVideoAdapter( new Mid() );
		somMidAdaptadoVideo.rodarVideo();
		
	}

}
