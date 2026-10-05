package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 implements Comparable {
    public static final xq0 g;
    public static final xq0 h;
    public static final xq0 i;
    public static final xq0 j;
    public static final xq0 k;
    public final int f;

    static {
        xq0 xq0Var = new xq0(100);
        xq0 xq0Var2 = new xq0(200);
        xq0 xq0Var3 = new xq0(300);
        xq0 xq0Var4 = new xq0(400);
        xq0 xq0Var5 = new xq0(500);
        xq0 xq0Var6 = new xq0(600);
        g = xq0Var6;
        xq0 xq0Var7 = new xq0(700);
        xq0 xq0Var8 = new xq0(800);
        xq0 xq0Var9 = new xq0(900);
        h = xq0Var4;
        i = xq0Var5;
        j = xq0Var6;
        k = xq0Var7;
        vr.L(xq0Var, xq0Var2, xq0Var3, xq0Var4, xq0Var5, xq0Var6, xq0Var7, xq0Var8, xq0Var9);
    }

    public xq0(int i2) {
        this.f = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        n21.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return s51.r(this.f, ((xq0) obj).f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xq0) {
            return this.f == ((xq0) obj).f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f;
    }

    public final String toString() {
        return by1.h("FontWeight(weight=", ")", this.f);
    }
}
