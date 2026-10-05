package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y70 extends mb3 implements ns0 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(qk2 qk2Var, b80 b80Var, ok2 ok2Var, p40 p40Var) {
        super(1, p40Var);
        this.n = qk2Var;
        this.l = b80Var;
        this.o = ok2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.o;
        Object obj3 = this.l;
        p40 p40Var = (p40) obj;
        switch (i) {
            case 0:
                return new y70((qk2) this.n, (b80) obj3, (ok2) obj2, p40Var).o(dm3Var);
            case 1:
                return new y70((b80) obj3, (o50) this.n, (rs0) obj2, p40Var).o(dm3Var);
            default:
                return new y70((dm0) obj3, obj2, p40Var).o(dm3Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x014e, code lost:
    
        if (r12 != r6) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Exception {
        qk2 qk2Var;
        ok2 ok2Var;
        a70 a70Var;
        Object obj2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.o;
        y50 y50Var = y50.f;
        Object obj4 = this.l;
        p40 p40Var = null;
        switch (i) {
            case 0:
                ok2 ok2Var2 = (ok2) obj3;
                qk2 qk2Var2 = (qk2) this.n;
                b80 b80Var = (b80) obj4;
                int i2 = this.k;
                try {
                } catch (c60 unused) {
                    Object obj5 = qk2Var2.f;
                    this.m = ok2Var2;
                    this.k = 3;
                    obj = b80Var.k(obj5, true, this);
                    break;
                }
                if (i2 == 0) {
                    y02.Q(obj);
                    this.m = qk2Var2;
                    this.k = 1;
                    obj = b80Var.j(this);
                    if (obj == y50Var) {
                        return y50Var;
                    }
                    qk2Var = qk2Var2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ok2Var = (ok2) ((Serializable) this.m);
                            y02.Q(obj);
                            ok2Var.f = ((Number) obj).intValue();
                            return dm3Var;
                        }
                        if (i2 != 3) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ok2Var2 = (ok2) ((Serializable) this.m);
                        y02.Q(obj);
                        ok2Var2.f = ((Number) obj).intValue();
                        return dm3Var;
                    }
                    qk2Var = (qk2) ((Serializable) this.m);
                    y02.Q(obj);
                }
                qk2Var.f = obj;
                c43 c43VarI = b80Var.i();
                this.m = ok2Var2;
                this.k = 2;
                obj = c43VarI.a();
                if (obj == y50Var) {
                    return y50Var;
                }
                ok2Var = ok2Var2;
                ok2Var.f = ((Number) obj).intValue();
                return dm3Var;
            case 1:
                b80 b80Var2 = (b80) obj4;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    obj = b80.h(b80Var2, true, this);
                    if (obj == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                c.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj6 = this.m;
                            y02.Q(obj);
                            return obj6;
                        }
                        a70Var = (a70) this.m;
                        y02.Q(obj);
                        obj2 = a70Var.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == a70Var.c) {
                            c.q("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                            return null;
                        }
                        if (!s51.n(a70Var.b, obj)) {
                            this.m = obj;
                            this.k = 3;
                            if (b80Var2.k(obj, true, this) == y50Var) {
                                return y50Var;
                            }
                        }
                        return obj;
                    }
                    y02.Q(obj);
                }
                a70Var = (a70) obj;
                o50 o50Var = (o50) this.n;
                j jVar = new j((rs0) obj3, a70Var, p40Var, 20);
                this.m = a70Var;
                this.k = 2;
                obj = cl3.G(o50Var, jVar, this);
                if (obj == y50Var) {
                    return y50Var;
                }
                obj2 = a70Var.b;
                if ((obj2 == null ? obj2.hashCode() : 0) == a70Var.c) {
                }
                break;
            default:
                File file = ((dm0) obj4).a;
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            vl3 vl3Var = new vl3(fileOutputStream);
                            this.m = fileOutputStream;
                            this.n = fileOutputStream;
                            this.k = 1;
                            m22.q(obj3, vl3Var);
                            if (dm3Var == y50Var) {
                                return y50Var;
                            }
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = fileOutputStream;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw br.O(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream = (FileOutputStream) this.n;
                    fileOutputStream2 = (FileOutputStream) this.m;
                    try {
                        y02.Q(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            uq.l(fileOutputStream2, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                uq.l(fileOutputStream2, null);
                return dm3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(dm0 dm0Var, Object obj, p40 p40Var) {
        super(1, p40Var);
        this.l = dm0Var;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(b80 b80Var, o50 o50Var, rs0 rs0Var, p40 p40Var) {
        super(1, p40Var);
        this.l = b80Var;
        this.n = o50Var;
        this.o = rs0Var;
    }
}
