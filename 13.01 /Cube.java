
public class Cube extends Box {

	private int length, width, height;
	
	public Cube(int l, int w, int h) {
		super(l, w, h);
		length = l;
		width = w;
		height = h;
	}
	
	public String getDimiensions() {
		String d = "Cube's Dimensions are: " + length + " x " + width +" x " + height;
		return d;
	}


}
