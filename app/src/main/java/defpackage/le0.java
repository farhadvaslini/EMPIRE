package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class le0 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (defpackage.gy1.b(defpackage.w22.D(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(rb3 rb3Var, long j, q40 q40Var) {
        ce0 ce0Var;
        pk2 pk2Var;
        Object objC;
        y50 y50Var;
        Object obj;
        Object obj2;
        if (q40Var instanceof ce0) {
            ce0Var = (ce0) q40Var;
            int i = ce0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ce0Var.l = i - Integer.MIN_VALUE;
            } else {
                ce0Var = new ce0(q40Var);
            }
        }
        Object obj3 = ce0Var.k;
        int i2 = ce0Var.l;
        if (i2 == 0) {
            y02.Q(obj3);
            if (!g(rb3Var.k.y, j)) {
                pk2Var = new pk2();
                pk2Var.f = j;
                ce0Var.i = rb3Var;
                ce0Var.j = pk2Var;
                ce0Var.l = 1;
                objC = rb3Var.c(ab2.g, ce0Var);
                y50Var = y50.f;
                if (objC != y50Var) {
                }
            }
            return null;
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pk2 pk2Var2 = ce0Var.j;
        rb3 rb3Var2 = ce0Var.i;
        y02.Q(obj3);
        pk2 pk2Var3 = pk2Var2;
        rb3Var = rb3Var2;
        za2 za2Var = (za2) obj3;
        List list = za2Var.a;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (d32.l(((gb2) obj).a, pk2Var3.f)) {
                break;
            }
            i4++;
        }
        gb2 gb2Var = (gb2) obj;
        if (gb2Var == null) {
            if (w22.n(gb2Var)) {
                List list2 = za2Var.a;
                int size2 = list2.size();
                while (true) {
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i3);
                    if (((gb2) obj2).d) {
                        break;
                    }
                    i3++;
                }
                gb2 gb2Var2 = (gb2) obj2;
                if (gb2Var2 != null) {
                    pk2Var3.f = gb2Var2.a;
                    pk2Var = pk2Var3;
                    ce0Var.i = rb3Var;
                    ce0Var.j = pk2Var;
                    ce0Var.l = 1;
                    objC = rb3Var.c(ab2.g, ce0Var);
                    y50Var = y50.f;
                    if (objC != y50Var) {
                        return y50Var;
                    }
                    pk2 pk2Var4 = pk2Var;
                    obj3 = objC;
                    pk2Var3 = pk2Var4;
                }
            }
            za2 za2Var2 = (za2) obj3;
            List list3 = za2Var2.a;
            int size3 = list3.size();
            int i32 = 0;
            int i42 = 0;
            while (true) {
                if (i42 < size3) {
                }
                i42++;
            }
            gb2 gb2Var3 = (gb2) obj;
            if (gb2Var3 == null) {
                gb2Var3 = null;
            }
        }
        if (gb2Var3 == null || gb2Var3.c()) {
            return null;
        }
        return gb2Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x016c -> B:62:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(rb3 rb3Var, long j, int i, u uVar, ml mlVar) {
        de0 de0Var;
        rb3 rb3Var2;
        float fH;
        pk2 pk2Var;
        vx0 vx0Var;
        rs0 rs0Var;
        pk2 pk2Var2;
        rb3 rb3Var3;
        pk2 pk2Var3;
        int size;
        gb2 gb2Var;
        int i2;
        Object obj;
        gb2 gb2Var2;
        Object obj2;
        Object objC;
        if (mlVar instanceof de0) {
            de0Var = (de0) mlVar;
            int i3 = de0Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                de0Var.p = i3 - Integer.MIN_VALUE;
            } else {
                de0Var = new de0(mlVar);
            }
        }
        Object obj3 = de0Var.o;
        int i4 = de0Var.p;
        int i5 = 1;
        gb2 gb2Var3 = null;
        y50 y50Var = y50.f;
        if (i4 == 0) {
            y02.Q(obj3);
            rb3Var2 = rb3Var;
            if (g(rb3Var2.k.y, j)) {
                return null;
            }
            fH = h(rb3Var2.F(), i);
            pk2Var = new pk2();
            pk2Var.f = j;
            vx0Var = new vx0(0L, t02.g);
            rs0Var = uVar;
            de0Var.i = rs0Var;
            de0Var.j = rb3Var2;
            de0Var.k = pk2Var;
            de0Var.l = vx0Var;
            de0Var.m = gb2Var3;
            de0Var.n = fH;
            de0Var.p = i5;
            objC = rb3Var2.c(ab2.g, de0Var);
            if (objC != y50Var) {
            }
            return y50Var;
        }
        if (i4 == 1) {
            float f = de0Var.n;
            vx0Var = de0Var.l;
            pk2 pk2Var4 = de0Var.k;
            rb3Var3 = de0Var.j;
            rs0 rs0Var2 = de0Var.i;
            y02.Q(obj3);
            pk2Var2 = pk2Var4;
            fH = f;
            rs0Var = rs0Var2;
            pk2Var3 = pk2Var2;
            za2 za2Var = (za2) obj3;
            List list = za2Var.a;
            size = list.size();
            gb2Var = gb2Var3;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                }
                i2++;
            }
            gb2Var2 = (gb2) obj;
            if (gb2Var2 != null) {
                return gb2Var;
            }
            if (w22.n(gb2Var2)) {
            }
            de0Var.i = rs0Var;
            de0Var.j = rb3Var2;
            de0Var.k = pk2Var;
            de0Var.l = vx0Var;
            de0Var.m = gb2Var3;
            de0Var.n = fH;
            de0Var.p = i5;
            objC = rb3Var2.c(ab2.g, de0Var);
            if (objC != y50Var) {
            }
            return y50Var;
        }
        if (i4 != 2) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f2 = de0Var.n;
        gb2 gb2Var4 = de0Var.m;
        vx0 vx0Var2 = de0Var.l;
        pk2 pk2Var5 = de0Var.k;
        rb3 rb3Var4 = de0Var.j;
        rs0 rs0Var3 = de0Var.i;
        y02.Q(obj3);
        pk2Var3 = pk2Var5;
        rb3Var3 = rb3Var4;
        char c = 2;
        int i6 = 1;
        gb2Var = null;
        long j2 = 0;
        float f3 = f2;
        rs0Var = rs0Var3;
        if (!gb2Var4.c()) {
            return gb2Var;
        }
        gb2Var3 = gb2Var;
        i5 = i6;
        vx0Var = vx0Var2;
        fH = f3;
        rb3Var2 = rb3Var3;
        pk2Var = pk2Var3;
        de0Var.i = rs0Var;
        de0Var.j = rb3Var2;
        de0Var.k = pk2Var;
        de0Var.l = vx0Var;
        de0Var.m = gb2Var3;
        de0Var.n = fH;
        de0Var.p = i5;
        objC = rb3Var2.c(ab2.g, de0Var);
        if (objC != y50Var) {
            pk2Var2 = pk2Var;
            rb3Var3 = rb3Var2;
            obj3 = objC;
            pk2Var3 = pk2Var2;
            za2 za2Var2 = (za2) obj3;
            List list2 = za2Var2.a;
            size = list2.size();
            gb2Var = gb2Var3;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    obj = gb2Var;
                    break;
                }
                obj = list2.get(i2);
                if (d32.l(((gb2) obj).a, pk2Var3.f)) {
                    break;
                }
                i2++;
            }
            gb2Var2 = (gb2) obj;
            if (gb2Var2 != null || gb2Var2.c()) {
                return gb2Var;
            }
            if (w22.n(gb2Var2)) {
                i6 = 1;
                long jA = vx0.a(vx0Var, w22.D(gb2Var2, true), fH);
                if ((9223372034707292159L & jA) != 9205357640488583168L) {
                    rs0Var.f(gb2Var2, new Float(Float.intBitsToFloat((int) (jA >> 32))));
                    if (gb2Var2.c()) {
                        return gb2Var2;
                    }
                    vx0Var.a = 0L;
                    gb2Var3 = gb2Var;
                    i5 = 1;
                    rb3Var2 = rb3Var3;
                    pk2Var = pk2Var3;
                } else {
                    j2 = 0;
                    de0Var.i = rs0Var;
                    de0Var.j = rb3Var3;
                    de0Var.k = pk2Var3;
                    de0Var.l = vx0Var;
                    de0Var.m = gb2Var2;
                    de0Var.n = fH;
                    c = 2;
                    de0Var.p = 2;
                    if (rb3Var3.c(ab2.h, de0Var) != y50Var) {
                        float f4 = fH;
                        vx0Var2 = vx0Var;
                        gb2Var4 = gb2Var2;
                        f3 = f4;
                        if (!gb2Var4.c()) {
                        }
                    }
                }
            } else {
                List list3 = za2Var2.a;
                int size2 = list3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        obj2 = gb2Var;
                        break;
                    }
                    obj2 = list3.get(i7);
                    if (((gb2) obj2).d) {
                        break;
                    }
                    i7++;
                }
                gb2 gb2Var5 = (gb2) obj2;
                if (gb2Var5 == null) {
                    return gb2Var;
                }
                pk2Var3.f = gb2Var5.a;
                gb2Var3 = gb2Var;
                i5 = 1;
                rb3Var2 = rb3Var3;
                pk2Var = pk2Var3;
            }
            de0Var.i = rs0Var;
            de0Var.j = rb3Var2;
            de0Var.k = pk2Var;
            de0Var.l = vx0Var;
            de0Var.m = gb2Var3;
            de0Var.n = fH;
            de0Var.p = i5;
            objC = rb3Var2.c(ab2.g, de0Var);
            if (objC != y50Var) {
            }
        }
        return y50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v3, types: [qk2] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(rb3 rb3Var, long j, q40 q40Var) {
        ee0 ee0Var;
        Object obj;
        gb2 gb2Var;
        mk2 mk2Var;
        if (q40Var instanceof ee0) {
            ee0Var = (ee0) q40Var;
            int i = ee0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ee0Var.m = i - Integer.MIN_VALUE;
            } else {
                ee0Var = new ee0(q40Var);
            }
        }
        Object obj2 = ee0Var.l;
        int i2 = ee0Var.m;
        try {
            if (i2 == 0) {
                y02.Q(obj2);
                if (!g(rb3Var.k.y, j)) {
                    List list = rb3Var.k.y.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (d32.l(((gb2) obj).a, j)) {
                            break;
                        }
                        i3++;
                    }
                    gb2Var = (gb2) obj;
                    if (gb2Var != null) {
                        qk2 qk2Var = new qk2();
                        qk2 qk2Var2 = new qk2();
                        qk2Var2.f = gb2Var;
                        long jC = rb3Var.F().c();
                        mk2 mk2Var2 = new mk2();
                        rs0 fe0Var = new fe0(mk2Var2, qk2Var2, qk2Var, null);
                        ee0Var.i = gb2Var;
                        ee0Var.j = qk2Var;
                        ee0Var.k = mk2Var2;
                        ee0Var.m = 1;
                        Object objH = rb3Var.H(jC, fe0Var, ee0Var);
                        Object obj3 = y50.f;
                        if (objH == obj3) {
                            return obj3;
                        }
                        mk2Var = mk2Var2;
                        j = qk2Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mk2Var = ee0Var.k;
            qk2 qk2Var3 = ee0Var.j;
            gb2Var = ee0Var.i;
            y02.Q(obj2);
            j = qk2Var3;
            if (mk2Var.f) {
                gb2 gb2Var2 = (gb2) j.f;
                return gb2Var2 == null ? gb2Var : gb2Var2;
            }
            return null;
        } catch (bb2 unused) {
            gb2 gb2Var3 = (gb2) j.f;
            return gb2Var3 == null ? gb2Var : gb2Var3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015f -> B:62:0x0165). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(rb3 rb3Var, long j, pt2 pt2Var, ml mlVar) {
        ge0 ge0Var;
        rb3 rb3Var2;
        float fD;
        pk2 pk2Var;
        vx0 vx0Var;
        rs0 rs0Var;
        pk2 pk2Var2;
        rb3 rb3Var3;
        pk2 pk2Var3;
        int size;
        gb2 gb2Var;
        int i;
        Object obj;
        gb2 gb2Var2;
        Object obj2;
        Object objC;
        if (mlVar instanceof ge0) {
            ge0Var = (ge0) mlVar;
            int i2 = ge0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ge0Var.p = i2 - Integer.MIN_VALUE;
            } else {
                ge0Var = new ge0(mlVar);
            }
        }
        Object obj3 = ge0Var.o;
        int i3 = ge0Var.p;
        int i4 = 1;
        gb2 gb2Var3 = null;
        y50 y50Var = y50.f;
        if (i3 == 0) {
            y02.Q(obj3);
            rb3Var2 = rb3Var;
            if (g(rb3Var2.k.y, j)) {
                return null;
            }
            fD = rb3Var2.F().d();
            pk2Var = new pk2();
            pk2Var.f = j;
            vx0Var = new vx0(0L, null);
            rs0Var = pt2Var;
            ge0Var.i = rs0Var;
            ge0Var.j = rb3Var2;
            ge0Var.k = pk2Var;
            ge0Var.l = vx0Var;
            ge0Var.m = gb2Var3;
            ge0Var.n = fD;
            ge0Var.p = i4;
            objC = rb3Var2.c(ab2.g, ge0Var);
            if (objC != y50Var) {
            }
            return y50Var;
        }
        if (i3 == 1) {
            float f = ge0Var.n;
            vx0Var = ge0Var.l;
            pk2 pk2Var4 = ge0Var.k;
            rb3Var3 = ge0Var.j;
            rs0 rs0Var2 = ge0Var.i;
            y02.Q(obj3);
            pk2Var2 = pk2Var4;
            fD = f;
            rs0Var = rs0Var2;
            pk2Var3 = pk2Var2;
            za2 za2Var = (za2) obj3;
            List list = za2Var.a;
            size = list.size();
            gb2Var = gb2Var3;
            i = 0;
            while (true) {
                if (i < size) {
                }
                i++;
            }
            gb2Var2 = (gb2) obj;
            if (gb2Var2 != null) {
                return gb2Var;
            }
            if (w22.n(gb2Var2)) {
            }
            ge0Var.i = rs0Var;
            ge0Var.j = rb3Var2;
            ge0Var.k = pk2Var;
            ge0Var.l = vx0Var;
            ge0Var.m = gb2Var3;
            ge0Var.n = fD;
            ge0Var.p = i4;
            objC = rb3Var2.c(ab2.g, ge0Var);
            if (objC != y50Var) {
            }
            return y50Var;
        }
        if (i3 != 2) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f2 = ge0Var.n;
        gb2 gb2Var4 = ge0Var.m;
        vx0 vx0Var2 = ge0Var.l;
        pk2 pk2Var5 = ge0Var.k;
        rb3 rb3Var4 = ge0Var.j;
        rs0 rs0Var3 = ge0Var.i;
        y02.Q(obj3);
        pk2Var3 = pk2Var5;
        rb3Var3 = rb3Var4;
        char c = 2;
        int i5 = 1;
        gb2Var = null;
        long j2 = 0;
        float f3 = f2;
        rs0Var = rs0Var3;
        if (!gb2Var4.c()) {
            return gb2Var;
        }
        gb2Var3 = gb2Var;
        i4 = i5;
        vx0Var = vx0Var2;
        fD = f3;
        rb3Var2 = rb3Var3;
        pk2Var = pk2Var3;
        ge0Var.i = rs0Var;
        ge0Var.j = rb3Var2;
        ge0Var.k = pk2Var;
        ge0Var.l = vx0Var;
        ge0Var.m = gb2Var3;
        ge0Var.n = fD;
        ge0Var.p = i4;
        objC = rb3Var2.c(ab2.g, ge0Var);
        if (objC != y50Var) {
            pk2Var2 = pk2Var;
            rb3Var3 = rb3Var2;
            obj3 = objC;
            pk2Var3 = pk2Var2;
            za2 za2Var2 = (za2) obj3;
            List list2 = za2Var2.a;
            size = list2.size();
            gb2Var = gb2Var3;
            i = 0;
            while (true) {
                if (i < size) {
                    obj = gb2Var;
                    break;
                }
                obj = list2.get(i);
                if (d32.l(((gb2) obj).a, pk2Var3.f)) {
                    break;
                }
                i++;
            }
            gb2Var2 = (gb2) obj;
            if (gb2Var2 != null || gb2Var2.c()) {
                return gb2Var;
            }
            if (w22.n(gb2Var2)) {
                i5 = 1;
                long jA = vx0.a(vx0Var, w22.D(gb2Var2, true), fD);
                if ((9223372034707292159L & jA) != 9205357640488583168L) {
                    rs0Var.f(gb2Var2, new gy1(jA));
                    if (gb2Var2.c()) {
                        return gb2Var2;
                    }
                    vx0Var.a = 0L;
                    gb2Var3 = gb2Var;
                    i4 = 1;
                    rb3Var2 = rb3Var3;
                    pk2Var = pk2Var3;
                } else {
                    j2 = 0;
                    ge0Var.i = rs0Var;
                    ge0Var.j = rb3Var3;
                    ge0Var.k = pk2Var3;
                    ge0Var.l = vx0Var;
                    ge0Var.m = gb2Var2;
                    ge0Var.n = fD;
                    c = 2;
                    ge0Var.p = 2;
                    if (rb3Var3.c(ab2.h, ge0Var) != y50Var) {
                        float f4 = fD;
                        vx0Var2 = vx0Var;
                        gb2Var4 = gb2Var2;
                        f3 = f4;
                        if (!gb2Var4.c()) {
                        }
                    }
                }
            } else {
                List list3 = za2Var2.a;
                int size2 = list3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        obj2 = gb2Var;
                        break;
                    }
                    obj2 = list3.get(i6);
                    if (((gb2) obj2).d) {
                        break;
                    }
                    i6++;
                }
                gb2 gb2Var5 = (gb2) obj2;
                if (gb2Var5 == null) {
                    return gb2Var;
                }
                pk2Var3.f = gb2Var5.a;
                gb2Var3 = gb2Var;
                i4 = 1;
                rb3Var2 = rb3Var3;
                pk2Var = pk2Var3;
            }
            ge0Var.i = rs0Var;
            ge0Var.j = rb3Var2;
            ge0Var.k = pk2Var;
            ge0Var.l = vx0Var;
            ge0Var.m = gb2Var3;
            ge0Var.n = fD;
            ge0Var.p = i4;
            objC = rb3Var2.c(ab2.g, ge0Var);
            if (objC != y50Var) {
            }
        }
        return y50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(rb3 rb3Var, long j, ns0 ns0Var, q40 q40Var) {
        ie0 ie0Var;
        y50 y50Var;
        gb2 gb2Var;
        if (q40Var instanceof ie0) {
            ie0Var = (ie0) q40Var;
            int i = ie0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ie0Var.l = i - Integer.MIN_VALUE;
            } else {
                ie0Var = new ie0(q40Var);
            }
        }
        Object objA = ie0Var.k;
        int i2 = ie0Var.l;
        if (i2 == 0) {
            y02.Q(objA);
            ie0Var.i = rb3Var;
            ie0Var.j = ns0Var;
            ie0Var.l = 1;
            objA = a(rb3Var, j, ie0Var);
            y50Var = y50.f;
            if (objA == y50Var) {
            }
            gb2Var = (gb2) objA;
            if (gb2Var == null) {
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ns0 ns0Var2 = ie0Var.j;
            rb3 rb3Var2 = ie0Var.i;
            y02.Q(objA);
            ns0Var = ns0Var2;
            rb3Var = rb3Var2;
            gb2Var = (gb2) objA;
            if (gb2Var == null) {
                if (w22.n(gb2Var)) {
                    return Boolean.TRUE;
                }
                ns0Var.h(gb2Var);
                j = gb2Var.a;
                ie0Var.i = rb3Var;
                ie0Var.j = ns0Var;
                ie0Var.l = 1;
                objA = a(rb3Var, j, ie0Var);
                y50Var = y50.f;
                if (objA == y50Var) {
                    return y50Var;
                }
                gb2Var = (gb2) objA;
                if (gb2Var == null) {
                    return Boolean.FALSE;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if (r0 == 0.0f) goto L56;
     */
    /* JADX WARN: Path cross not found for [B:35:0x00aa, B:46:0x00cd], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:23:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(rb3 rb3Var, long j, s sVar, ml mlVar) {
        je0 je0Var;
        rb3 rb3Var2;
        long j2;
        t02 t02Var;
        je0 je0Var2;
        ns0 ns0Var;
        pk2 pk2Var;
        t02 t02Var2;
        rb3 rb3Var3;
        Object objC;
        y50 y50Var;
        Object obj;
        float fIntBitsToFloat;
        Object obj2;
        if (mlVar instanceof je0) {
            je0Var = (je0) mlVar;
            int i = je0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                je0Var.o = i - Integer.MIN_VALUE;
            } else {
                je0Var = new je0(mlVar);
            }
        }
        Object obj3 = je0Var.n;
        int i2 = je0Var.o;
        gb2 gb2Var = null;
        if (i2 == 0) {
            y02.Q(obj3);
            rb3Var2 = rb3Var;
            j2 = j;
            if (!g(rb3Var2.k.y, j2)) {
                t02Var = t02.g;
                je0Var2 = je0Var;
                ns0Var = sVar;
                pk2Var = new pk2();
                pk2Var.f = j2;
                rb3Var3 = rb3Var2;
                t02Var2 = t02Var;
                je0Var2.i = ns0Var;
                je0Var2.j = rb3Var2;
                je0Var2.k = t02Var2;
                je0Var2.l = rb3Var3;
                je0Var2.m = pk2Var;
                je0Var2.o = 1;
                objC = rb3Var3.c(ab2.g, je0Var2);
                y50Var = y50.f;
                if (objC == y50Var) {
                }
            }
            return Boolean.valueOf(gb2Var == null);
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pk2 pk2Var2 = je0Var.m;
        rb3Var3 = je0Var.l;
        t02Var2 = je0Var.k;
        rb3 rb3Var4 = je0Var.j;
        ns0 ns0Var2 = je0Var.i;
        y02.Q(obj3);
        je0Var2 = je0Var;
        ns0Var = ns0Var2;
        pk2Var = pk2Var2;
        za2 za2Var = (za2) obj3;
        List list = za2Var.a;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (d32.l(((gb2) obj).a, pk2Var.f)) {
                break;
            }
            i3++;
        }
        gb2 gb2Var2 = (gb2) obj;
        if (gb2Var2 == null) {
            if (w22.n(gb2Var2)) {
                List list2 = za2Var.a;
                int size2 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i4);
                    if (((gb2) obj2).d) {
                        break;
                    }
                    i4++;
                }
                gb2 gb2Var3 = (gb2) obj2;
                if (gb2Var3 != null) {
                    pk2Var.f = gb2Var3.a;
                    rb3Var2 = rb3Var4;
                    je0Var2.i = ns0Var;
                    je0Var2.j = rb3Var2;
                    je0Var2.k = t02Var2;
                    je0Var2.l = rb3Var3;
                    je0Var2.m = pk2Var;
                    je0Var2.o = 1;
                    objC = rb3Var3.c(ab2.g, je0Var2);
                    y50Var = y50.f;
                    if (objC == y50Var) {
                        return y50Var;
                    }
                    rb3Var4 = rb3Var2;
                    obj3 = objC;
                    za2 za2Var2 = (za2) obj3;
                    List list3 = za2Var2.a;
                    int size3 = list3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                    }
                    gb2 gb2Var22 = (gb2) obj;
                    if (gb2Var22 == null) {
                        gb2Var22 = null;
                    }
                }
            } else {
                long jD = w22.D(gb2Var22, true);
                if (t02Var2 != null) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (t02Var2 == t02.f ? jD & 4294967295L : jD >> 32));
                } else {
                    fIntBitsToFloat = gy1.c(jD);
                }
            }
        }
        if (gb2Var22 == null || gb2Var22.c()) {
            gb2Var = null;
        } else if (w22.n(gb2Var22)) {
            gb2Var = gb2Var22;
        } else {
            ns0Var.h(gb2Var22);
            rb3Var2 = rb3Var4;
            t02Var = t02Var2;
            j2 = gb2Var22.a;
            pk2Var = new pk2();
            pk2Var.f = j2;
            rb3Var3 = rb3Var2;
            t02Var2 = t02Var;
            je0Var2.i = ns0Var;
            je0Var2.j = rb3Var2;
            je0Var2.k = t02Var2;
            je0Var2.l = rb3Var3;
            je0Var2.m = pk2Var;
            je0Var2.o = 1;
            objC = rb3Var3.c(ab2.g, je0Var2);
            y50Var = y50.f;
            if (objC == y50Var) {
            }
        }
        return Boolean.valueOf(gb2Var == null);
    }

    public static final boolean g(za2 za2Var, long j) {
        Object obj;
        List list = za2Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (d32.l(((gb2) obj).a, j)) {
                break;
            }
            i++;
        }
        gb2 gb2Var = (gb2) obj;
        if (gb2Var != null && gb2Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float h(oq3 oq3Var, int i) {
        return i == 2 ? oq3Var.d() * a : oq3Var.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0708, code lost:
    
        if (defpackage.gy1.c(defpackage.w22.D(r4, true)) == 0.0f) goto L205;
     */
    /* JADX WARN: Path cross not found for [B:133:0x0532, B:135:0x0544], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:138:0x054b, B:133:0x0532], limit reached: 231 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x045c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0525 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0436  */
    /* JADX WARN: Type update failed for variable: r28v0 ??, new type: rb3
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18961. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Type update failed for variable: r28v0 ??, new type: rb3
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18961. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.ifListener(TypeUpdate.java:640)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:381)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0453 -> B:92:0x0401). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0491 -> B:165:0x0600). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05ea -> B:162:0x05f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x061a -> B:86:0x03da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0688 -> B:179:0x0691). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x024c -> B:32:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02ef -> B:32:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0347 -> B:78:0x03b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x03a1 -> B:75:0x03a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(rb3 rb3Var, gb2 gb2Var, q20 q20Var, ir irVar, u uVar, vk1 vk1Var, s sVar, ml mlVar) {
        ke0 ke0Var;
        long j;
        rs0 rs0Var;
        ns0 ns0Var;
        rb3 rb3Var2;
        boolean z;
        ss0 ss0Var;
        cs0 cs0Var;
        gb2 gb2Var2;
        t02 t02Var;
        gb2 gb2Var3;
        pk2 pk2Var;
        ab2 ab2Var;
        y50 y50Var;
        gb2 gb2Var4;
        ns0 ns0Var2;
        float f;
        Object obj;
        vx0 vx0Var;
        pk2 pk2Var2;
        rb3 rb3Var3;
        pk2 pk2Var3;
        rb3 rb3Var4;
        int size;
        int i;
        cs0 cs0Var2;
        gb2 gb2Var5;
        ns0 ns0Var3;
        Object obj2;
        gb2 gb2Var6;
        rb3 rb3Var5;
        ab2 ab2Var2;
        float f2;
        t02 t02Var2;
        gb2 gb2Var7;
        rb3 rb3Var6;
        cs0 cs0Var3;
        vx0 vx0Var2;
        gb2 gb2Var8;
        Object obj3;
        int i2;
        Object objC;
        long j2;
        gb2 gb2Var9;
        gb2 gb2Var10;
        ns0 ns0Var4;
        cs0 cs0Var4;
        rs0 rs0Var2;
        ss0 ss0Var2;
        t02 t02Var3;
        rb3 rb3Var7;
        pk2 pk2Var4;
        gb2 gb2Var11;
        rs0 rs0Var3;
        float f3;
        Object obj4;
        vx0 vx0Var3;
        ke0 ke0Var2;
        rb3 rb3Var8;
        pk2 pk2Var5;
        rb3 rb3Var9;
        List list;
        int size2;
        int i3;
        cs0 cs0Var5;
        gb2 gb2Var12;
        rs0 rs0Var4;
        Object obj5;
        gb2 gb2Var13;
        cs0 cs0Var6;
        gb2 gb2Var14;
        rb3 rb3Var10;
        ab2 ab2Var3;
        vx0 vx0Var4;
        rb3 rb3Var11;
        gb2 gb2Var15;
        Object obj6;
        List list2;
        int i4;
        Object objC2;
        int size3;
        int i5;
        int size4;
        int i6;
        gb2 gb2Var16;
        rs0 rs0Var5;
        cs0 cs0Var7;
        gb2 gb2Var17;
        pk2 pk2Var6;
        ns0 ns0Var5;
        rb3 rb3Var12;
        rb3 rb3Var13;
        ke0 ke0Var3;
        int size5;
        int i7;
        ke0 ke0Var4;
        rb3 rb3Var14;
        rb3 rb3Var15;
        Object obj7;
        gb2 gb2Var18;
        Object obj8;
        if (mlVar instanceof ke0) {
            ke0Var = (ke0) mlVar;
            int i8 = ke0Var.x;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                ke0Var.x = i8 - Integer.MIN_VALUE;
            } else {
                ke0Var = new ke0(mlVar);
            }
        }
        Object obj9 = ke0Var.w;
        int i9 = ke0Var.x;
        ab2 ab2Var4 = ab2.h;
        ab2 ab2Var5 = ab2.g;
        y50 y50Var2 = y50.f;
        switch (i9) {
            case 0:
                j = 9223372034707292159L;
                y02.Q(obj9);
                q20Var.getClass();
                boolean zBooleanValue = Boolean.TRUE.booleanValue();
                if (!zBooleanValue) {
                    gb2Var.a();
                }
                ke0Var.i = rb3Var;
                ke0Var.j = gb2Var;
                ke0Var.k = null;
                ke0Var.l = irVar;
                rs0Var = uVar;
                ke0Var.m = rs0Var;
                ke0Var.n = vk1Var;
                ns0Var = sVar;
                ke0Var.o = ns0Var;
                ke0Var.u = zBooleanValue;
                ke0Var.x = 1;
                Object objB = cd3.b(rb3Var, ke0Var, 2);
                if (objB != y50Var2) {
                    rb3Var2 = rb3Var;
                    z = zBooleanValue;
                    obj9 = objB;
                    ss0Var = irVar;
                    cs0Var = vk1Var;
                    gb2Var2 = gb2Var;
                    t02Var = null;
                    gb2Var3 = (gb2) obj9;
                    pk2Var = new pk2();
                    pk2Var.f = 0L;
                    if (!z) {
                        ab2Var = ab2Var5;
                        y50Var = y50Var2;
                        if (gb2Var2 == null) {
                            List list3 = rb3Var2.k.y.a;
                            int size6 = list3.size();
                            for (int i10 = 0; i10 < size6; i10++) {
                                if (((gb2) list3.get(i10)).d) {
                                    cs0 cs0Var8 = cs0Var;
                                    gb2Var10 = gb2Var3;
                                    rb3 rb3Var16 = rb3Var2;
                                    t02Var3 = t02Var;
                                    gb2Var9 = gb2Var2;
                                    ss0Var2 = ss0Var;
                                    cs0Var4 = cs0Var8;
                                    ns0 ns0Var6 = ns0Var;
                                    rs0Var2 = rs0Var;
                                    ns0Var4 = ns0Var6;
                                    ke0Var.i = rb3Var16;
                                    ke0Var.j = t02Var3;
                                    ke0Var.k = ss0Var2;
                                    ke0Var.l = rs0Var2;
                                    ke0Var.m = cs0Var4;
                                    ke0Var.n = ns0Var4;
                                    ke0Var.o = gb2Var10;
                                    ke0Var.p = gb2Var9;
                                    ke0Var.q = pk2Var;
                                    ke0Var.r = null;
                                    ke0Var.s = null;
                                    ke0Var.t = null;
                                    ke0Var.x = 4;
                                    Object objC3 = rb3Var16.c(ab2Var4, ke0Var);
                                    if (objC3 == y50Var) {
                                        return y50Var;
                                    }
                                    pk2 pk2Var7 = pk2Var;
                                    rb3Var7 = rb3Var16;
                                    obj9 = objC3;
                                    pk2Var4 = pk2Var7;
                                    List list4 = ((za2) obj9).a;
                                    size3 = list4.size();
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < size3) {
                                            if (((gb2) list4.get(i5)).c()) {
                                                int size7 = list4.size();
                                                for (int i11 = 0; i11 < size7; i11++) {
                                                    if (((gb2) list4.get(i11)).d) {
                                                        rb3Var16 = rb3Var7;
                                                        pk2Var = pk2Var4;
                                                    }
                                                }
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                    size4 = list4.size();
                                    for (i6 = 0; i6 < size4; i6++) {
                                        if (((gb2) list4.get(i6)).d) {
                                            gb2 gb2Var19 = (gb2) qx.r0(list4);
                                            ke0 ke0Var5 = ke0Var;
                                            long jD = gy1.d(gb2Var19 != null ? gb2Var19.c : 0L, gb2Var10.c);
                                            long j3 = gb2Var10.a;
                                            int i12 = gb2Var10.i;
                                            if (g(rb3Var7.k.y, j3)) {
                                                rs0 rs0Var6 = rs0Var2;
                                                ns0Var = ns0Var4;
                                                rs0Var = rs0Var6;
                                                ke0Var = ke0Var5;
                                                gb2Var3 = gb2Var10;
                                                cs0Var = cs0Var4;
                                                t02Var = t02Var3;
                                                rb3Var2 = rb3Var7;
                                                ab2Var3 = ab2Var4;
                                                pk2Var = pk2Var4;
                                                gb2Var13 = null;
                                                ss0 ss0Var3 = ss0Var2;
                                                gb2Var2 = gb2Var13;
                                                ab2Var4 = ab2Var3;
                                                ss0Var = ss0Var3;
                                                if (gb2Var2 == null) {
                                                }
                                            } else {
                                                float fH = h(rb3Var7.F(), i12);
                                                pk2Var5 = new pk2();
                                                pk2Var5.f = j3;
                                                vx0 vx0Var5 = new vx0(jD, t02Var3);
                                                ke0Var = ke0Var5;
                                                rb3Var11 = rb3Var7;
                                                ke0Var.i = rb3Var11;
                                                ke0Var.j = t02Var3;
                                                ke0Var.k = ss0Var2;
                                                ke0Var.l = rs0Var2;
                                                ke0Var.m = cs0Var4;
                                                ke0Var.n = ns0Var4;
                                                ke0Var.o = gb2Var10;
                                                ke0Var.p = pk2Var4;
                                                ke0Var.q = rb3Var7;
                                                ke0Var.r = pk2Var5;
                                                ke0Var.s = vx0Var5;
                                                ke0Var.t = null;
                                                ke0Var.v = fH;
                                                ke0Var.x = 5;
                                                rb3 rb3Var17 = rb3Var11;
                                                ab2 ab2Var6 = ab2Var;
                                                objC2 = rb3Var7.c(ab2Var6, ke0Var);
                                                if (objC2 == y50Var) {
                                                    return y50Var;
                                                }
                                                obj4 = objC2;
                                                vx0Var3 = vx0Var5;
                                                ab2Var = ab2Var6;
                                                rb3Var9 = rb3Var7;
                                                rs0Var3 = rs0Var2;
                                                gb2Var11 = gb2Var10;
                                                f3 = fH;
                                                ke0Var2 = ke0Var;
                                                rb3Var8 = rb3Var17;
                                                za2 za2Var = (za2) obj4;
                                                y50 y50Var3 = y50Var;
                                                list = za2Var.a;
                                                ab2 ab2Var7 = ab2Var4;
                                                size2 = list.size();
                                                rb3 rb3Var18 = rb3Var9;
                                                i3 = 0;
                                                while (true) {
                                                    if (i3 >= size2) {
                                                        obj5 = list.get(i3);
                                                        list2 = list;
                                                        cs0Var5 = cs0Var4;
                                                        gb2Var12 = gb2Var11;
                                                        rs0Var4 = rs0Var3;
                                                        i4 = i3;
                                                        if (!d32.l(((gb2) obj5).a, pk2Var5.f)) {
                                                            i3 = i4 + 1;
                                                            gb2Var11 = gb2Var12;
                                                            cs0Var4 = cs0Var5;
                                                            rs0Var3 = rs0Var4;
                                                            list = list2;
                                                        }
                                                    } else {
                                                        cs0Var5 = cs0Var4;
                                                        gb2Var12 = gb2Var11;
                                                        rs0Var4 = rs0Var3;
                                                        obj5 = null;
                                                    }
                                                }
                                                gb2Var13 = (gb2) obj5;
                                                if (gb2Var13 != null && !gb2Var13.c()) {
                                                    if (w22.n(gb2Var13)) {
                                                        List list5 = za2Var.a;
                                                        int size8 = list5.size();
                                                        int i13 = 0;
                                                        while (true) {
                                                            if (i13 < size8) {
                                                                obj6 = list5.get(i13);
                                                                if (!((gb2) obj6).d) {
                                                                    i13++;
                                                                }
                                                            } else {
                                                                obj6 = null;
                                                            }
                                                        }
                                                        gb2 gb2Var20 = (gb2) obj6;
                                                        if (gb2Var20 != null) {
                                                            pk2Var5.f = gb2Var20.a;
                                                            cs0Var4 = cs0Var5;
                                                            rs0Var2 = rs0Var4;
                                                            vx0Var5 = vx0Var3;
                                                            rb3Var11 = rb3Var8;
                                                            ke0Var = ke0Var2;
                                                            fH = f3;
                                                            rb3Var7 = rb3Var18;
                                                            y50Var = y50Var3;
                                                            ab2Var4 = ab2Var7;
                                                            gb2Var10 = gb2Var12;
                                                        }
                                                    } else if ((vx0.a(vx0Var3, w22.D(gb2Var13, true), f3) & j) != 9205357640488583168L) {
                                                        gb2Var13.a();
                                                        pk2Var4.f = w22.D(gb2Var13, false);
                                                        if (gb2Var13.c()) {
                                                            t02 t02Var4 = t02Var3;
                                                            rb3Var2 = rb3Var8;
                                                            ke0Var = ke0Var2;
                                                            t02Var = t02Var4;
                                                            gb2Var3 = gb2Var12;
                                                            cs0Var = cs0Var5;
                                                            pk2Var = pk2Var4;
                                                            ns0Var = ns0Var4;
                                                            ab2Var3 = ab2Var7;
                                                            rs0Var = rs0Var4;
                                                            y50Var = y50Var3;
                                                            ss0 ss0Var32 = ss0Var2;
                                                            gb2Var2 = gb2Var13;
                                                            ab2Var4 = ab2Var3;
                                                            ss0Var = ss0Var32;
                                                            if (gb2Var2 == null) {
                                                            }
                                                        } else {
                                                            vx0Var3.a = 0L;
                                                            cs0Var4 = cs0Var5;
                                                            rs0Var2 = rs0Var4;
                                                            vx0Var5 = vx0Var3;
                                                            rb3Var11 = rb3Var8;
                                                            ke0Var = ke0Var2;
                                                            fH = f3;
                                                            rb3Var7 = rb3Var18;
                                                            y50Var = y50Var3;
                                                            ab2Var4 = ab2Var7;
                                                            gb2Var10 = gb2Var12;
                                                        }
                                                    } else {
                                                        ke0Var2.i = rb3Var8;
                                                        ke0Var2.j = t02Var3;
                                                        ke0Var2.k = ss0Var2;
                                                        ke0Var2.l = rs0Var4;
                                                        cs0Var6 = cs0Var5;
                                                        ke0Var2.m = cs0Var6;
                                                        ke0Var2.n = ns0Var4;
                                                        gb2Var14 = gb2Var12;
                                                        ke0Var2.o = gb2Var14;
                                                        ke0Var2.p = pk2Var4;
                                                        rb3Var10 = rb3Var18;
                                                        ke0Var2.q = rb3Var10;
                                                        ke0Var2.r = pk2Var5;
                                                        ke0Var2.s = vx0Var3;
                                                        ke0Var2.t = gb2Var13;
                                                        ke0Var2.v = f3;
                                                        ke0Var2.x = 6;
                                                        ab2Var3 = ab2Var7;
                                                        rs0 rs0Var7 = rs0Var4;
                                                        y50Var = y50Var3;
                                                        if (rb3Var10.c(ab2Var3, ke0Var2) == y50Var) {
                                                            return y50Var;
                                                        }
                                                        vx0Var4 = vx0Var3;
                                                        rb3Var11 = rb3Var8;
                                                        ke0Var = ke0Var2;
                                                        gb2Var15 = gb2Var13;
                                                        rs0Var2 = rs0Var7;
                                                        if (gb2Var15.c()) {
                                                            fH = f3;
                                                            gb2Var10 = gb2Var14;
                                                            vx0Var5 = vx0Var4;
                                                            ab2Var4 = ab2Var3;
                                                            cs0Var4 = cs0Var6;
                                                            rb3Var7 = rb3Var10;
                                                        } else {
                                                            rs0 rs0Var8 = rs0Var2;
                                                            ns0Var = ns0Var4;
                                                            rs0Var = rs0Var8;
                                                            t02Var = t02Var3;
                                                            cs0Var = cs0Var6;
                                                            gb2Var13 = null;
                                                            rb3Var2 = rb3Var11;
                                                            pk2Var = pk2Var4;
                                                            gb2Var3 = gb2Var14;
                                                            ss0 ss0Var322 = ss0Var2;
                                                            gb2Var2 = gb2Var13;
                                                            ab2Var4 = ab2Var3;
                                                            ss0Var = ss0Var322;
                                                            if (gb2Var2 == null) {
                                                            }
                                                        }
                                                    }
                                                    ke0Var.i = rb3Var11;
                                                    ke0Var.j = t02Var3;
                                                    ke0Var.k = ss0Var2;
                                                    ke0Var.l = rs0Var2;
                                                    ke0Var.m = cs0Var4;
                                                    ke0Var.n = ns0Var4;
                                                    ke0Var.o = gb2Var10;
                                                    ke0Var.p = pk2Var4;
                                                    ke0Var.q = rb3Var7;
                                                    ke0Var.r = pk2Var5;
                                                    ke0Var.s = vx0Var5;
                                                    ke0Var.t = null;
                                                    ke0Var.v = fH;
                                                    ke0Var.x = 5;
                                                    rb3 rb3Var172 = rb3Var11;
                                                    ab2 ab2Var62 = ab2Var;
                                                    objC2 = rb3Var7.c(ab2Var62, ke0Var);
                                                    if (objC2 == y50Var) {
                                                    }
                                                }
                                                t02 t02Var5 = t02Var3;
                                                rb3Var2 = rb3Var8;
                                                ke0Var = ke0Var2;
                                                t02Var = t02Var5;
                                                gb2Var3 = gb2Var12;
                                                cs0Var = cs0Var5;
                                                pk2Var = pk2Var4;
                                                ns0Var = ns0Var4;
                                                ab2Var3 = ab2Var7;
                                                gb2Var13 = null;
                                                rs0Var = rs0Var4;
                                                y50Var = y50Var3;
                                                ss0 ss0Var3222 = ss0Var2;
                                                gb2Var2 = gb2Var13;
                                                ab2Var4 = ab2Var3;
                                                ss0Var = ss0Var3222;
                                                if (gb2Var2 == null) {
                                                }
                                            }
                                        }
                                    }
                                    rs0 rs0Var9 = rs0Var2;
                                    ns0Var = ns0Var4;
                                    rs0Var = rs0Var9;
                                    gb2Var3 = gb2Var10;
                                    cs0Var = cs0Var4;
                                    ss0Var = ss0Var2;
                                    gb2Var2 = gb2Var9;
                                    t02Var = t02Var3;
                                    rb3Var2 = rb3Var7;
                                    pk2Var = pk2Var4;
                                    if (gb2Var2 == null) {
                                    }
                                }
                            }
                        }
                        if (gb2Var2 != null) {
                            ss0Var.e(gb2Var3, gb2Var2, new gy1(pk2Var.f));
                            rs0Var.f(gb2Var2, new gy1(pk2Var.f));
                            long j4 = gb2Var2.a;
                            if (g(rb3Var2.k.y, j4)) {
                                gb2Var16 = null;
                                if (gb2Var16 != null) {
                                    cs0Var.a();
                                } else {
                                    ns0Var.h(gb2Var16);
                                }
                            }
                            pk2 pk2Var8 = new pk2();
                            pk2Var8.f = j4;
                            cs0Var7 = cs0Var;
                            ns0 ns0Var7 = ns0Var;
                            rb3 rb3Var19 = rb3Var2;
                            rb3 rb3Var20 = rb3Var19;
                            rs0Var5 = rs0Var;
                            ke0Var.i = rs0Var5;
                            ke0Var.j = cs0Var7;
                            ke0Var.k = ns0Var7;
                            ke0Var.l = rb3Var20;
                            ke0Var.m = rb3Var19;
                            ke0Var.n = pk2Var8;
                            gb2Var17 = null;
                            ke0Var.o = null;
                            ke0Var.p = null;
                            ke0Var.q = null;
                            ke0Var.r = null;
                            ke0Var.s = null;
                            ke0Var.t = null;
                            ke0Var.x = 7;
                            ab2Var5 = ab2Var;
                            Object objC4 = rb3Var19.c(ab2Var5, ke0Var);
                            if (objC4 == y50Var) {
                                return y50Var;
                            }
                            ke0 ke0Var6 = ke0Var;
                            pk2Var6 = pk2Var8;
                            obj9 = objC4;
                            ns0Var5 = ns0Var7;
                            rb3Var12 = rb3Var20;
                            rb3Var13 = rb3Var19;
                            ke0Var3 = ke0Var6;
                            za2 za2Var2 = (za2) obj9;
                            List list6 = za2Var2.a;
                            size5 = list6.size();
                            i7 = 0;
                            while (true) {
                                if (i7 >= size5) {
                                    Object obj10 = list6.get(i7);
                                    ke0Var4 = ke0Var3;
                                    rb3Var14 = rb3Var13;
                                    rb3Var15 = rb3Var12;
                                    ab2Var = ab2Var5;
                                    if (d32.l(((gb2) obj10).a, pk2Var6.f)) {
                                        obj7 = obj10;
                                    } else {
                                        i7++;
                                        ke0Var3 = ke0Var4;
                                        rb3Var13 = rb3Var14;
                                        rb3Var12 = rb3Var15;
                                        ab2Var5 = ab2Var;
                                    }
                                } else {
                                    ke0Var4 = ke0Var3;
                                    rb3Var14 = rb3Var13;
                                    rb3Var15 = rb3Var12;
                                    ab2Var = ab2Var5;
                                    obj7 = gb2Var17;
                                }
                            }
                            gb2Var18 = (gb2) obj7;
                            if (gb2Var18 != null) {
                                if (w22.n(gb2Var18)) {
                                    List list7 = za2Var2.a;
                                    int size9 = list7.size();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < size9) {
                                            obj8 = list7.get(i14);
                                            if (!((gb2) obj8).d) {
                                                i14++;
                                            }
                                        } else {
                                            obj8 = gb2Var17;
                                        }
                                    }
                                    gb2 gb2Var21 = (gb2) obj8;
                                    if (gb2Var21 != null) {
                                        pk2Var6.f = gb2Var21.a;
                                    }
                                }
                                rb3Var19 = rb3Var14;
                                rb3Var20 = rb3Var15;
                                pk2Var8 = pk2Var6;
                                ns0Var7 = ns0Var5;
                                ke0Var = ke0Var4;
                                ke0Var.i = rs0Var5;
                                ke0Var.j = cs0Var7;
                                ke0Var.k = ns0Var7;
                                ke0Var.l = rb3Var20;
                                ke0Var.m = rb3Var19;
                                ke0Var.n = pk2Var8;
                                gb2Var17 = null;
                                ke0Var.o = null;
                                ke0Var.p = null;
                                ke0Var.q = null;
                                ke0Var.r = null;
                                ke0Var.s = null;
                                ke0Var.t = null;
                                ke0Var.x = 7;
                                ab2Var5 = ab2Var;
                                Object objC42 = rb3Var19.c(ab2Var5, ke0Var);
                                if (objC42 == y50Var) {
                                }
                            } else {
                                gb2Var18 = gb2Var17;
                            }
                            if (gb2Var18 == null || gb2Var18.c()) {
                                ns0Var = ns0Var5;
                                cs0Var = cs0Var7;
                                gb2Var16 = gb2Var17;
                            } else if (w22.n(gb2Var18)) {
                                rs0Var5.f(gb2Var18, new gy1(w22.D(gb2Var18, false)));
                                gb2Var18.a();
                                j4 = gb2Var18.a;
                                rs0 rs0Var10 = rs0Var5;
                                ns0Var = ns0Var5;
                                rs0Var = rs0Var10;
                                ke0Var = ke0Var4;
                                rb3Var2 = rb3Var15;
                                cs0Var = cs0Var7;
                                pk2 pk2Var82 = new pk2();
                                pk2Var82.f = j4;
                                cs0Var7 = cs0Var;
                                ns0 ns0Var72 = ns0Var;
                                rb3 rb3Var192 = rb3Var2;
                                rb3 rb3Var202 = rb3Var192;
                                rs0Var5 = rs0Var;
                                ke0Var.i = rs0Var5;
                                ke0Var.j = cs0Var7;
                                ke0Var.k = ns0Var72;
                                ke0Var.l = rb3Var202;
                                ke0Var.m = rb3Var192;
                                ke0Var.n = pk2Var82;
                                gb2Var17 = null;
                                ke0Var.o = null;
                                ke0Var.p = null;
                                ke0Var.q = null;
                                ke0Var.r = null;
                                ke0Var.s = null;
                                ke0Var.t = null;
                                ke0Var.x = 7;
                                ab2Var5 = ab2Var;
                                Object objC422 = rb3Var192.c(ab2Var5, ke0Var);
                                if (objC422 == y50Var) {
                                }
                            } else {
                                ns0Var = ns0Var5;
                                gb2Var16 = gb2Var18;
                                cs0Var = cs0Var7;
                            }
                            if (gb2Var16 != null) {
                            }
                            break;
                        }
                        return dm3.a;
                    }
                    j2 = gb2Var3.a;
                    int i15 = gb2Var3.i;
                    if (g(rb3Var2.k.y, j2)) {
                        ab2Var2 = ab2Var4;
                        ab2Var = ab2Var5;
                        y50Var = y50Var2;
                        gb2Var8 = null;
                        if (gb2Var8 != null || gb2Var8.c()) {
                            ab2 ab2Var8 = ab2Var2;
                            gb2Var2 = gb2Var8;
                            ab2Var4 = ab2Var8;
                            if (gb2Var2 == null) {
                            }
                            if (gb2Var2 != null) {
                            }
                            return dm3.a;
                        }
                        y50Var2 = y50Var;
                        ab2Var4 = ab2Var2;
                        ab2Var5 = ab2Var;
                        j2 = gb2Var3.a;
                        int i152 = gb2Var3.i;
                        if (g(rb3Var2.k.y, j2)) {
                            float fH2 = h(rb3Var2.F(), i152);
                            pk2 pk2Var9 = new pk2();
                            pk2Var9.f = j2;
                            f = fH2;
                            gb2Var3 = gb2Var3;
                            vx0 vx0Var6 = new vx0(0L, t02Var);
                            pk2 pk2Var10 = pk2Var;
                            rb3Var6 = rb3Var2;
                            ke0Var.i = rb3Var6;
                            ke0Var.j = t02Var;
                            ke0Var.k = ss0Var;
                            ke0Var.l = rs0Var;
                            ke0Var.m = cs0Var;
                            ke0Var.n = ns0Var;
                            ke0Var.o = gb2Var3;
                            ke0Var.p = pk2Var10;
                            ke0Var.q = rb3Var2;
                            ke0Var.r = pk2Var9;
                            ke0Var.s = vx0Var6;
                            gb2 gb2Var22 = gb2Var3;
                            ke0Var.t = null;
                            ke0Var.v = f;
                            ke0Var.x = 2;
                            objC = rb3Var2.c(ab2Var5, ke0Var);
                            if (objC != y50Var2) {
                                ns0 ns0Var8 = ns0Var;
                                gb2Var4 = gb2Var22;
                                obj = objC;
                                vx0Var = vx0Var6;
                                pk2Var2 = pk2Var10;
                                rb3Var3 = rb3Var6;
                                rb3Var4 = rb3Var2;
                                pk2Var3 = pk2Var9;
                                ns0Var2 = ns0Var8;
                                ab2Var = ab2Var5;
                                za2 za2Var3 = (za2) obj;
                                y50 y50Var4 = y50Var2;
                                List list8 = za2Var3.a;
                                ab2 ab2Var9 = ab2Var4;
                                size = list8.size();
                                rb3 rb3Var21 = rb3Var4;
                                i = 0;
                                while (true) {
                                    if (i >= size) {
                                        obj2 = list8.get(i);
                                        i2 = size;
                                        gb2Var5 = gb2Var4;
                                        ns0Var3 = ns0Var2;
                                        cs0Var2 = cs0Var;
                                        if (!d32.l(((gb2) obj2).a, pk2Var3.f)) {
                                            i++;
                                            size = i2;
                                            gb2Var4 = gb2Var5;
                                            ns0Var2 = ns0Var3;
                                            cs0Var = cs0Var2;
                                        }
                                    } else {
                                        cs0Var2 = cs0Var;
                                        gb2Var5 = gb2Var4;
                                        ns0Var3 = ns0Var2;
                                        obj2 = null;
                                    }
                                }
                                gb2Var6 = (gb2) obj2;
                                if (gb2Var6 != null && !gb2Var6.c()) {
                                    if (w22.n(gb2Var6)) {
                                        long jA = vx0.a(vx0Var, w22.D(gb2Var6, true), f);
                                        if ((jA & j) != 9205357640488583168L) {
                                            gb2Var6.a();
                                            pk2Var2.f = jA;
                                            if (gb2Var6.c()) {
                                                gb2Var3 = gb2Var5;
                                                ns0Var = ns0Var3;
                                                gb2Var8 = gb2Var6;
                                                rb3Var2 = rb3Var3;
                                                pk2Var = pk2Var2;
                                                y50Var = y50Var4;
                                                ab2Var2 = ab2Var9;
                                                cs0Var = cs0Var2;
                                                if (gb2Var8 != null) {
                                                }
                                                ab2 ab2Var82 = ab2Var2;
                                                gb2Var2 = gb2Var8;
                                                ab2Var4 = ab2Var82;
                                                if (gb2Var2 == null) {
                                                }
                                                if (gb2Var2 != null) {
                                                }
                                                return dm3.a;
                                            }
                                            vx0Var.a = 0L;
                                            ns0Var = ns0Var3;
                                            cs0Var = cs0Var2;
                                            pk2Var9 = pk2Var3;
                                            rb3Var6 = rb3Var3;
                                            pk2Var10 = pk2Var2;
                                            ab2Var5 = ab2Var;
                                            y50Var2 = y50Var4;
                                            ab2Var4 = ab2Var9;
                                            rb3Var2 = rb3Var21;
                                            vx0Var6 = vx0Var;
                                            gb2Var3 = gb2Var5;
                                        } else {
                                            ke0Var.i = rb3Var3;
                                            ke0Var.j = t02Var;
                                            ke0Var.k = ss0Var;
                                            ke0Var.l = rs0Var;
                                            cs0 cs0Var9 = cs0Var2;
                                            ke0Var.m = cs0Var9;
                                            ns0Var = ns0Var3;
                                            ke0Var.n = ns0Var;
                                            gb2 gb2Var23 = gb2Var5;
                                            ke0Var.o = gb2Var23;
                                            ke0Var.p = pk2Var2;
                                            rb3Var5 = rb3Var21;
                                            ke0Var.q = rb3Var5;
                                            ke0Var.r = pk2Var3;
                                            ke0Var.s = vx0Var;
                                            ke0Var.t = gb2Var6;
                                            ke0Var.v = f;
                                            ke0Var.x = 3;
                                            ab2Var2 = ab2Var9;
                                            f2 = f;
                                            y50Var = y50Var4;
                                            if (rb3Var5.c(ab2Var2, ke0Var) == y50Var) {
                                                return y50Var;
                                            }
                                            t02Var2 = t02Var;
                                            gb2Var7 = gb2Var6;
                                            rb3Var6 = rb3Var3;
                                            cs0Var3 = cs0Var9;
                                            vx0Var2 = vx0Var;
                                            gb2Var3 = gb2Var23;
                                            if (!gb2Var7.c()) {
                                                t02Var = t02Var2;
                                                rb3Var2 = rb3Var6;
                                                cs0Var = cs0Var3;
                                                pk2Var = pk2Var2;
                                                gb2Var8 = null;
                                                if (gb2Var8 != null) {
                                                }
                                                ab2 ab2Var822 = ab2Var2;
                                                gb2Var2 = gb2Var8;
                                                ab2Var4 = ab2Var822;
                                                if (gb2Var2 == null) {
                                                }
                                                if (gb2Var2 != null) {
                                                }
                                                return dm3.a;
                                            }
                                            t02Var = t02Var2;
                                            cs0Var = cs0Var3;
                                            pk2Var10 = pk2Var2;
                                            ab2Var5 = ab2Var;
                                            vx0Var6 = vx0Var2;
                                            ab2Var4 = ab2Var2;
                                            pk2Var9 = pk2Var3;
                                            rb3Var2 = rb3Var5;
                                            y50Var2 = y50Var;
                                            f = f2;
                                        }
                                    } else {
                                        List list9 = za2Var3.a;
                                        int size10 = list9.size();
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < size10) {
                                                obj3 = list9.get(i16);
                                                if (!((gb2) obj3).d) {
                                                    i16++;
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        gb2 gb2Var24 = (gb2) obj3;
                                        if (gb2Var24 != null) {
                                            pk2Var3.f = gb2Var24.a;
                                            ns0Var = ns0Var3;
                                            cs0Var = cs0Var2;
                                            pk2Var9 = pk2Var3;
                                            rb3Var6 = rb3Var3;
                                            pk2Var10 = pk2Var2;
                                            ab2Var5 = ab2Var;
                                            y50Var2 = y50Var4;
                                            ab2Var4 = ab2Var9;
                                            rb3Var2 = rb3Var21;
                                            vx0Var6 = vx0Var;
                                            gb2Var3 = gb2Var5;
                                        }
                                    }
                                    ke0Var.i = rb3Var6;
                                    ke0Var.j = t02Var;
                                    ke0Var.k = ss0Var;
                                    ke0Var.l = rs0Var;
                                    ke0Var.m = cs0Var;
                                    ke0Var.n = ns0Var;
                                    ke0Var.o = gb2Var3;
                                    ke0Var.p = pk2Var10;
                                    ke0Var.q = rb3Var2;
                                    ke0Var.r = pk2Var9;
                                    ke0Var.s = vx0Var6;
                                    gb2 gb2Var222 = gb2Var3;
                                    ke0Var.t = null;
                                    ke0Var.v = f;
                                    ke0Var.x = 2;
                                    objC = rb3Var2.c(ab2Var5, ke0Var);
                                    if (objC != y50Var2) {
                                    }
                                }
                                gb2Var3 = gb2Var5;
                                ns0Var = ns0Var3;
                                cs0Var = cs0Var2;
                                rb3Var2 = rb3Var3;
                                pk2Var = pk2Var2;
                                y50Var = y50Var4;
                                ab2Var2 = ab2Var9;
                                gb2Var8 = null;
                                if (gb2Var8 != null) {
                                }
                                ab2 ab2Var8222 = ab2Var2;
                                gb2Var2 = gb2Var8;
                                ab2Var4 = ab2Var8222;
                                if (gb2Var2 == null) {
                                }
                                if (gb2Var2 != null) {
                                }
                                return dm3.a;
                            }
                        }
                    }
                }
                return y50Var2;
            case 1:
                j = 9223372034707292159L;
                z = ke0Var.u;
                ns0 ns0Var9 = (ns0) ke0Var.o;
                cs0Var = (cs0) ke0Var.n;
                rs0Var = (rs0) ke0Var.m;
                ss0Var = (ss0) ke0Var.l;
                t02 t02Var6 = (t02) ke0Var.k;
                gb2Var2 = (gb2) ke0Var.j;
                rb3Var2 = (rb3) ke0Var.i;
                y02.Q(obj9);
                ns0Var = ns0Var9;
                t02Var = t02Var6;
                gb2Var3 = (gb2) obj9;
                pk2Var = new pk2();
                pk2Var.f = 0L;
                if (!z) {
                }
                j2 = gb2Var3.a;
                int i1522 = gb2Var3.i;
                if (g(rb3Var2.k.y, j2)) {
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                j = 9223372034707292159L;
                float f4 = ke0Var.v;
                vx0 vx0Var7 = ke0Var.s;
                pk2 pk2Var11 = ke0Var.r;
                rb3 rb3Var22 = (rb3) ke0Var.q;
                pk2 pk2Var12 = (pk2) ke0Var.p;
                gb2Var4 = (gb2) ke0Var.o;
                ns0Var2 = (ns0) ke0Var.n;
                cs0 cs0Var10 = (cs0) ke0Var.m;
                rs0 rs0Var11 = (rs0) ke0Var.l;
                ss0 ss0Var4 = (ss0) ke0Var.k;
                t02 t02Var7 = (t02) ke0Var.j;
                rb3 rb3Var23 = (rb3) ke0Var.i;
                y02.Q(obj9);
                f = f4;
                obj = obj9;
                vx0Var = vx0Var7;
                t02Var = t02Var7;
                pk2Var2 = pk2Var12;
                ss0Var = ss0Var4;
                rb3Var3 = rb3Var23;
                pk2Var3 = pk2Var11;
                cs0Var = cs0Var10;
                rb3Var4 = rb3Var22;
                rs0Var = rs0Var11;
                ab2Var = ab2Var5;
                za2 za2Var32 = (za2) obj;
                y50 y50Var42 = y50Var2;
                List list82 = za2Var32.a;
                ab2 ab2Var92 = ab2Var4;
                size = list82.size();
                rb3 rb3Var212 = rb3Var4;
                i = 0;
                while (true) {
                    if (i >= size) {
                    }
                    i++;
                    size = i2;
                    gb2Var4 = gb2Var5;
                    ns0Var2 = ns0Var3;
                    cs0Var = cs0Var2;
                }
                gb2Var6 = (gb2) obj2;
                if (gb2Var6 != null) {
                    if (w22.n(gb2Var6)) {
                    }
                    ke0Var.i = rb3Var6;
                    ke0Var.j = t02Var;
                    ke0Var.k = ss0Var;
                    ke0Var.l = rs0Var;
                    ke0Var.m = cs0Var;
                    ke0Var.n = ns0Var;
                    ke0Var.o = gb2Var3;
                    ke0Var.p = pk2Var10;
                    ke0Var.q = rb3Var2;
                    ke0Var.r = pk2Var9;
                    ke0Var.s = vx0Var6;
                    gb2 gb2Var2222 = gb2Var3;
                    ke0Var.t = null;
                    ke0Var.v = f;
                    ke0Var.x = 2;
                    objC = rb3Var2.c(ab2Var5, ke0Var);
                    if (objC != y50Var2) {
                    }
                    return y50Var2;
                }
                gb2Var3 = gb2Var5;
                ns0Var = ns0Var3;
                cs0Var = cs0Var2;
                rb3Var2 = rb3Var3;
                pk2Var = pk2Var2;
                y50Var = y50Var42;
                ab2Var2 = ab2Var92;
                gb2Var8 = null;
                if (gb2Var8 != null) {
                }
                ab2 ab2Var82222 = ab2Var2;
                gb2Var2 = gb2Var8;
                ab2Var4 = ab2Var82222;
                if (gb2Var2 == null) {
                }
                if (gb2Var2 != null) {
                }
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                j = 9223372034707292159L;
                float f5 = ke0Var.v;
                gb2Var7 = ke0Var.t;
                vx0 vx0Var8 = ke0Var.s;
                pk2 pk2Var13 = ke0Var.r;
                rb3 rb3Var24 = (rb3) ke0Var.q;
                pk2 pk2Var14 = (pk2) ke0Var.p;
                gb2 gb2Var25 = (gb2) ke0Var.o;
                ns0 ns0Var10 = (ns0) ke0Var.n;
                cs0Var3 = (cs0) ke0Var.m;
                rs0 rs0Var12 = (rs0) ke0Var.l;
                ss0 ss0Var5 = (ss0) ke0Var.k;
                t02 t02Var8 = (t02) ke0Var.j;
                rb3 rb3Var25 = (rb3) ke0Var.i;
                y02.Q(obj9);
                rb3Var6 = rb3Var25;
                y50Var = y50Var2;
                rb3Var5 = rb3Var24;
                ns0Var = ns0Var10;
                ab2Var2 = ab2Var4;
                vx0Var2 = vx0Var8;
                rs0Var = rs0Var12;
                pk2Var2 = pk2Var14;
                f2 = f5;
                ab2Var = ab2Var5;
                gb2Var3 = gb2Var25;
                pk2Var3 = pk2Var13;
                ss0Var = ss0Var5;
                t02Var2 = t02Var8;
                if (!gb2Var7.c()) {
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                j = 9223372034707292159L;
                pk2 pk2Var15 = (pk2) ke0Var.q;
                gb2Var9 = (gb2) ke0Var.p;
                gb2Var10 = (gb2) ke0Var.o;
                ns0Var4 = (ns0) ke0Var.n;
                cs0Var4 = (cs0) ke0Var.m;
                rs0Var2 = (rs0) ke0Var.l;
                ss0Var2 = (ss0) ke0Var.k;
                t02Var3 = (t02) ke0Var.j;
                rb3Var7 = (rb3) ke0Var.i;
                y02.Q(obj9);
                ab2Var = ab2Var5;
                pk2Var4 = pk2Var15;
                y50Var = y50Var2;
                List list42 = ((za2) obj9).a;
                size3 = list42.size();
                i5 = 0;
                while (true) {
                    if (i5 < size3) {
                    }
                    i5++;
                }
                size4 = list42.size();
                while (i6 < size4) {
                }
                rs0 rs0Var92 = rs0Var2;
                ns0Var = ns0Var4;
                rs0Var = rs0Var92;
                gb2Var3 = gb2Var10;
                cs0Var = cs0Var4;
                ss0Var = ss0Var2;
                gb2Var2 = gb2Var9;
                t02Var = t02Var3;
                rb3Var2 = rb3Var7;
                pk2Var = pk2Var4;
                if (gb2Var2 == null) {
                }
                if (gb2Var2 != null) {
                }
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                j = 9223372034707292159L;
                float f6 = ke0Var.v;
                vx0 vx0Var9 = ke0Var.s;
                pk2 pk2Var16 = ke0Var.r;
                rb3 rb3Var26 = (rb3) ke0Var.q;
                pk2 pk2Var17 = (pk2) ke0Var.p;
                gb2Var11 = (gb2) ke0Var.o;
                ns0 ns0Var11 = (ns0) ke0Var.n;
                cs0 cs0Var11 = (cs0) ke0Var.m;
                rs0Var3 = (rs0) ke0Var.l;
                ss0 ss0Var6 = (ss0) ke0Var.k;
                t02 t02Var9 = (t02) ke0Var.j;
                rb3 rb3Var27 = (rb3) ke0Var.i;
                y02.Q(obj9);
                f3 = f6;
                obj4 = obj9;
                vx0Var3 = vx0Var9;
                ke0Var2 = ke0Var;
                rb3Var8 = rb3Var27;
                y50Var = y50Var2;
                pk2Var5 = pk2Var16;
                rb3Var9 = rb3Var26;
                ns0Var4 = ns0Var11;
                ss0Var2 = ss0Var6;
                ab2Var = ab2Var5;
                pk2Var4 = pk2Var17;
                cs0Var4 = cs0Var11;
                t02Var3 = t02Var9;
                za2 za2Var4 = (za2) obj4;
                y50 y50Var32 = y50Var;
                list = za2Var4.a;
                ab2 ab2Var72 = ab2Var4;
                size2 = list.size();
                rb3 rb3Var182 = rb3Var9;
                i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                    }
                    i3 = i4 + 1;
                    gb2Var11 = gb2Var12;
                    cs0Var4 = cs0Var5;
                    rs0Var3 = rs0Var4;
                    list = list2;
                }
                gb2Var13 = (gb2) obj5;
                if (gb2Var13 != null) {
                    if (w22.n(gb2Var13)) {
                    }
                    ke0Var.i = rb3Var11;
                    ke0Var.j = t02Var3;
                    ke0Var.k = ss0Var2;
                    ke0Var.l = rs0Var2;
                    ke0Var.m = cs0Var4;
                    ke0Var.n = ns0Var4;
                    ke0Var.o = gb2Var10;
                    ke0Var.p = pk2Var4;
                    ke0Var.q = rb3Var7;
                    ke0Var.r = pk2Var5;
                    ke0Var.s = vx0Var5;
                    ke0Var.t = null;
                    ke0Var.v = fH;
                    ke0Var.x = 5;
                    rb3 rb3Var1722 = rb3Var11;
                    ab2 ab2Var622 = ab2Var;
                    objC2 = rb3Var7.c(ab2Var622, ke0Var);
                    if (objC2 == y50Var) {
                    }
                }
                t02 t02Var52 = t02Var3;
                rb3Var2 = rb3Var8;
                ke0Var = ke0Var2;
                t02Var = t02Var52;
                gb2Var3 = gb2Var12;
                cs0Var = cs0Var5;
                pk2Var = pk2Var4;
                ns0Var = ns0Var4;
                ab2Var3 = ab2Var72;
                gb2Var13 = null;
                rs0Var = rs0Var4;
                y50Var = y50Var32;
                ss0 ss0Var32222 = ss0Var2;
                gb2Var2 = gb2Var13;
                ab2Var4 = ab2Var3;
                ss0Var = ss0Var32222;
                if (gb2Var2 == null) {
                }
                if (gb2Var2 != null) {
                }
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                float f7 = ke0Var.v;
                gb2Var15 = ke0Var.t;
                vx0 vx0Var10 = ke0Var.s;
                pk2 pk2Var18 = ke0Var.r;
                j = 9223372034707292159L;
                rb3 rb3Var28 = (rb3) ke0Var.q;
                pk2 pk2Var19 = (pk2) ke0Var.p;
                gb2Var14 = (gb2) ke0Var.o;
                ns0 ns0Var12 = (ns0) ke0Var.n;
                cs0Var6 = (cs0) ke0Var.m;
                rs0 rs0Var13 = (rs0) ke0Var.l;
                ss0 ss0Var7 = (ss0) ke0Var.k;
                t02 t02Var10 = (t02) ke0Var.j;
                rb3 rb3Var29 = (rb3) ke0Var.i;
                y02.Q(obj9);
                rb3Var10 = rb3Var28;
                rs0Var2 = rs0Var13;
                rb3Var11 = rb3Var29;
                ab2Var = ab2Var5;
                y50Var = y50Var2;
                pk2Var5 = pk2Var18;
                pk2Var4 = pk2Var19;
                ab2Var3 = ab2Var4;
                ss0Var2 = ss0Var7;
                ns0Var4 = ns0Var12;
                t02Var3 = t02Var10;
                vx0Var4 = vx0Var10;
                f3 = f7;
                if (gb2Var15.c()) {
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                pk2 pk2Var20 = (pk2) ke0Var.n;
                rb3 rb3Var30 = (rb3) ke0Var.m;
                rb3 rb3Var31 = (rb3) ke0Var.l;
                ns0 ns0Var13 = (ns0) ke0Var.k;
                cs0Var7 = (cs0) ke0Var.j;
                rs0Var5 = (rs0) ke0Var.i;
                y02.Q(obj9);
                gb2Var17 = null;
                ns0Var5 = ns0Var13;
                rb3Var12 = rb3Var31;
                rb3Var13 = rb3Var30;
                ke0Var3 = ke0Var;
                pk2Var6 = pk2Var20;
                y50Var = y50Var2;
                za2 za2Var22 = (za2) obj9;
                List list62 = za2Var22.a;
                size5 = list62.size();
                i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                    }
                    i7++;
                    ke0Var3 = ke0Var4;
                    rb3Var13 = rb3Var14;
                    rb3Var12 = rb3Var15;
                    ab2Var5 = ab2Var;
                }
                gb2Var18 = (gb2) obj7;
                if (gb2Var18 != null) {
                }
                if (gb2Var18 == null) {
                    if (w22.n(gb2Var18)) {
                    }
                }
                return dm3.a;
            default:
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
