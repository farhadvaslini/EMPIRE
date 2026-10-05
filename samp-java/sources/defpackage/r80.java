package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class r80 extends mb3 implements rs0 {
    public final /* synthetic */ int j = 0;
    public nk2 k;
    public int l;
    public final /* synthetic */ float m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ cs2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(o63 o63Var, float f, ns0 ns0Var, cs2 cs2Var, p40 p40Var) {
        super(2, p40Var);
        this.n = o63Var;
        this.m = f;
        this.o = ns0Var;
        this.p = cs2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((r80) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                ts2 ts2Var = (ts2) this.p;
                return new r80(this.m, (s80) obj2, ts2Var, p40Var);
            default:
                cs2 cs2Var = this.p;
                return new r80((o63) this.n, this.m, (ns0) obj2, cs2Var, p40Var);
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [l63] */
    @Override // defpackage.ml
    public final Object o(Object obj) {
        nk2 nk2Var;
        pe peVar;
        float f;
        y50 y50Var;
        float fSignum;
        final nk2 nk2Var2;
        Object objB;
        float f2;
        int i = this.j;
        y50 y50Var2 = y50.f;
        float f3 = this.m;
        Object obj2 = this.o;
        final int i2 = 0;
        switch (i) {
            case 0:
                int i3 = this.l;
                if (i3 != 0) {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    peVar = (pe) this.n;
                    nk2Var = this.k;
                    try {
                        y02.Q(obj);
                    } catch (CancellationException unused) {
                        nk2Var.f = ((Number) peVar.a()).floatValue();
                    }
                    f3 = nk2Var.f;
                    break;
                } else {
                    y02.Q(obj);
                    if (Math.abs(f3) > 1.0f) {
                        nk2Var = new nk2();
                        nk2Var.f = f3;
                        nk2 nk2Var3 = new nk2();
                        pe peVarC = cl3.c(0.0f, f3, 28);
                        try {
                            s80 s80Var = (s80) obj2;
                            h80 h80Var = s80Var.a;
                            v1 v1Var = new v1(nk2Var3, (ts2) this.p, nk2Var, s80Var);
                            this.k = nk2Var;
                            this.n = peVarC;
                            this.l = 1;
                            if (t22.n(peVarC, h80Var, false, v1Var, this) == y50Var2) {
                                return y50Var2;
                            }
                        } catch (CancellationException unused2) {
                            peVar = peVarC;
                            nk2Var.f = ((Number) peVar.a()).floatValue();
                        }
                        f3 = nk2Var.f;
                    }
                }
                return new Float(f3);
            default:
                final ns0 ns0Var = (ns0) obj2;
                o63 o63Var = (o63) this.n;
                a31 a31Var = o63Var.a;
                int i4 = this.l;
                if (i4 == 0) {
                    y02.Q(obj);
                    float f4 = ((qe) new pl(12, o63Var.b.a).w(new qe(0.0f), new qe(f3))).a;
                    i32 i32Var = (i32) a31Var.g;
                    int iO = i32Var.o();
                    d42 d42Var = i32Var.m;
                    int i5 = ((y22) d42Var.getValue()).c + iO;
                    if (i5 == 0) {
                        fSignum = 0.0f;
                        f = 0.0f;
                        y50Var = y50Var2;
                    } else {
                        int i6 = i32Var.e;
                        if (f3 < 0.0f) {
                            i6++;
                        }
                        int iH = y02.h(((int) (f4 / i5)) + i6, 0, i32Var.n());
                        i32Var.o();
                        int i7 = ((y22) d42Var.getValue()).c;
                        f = 0.0f;
                        y50Var = y50Var2;
                        long j = i6;
                        long j2 = j - 1;
                        int i8 = (int) (j2 < 0 ? 0L : j2);
                        long j3 = j + 1;
                        if (j3 > 2147483647L) {
                            j3 = 2147483647L;
                        }
                        int iAbs = Math.abs((y02.h(y02.h(iH, i8, (int) j3), 0, i32Var.n()) - i6) * i5) - i5;
                        if (iAbs < 0) {
                            iAbs = 0;
                        }
                        fSignum = iAbs == 0 ? iAbs : Math.signum(f3) * iAbs;
                    }
                    if (Float.isNaN(fSignum)) {
                        p21.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    nk2Var2 = new nk2();
                    float fSignum2 = Math.signum(f3) * Math.abs(fSignum);
                    nk2Var2.f = fSignum2;
                    ns0Var.h(new Float(fSignum2));
                    float f5 = nk2Var2.f;
                    ?? r4 = new ns0() { // from class: l63
                        @Override // defpackage.ns0
                        public final Object h(Object obj3) {
                            int i9 = i2;
                            dm3 dm3Var = dm3.a;
                            ns0 ns0Var2 = ns0Var;
                            nk2 nk2Var4 = nk2Var2;
                            float fFloatValue = ((Float) obj3).floatValue();
                            switch (i9) {
                                case 0:
                                    float f6 = nk2Var4.f - fFloatValue;
                                    nk2Var4.f = f6;
                                    ns0Var2.h(Float.valueOf(f6));
                                    break;
                                default:
                                    float f7 = nk2Var4.f - fFloatValue;
                                    nk2Var4.f = f7;
                                    ns0Var2.h(Float.valueOf(f7));
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    this.k = nk2Var2;
                    this.l = 1;
                    objB = o63.b(o63Var, this.p, f5, this.m, r4, this);
                    if (objB == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y02.Q(obj);
                            return obj;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nk2 nk2Var4 = this.k;
                    y02.Q(obj);
                    f = 0.0f;
                    y50Var = y50Var2;
                    nk2Var2 = nk2Var4;
                    objB = obj;
                }
                pe peVar2 = (pe) objB;
                float fFloatValue = ((Number) peVar2.a()).floatValue();
                i32 i32Var2 = (i32) a31Var.g;
                m22 m22Var = i32Var2.m().n;
                List list = i32Var2.m().a;
                int size = list.size();
                float f6 = Float.NEGATIVE_INFINITY;
                float f7 = Float.POSITIVE_INFINITY;
                while (i2 < size) {
                    fn1 fn1Var = (fn1) list.get(i2);
                    t22.z(i32Var2.m());
                    int i9 = i32Var2.m().f;
                    int i10 = i32Var2.m().d;
                    int i11 = i32Var2.m().b;
                    int i12 = fn1Var.j;
                    i32Var2.n();
                    m22Var.getClass();
                    float f8 = i12 - f;
                    if (f8 <= f && f8 > f6) {
                        f6 = f8;
                    }
                    if (f8 >= f && f8 < f7) {
                        f7 = f8;
                    }
                    i2++;
                }
                if (f6 == Float.NEGATIVE_INFINITY) {
                    f6 = f7;
                }
                if (f7 == Float.POSITIVE_INFINITY) {
                    f7 = f6;
                }
                if (!i32Var2.c()) {
                    if (d32.t(i32Var2, fFloatValue)) {
                        f6 = f;
                        f7 = f6;
                    } else {
                        f7 = f;
                    }
                }
                if (i32Var2.a()) {
                    f2 = f7;
                } else if (d32.t(i32Var2, fFloatValue)) {
                    f6 = f;
                    f2 = f7;
                } else {
                    f2 = f;
                    f6 = f2;
                }
                float fFloatValue2 = ((Number) ((w91) a31Var.h).e(Float.valueOf(fFloatValue), Float.valueOf(f6), Float.valueOf(f2))).floatValue();
                if (fFloatValue2 != f6 && fFloatValue2 != f2 && fFloatValue2 != f) {
                    p21.c("Final Snapping Offset Should Be one of " + f6 + ", " + f2 + " or 0.0");
                }
                if (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) {
                    fFloatValue2 = f;
                }
                if (Float.isNaN(fFloatValue2)) {
                    p21.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                nk2Var2.f = fFloatValue2;
                float f9 = f;
                pe peVarK = cl3.k(peVar2, f9, f9, 30);
                s83 s83Var = o63Var.c;
                final int i13 = 1;
                ns0 ns0Var2 = new ns0() { // from class: l63
                    @Override // defpackage.ns0
                    public final Object h(Object obj3) {
                        int i92 = i13;
                        dm3 dm3Var = dm3.a;
                        ns0 ns0Var22 = ns0Var;
                        nk2 nk2Var42 = nk2Var2;
                        float fFloatValue3 = ((Float) obj3).floatValue();
                        switch (i92) {
                            case 0:
                                float f62 = nk2Var42.f - fFloatValue3;
                                nk2Var42.f = f62;
                                ns0Var22.h(Float.valueOf(f62));
                                break;
                            default:
                                float f72 = nk2Var42.f - fFloatValue3;
                                nk2Var42.f = f72;
                                ns0Var22.h(Float.valueOf(f72));
                                break;
                        }
                        return dm3Var;
                    }
                };
                this.k = null;
                this.l = 2;
                Object objY = g12.y(this.p, fFloatValue2, fFloatValue2, peVarK, s83Var, ns0Var2, this);
                return objY == y50Var ? y50Var : objY;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(float f, s80 s80Var, ts2 ts2Var, p40 p40Var) {
        super(2, p40Var);
        this.m = f;
        this.o = s80Var;
        this.p = ts2Var;
    }
}
