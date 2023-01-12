public class StringBufferReverse {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("ASDFGHQWERTYUIJ");
        sb=sb.reverse();
        System.out.println(sb);

        sb.delete(4,9);
        System.out.println(sb);

    }
}
