package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class j70 extends mb3 implements ns0 {
    public Object j;
    public Serializable k;
    public Object l;
    public Object m;
    public Iterator n;
    public int o;
    public int p;
    public final /* synthetic */ b80 q;
    public final /* synthetic */ pl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(b80 b80Var, pl plVar, p40 p40Var) {
        super(1, p40Var);
        this.q = b80Var;
        this.r = plVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        return new j70(this.q, this.r, (p40) obj).o(dm3.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        bt1 dt1Var;
        mk2 mk2Var;
        qk2 qk2Var;
        qk2 qk2Var2;
        Iterator it;
        bt1 bt1Var;
        mk2 mk2Var2;
        qk2 qk2Var3;
        i70 i70Var;
        dt1 dt1Var2;
        qk2 qk2Var4;
        mk2 mk2Var3;
        bt1 bt1Var2;
        int iHashCode;
        Integer numA;
        Object obj2;
        int i = this.p;
        pl plVar = this.r;
        b80 b80Var = this.q;
        y50 y50Var = y50.f;
        if (i == 0) {
            y02.Q(obj);
            dt1Var = new dt1();
            mk2Var = new mk2();
            qk2Var = new qk2();
            this.j = dt1Var;
            this.k = mk2Var;
            this.l = qk2Var;
            this.m = qk2Var;
            this.p = 1;
            obj = b80.h(b80Var, true, this);
            if (obj != y50Var) {
                qk2Var2 = qk2Var;
            }
            return y50Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iHashCode = this.o;
                    obj2 = this.j;
                    y02.Q(obj);
                    return new a70(iHashCode, ((Number) obj).intValue(), obj2);
                }
                bt1 bt1Var3 = (bt1) this.l;
                qk2Var4 = (qk2) this.k;
                mk2Var3 = (mk2) this.j;
                y02.Q(obj);
                bt1Var2 = bt1Var3;
                try {
                    mk2Var3.f = true;
                    ((dt1) bt1Var2).i(null);
                    Object obj3 = qk2Var4.f;
                    iHashCode = obj3 == null ? obj3.hashCode() : 0;
                    c43 c43VarI = b80Var.i();
                    this.j = obj3;
                    this.k = null;
                    this.l = null;
                    this.o = iHashCode;
                    this.p = 4;
                    numA = c43VarI.a();
                    if (numA != y50Var) {
                        obj = numA;
                        obj2 = obj3;
                        return new a70(iHashCode, ((Number) obj).intValue(), obj2);
                    }
                    return y50Var;
                } catch (Throwable th) {
                    ((dt1) bt1Var2).i(null);
                    throw th;
                }
            }
            it = this.n;
            i70Var = (i70) this.m;
            qk2Var3 = (qk2) this.l;
            mk2Var2 = (mk2) this.k;
            bt1Var = (bt1) this.j;
            y02.Q(obj);
            while (it.hasNext()) {
                rs0 rs0Var = (rs0) it.next();
                this.j = bt1Var;
                this.k = mk2Var2;
                this.l = qk2Var3;
                this.m = i70Var;
                this.n = it;
                this.p = 2;
                if (rs0Var.f(i70Var, this) == y50Var) {
                    break;
                }
            }
            qk2Var2 = qk2Var3;
            mk2Var = mk2Var2;
            dt1Var = bt1Var;
            plVar.i = null;
            this.j = mk2Var;
            this.k = qk2Var2;
            this.l = dt1Var;
            this.m = null;
            this.n = null;
            this.p = 3;
            dt1Var2 = (dt1) dt1Var;
            if (dt1Var2.f(this) != y50Var) {
                qk2Var4 = qk2Var2;
                mk2Var3 = mk2Var;
                bt1Var2 = dt1Var2;
                mk2Var3.f = true;
                ((dt1) bt1Var2).i(null);
                Object obj32 = qk2Var4.f;
                if (obj32 == null) {
                }
                c43 c43VarI2 = b80Var.i();
                this.j = obj32;
                this.k = null;
                this.l = null;
                this.o = iHashCode;
                this.p = 4;
                numA = c43VarI2.a();
                if (numA != y50Var) {
                }
            }
            return y50Var;
        }
        qk2Var = (qk2) this.m;
        qk2Var2 = (qk2) this.l;
        mk2Var = (mk2) this.k;
        dt1Var = (bt1) this.j;
        y02.Q(obj);
        qk2Var.f = ((a70) obj).b;
        i70 i70Var2 = new i70(dt1Var, mk2Var, qk2Var2, b80Var);
        List list = (List) plVar.i;
        if (list != null) {
            it = list.iterator();
            bt1Var = dt1Var;
            mk2Var2 = mk2Var;
            qk2Var3 = qk2Var2;
            i70Var = i70Var2;
            while (it.hasNext()) {
            }
            qk2Var2 = qk2Var3;
            mk2Var = mk2Var2;
            dt1Var = bt1Var;
        }
        plVar.i = null;
        this.j = mk2Var;
        this.k = qk2Var2;
        this.l = dt1Var;
        this.m = null;
        this.n = null;
        this.p = 3;
        dt1Var2 = (dt1) dt1Var;
        if (dt1Var2.f(this) != y50Var) {
        }
        return y50Var;
    }
}
