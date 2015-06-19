package LinuxDOS;

abstract public class Linux {

	public Linux() {}
	
	public void CallLinux(){
		System.out.println( "Chamada Linux " + this.getClass().getSimpleName() );
	}

}
