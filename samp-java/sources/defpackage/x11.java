package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x11 implements ze0 {
    public final se0 f;
    public s11 g;
    public v11 h;
    public u11 i;
    public t11 j;
    public br k;
    public op3 l;
    public vx0 m;
    public final s4 n;
    public final s4 o;

    public x11(se0 se0Var) {
        this.f = se0Var;
        s4 s4Var = new s4();
        s4Var.b = new as1();
        this.n = s4Var;
        s4 s4Var2 = new s4();
        s4Var2.b = new rr1();
        this.o = s4Var2;
    }

    public static void c(x11 x11Var, q11 q11Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        se0 se0Var = x11Var.f;
        u11 u11Var = x11Var.i;
        if (u11Var == null) {
            u11Var = new u11();
            u11Var.k = null;
            u11Var.l = Long.MAX_VALUE;
            u11Var.m = false;
            x11Var.i = u11Var;
        }
        u11Var.k = q11Var;
        u11Var.l = j;
        vx0 vx0Var = x11Var.m;
        t02 t02Var = se0Var.v;
        if (vx0Var == null) {
            x11Var.m = new vx0(t02Var);
        } else {
            vx0Var.b = t02Var;
            vx0Var.a = j2;
        }
        u11Var.m = false;
        x11Var.k = u11Var;
    }

    @Override // defpackage.ze0
    public final t02 E() {
        return this.f.v;
    }

    @Override // defpackage.aw0
    public final String V0() {
        br brVar = this.k;
        return brVar instanceof s11 ? ((s11) brVar).m ? "waiting" : "idle" : ((brVar instanceof u11) || (brVar instanceof t11)) ? "waiting" : brVar instanceof v11 ? "recognized" : "idle";
    }

    public final void a() {
        s11 s11Var = this.g;
        r11 r11Var = r11.h;
        if (s11Var == null) {
            s11Var = new s11();
            s11Var.k = r11Var;
            s11Var.l = false;
            s11Var.m = false;
            this.g = s11Var;
        }
        s11Var.k = r11Var;
        s11Var.l = false;
        s11Var.m = false;
        this.k = s11Var;
    }

    public final void b(q11 q11Var, long j, vx0 vx0Var) {
        t11 t11Var = this.j;
        if (t11Var == null) {
            t11Var = new t11();
            t11Var.k = null;
            t11Var.l = Long.MAX_VALUE;
            this.j = t11Var;
        }
        t11Var.k = q11Var;
        t11Var.l = j;
        vx0Var.a = 0L;
        this.k = t11Var;
    }

    public final op3 d() {
        op3 op3Var = this.l;
        if (op3Var != null) {
            return op3Var;
        }
        c.p("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(q11 q11Var, p11 p11Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = q11Var.c;
        se0 se0Var = this.f;
        t02 t02Var = se0Var.v;
        t02Var.getClass();
        af0 af0Var = bf0.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (t02Var == t02.f ? j & 4294967295L : j >> 32))) > 2.0f) {
            op3 op3VarD = d();
            t02 t02Var2 = se0Var.v;
            s4 s4Var = this.n;
            as1 as1Var = (as1) s4Var.b;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (lr.q(q11Var)) {
                s4Var.a = 0;
                as1Var.e();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (lr.i(q11Var) || lr.q(q11Var)) {
                j2 = 4294967295L;
            } else {
                if (as1Var.b == 3) {
                    int i = s4Var.a;
                    s4Var.a = i + 1;
                    as1Var.o(i, q11Var);
                } else {
                    as1Var.b(q11Var);
                }
                if (s4Var.a == 3) {
                    s4Var.a = 0;
                }
                Object[] objArr = as1Var.a;
                int i2 = as1Var.b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((q11) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = as1Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = as1Var.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((q11) objArr2[i5]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / as1Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (t02Var2 != null) {
                int i6 = p11Var.a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = t02Var2 == t02.g ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ((ol1) op3VarD.a).a(q11Var.b, jFloatToRawIntBits);
            s4 s4Var2 = this.o;
            rr1 rr1Var = (rr1) s4Var2.b;
            int i7 = rr1Var.b;
            if (i7 == 3) {
                int i8 = s4Var2.a;
                s4Var2.a = i8 + 1;
                if (i8 < 0 || i8 >= i7) {
                    c.i("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = rr1Var.a;
                    long j5 = jArr[i8];
                    jArr[i8] = j;
                }
            } else {
                rr1Var.a(j);
            }
            if (s4Var2.a == 3) {
                s4Var2.a = 0;
            }
            long[] jArr2 = rr1Var.a;
            int i9 = rr1Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
            }
            int i11 = rr1Var.b;
            float f = fIntBitsToFloat7 / i11;
            long[] jArr3 = rr1Var.a;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + fIntBitsToFloat4;
            }
            se0Var.A1(new yd0((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / rr1Var.b)) & j2), true));
        }
    }

    public final void f(q11 q11Var, q11 q11Var2, p11 p11Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.l == null) {
            this.l = new op3();
        }
        op3 op3VarD = d();
        se0 se0Var = this.f;
        t02 t02Var = se0Var.v;
        s4 s4Var = this.n;
        as1 as1Var = (as1) s4Var.b;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (q11Var.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (q11Var.c & 4294967295L));
        if (lr.q(q11Var)) {
            s4Var.a = 0;
            as1Var.e();
        }
        if (lr.i(q11Var) || lr.q(q11Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (as1Var.b == 3) {
                int i = s4Var.a;
                s4Var.a = i + 1;
                as1Var.o(i, q11Var);
            } else {
                as1Var.b(q11Var);
            }
            if (s4Var.a == 3) {
                s4Var.a = 0;
            }
            Object[] objArr = as1Var.a;
            int i2 = as1Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((q11) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = as1Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = as1Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((q11) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / as1Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (t02Var != null) {
            int i6 = p11Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = t02Var == t02.g ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        ((ol1) op3VarD.a).a(q11Var.b, jFloatToRawIntBits);
        long jD = gy1.d(lr.O(q11Var2, se0Var.v, p11Var), j);
        if (((Boolean) se0Var.w.h(new ob2(1))).booleanValue()) {
            se0Var.A1(new zd0(jD));
        }
        s4 s4Var2 = this.o;
        s4Var2.a = 0;
        ((rr1) s4Var2.b).b = 0;
    }
}
