public class Main {
    public static void main(String[] args) {
        class HelloWorld {

            static String mulString(String p, int n) {
                String result = "";
                for (int i = 0; i < n; i++)
                    result += p;
                return result;
            }

            public static void main(String[] args) {

                System.out.println(mulString("A", 100));
            }
        }
    }
}