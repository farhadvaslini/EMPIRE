package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bb0 extends p93 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public wr1 e;
    public Object f;
    public int g;

    public bb0(long j) {
        super(j);
        wr1 wr1Var = ay1.a;
        wr1Var.getClass();
        this.e = wr1Var;
        this.f = h;
    }

    @Override // defpackage.p93
    public final void a(p93 p93Var) {
        p93Var.getClass();
        bb0 bb0Var = (bb0) p93Var;
        this.e = bb0Var.e;
        this.f = bb0Var.f;
        this.g = bb0Var.g;
    }

    @Override // defpackage.p93
    public final p93 b(long j) {
        return new bb0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(cb0 cb0Var, t63 t63Var) {
        boolean z;
        boolean z2;
        Object obj = a73.c;
        synchronized (obj) {
            z = true;
            if (this.c == t63Var.g()) {
                z2 = this.d != t63Var.h();
            }
        }
        if (this.f == h || (z2 && this.g != d(cb0Var, t63Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = t63Var.g();
            this.d = t63Var.h();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[PHI: r11
      0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v10, types: [bb0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [p93] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, p93] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(cb0 cb0Var, t63 t63Var) {
        wr1 wr1Var;
        int iIdentityHashCode;
        long[] jArr;
        int i;
        Object[] objArr;
        long[] jArr2;
        ?? r25;
        Object[] objArr2;
        long j;
        long j2;
        int i2;
        ?? r252;
        ?? I;
        synchronized (a73.c) {
            wr1Var = this.e;
        }
        int i3 = 7;
        if (wr1Var.e == 0) {
            return 7;
        }
        qs1 qs1VarI = b32.i();
        Object[] objArr3 = qs1VarI.f;
        int i4 = qs1VarI.h;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            ((mv0) objArr3[i5]).b();
        }
        try {
            Object[] objArr4 = wr1Var.b;
            int[] iArr = wr1Var.c;
            long[] jArr3 = wr1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i6 = 0;
                while (true) {
                    long j3 = jArr3[i6];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8;
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        i = i3;
                        ?? r3 = z;
                        while (r3 < i8) {
                            if ((j3 & 255) < 128) {
                                int i9 = (i6 << 3) + r3;
                                j2 = j4;
                                n93 n93Var = (n93) objArr4[i9];
                                int i10 = i7;
                                if (iArr[i9] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (n93Var instanceof cb0) {
                                        cb0 cb0Var2 = (cb0) n93Var;
                                        I = cb0Var2.g((bb0) a73.i(cb0Var2.i, t63Var), t63Var, z, cb0Var2.g);
                                        wr1 wr1Var2 = I.e;
                                        Object[] objArr5 = wr1Var2.b;
                                        long[] jArr4 = wr1Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r252 = r3;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i11 = 0;
                                            while (true) {
                                                long j5 = jArr4[i11];
                                                j = j3;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j5) << i) & j5 & j2) != j2) {
                                                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                    for (int i13 = 0; i13 < i12; i13++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((n93) objArr5[(i11 << 3) + i13]);
                                                        }
                                                        j5 >>= i10;
                                                    }
                                                    if (i12 != i10) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    j3 = j;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r252 = r3;
                                        objArr2 = objArr4;
                                        j = j3;
                                        I = a73.i(n93Var.a(), t63Var);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(I)) * 31) + Long.hashCode(I.a);
                                    r25 = r252;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i2 = i7;
                            }
                            j3 = j >> i2;
                            i7 = i2;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i8 != i7) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i = i3;
                        objArr = objArr4;
                    }
                    if (i6 == length) {
                        i3 = iIdentityHashCode;
                        break;
                    }
                    i6++;
                    i3 = i;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            iIdentityHashCode = i3;
            Object[] objArr6 = qs1VarI.f;
            int i14 = qs1VarI.h;
            for (int i15 = 0; i15 < i14; i15++) {
                ((mv0) objArr6[i15]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = qs1VarI.f;
            int i16 = qs1VarI.h;
            for (int i17 = 0; i17 < i16; i17++) {
                ((mv0) objArr7[i17]).a();
            }
            throw th;
        }
    }
}
