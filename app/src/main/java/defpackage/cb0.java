package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cb0 extends o93 implements e93 {
    public final cs0 g;
    public final h73 h;
    public bb0 i = new bb0(a73.j().g());

    public cb0(cs0 cs0Var, h73 h73Var) {
        this.g = cs0Var;
        this.h = h73Var;
    }

    @Override // defpackage.n93
    public final p93 a() {
        return this.i;
    }

    @Override // defpackage.n93
    public final void c(p93 p93Var) {
        p93Var.getClass();
        this.i = (bb0) p93Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bb0 g(bb0 bb0Var, t63 t63Var, boolean z, cs0 cs0Var) {
        qs1 qs1VarI;
        h73 h73Var;
        int i;
        bb0 bb0Var2 = bb0Var;
        if (bb0Var2.c(this, t63Var)) {
            if (z) {
                qs1VarI = b32.i();
                Object[] objArr = qs1VarI.f;
                int i2 = qs1VarI.h;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((mv0) objArr[i3]).b();
                }
                try {
                    wr1 wr1Var = bb0Var2.e;
                    pi piVar = i73.a;
                    n41 n41Var = (n41) piVar.j();
                    if (n41Var == null) {
                        n41Var = new n41();
                        piVar.K(n41Var);
                    }
                    int i4 = n41Var.a;
                    Object[] objArr2 = wr1Var.b;
                    int[] iArr = wr1Var.c;
                    long[] jArr = wr1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        n93 n93Var = (n93) objArr2[i9];
                                        i = i6;
                                        n41Var.a = i4 + iArr[i9];
                                        ns0 ns0VarE = t63Var.e();
                                        if (ns0VarE != null) {
                                            ns0VarE.h(n93Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    n41Var.a = i4;
                    Object[] objArr3 = qs1VarI.f;
                    int i10 = qs1VarI.h;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((mv0) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bb0Var2;
        }
        wr1 wr1Var2 = new wr1();
        pi piVar2 = i73.a;
        n41 n41Var2 = (n41) piVar2.j();
        if (n41Var2 == null) {
            n41Var2 = new n41();
            piVar2.K(n41Var2);
        }
        int i12 = n41Var2.a;
        qs1VarI = b32.i();
        Object[] objArr4 = qs1VarI.f;
        int i13 = qs1VarI.h;
        for (int i14 = 0; i14 < i13; i14++) {
            ((mv0) objArr4[i14]).b();
        }
        try {
            n41Var2.a = i12 + 1;
            Object objT = jo3.t(new b5(this, n41Var2, wr1Var2, i12), cs0Var);
            n41Var2.a = i12;
            Object[] objArr5 = qs1VarI.f;
            int i15 = qs1VarI.h;
            for (int i16 = 0; i16 < i15; i16++) {
                ((mv0) objArr5[i16]).a();
            }
            Object obj = a73.c;
            synchronized (obj) {
                try {
                    t63 t63VarJ = a73.j();
                    Object obj2 = bb0Var2.f;
                    if (obj2 == bb0.h || (h73Var = this.h) == null || !h73Var.d(objT, obj2)) {
                        bb0 bb0Var3 = this.i;
                        synchronized (obj) {
                            p93 p93VarM = a73.m(bb0Var3, this);
                            p93VarM.a(bb0Var3);
                            p93VarM.a = t63VarJ.g();
                            bb0Var2 = (bb0) p93VarM;
                            bb0Var2.e = wr1Var2;
                            bb0Var2.g = bb0Var2.d(this, t63VarJ);
                            bb0Var2.f = objT;
                        }
                        return bb0Var2;
                    }
                    bb0Var2.e = wr1Var2;
                    bb0Var2.g = bb0Var2.d(this, t63VarJ);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n41 n41Var3 = (n41) i73.a.j();
            if (n41Var3 == null || n41Var3.a != 0) {
                return bb0Var2;
            }
            a73.j().m();
            synchronized (obj) {
                t63 t63VarJ2 = a73.j();
                bb0Var2.c = t63VarJ2.g();
                bb0Var2.d = t63VarJ2.h();
                return bb0Var2;
            }
        } finally {
            Object[] objArr6 = qs1VarI.f;
            int i17 = qs1VarI.h;
            for (int i18 = 0; i18 < i17; i18++) {
                ((mv0) objArr6[i18]).a();
            }
        }
    }

    @Override // defpackage.e93
    public final Object getValue() {
        ns0 ns0VarE = a73.j().e();
        if (ns0VarE != null) {
            ns0VarE.h(this);
        }
        t63 t63VarJ = a73.j();
        return g((bb0) a73.i(this.i, t63VarJ), t63VarJ, true, this.g).f;
    }

    public final bb0 h() {
        t63 t63VarJ = a73.j();
        return g((bb0) a73.i(this.i, t63VarJ), t63VarJ, false, this.g);
    }

    public final String toString() {
        bb0 bb0Var = (bb0) a73.h(this.i);
        return "DerivedState(value=" + (bb0Var.c(this, a73.j()) ? String.valueOf(bb0Var.f) : "<Not calculated>") + ")@" + hashCode();
    }
}
