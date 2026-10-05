package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class mu2 {
    public static final re a = new re(Float.NaN, Float.NaN);
    public static final bl3 b = new bl3(new cr2(15), new cr2(16));
    public static final long c;
    public static final s83 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new s83(new gy1(jFloatToRawIntBits));
    }
}
