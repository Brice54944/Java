public class RGBEqualsMain {
    public static void main(String[] args) {
        RGB rgb1 = new RGB(0.1,0.2,0.3);
        RGB rgb2 = new RGB(0.3,0.2,0.1);
        RGB rgb3 = rgb2;
        RGB rgb4 = new RGB(0.1,0.2,0.3);
        boolean b = rgb2.equals(rgb3);
        boolean c = (rgb1 == rgb4);
        System.out.println(b);
        System.out.println(c);
        System.out.println(rgb2.hasValueInRange());
    }
}
