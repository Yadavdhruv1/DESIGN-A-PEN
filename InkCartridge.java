public class InkCartridge {
    InkType inkType;
    WritingColor color;
    InkLevel inkLevel;
    InkLevel capacity;

    public InkCartridge(InkType inkType, WritingColor color) {
        this.inkType = inkType;
        this.color = color;
        this.inkLevel = InkLevel.FULL;
        this.capacity = InkLevel.FULL;
    }

    public void refill(InkType inkType, WritingColor color) {
        this.inkType = inkType;
        this.color = color;
        this.inkLevel = InkLevel.FULL;
    }

    public boolean isEmpty() {
        return this.inkLevel == InkLevel.EMPTY;
    }

    public InkLevel getInkLevel() {
        return inkLevel;
    }

    public void useInk() {
        if (inkLevel == InkLevel.FULL) {
            inkLevel = InkLevel.LOW;
        } else if (inkLevel == InkLevel.LOW) {
            inkLevel = InkLevel.EMPTY;
        }
    }
}