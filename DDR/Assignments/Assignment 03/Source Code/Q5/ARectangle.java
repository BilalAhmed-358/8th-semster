// ARectangle.java
public class ARectangle extends AShape {
    protected float wd;
    protected float ht;

    public ARectangle(float ptX, float ptY, float wd, float ht) {
        this.ptX = ptX;
        this.ptY = ptY;
        this.wd = wd;
        this.ht = ht;
    }

    public float area() {
        return wd * ht;
    }

    public float perimeter() {
        return 2 * (wd + ht);
    }

    public boolean holds(float x, float y) {
        return x >= ptX - wd / 2 && x <= ptX + wd / 2 && y >= ptY - ht / 2 && y <= ptY + ht / 2;
    }

    public boolean holds(AShape shape) {
        if (shape instanceof ARectangle) {
            ARectangle rect = (ARectangle) shape;
            return ptX - wd / 2 <= rect.ptX - rect.wd / 2 &&
                    ptX + wd / 2 >= rect.ptX + rect.wd / 2 &&
                    ptY - ht / 2 <= rect.ptY - rect.ht / 2 &&
                    ptY + ht / 2 >= rect.ptY + rect.ht / 2;
        }
        return false;
    }

    public boolean covers(AShape shape) {
        if (shape instanceof ARectangle) {
            ARectangle rect = (ARectangle) shape;
            return ptX - wd / 2 <= rect.ptX + rect.wd / 2 &&
                    ptX + wd / 2 >= rect.ptX - rect.wd / 2 &&
                    ptY - ht / 2 <= rect.ptY + rect.ht / 2 &&
                    ptY + ht / 2 >= rect.ptY - rect.ht / 2;
        }
        return false;
    }
}
