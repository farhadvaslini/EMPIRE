package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ij0 {
    public static final ij0 b = new ij0(new fk3((cl0) null, (q43) null, (hs) null, (kr2) null, (LinkedHashMap) null, 127));
    public final fk3 a;

    public ij0(fk3 fk3Var) {
        this.a = fk3Var;
    }

    public final ij0 a(ij0 ij0Var) {
        fk3 fk3Var = ij0Var.a;
        cl0 cl0Var = fk3Var.a;
        fk3 fk3Var2 = this.a;
        if (cl0Var == null) {
            cl0Var = fk3Var2.a;
        }
        q43 q43Var = fk3Var.b;
        if (q43Var == null) {
            q43Var = fk3Var2.b;
        }
        hs hsVar = fk3Var.c;
        if (hsVar == null) {
            hsVar = fk3Var2.c;
        }
        kr2 kr2Var = fk3Var.d;
        if (kr2Var == null) {
            kr2Var = fk3Var2.d;
        }
        Map map = fk3Var2.f;
        Map map2 = fk3Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new ij0(new fk3(cl0Var, q43Var, hsVar, kr2Var, linkedHashMap, 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ij0) && ((ij0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        fk3 fk3Var = this.a;
        cl0 cl0Var = fk3Var.a;
        String string = cl0Var != null ? cl0Var.toString() : null;
        q43 q43Var = fk3Var.b;
        String string2 = q43Var != null ? q43Var.toString() : null;
        hs hsVar = fk3Var.c;
        String string3 = hsVar != null ? hsVar.toString() : null;
        kr2 kr2Var = fk3Var.d;
        String string4 = kr2Var != null ? kr2Var.toString() : null;
        StringBuilder sbN = nc2.n("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - ");
        sbN.append(string3);
        sbN.append(", Scale - ");
        sbN.append(string4);
        sbN.append(", Veil - null");
        return sbN.toString();
    }
}
