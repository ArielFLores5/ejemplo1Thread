package ejemplo1_Thread;

public class proceso {
	String nameProcess;
	
	public proceso(String nameProcess) {
		super();
		this.nameProcess = nameProcess;
	}

	public void listValue() {
		for(int i=0;i<10;i++) {
			System.out.println(nameProcess+":"+i);
		}
	}
	
}
