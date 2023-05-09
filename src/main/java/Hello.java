public class Hello {
    public String getMess(){
        return "aaa";
    }

    private String a;
    private int b;

    public Hello() {
    }

    public Hello(String a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }
}
