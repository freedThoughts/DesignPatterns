package adaptorPattern.Adaptee;

public class VlcPlayer implements AdvancedMediaPlayer{
	
	@Override
	public void play(String mediaType, String fileName) {
		System.out.println("Playing " + mediaType);
		
	}

}
