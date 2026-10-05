package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ls implements dt0 {
    public final o50 f;
    public final int g;
    public final jp h;

    public ls(o50 o50Var, int i, jp jpVar) {
        this.f = o50Var;
        this.g = i;
        this.h = jpVar;
    }

    @Override // defpackage.fn0
    public Object a(gn0 gn0Var, p40 p40Var) {
        Object objW = ur.w(new l(gn0Var, this, null, 8), p40Var);
        return objW == y50.f ? objW : dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.dt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fn0 b(o50 o50Var, int i, jp jpVar) {
        o50 o50Var2 = this.f;
        o50 o50VarK = o50Var.k(o50Var2);
        jp jpVar2 = jp.f;
        jp jpVar3 = this.h;
        int i2 = this.g;
        if (jpVar == jpVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i == -2) {
                            i = i2;
                        } else {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            jpVar = jpVar3;
        }
        return (s51.n(o50VarK, o50Var2) && i == i2 && jpVar == jpVar3) ? this : e(o50VarK, i, jpVar);
    }

    public String c() {
        return null;
    }

    public abstract Object d(kd2 kd2Var, p40 p40Var);

    public abstract ls e(o50 o50Var, int i, jp jpVar);

    public fn0 f() {
        return null;
    }

    public js g(x50 x50Var) {
        int i = this.g;
        if (i == -3) {
            i = -2;
        }
        rs0 jVar = new j(this, null, 8);
        kd2 kd2Var = new kd2(uq.y(x50Var, this.f), lr.a(i, 4, this.h));
        kd2Var.r0(a60.h, kd2Var, jVar);
        return kd2Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        li0 li0Var = li0.f;
        o50 o50Var = this.f;
        if (o50Var != li0Var) {
            arrayList.add("context=" + o50Var);
        }
        int i = this.g;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        jp jpVar = jp.f;
        jp jpVar2 = this.h;
        if (jpVar2 != jpVar) {
            arrayList.add("onBufferOverflow=" + jpVar2);
        }
        return getClass().getSimpleName() + '[' + qx.x0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
