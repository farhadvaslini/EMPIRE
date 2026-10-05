package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qz2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ sz2 g;

    public /* synthetic */ qz2(sz2 sz2Var, int i) {
        this.f = i;
        this.g = sz2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        Object next;
        int i = this.f;
        Object[] objArr = 0;
        int i2 = 1;
        dm3 dm3Var = dm3.a;
        sz2 sz2Var = this.g;
        int i3 = 2;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    vr.c(ko2.a.a(null), gq.N(200634425, new qz2(sz2Var, i2), nv0Var), nv0Var, 56);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    nh3.a(Boolean.TRUE, false, gq.N(-941143602, new qz2(sz2Var, i3), nv0Var2), nv0Var2, 438);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    Boolean boolValueOf = Boolean.valueOf(sz2Var.b());
                    l22 l22VarA = sz2Var.a();
                    boolean zH = nv0Var3.h(sz2Var);
                    Object objO = nv0Var3.O();
                    if (zH || objO == c20.a) {
                        objO = new l80(sz2Var, objArr == true ? 1 : 0, 12);
                        nv0Var3.j0(objO);
                    }
                    rn.m(boolValueOf, l22VarA, (rs0) objO, nv0Var3);
                    vm1.c(sz2Var.b(), null, dj0.f(null, 3), dj0.g(null, 3), null, gq.N(1087857318, new ir(14, sz2Var), nv0Var3), nv0Var3, 200064, 18);
                }
                break;
            default:
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                str.getClass();
                d42 d42Var = sz2Var.x;
                d42Var.setValue(zBooleanValue ? oz2.F((Set) d42Var.getValue(), str) : oz2.A((Set) d42Var.getValue(), str));
                sz2Var.p.f(str, bool);
                Iterator it = ((Iterable) sz2Var.b.g.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (s51.n(((y31) next).a.b, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                y31 y31Var = (y31) next;
                if ((y31Var != null ? y31Var.a.h : null) == p72.g) {
                    new Handler(Looper.getMainLooper()).postDelayed(new rz2(sz2Var, 2), 250L);
                }
                break;
        }
        return dm3Var;
    }
}
