package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class to2 implements z13 {
    public final l50 a;
    public final l50 b;
    public final l50 c;
    public final l50 d;

    public to2(l50 l50Var, l50 l50Var2, l50 l50Var3, l50 l50Var4) {
        this.a = l50Var;
        this.b = l50Var2;
        this.c = l50Var3;
        this.d = l50Var4;
    }

    public static to2 b(to2 to2Var, l50 l50Var, l50 l50Var2, l50 l50Var3, l50 l50Var4, int i) {
        if ((i & 1) != 0) {
            l50Var = to2Var.a;
        }
        if ((i & 2) != 0) {
            l50Var2 = to2Var.b;
        }
        if ((i & 4) != 0) {
            l50Var3 = to2Var.c;
        }
        if ((i & 8) != 0) {
            l50Var4 = to2Var.d;
        }
        to2Var.getClass();
        return new to2(l50Var, l50Var2, l50Var3, l50Var4);
    }

    @Override // defpackage.z13
    public final vr a(long j, bb1 bb1Var, ua0 ua0Var) {
        float fA = this.a.a(j, ua0Var);
        float fA2 = this.b.a(j, ua0Var);
        float fA3 = this.c.a(j, ua0Var);
        float fA4 = this.d.a(j, ua0Var);
        float fB = h43.b(j);
        float f = fA + fA4;
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbK = nc2.k("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbK.append(fA3);
            sbK.append(", bottomStart = ");
            sbK.append(fA4);
            sbK.append(")!");
            p21.a(sbK.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new w02(b32.b(0L, j));
        }
        jk2 jk2VarB = b32.b(0L, j);
        bb1 bb1Var2 = bb1.f;
        float f5 = bb1Var == bb1Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (bb1Var == bb1Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = bb1Var == bb1Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (bb1Var != bb1Var2) {
            fA4 = fA3;
        }
        return new x02(new ro2(jk2VarB.a, jk2VarB.b, jk2VarB.c, jk2VarB.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to2)) {
            return false;
        }
        to2 to2Var = (to2) obj;
        return s51.n(this.a, to2Var.a) && s51.n(this.b, to2Var.b) && s51.n(this.c, to2Var.c) && s51.n(this.d, to2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
