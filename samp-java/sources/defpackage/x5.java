package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x5 extends mb3 implements ns0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(Object obj, Object obj2, p40 p40Var, int i) {
        super(1, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.m;
        p40 p40Var = (p40) obj;
        switch (i) {
            case 0:
                return new x5((d6) this.l, (ss0) obj2, p40Var, 0).o(dm3Var);
            case 1:
                return new x5((wb) this.l, (yd3) obj2, p40Var, 1).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new x5((tl) this.l, (sl) obj2, p40Var, 2).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new x5((b80) obj2, p40Var, 3).o(dm3Var);
            default:
                return new x5((pl0) obj2, p40Var, 4).o(dm3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    @Override // defpackage.ml
    public final Object o(Object obj) throws Exception {
        tb tbVar;
        Handler handler;
        Throwable th;
        d93 zi2Var;
        Throwable th2;
        FileInputStream fileInputStream;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        Object obj2 = this.m;
        boolean z = true;
        p40 p40Var = null;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                d6 d6Var = (d6) this.l;
                int i3 = 3;
                v5 v5Var = new v5(d6Var, i3);
                l lVar = new l((ss0) obj2, d6Var, p40Var, i3);
                this.k = 1;
                return s51.l(v5Var, lVar, this) == y50Var ? y50Var : dm3Var;
            case 1:
                wb wbVar = (wb) this.l;
                p73 p73Var = wbVar.e;
                View view = wbVar.a;
                int i4 = this.k;
                int i5 = 4;
                try {
                    if (i4 == 0) {
                        y02.Q(obj);
                        ub ubVar = new ub();
                        yd3 yd3Var = (yd3) obj2;
                        int i6 = 0;
                        tb tbVar2 = new tb(ubVar, new rb(wbVar, yd3Var, 0), new rb(wbVar, yd3Var, 1), view);
                        ns0 ns0Var = wbVar.b;
                        if (ns0Var != null && (tbVar = (tb) ns0Var.h(tbVar2)) != null) {
                            tbVar2 = tbVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            vb vbVar = wbVar.i;
                            if (vbVar == null) {
                                vbVar = new vb(wbVar, tbVar2, ubVar, i6);
                                wbVar.i = vbVar;
                            }
                            view.post(vbVar);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new en0(tbVar2), 1);
                            if (actionModeStartActionMode == null) {
                                return dm3Var;
                            }
                            wbVar.h = actionModeStartActionMode;
                        }
                        this.k = 1;
                        np npVar = ubVar.a;
                        npVar.getClass();
                        Object objG = np.G(npVar, this);
                        if (objG != y50Var) {
                            objG = dm3Var;
                        }
                        if (objG == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i4 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        Runnable vVar = wbVar.j;
                        if (vVar == null) {
                            vVar = new v(i5, wbVar);
                            wbVar.j = vVar;
                        }
                        view.post(vVar);
                    } else {
                        ActionMode actionMode = wbVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    vb vbVar2 = wbVar.i;
                    if (vbVar2 != null) {
                        view.removeCallbacks(vbVar2);
                    }
                    wbVar.h = null;
                    return dm3Var;
                } finally {
                    p73Var.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper2 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable vVar2 = wbVar.j;
                        if (vVar2 == null) {
                            vVar2 = new v(i5, wbVar);
                            wbVar.j = vVar2;
                        }
                        view.post(vVar2);
                    } else {
                        ActionMode actionMode2 = wbVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    vb vbVar3 = wbVar.i;
                    if (vbVar3 != null) {
                        view.removeCallbacks(vbVar3);
                    }
                    wbVar.h = null;
                }
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                sl slVar = (sl) obj2;
                d42 d42Var = ((tl) this.l).c;
                int i7 = this.k;
                try {
                    if (i7 == 0) {
                        y02.Q(obj);
                        d42Var.setValue(slVar);
                        this.k = 1;
                        np npVar2 = slVar.b;
                        npVar2.getClass();
                        Object objG2 = np.G(npVar2, this);
                        if (objG2 != y50Var) {
                            objG2 = dm3Var;
                        }
                        if (objG2 == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i7 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    return dm3Var;
                } finally {
                    d42Var.setValue(null);
                }
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                b80 b80Var = (b80) obj2;
                int i8 = this.k;
                try {
                } catch (Throwable th3) {
                    c43 c43VarI = b80Var.i();
                    this.l = th3;
                    this.k = 2;
                    Integer numA = c43VarI.a();
                    if (numA == y50Var) {
                        return y50Var;
                    }
                    obj = numA;
                    th = th3;
                }
                if (i8 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    obj = b80.h(b80Var, true, this);
                    if (obj == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.l;
                        y02.Q(obj);
                        zi2Var = new zi2(th, ((Number) obj).intValue());
                        return new r32(zi2Var, Boolean.TRUE);
                    }
                    y02.Q(obj);
                }
                zi2Var = (d93) obj;
                return new r32(zi2Var, Boolean.TRUE);
            default:
                pl0 pl0Var = (pl0) obj2;
                ?? r0 = this.k;
                try {
                    try {
                        try {
                        } finally {
                        }
                    } catch (FileNotFoundException unused) {
                        if (!pl0Var.a.exists()) {
                            return new es1(z);
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(pl0Var.a);
                        try {
                            this.l = fileInputStream2;
                            this.k = 2;
                            es1 es1VarO = m22.o(fileInputStream2);
                            if (es1VarO == y50Var) {
                                return y50Var;
                            }
                            obj = es1VarO;
                            fileInputStream = fileInputStream2;
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileInputStream = fileInputStream2;
                            try {
                                throw th2;
                            } catch (Throwable th5) {
                                uq.l(fileInputStream, th2);
                                throw th5;
                            }
                        }
                    }
                    if (r0 == 0) {
                        y02.Q(obj);
                        FileInputStream fileInputStream3 = new FileInputStream(pl0Var.a);
                        this.l = fileInputStream3;
                        this.k = 1;
                        obj = m22.o(fileInputStream3);
                        r0 = fileInputStream3;
                        if (obj == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (r0 != 1) {
                            if (r0 != 2) {
                                c.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileInputStream = (FileInputStream) this.l;
                            try {
                                y02.Q(obj);
                                uq.l(fileInputStream, null);
                                return obj;
                            } catch (Throwable th6) {
                                th2 = th6;
                                throw th2;
                            }
                        }
                        FileInputStream fileInputStream4 = (FileInputStream) this.l;
                        y02.Q(obj);
                        r0 = fileInputStream4;
                    }
                    uq.l(r0, null);
                    return obj;
                } catch (Exception e) {
                    if (e instanceof FileNotFoundException) {
                        throw br.O(pl0Var.a.getParent(), (FileNotFoundException) e);
                    }
                    throw e;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(Object obj, p40 p40Var, int i) {
        super(1, p40Var);
        this.j = i;
        this.m = obj;
    }
}
