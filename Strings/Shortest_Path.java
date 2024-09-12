public class Shortest_Path {
    public static int shortestPath(String str) {
        int x = 0; int y = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='N') {
                y++;
            } else if(str.charAt(i)=='S') {
                y--;
            } else if(str.charAt(i)=='E') {
                x++;
            } else if(str.charAt(i)=='W') {
                x--;
            }
        }
        int shortestPath = (int)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        return shortestPath;
    }
    public static String subString(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]) {
        // String str ="WNEENESENNN";
        // System.out.println(shortestPath(str));
        // String str1 = "Tony";
        // String str2 = "Tony";
        // String str3 = new String("Tony");
        // if(str1 == str2) {
        //     System.out.println("The strings are same...");
        // } else {
        //     System.out.println("THe strings are not same...");
        // }
        // if(str1.equals(str3)) {
        //     System.out.println("The strings are same...");
        // } else {
        //     System.out.println("THe strings are not same...");
        // }
        
        //substring
        String str = "HelloWorld";
        // System.out.println(subString(str, 0, 4));
        System.out.println(str.substring(0, 5));
    }
} 