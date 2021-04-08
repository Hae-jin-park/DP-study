
public class ComputerBuilder {
	
	private Computer com;
	private ComputerBuilder() {
		com = new Computer("default","default","default");
	}
	
	public static ComputerBuilder start() {
		return new ComputerBuilder();
	}
	
	public static ComputerBuilder startWithCpu(String cpu) {
		ComputerBuilder builder = new ComputerBuilder();
		builder.com.setCpu(cpu);
		return builder;
	}
	
	public ComputerBuilder setCpu(String str) {
		com.setCpu(str);
		return this;
	}
	
	public ComputerBuilder setRam(String str) {
		com.setRam(str);
		return this;
	}
	
	public ComputerBuilder setStorage(String str) {
		com.setStorage(str);
		return this;
	}
	
	public Computer build() {
		return this.com;
	}
}
