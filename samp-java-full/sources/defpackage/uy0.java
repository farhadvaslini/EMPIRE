package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class uy0 {
    public final rs0 a;
    public final /* synthetic */ int b;

    public uy0(int i, rs0 rs0Var) {
        this.b = i;
        this.a = rs0Var;
    }

    public final float a(float f, ab1 ab1Var, ab1 ab1Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (ab1Var2.O(ab1Var, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (ab1Var.i0() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (ab1Var2.O(ab1Var, (((long) Float.floatToRawIntBits(((int) (ab1Var.i0() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
