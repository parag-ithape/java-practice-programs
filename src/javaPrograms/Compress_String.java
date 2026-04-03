package javaPrograms;

public class Compress_String 
{

	public static void main(String[] args) 
	{
        String input = "aabbbcccccddddffjjj";
        String output = compressString(input);
        System.out.println(output);
    }

    public static String compressString(String input) {
        String compressed = "";
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed += count + "" + input.charAt(i - 1);
                count = 1;
            }
        }

        compressed += count + "" + input.charAt(input.length() - 1);
        return compressed;
    }
}