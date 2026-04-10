public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        byte byteValue = 100;
        short shortValue = 127;
        long longValue = 5854L;
        float floatValue = 3.14f;
        double doubleValue = 3.141592653589793;
        char charValue = 'A';
        boolean booleanValue = true;
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
        int binaryValue = 0b101;
        System.out.println("Binary value (0b101): " + binaryValue);
        int hexValue = 0x7e;
        System.out.println("Hexadecimal value (0x7e): " + hexValue);
    }
}
