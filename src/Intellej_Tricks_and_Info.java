public class Intellej_Tricks_and_Info {
    public static void main(String[] args) {
        // In Intellej, typing "main" in a brand-new class file pulls up "public static void main(String[] args)"
        //without having to type it manually again and again.
        System.out.println("sout"); // Typing sout pulls in System.out.println without having to type the whole thing
        int var1 = 5;
        var1 += 90;
        var1 *= 2;
        var1 ++;
        System.out.println(var1); // now here, our variable "var1" is mentioned a lot, would be a pain to change each
        // usage of this variable one by one, to make this process a lot more streamlined, we just press L shift + f6
    }
}
