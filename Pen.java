public class Pen {
    PenType type;
    InkCartridge cartridge;
    String brand;

    public Pen(PenType type, String brand, InkCartridge cartridge) {
        this.type = type;
        this.brand = brand;
        this.cartridge = cartridge;
    }

    public String write(String text) {
        if (cartridge.isEmpty()) {
            return "Pen is out of ink!";
        }

        cartridge.useInk();
        return "Writing: " + text;
    }

    public boolean replaceRefill(PenType type, InkType inkType, WritingColor color) {
        this.cartridge = new InkCartridge(inkType, color);
        return true;
    }

    public boolean isPenEmpty() {
        return cartridge.isEmpty();
    }

    public InkLevel getInkLevel() {
        return cartridge.getInkLevel();
    }
}