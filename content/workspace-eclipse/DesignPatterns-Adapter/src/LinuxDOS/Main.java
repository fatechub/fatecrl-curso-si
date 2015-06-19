package LinuxDOS;

public class Main {
	public static void main(String[] args) {
		ls comandoLS = new ls();
		comandoLS.CallLinux();

		DOSLinuxAdapter comandoDIRAdaptadoLinux = new DOSLinuxAdapter( new DIR() );
		comandoDIRAdaptadoLinux.CallLinux();
	}

}
