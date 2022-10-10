public class Shop implements Printable{
    private int name;

    public int getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Название магазина: "+getName());
    }
}
