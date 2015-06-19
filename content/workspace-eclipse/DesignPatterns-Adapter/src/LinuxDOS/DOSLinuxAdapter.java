package LinuxDOS; 

public class DOSLinuxAdapter implements LinuxTarget {	
	private DOS dos;
	
	public DOSLinuxAdapter(DOS dos){ 
		// setcomando()
		this.dos = dos;
	}
	
	@Override
	public void CallLinux() {
		dos.CallDOS();		
	}

}

