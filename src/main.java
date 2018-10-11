public class main {
    public static void main (String []Args){
        System.out.println("Lab #2 Java. Performed by Radchenko A.V. IS-61");
        System.out.println("Task #12: Search words in text and group words that have similar first and last letters");
        System.out.println("Default text: ");
        System.out.print("\n");
        String text = "This text is performed by me. Nothing can be simplier. dumb! Pulp-";
        System.out.print(text + "\n");
        Solution solve = new Solution();
        System.out.print("\n");
        System.out.println("Divided paired words:");
        System.out.print("\n");
        solve.out(solve.parse(text));
    }
}
