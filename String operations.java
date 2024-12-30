public class g
 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("JOE");
        sb.append("movie");
        System.out.println("after appending:" + sb);
        sb.insert(3,"is a");
        System.out.println("After indexing:" +sb);
        sb.replace(0,2,"kgf");
        System.out.println("After replacing:" +sb);
        sb.delete(4,7);
        System.out.println("After deleting:" +sb);
        sb.reverse();
        System.out.println("After reversing:" +sb);
        int capacity=sb.capacity();
        System.out.println("Current capacity:" +capacity);
        int length=sb.length();
        System.out.println("String length:" +length);
        char charAt7=sb.charAt(7);
        System.out.println("character at given index:" +charAt7);
        sb.setCharAt(5,'v');
        System.out.println("After changing char at given index:" +sb);
        String Substring=sb.substring(5,6);
        System.out.println("printing substring for given range:" +Substring);
        int n=sb.indexOf("movie");
        System.out.println("printing index:" +n);
        sb.deleteCharAt(6);
        System.out.println("After deleting character:" +sb);
        String result=sb.toString();
        System.out.println("Final string:" +result);
    }
    
}
