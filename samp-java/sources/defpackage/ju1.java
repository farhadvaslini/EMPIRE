package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ju1 extends gu1 {
    public final zv1 f;
    public final String g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju1(zv1 zv1Var) {
        super(zv1Var.b(uq.w(mu1.class)), null);
        zv1Var.getClass();
        this.h = new ArrayList();
        this.f = zv1Var;
        this.g = "main";
    }

    public final iu1 c() {
        int iHashCode;
        iu1 iu1Var = (iu1) super.a();
        ArrayList arrayList = this.h;
        arrayList.getClass();
        lu1 lu1Var = iu1Var.k;
        lu1Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            fu1 fu1Var = (fu1) obj;
            if (fu1Var != null) {
                l83 l83Var = lu1Var.b;
                iu1 iu1Var2 = lu1Var.a;
                yf yfVar = iu1Var2.g;
                yf yfVar2 = fu1Var.g;
                int i2 = yfVar2.a;
                String str = (String) yfVar2.e;
                if (i2 == 0 && str == null) {
                    c.p("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) yfVar.e;
                if (str2 != null && s51.n(str, str2)) {
                    qn1.j("Destination ", fu1Var, " cannot have the same route as graph ", iu1Var2);
                    return null;
                }
                if (i2 == yfVar.a) {
                    qn1.j("Destination ", fu1Var, " cannot have the same id as graph ", iu1Var2);
                    return null;
                }
                fu1 fu1Var2 = (fu1) l83Var.b(i2);
                if (fu1Var2 == fu1Var) {
                    continue;
                } else {
                    if (fu1Var.h != null) {
                        c.q("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (fu1Var2 != null) {
                        fu1Var2.h = null;
                    }
                    fu1Var.h = iu1Var2;
                    l83Var.d(yfVar2.a, fu1Var);
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (this.b != null) {
                c.q("You must set a start destination route");
                return null;
            }
            c.q("You must set a start destination id");
            return null;
        }
        iu1 iu1Var3 = lu1Var.a;
        if (str3 != null) {
            if (str3.equals((String) iu1Var3.g.e)) {
                qn1.j("Start destination ", str3, " cannot use the same route as the graph ", iu1Var3);
            } else if (y93.q0(str3)) {
                c.p("Cannot have an empty start destination route");
            } else {
                int i3 = fu1.j;
                iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return iu1Var;
        }
        iHashCode = 0;
        lu1Var.c = iHashCode;
        lu1Var.e = str3;
        return iu1Var;
    }
}
