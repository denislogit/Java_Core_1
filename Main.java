public class Main {
    public static void main(String[] args) {
/*int a = 1;
		byte b = 2;
		short c = 3;
		long d = 4;
		float e = 5;
		double f = 6;
		char g = 7;
		boolean h = true;

		System.out.println("int = " +Integer.MIN_VALUE+ " " +Integer.MAX_VALUE);
		System.out.println("byte = " +Byte.MIN_VALUE+ " " +Byte.MAX_VALUE);
		System.out.println("short = " +Short.MIN_VALUE+ " " +Short.MAX_VALUE);
		System.out.println("long = " +Long.MIN_VALUE+ " " +Long.MAX_VALUE);
		System.out.println("float = " +Float.MIN_VALUE+ " " +Float.MAX_VALUE);
		System.out.println("double = " +Double.MIN_VALUE+ " " +Double.MAX_VALUE);
		System.out.println("char = " +Character.MIN_VALUE+ " " +Character.MAX_VALUE);
		System.out.println("boolean = " + "true" + " " + "false");*/



        int[] array = {5, 14, 19, 1, 21, 25, 6};
        int minValue = array[0];
        int maxValue = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        for (int c = 0; c < array.length; c++) {
            if (array[c] > maxValue) {
                maxValue = array[c];
            }
        }
        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);

    }

}