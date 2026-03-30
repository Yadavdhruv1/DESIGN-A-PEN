public class RefillManager {

    public boolean refillInkCartridge(Pen pen, InkType type, WritingColor color) {
        if (pen.cartridge != null) {
            pen.cartridge.refill(type, color);
            return true;
        }
        return false;
    }
}