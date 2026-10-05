package defpackage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b80 implements e70 {
    public final ql0 a;
    public final x50 b;
    public final p70 c;
    public int e;
    public w83 f;
    public final pl h;
    public final xb3 i;
    public final xb3 j;
    public final pl k;
    public final dt1 d = new dt1();
    public final yl1 g = new yl1(18);

    public b80(ql0 ql0Var, List list, h01 h01Var, x50 x50Var) {
        this.a = ql0Var;
        this.b = x50Var;
        p40 p40Var = null;
        this.c = new p70(3, new l(this, p40Var, 11));
        this.h = new pl(this, list);
        final byte b = 0;
        this.i = new xb3(new cs0(this) { // from class: f70
            public final /* synthetic */ b80 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() throws IOException {
                int i = b;
                b80 b80Var = this.g;
                switch (i) {
                    case 0:
                        ql0 ql0Var2 = b80Var.a;
                        File canonicalFile = ((File) ql0Var2.b.a()).getCanonicalFile();
                        synchronized (ql0.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = ql0.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new tl0(canonicalFile, (c43) ql0Var2.a.h(canonicalFile), new ja(14, canonicalFile));
                    default:
                        return ((tl0) b80Var.i.getValue()).b;
                }
            }
        });
        final int i = 1;
        this.j = new xb3(new cs0(this) { // from class: f70
            public final /* synthetic */ b80 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() throws IOException {
                int i2 = i;
                b80 b80Var = this.g;
                switch (i2) {
                    case 0:
                        ql0 ql0Var2 = b80Var.a;
                        File canonicalFile = ((File) ql0Var2.b.a()).getCanonicalFile();
                        synchronized (ql0.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = ql0.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new tl0(canonicalFile, (c43) ql0Var2.a.h(canonicalFile), new ja(14, canonicalFile));
                    default:
                        return ((tl0) b80Var.i.getValue()).b;
                }
            }
        });
        this.k = new pl(x50Var, new s(18, this), new z00(17, b), new j(this, p40Var, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b80 b80Var, q40 q40Var) {
        q70 q70Var;
        dt1 dt1Var;
        if (q40Var instanceof q70) {
            q70Var = (q70) q40Var;
            int i = q70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                q70Var.l = i - Integer.MIN_VALUE;
            } else {
                q70Var = new q70(b80Var, q40Var);
            }
        }
        Object obj = q70Var.j;
        int i2 = q70Var.l;
        if (i2 == 0) {
            y02.Q(obj);
            dt1 dt1Var2 = b80Var.d;
            q70Var.i = dt1Var2;
            q70Var.l = 1;
            Object objF = dt1Var2.f(q70Var);
            y50 y50Var = y50.f;
            if (objF == y50Var) {
                return y50Var;
            }
            dt1Var = dt1Var2;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dt1Var = q70Var.i;
            y02.Q(obj);
        }
        try {
            int i3 = b80Var.e - 1;
            b80Var.e = i3;
            if (i3 == 0) {
                w83 w83Var = b80Var.f;
                if (w83Var != null) {
                    w83Var.c(null);
                }
                b80Var.f = null;
            }
            dt1Var.i(null);
            return dm3.a;
        } catch (Throwable th) {
            dt1Var.i(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b80 b80Var, uo1 uo1Var, q40 q40Var) throws IllegalAccessException, InvocationTargetException {
        s70 s70Var;
        gz gzVar;
        o50 o50Var;
        if (q40Var instanceof s70) {
            s70Var = (s70) q40Var;
            int i = s70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s70Var.l = i - Integer.MIN_VALUE;
            } else {
                s70Var = new s70(b80Var, q40Var);
            }
        }
        Object qn2Var = s70Var.j;
        int i2 = s70Var.l;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(qn2Var);
            gz gzVar2 = uo1Var.b;
            try {
                o50Var = uo1Var.d;
            } catch (Throwable th) {
                th = th;
            }
            try {
                o50 o50Var2 = s70Var.g;
                o50Var2.getClass();
                o50 o50VarK = o50Var.k(o50Var2);
                j jVar = new j(b80Var, uo1Var, p40Var, 19);
                s70Var.i = gzVar2;
                s70Var.l = 1;
                Object objG = cl3.G(o50VarK, jVar, s70Var);
                y50 y50Var = y50.f;
                if (objG == y50Var) {
                    return y50Var;
                }
                qn2Var = objG;
                gzVar = gzVar2;
            } catch (Throwable th2) {
                th = th2;
                gzVar = gzVar2;
                qn2Var = new qn2(th);
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gzVar = s70Var.i;
            try {
                y02.Q(qn2Var);
            } catch (Throwable th3) {
                th = th3;
                qn2Var = new qn2(th);
            }
        }
        Throwable thA = rn2.a(qn2Var);
        if (thA == null) {
            gzVar.Y(qn2Var);
        } else {
            gzVar.getClass();
            gzVar.Y(new jz(thA, false));
        }
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(b80 b80Var, q40 q40Var) {
        t70 t70Var;
        dt1 dt1Var;
        if (q40Var instanceof t70) {
            t70Var = (t70) q40Var;
            int i = t70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                t70Var.l = i - Integer.MIN_VALUE;
            } else {
                t70Var = new t70(b80Var, q40Var);
            }
        }
        Object obj = t70Var.j;
        int i2 = t70Var.l;
        int i3 = 1;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            dt1 dt1Var2 = b80Var.d;
            t70Var.i = dt1Var2;
            t70Var.l = 1;
            Object objF = dt1Var2.f(t70Var);
            y50 y50Var = y50.f;
            if (objF == y50Var) {
                return y50Var;
            }
            dt1Var = dt1Var2;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dt1Var = t70Var.i;
            y02.Q(obj);
        }
        try {
            int i4 = b80Var.e + 1;
            b80Var.e = i4;
            if (i4 == 1) {
                b80Var.f = cl3.t(b80Var.b, null, new k70(b80Var, p40Var, i3), 3);
            }
            dt1Var.i(null);
            return dm3.a;
        } catch (Throwable th) {
            dt1Var.i(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1.C(r0) == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(b80 b80Var, q40 q40Var) throws Throwable {
        u70 u70Var;
        int iIntValue;
        int i;
        Throwable th;
        if (q40Var instanceof u70) {
            u70Var = (u70) q40Var;
            int i2 = u70Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u70Var.l = i2 - Integer.MIN_VALUE;
            } else {
                u70Var = new u70(b80Var, q40Var);
            }
        }
        Object objA = u70Var.j;
        int i3 = u70Var.l;
        Object obj = y50.f;
        try {
            if (i3 == 0) {
                y02.Q(objA);
                c43 c43VarI = b80Var.i();
                u70Var.l = 1;
                objA = c43VarI.a();
                if (objA != obj) {
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = u70Var.i;
                try {
                    y02.Q(objA);
                    return dm3.a;
                } catch (Throwable th2) {
                    th = th2;
                    b80Var.g.I(new zi2(th, i));
                    throw th;
                }
            }
            y02.Q(objA);
            pl plVar = b80Var.h;
            u70Var.i = iIntValue;
            u70Var.l = 2;
        } catch (Throwable th3) {
            i = iIntValue;
            th = th3;
            b80Var.g.I(new zi2(th, i));
            throw th;
        }
        iIntValue = ((Number) objA).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(b80 b80Var, boolean z, p40 p40Var) {
        v70 v70Var;
        d93 d93VarA;
        r32 r32Var;
        yl1 yl1Var = b80Var.g;
        if (p40Var instanceof v70) {
            v70Var = (v70) p40Var;
            int i = v70Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                v70Var.m = i - Integer.MIN_VALUE;
            } else {
                v70Var = new v70(b80Var, p40Var);
            }
        }
        Object objA = v70Var.k;
        int i2 = v70Var.m;
        int i3 = 3;
        p40 p40Var2 = null;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(objA);
            d93VarA = yl1Var.A();
            if (d93VarA instanceof ul3) {
                c.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            c43 c43VarI = b80Var.i();
            v70Var.j = d93VarA;
            v70Var.i = z;
            v70Var.m = 1;
            objA = c43VarI.a();
            if (objA != y50Var) {
            }
            return y50Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                y02.Q(objA);
                r32Var = (r32) objA;
                d93 d93Var = (d93) r32Var.f;
                if (((Boolean) r32Var.g).booleanValue()) {
                }
                return d93Var;
            }
            if (i2 != 3) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objA);
            r32Var = (r32) objA;
            d93 d93Var2 = (d93) r32Var.f;
            if (((Boolean) r32Var.g).booleanValue()) {
                yl1Var.I(d93Var2);
            }
            return d93Var2;
        }
        z = v70Var.i;
        d93VarA = v70Var.j;
        y02.Q(objA);
        int iIntValue = ((Number) objA).intValue();
        boolean z2 = d93VarA instanceof a70;
        int i4 = z2 ? ((a70) d93VarA).a : -1;
        if (z2 && iIntValue == i4) {
            return d93VarA;
        }
        if (z) {
            c43 c43VarI2 = b80Var.i();
            x5 x5Var = new x5(b80Var, p40Var2, i3);
            v70Var.j = null;
            v70Var.m = 2;
            objA = c43VarI2.b(x5Var, v70Var);
        } else {
            c43 c43VarI3 = b80Var.i();
            w70 w70Var = new w70(b80Var, i4, p40Var2, 0);
            v70Var.j = null;
            v70Var.m = 3;
            objA = c43VarI3.c(w70Var, v70Var);
        }
        return y50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        if (r10 != r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[Catch: c60 -> 0x0097, TryCatch #0 {c60 -> 0x0097, blocks: (B:36:0x0092, B:68:0x0114, B:41:0x009c, B:65:0x00f9, B:44:0x00a6, B:60:0x00dd, B:47:0x00ac, B:55:0x00c2, B:56:0x00c6, B:51:0x00b5, B:62:0x00e9), top: B:72:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(b80 b80Var, boolean z, q40 q40Var) {
        x70 x70Var;
        Object objA;
        Object obj;
        int i;
        c60 c60Var;
        ok2 ok2Var;
        qk2 qk2Var;
        if (q40Var instanceof x70) {
            x70Var = (x70) q40Var;
            int i2 = x70Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x70Var.p = i2 - Integer.MIN_VALUE;
            } else {
                x70Var = new x70(b80Var, q40Var);
            }
        }
        Object objA2 = x70Var.n;
        int i3 = x70Var.p;
        int i4 = 1;
        p40 p40Var = null;
        Object obj2 = y50.f;
        try {
            switch (i3) {
                case 0:
                    y02.Q(objA2);
                    if (!z) {
                        c43 c43VarI = b80Var.i();
                        x70Var.i = z;
                        x70Var.p = 3;
                        objA2 = c43VarI.a();
                        if (objA2 != obj2) {
                            int iIntValue = ((Number) objA2).intValue();
                            c43 c43VarI2 = b80Var.i();
                            rs0 w70Var = new w70(b80Var, iIntValue, p40Var, i4);
                            x70Var.i = z;
                            x70Var.p = 4;
                            objA2 = c43VarI2.c(w70Var, x70Var);
                            break;
                        }
                    } else {
                        x70Var.i = z;
                        x70Var.p = 1;
                        objA2 = b80Var.j(x70Var);
                        if (objA2 != obj2) {
                            iHashCode = objA2 != null ? objA2.hashCode() : 0;
                            c43 c43VarI3 = b80Var.i();
                            x70Var.j = objA2;
                            x70Var.i = z;
                            x70Var.m = iHashCode;
                            x70Var.p = 2;
                            objA = c43VarI3.a();
                            if (objA == obj2) {
                                obj = objA2;
                                objA2 = objA;
                                i = iHashCode;
                                return new a70(i, ((Number) objA2).intValue(), obj);
                            }
                        }
                    }
                    return obj2;
                case 1:
                    z = x70Var.i;
                    y02.Q(objA2);
                    if (objA2 != null) {
                    }
                    c43 c43VarI32 = b80Var.i();
                    x70Var.j = objA2;
                    x70Var.i = z;
                    x70Var.m = iHashCode;
                    x70Var.p = 2;
                    objA = c43VarI32.a();
                    if (objA == obj2) {
                    }
                    break;
                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                    i = x70Var.m;
                    boolean z2 = x70Var.i;
                    obj = x70Var.j;
                    y02.Q(objA2);
                    return new a70(i, ((Number) objA2).intValue(), obj);
                case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                    z = x70Var.i;
                    y02.Q(objA2);
                    int iIntValue2 = ((Number) objA2).intValue();
                    c43 c43VarI22 = b80Var.i();
                    rs0 w70Var2 = new w70(b80Var, iIntValue2, p40Var, i4);
                    x70Var.i = z;
                    x70Var.p = 4;
                    objA2 = c43VarI22.c(w70Var2, x70Var);
                    break;
                case oc2.LONG_FIELD_NUMBER /* 4 */:
                    boolean z3 = x70Var.i;
                    y02.Q(objA2);
                    return (a70) objA2;
                case oc2.STRING_FIELD_NUMBER /* 5 */:
                    boolean z4 = x70Var.i;
                    qk2 qk2Var2 = (qk2) x70Var.l;
                    qk2 qk2Var3 = x70Var.k;
                    c60 c60Var2 = (c60) x70Var.j;
                    y02.Q(objA2);
                    qk2Var2.f = objA2;
                    ok2 ok2Var2 = new ok2();
                    try {
                        y70 y70Var = new y70(qk2Var3, b80Var, ok2Var2, (p40) null);
                        x70Var.j = c60Var2;
                        x70Var.k = qk2Var3;
                        x70Var.l = ok2Var2;
                        x70Var.p = 6;
                        if ((z4 ? y70Var.h(x70Var) : b80Var.i().b(new r70(y70Var, p40Var, iHashCode), x70Var)) != obj2) {
                            ok2Var = ok2Var2;
                            qk2Var = qk2Var3;
                            Object obj3 = qk2Var.f;
                            return new a70(obj3 != null ? obj3.hashCode() : 0, ok2Var.f, obj3);
                        }
                        return obj2;
                    } catch (Throwable th) {
                        th = th;
                        c60Var = c60Var2;
                        uq.j(c60Var, th);
                        throw c60Var;
                    }
                case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                    ok2Var = (ok2) x70Var.l;
                    qk2Var = x70Var.k;
                    c60Var = (c60) x70Var.j;
                    try {
                        y02.Q(objA2);
                        Object obj32 = qk2Var.f;
                        return new a70(obj32 != null ? obj32.hashCode() : 0, ok2Var.f, obj32);
                    } catch (Throwable th2) {
                        th = th2;
                        uq.j(c60Var, th);
                        throw c60Var;
                    }
                default:
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (c60 e) {
            qk2 qk2Var4 = new qk2();
            x70Var.j = e;
            x70Var.k = qk2Var4;
            x70Var.l = qk2Var4;
            x70Var.i = z;
            x70Var.p = 5;
            throw e;
        }
    }

    @Override // defpackage.e70
    public final Object a(rs0 rs0Var, q40 q40Var) {
        ho3 ho3Var = (ho3) q40Var.i().m(m22.A);
        if (ho3Var != null) {
            ho3Var.a(this);
        }
        return cl3.G(new ho3(ho3Var, this), new l(this, rs0Var, null, 12), q40Var);
    }

    @Override // defpackage.e70
    public final fn0 b() {
        return this.c;
    }

    public final c43 i() {
        return (c43) this.j.getValue();
    }

    public final Object j(q40 q40Var) {
        return ((tl0) this.i.getValue()).a(new m70(3, (p40) null), q40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, boolean z, q40 q40Var) throws Throwable {
        z70 z70Var;
        ok2 ok2Var;
        if (q40Var instanceof z70) {
            z70Var = (z70) q40Var;
            int i = z70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                z70Var.l = i - Integer.MIN_VALUE;
            } else {
                z70Var = new z70(this, q40Var);
            }
        }
        Object obj2 = z70Var.j;
        int i2 = z70Var.l;
        if (i2 == 0) {
            y02.Q(obj2);
            ok2 ok2Var2 = new ok2();
            tl0 tl0Var = (tl0) this.i.getValue();
            a80 a80Var = new a80(ok2Var2, this, obj, z, null);
            z70Var.i = ok2Var2;
            z70Var.l = 1;
            Object objB = tl0Var.b(a80Var, z70Var);
            y50 y50Var = y50.f;
            if (objB == y50Var) {
                return y50Var;
            }
            ok2Var = ok2Var2;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ok2Var = z70Var.i;
            y02.Q(obj2);
        }
        return new Integer(ok2Var.f);
    }
}
