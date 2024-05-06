public class Main
{
    public static void main(String[] args) {
        Romano romano = new Romano("DCCLXXXVIII");
        System.out.println(romano.toArabic());
        Arabic arabic = new Arabic(788);
        System.out.println(arabic.getNumberRomanic());

    }
}
