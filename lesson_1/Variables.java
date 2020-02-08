public class Variables {	
    public static void main(String[] args) {

		byte cores;
		short frequency;
		int memorySize;
		long hardDiskDriveCapacity;

		float weight;
		double display;

		char ch1=109, ch2=115, ch3=105;

		boolean notebook;

		notebook = true;
		cores = 4;
		frequency = 2700;
		memorySize = 8192;
		hardDiskDriveCapacity = 1073741824L * 1024;
		weight = 2.1F;
		display = 15.61;
		
        System.out.println("notebook " + notebook);
        System.out.println("this CPU have - " + cores + " cores");
        System.out.println("Frequency - " +frequency + " mHz");
        System.out.println("Memory size - " +memorySize + " mb");
        System.out.println("HDD Capacity - " + hardDiskDriveCapacity + " bytes");
        System.out.println("Weight - " + weight + " kg");
        System.out.println("Display - " + display + " inch");
        System.out.println("Model - " + ch1 + ch2 + ch3 );

    }
}