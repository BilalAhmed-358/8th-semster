public class ARectangle implements IShape {
    private float ptX;
    private float ptY;
    private float wd;
    private float ht;

    public ARectangle(float ptX, float ptY, float wd, float ht) {
        this.ptX = ptX;
        this.ptY = ptY;
        this.wd = wd;
        this.ht = ht;
    }

    @Override
    public float area() {
        return wd * ht;
    }

    @Override
    public float perimeter() {
        return 2 * (wd + ht);
    }

    @Override
    public boolean holds(float x, float y) {
        return x >= ptX - wd / 2 && x <= ptX + wd / 2 && y >= ptY - ht / 2 && y <= ptY + ht / 2;
    }

    @Override
    public boolean holds(IShape shape) {
        if (shape instanceof ARectangle) {
            ARectangle rect = (ARectangle) shape;
            return ptX - wd / 2 <= rect.ptX - rect.wd / 2 &&
                    ptX + wd / 2 >= rect.ptX + rect.wd / 2 &&
                    ptY - ht / 2 <= rect.ptY - rect.ht / 2 &&
                    ptY + ht / 2 >= rect.ptY + rect.ht / 2;
        }
        return false;
    }

    @Override
    public boolean covers(IShape shape) {
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
