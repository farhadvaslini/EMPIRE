package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n8 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ n8(cs0 cs0Var, cs0 cs0Var2, t33 t33Var, ns0 ns0Var) {
        this.f = 11;
        this.h = cs0Var;
        this.g = cs0Var2;
        this.i = t33Var;
        this.j = ns0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        Object next;
        p40 p40Var = null;
        int i = 1;
        boolean zS = false;
        zS = false;
        switch (this.f) {
            case 0:
                ((pb0) this.g).e((cs0) this.h, (nb0) this.i, (bb1) this.j);
                return dm3.a;
            case 1:
                Float f = (Float) this.g;
                d21 d21Var = (d21) this.h;
                Float f2 = (Float) this.i;
                c21 c21Var = (c21) this.j;
                if (!f.equals(d21Var.f) || !f2.equals(d21Var.g)) {
                    d21Var.f = f;
                    d21Var.g = f2;
                    d21Var.i = new dd3(c21Var, rn.f1, f, f2, null);
                    d21Var.m.b.setValue(Boolean.TRUE);
                    d21Var.j = false;
                    d21Var.k = true;
                }
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ti tiVar = (ti) this.g;
                ns0 ns0Var = (ns0) this.h;
                os1 os1Var = (os1) this.i;
                os1 os1Var2 = (os1) this.j;
                os1Var.setValue(tiVar);
                ti tiVar2 = ui.a;
                tiVar.getClass();
                ui.a = tiVar;
                ns0Var.h(tiVar);
                os1Var2.setValue(Boolean.FALSE);
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ClipboardManager clipboardManager = (ClipboardManager) this.g;
                Context context = (Context) this.h;
                String str = (String) this.i;
                clipboardManager.setPrimaryClip(ClipData.newPlainText("log", qx.x0((List) ((os1) this.j).getValue(), "\n", null, null, null, 62)));
                Toast.makeText(context, str, 0).show();
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                s33 s33Var = (s33) this.g;
                s83 s83Var = (s83) this.h;
                s83 s83Var2 = (s83) this.i;
                s83 s83Var3 = (s83) this.j;
                s33Var.d = s83Var;
                s33Var.e = s83Var2;
                s33Var.b = s83Var3;
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                s33 s33Var2 = (s33) this.g;
                x50 x50Var = (x50) this.i;
                ed edVar = (ed) this.j;
                cs0 cs0Var = (cs0) this.h;
                int i2 = 2;
                if (((t33) s33Var2.c.g.getValue()) == t33.g) {
                    if (s33Var2.c.d().a.containsKey(t33.h)) {
                        cl3.t(x50Var, null, new ah1(edVar, p40Var, i2), 3);
                        cl3.t(x50Var, null, new qp1(s33Var2, p40Var, zS ? 1 : 0), 3);
                    } else {
                        cl3.t(x50Var, null, new qp1(s33Var2, p40Var, i), 3).r(new rf(cs0Var, 2));
                    }
                }
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                oa2 oa2Var = (oa2) this.g;
                y31 y31Var = (y31) this.h;
                os1 os1Var3 = (os1) this.i;
                os1 os1Var4 = (os1) this.j;
                String str2 = y31Var.a.b;
                boolean zBooleanValue = ((Boolean) os1Var3.getValue()).booleanValue();
                str2.getClass();
                i93 i93Var = oa2Var.o;
                if (!(i93Var.getValue() instanceof i92)) {
                    i93Var.j(null, new i92(f92.i, str2));
                    cl3.t(f80.F(oa2Var), null, new na2(oa2Var, str2, zBooleanValue, (p40) null), 3);
                }
                os1Var4.setValue(null);
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                hb0 hb0Var = (hb0) this.g;
                List list = (List) this.h;
                a42 a42Var = (a42) this.i;
                os1 os1Var5 = (os1) this.j;
                if (hb0Var.a()) {
                    int size = list.size();
                    int iG = a42Var.g();
                    if (iG >= 0 && iG < size) {
                        return y93.G0((String) list.get(a42Var.g())).toString();
                    }
                }
                return (String) os1Var5.getValue();
            case 8:
                rs0 rs0Var = (rs0) this.g;
                kq2 kq2Var = (kq2) this.h;
                vy2 vy2Var = (vy2) this.i;
                f80.p((os1) this.j, false);
                rs0Var.f(kq2Var.a, vy2Var.a.b);
                return dm3.a;
            case vr.g /* 9 */:
                ot0 ot0Var = (ot0) this.g;
                String str3 = (String) this.i;
                cs0 cs0Var2 = (cs0) this.h;
                os1 os1Var6 = (os1) this.j;
                boolean zBooleanValue2 = ((Boolean) ot0Var.h(str3)).booleanValue();
                os1Var6.setValue(Boolean.valueOf(!zBooleanValue2));
                if (zBooleanValue2) {
                    cs0Var2.a();
                }
                return dm3.a;
            case vr.h /* 10 */:
                y92 y92Var = (y92) this.g;
                y31 y31Var2 = (y31) this.h;
                rs0 rs0Var2 = (rs0) this.i;
                os1 os1Var7 = (os1) this.j;
                String str4 = y31Var2.a.b;
                synchronized (y92Var) {
                    try {
                        str4.getClass();
                        Iterator it = ((Iterable) y92Var.f.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (s51.n(((y31) next).a.b, str4)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        y31 y31Var3 = (y31) next;
                        if (y31Var3 != null && y92Var.l(str4, qx.R0(y31Var3.a.i))) {
                            zS = y92Var.s(str4, true);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (zS) {
                    rs0Var2.f(y31Var2.a.b, Boolean.TRUE);
                    os1Var7.setValue(null);
                }
                return dm3.a;
            default:
                return new s33((cs0) this.h, (cs0) this.g, (t33) this.i, (ns0) this.j);
        }
    }

    public /* synthetic */ n8(ot0 ot0Var, String str, cs0 cs0Var, os1 os1Var) {
        this.f = 9;
        this.g = ot0Var;
        this.i = str;
        this.h = cs0Var;
        this.j = os1Var;
    }

    public /* synthetic */ n8(s33 s33Var, x50 x50Var, ed edVar, cs0 cs0Var) {
        this.f = 5;
        this.g = s33Var;
        this.i = x50Var;
        this.j = edVar;
        this.h = cs0Var;
    }

    public /* synthetic */ n8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }
}
