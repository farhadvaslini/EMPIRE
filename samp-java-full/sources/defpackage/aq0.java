package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class aq0 implements zp0 {
    public final m22 a;
    public final c9 b;
    public final ar2 c;
    public final eq0 d;
    public final k71 e;

    public aq0(m22 m22Var, c9 c9Var) {
        ar2 ar2Var = bq0.a;
        eq0 eq0Var = new eq0();
        dq0 dq0Var = eq0.a;
        jx0 jx0Var = zb0.a;
        dq0Var.getClass();
        ur.c(pq.Q(dq0Var, jx0Var).k(li0.f).k(new xa3(null)));
        k71 k71Var = new k71(7);
        this.a = m22Var;
        this.b = c9Var;
        this.c = ar2Var;
        this.d = eq0Var;
        this.e = k71Var;
        new s(25, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a A[Catch: Exception -> 0x00a2, TRY_ENTER, TryCatch #3 {Exception -> 0x00a2, blocks: (B:25:0x0040, B:27:0x0054, B:30:0x0059, B:32:0x005d, B:37:0x0072, B:53:0x009a, B:54:0x00a1, B:33:0x0064, B:34:0x0066, B:35:0x0069, B:36:0x006e), top: B:65:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ml3 a(ll3 ll3Var) {
        Typeface typefaceO;
        Object objRemove;
        ar2 ar2Var = this.c;
        synchronized (((ak2) ar2Var.g)) {
            try {
                ml3 ml3Var = (ml3) ((nl1) ar2Var.h).a(ll3Var);
                if (ml3Var != null) {
                    if (ml3Var.g) {
                        return ml3Var;
                    }
                    nl1 nl1Var = (nl1) ar2Var.h;
                    synchronized (nl1Var.c) {
                        j21 j21Var = nl1Var.b;
                        j21Var.getClass();
                        objRemove = j21Var.f.remove(ll3Var);
                        if (objRemove != null) {
                            nl1Var.d--;
                        }
                    }
                }
                try {
                    this.d.getClass();
                    zb3 zb3Var = ll3Var.a;
                    h01 h01Var = (h01) this.e.g;
                    int i = ll3Var.c;
                    xq0 xq0Var = ll3Var.b;
                    ml3 ml3Var2 = null;
                    if (zb3Var != null && !(zb3Var instanceof t80)) {
                        if (zb3Var instanceof zv0) {
                            typefaceO = h01Var.q((zv0) zb3Var, xq0Var, i);
                        }
                        if (ml3Var2 != null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((ak2) ar2Var.g)) {
                            if (((nl1) ar2Var.h).a(ll3Var) == null && ml3Var2.g) {
                                ((nl1) ar2Var.h).b(ll3Var, ml3Var2);
                            }
                        }
                        return ml3Var2;
                    }
                    switch (h01Var.f) {
                        case 18:
                            typefaceO = h01.o(null, xq0Var, i);
                            break;
                        default:
                            typefaceO = h01.p(null, xq0Var, i);
                            break;
                    }
                    ml3Var2 = new ml3(typefaceO);
                    if (ml3Var2 != null) {
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ml3 b(zb3 zb3Var, xq0 xq0Var, int i, int i2) {
        c9 c9Var = this.b;
        c9Var.getClass();
        int i3 = c9Var.f;
        xq0 xq0Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? xq0Var : new xq0(y02.h(xq0Var.f + i3, 1, 1000));
        this.a.getClass();
        return a(new ll3(zb3Var, xq0Var2, i, i2, null));
    }
}
