package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw0 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ns0 g;

    public /* synthetic */ cw0(ns0 ns0Var, int i) {
        this.f = i;
        this.g = ns0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        ns0 ns0Var = this.g;
        switch (i) {
            case 0:
                nk3 nk3Var = (nk3) obj;
                if (!(nk3Var instanceof bw0)) {
                    c.q("Node is not a GestureNode instance");
                    return null;
                }
                aw0 aw0Var = ((bw0) nk3Var).t;
                aw0 aw0Var2 = aw0Var != null ? aw0Var : null;
                return Boolean.valueOf(aw0Var2 == null ? true : ((Boolean) ns0Var.h(aw0Var2)).booleanValue());
            case 1:
                ns0Var.h(ea1.k.get(((Integer) obj).intValue()));
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                bm2 bm2Var = (bm2) obj;
                bm2Var.getClass();
                ns0Var.h(bm2Var);
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ns0Var.h(uri);
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                String str = (String) obj;
                str.getClass();
                ns0Var.h(new h22(str));
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                t63 t63Var = (t63) ns0Var.h((y63) obj);
                synchronized (a73.c) {
                    a73.d = a73.d.f(t63Var.g());
                }
                return t63Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return ns0Var.h(l);
        }
    }
}
