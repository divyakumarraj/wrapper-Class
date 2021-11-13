public class IntToBinary{
    public static void main(String[] args) {
        int i = 20;
        String s= Integer.toBinaryString(i);
        String q= Integer.toOctalString(i);
        String w= Integer.toHexString(i);
        System.out.println("the Integer in base 2 of " +i+ " is "+s);
        System.out.println("the Integer in Octal of " +i+ " is "+q);
        System.out.println("the Integer in hexadecimal of " +i+ " is "+w);
    }

}
