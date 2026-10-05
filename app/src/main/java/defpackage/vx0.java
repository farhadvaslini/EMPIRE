package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 {
    public long a;
    public Object b;

    public vx0(long j, t02 t02Var) {
        this.b = t02Var;
        this.a = j;
    }

    public static long a(vx0 vx0Var, long j, float f) {
        long jE = gy1.e(vx0Var.a, j);
        vx0Var.a = jE;
        float fC = ((t02) vx0Var.b) == null ? gy1.c(jE) : Math.abs(vx0Var.b(jE));
        if (fC <= 0.0f || fC < f) {
            return 9205357640488583168L;
        }
        t02 t02Var = (t02) vx0Var.b;
        long j2 = vx0Var.a;
        if (t02Var == null) {
            float fC2 = gy1.c(j2);
            return gy1.d(vx0Var.a, gy1.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fC2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fC2)) & 4294967295L)));
        }
        float fB = vx0Var.b(j2) - (Math.signum(vx0Var.b(vx0Var.a)) * f);
        long j3 = vx0Var.a;
        t02 t02Var2 = (t02) vx0Var.b;
        t02 t02Var3 = t02.g;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (t02Var2 == t02Var3 ? j3 & 4294967295L : j3 >> 32));
        if (((t02) vx0Var.b) == t02Var3) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public float b(long j) {
        return Float.intBitsToFloat((int) (((t02) this.b) == t02.g ? j >> 32 : j & 4294967295L));
    }

    public ux0 c() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strQ = ((rp) this.b).q(this.a);
            this.a -= (long) strQ.length();
            if (strQ.length() == 0) {
                return new ux0((String[]) arrayList.toArray(new String[0]));
            }
            int iN0 = y93.n0(strQ, ':', 1, 4);
            if (iN0 != -1) {
                String strSubstring = strQ.substring(0, iN0);
                String strSubstring2 = strQ.substring(iN0 + 1);
                arrayList.add(strSubstring);
                arrayList.add(y93.G0(strSubstring2).toString());
            } else if (strQ.charAt(0) == ':') {
                String strSubstring3 = strQ.substring(1);
                arrayList.add("");
                arrayList.add(y93.G0(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(y93.G0(strQ).toString());
            }
        }
    }

    public /* synthetic */ vx0(t02 t02Var) {
        this(0L, t02Var);
    }
}
