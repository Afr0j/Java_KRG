public class ReplaceSubString {
    public static void main(String[] args) {
        String str="ASDFGHJKQWERTYU";
        String subStr=str.substring(2,7);
        String otherStr="12346";
        System.out.println(str);
        System.out.println(subStr);
        System.out.println(str.replace(str.substring(2,7),otherStr));
    }
}
