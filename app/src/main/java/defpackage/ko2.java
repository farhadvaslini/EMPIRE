package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ko2 {
    public static final t20 a = new t20(new f62(8));
    public static final mo2 b;
    public static final mo2 c;

    static {
        long j = wx.g;
        b = new mo2(true, Float.NaN, j);
        c = new mo2(false, Float.NaN, j);
    }

    public static mo2 a(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = wx.g;
        }
        return (jd0.b(f, Float.NaN) && wx.c(j, wx.g)) ? z ? b : c : new mo2(z, f, j);
    }
}
