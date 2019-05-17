package it.test;

/**
 * Hello world!
 *
 */
public class App 
{
	private String pippo;


	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	
    public String getPippo() {
		return pippo;
	}

	public void setPippo(String pippo) {
		if(pippo == null){
			this.pippo = "pluto";
		} else {
			this.pippo = pippo;
		}
	}
}
