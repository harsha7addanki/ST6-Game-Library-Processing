package HAStudios.ST6;


import processing.core.*;

/**
 * This is a template class and can be used to start a new processing Library.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own Library naming convention.
 * 
 * (the tag example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 * @example Hello 
 */

public class ST6 {
	PApplet Parent;
	serial console;
	int OS;
	
	public final static String VERSION = "##library.prettyVersion##";
	
	public ST6(PApplet theParent,serial theport,int oper) {
		Parent = theParent;
		console = theport;
		OS = oper;
		PApplet.print("Welcome To The ST6 Envioment v" + VERSION);
	}
	
	public float GetJoystickX() {
		console.write('X');
		if(console.available() > 0) {
			return (float) console.read();
		}
		return 0f;
	}
	public float GetJoystickY() {
		console.write('Y');
		if(console.available() > 0) {
			return (float) console.read();
		}
		return 0f;
	}
}

