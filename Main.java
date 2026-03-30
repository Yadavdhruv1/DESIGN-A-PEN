public class Main {
    public static void main(String[] args) {

        InkCartridge cartridge = new InkCartridge(InkType.GEL, WritingColor.BLUE);
        Pen pen = new Pen(PenType.GEL, "Reynolds", cartridge);

        System.out.println(pen.write("Hello World"));
        System.out.println("Ink Level: " + pen.getInkLevel());

        RefillManager manager = new RefillManager();
        manager.refillInkCartridge(pen, InkType.GEL, WritingColor.BLACK);

        System.out.println(pen.write("After refill"));
    }
}