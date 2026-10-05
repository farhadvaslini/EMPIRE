package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class j50 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ k50 g;

    public /* synthetic */ j50(k50 k50Var, dv2 dv2Var) {
        this.f = 3;
        this.g = k50Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        StringBuilder sb = null;
        boolean z = true;
        k50 k50Var = this.g;
        switch (i) {
            case 0:
                d42 d42Var = k50Var.x.t;
                Boolean bool = Boolean.TRUE;
                d42Var.setValue(bool);
                k50Var.x.s.setValue(bool);
                ye1 ye1Var = k50Var.x;
                AutofillValue autofillValue = ((z8) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                k50.s1(ye1Var, (String) textValue, k50Var.y, k50Var.z);
                return bool;
            case 1:
                List list = (List) obj;
                if (k50Var.x.d() != null) {
                    qg3 qg3VarD = k50Var.x.d();
                    qg3VarD.getClass();
                    list.add(qg3VarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                k50.s1(k50Var.x, ((af) obj).g, k50Var.y, k50Var.z);
                return Boolean.TRUE;
            default:
                af afVar = (af) obj;
                if (k50Var.y || !k50Var.z) {
                    z = false;
                } else {
                    jg3 jg3Var = k50Var.x.e;
                    if (jg3Var != null) {
                        List listL = vr.L(new lm0(), new dz(afVar, 1));
                        ye1 ye1Var2 = k50Var.x;
                        a31 a31Var = ye1Var2.d;
                        w40 w40Var = ye1Var2.v;
                        bg3 bg3VarN = a31Var.n(listL);
                        jg3Var.a(null, bg3VarN);
                        w40Var.h(bg3VarN);
                    } else {
                        bg3 bg3Var = k50Var.w;
                        String str = bg3Var.a.g;
                        long j = bg3Var.b;
                        int i2 = yg3.c;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        afVar.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) afVar);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            c.i(nc2.h("End index (", i4, ") is less than start index (", i3, ")."));
                        }
                        String string = sb.toString();
                        int length = afVar.g.length() + ((int) (k50Var.w.b >> 32));
                        k50Var.x.v.h(new bg3(string, d32.f(length, length), 4));
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ j50(k50 k50Var, int i) {
        this.f = i;
        this.g = k50Var;
    }
}
