public class Variable {	
	public static void main(String[] args) {
		byte cores = 4;
		short frequency = 2700;
		int memorySize = 8192;
		long hddCapacity = 1073741824L * 1024;
		float weight = 2.1F;
		double display = 15.61;
		char modelSymbol1 = 109, modelSymbol2 = 115, modelSymbol3 = 105;
		boolean isItNotebook = true;
		
		System.out.println("notebook " + notebook);
		System.out.println("this CPU have - " + cores + " cores");
		System.out.println("Frequency - " + frequency + " mHz");
		System.out.println("Memory size - " + memorySize + " mb");
		System.out.println("HDD Capacity - " + hddCapacity + " bytes");
		System.out.println("Weight - " + weight + " kg");
		System.out.println("Display - " + display + " inch");
		System.out.println("Model - " + modelSymbol1 + modelSymbol2 + modelSymbol3 );
	}
}