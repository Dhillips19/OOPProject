package ie.tudublin;

import C21406436.Planet;
import example.CubeVisual;
import example.MyVisual;
import example.RotatingAudioBands;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Planet());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}