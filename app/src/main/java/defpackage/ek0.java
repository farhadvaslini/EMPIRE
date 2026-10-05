package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ek0 {
    public static final ek0 b;
    public static final ek0 c;
    public final fk3 a;

    static {
        LinkedHashMap linkedHashMap = null;
        cl0 cl0Var = null;
        q43 q43Var = null;
        hs hsVar = null;
        kr2 kr2Var = null;
        b = new ek0(new fk3(cl0Var, q43Var, hsVar, kr2Var, linkedHashMap, 127));
        c = new ek0(new fk3(cl0Var, q43Var, hsVar, kr2Var, linkedHashMap, 95));
    }

    public ek0(fk3 fk3Var) {
        this.a = fk3Var;
    }

    public final ek0 a(ek0 ek0Var) {
        fk3 fk3Var = ek0Var.a;
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
        boolean z = fk3Var.e || fk3Var2.e;
        Map map = fk3Var2.f;
        Map map2 = fk3Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new ek0(new fk3(cl0Var, q43Var, hsVar, kr2Var, z, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ek0) && ((ek0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
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
        boolean z = fk3Var.e;
        StringBuilder sbN = nc2.n("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        nc2.w(sbN, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbN.append(z);
        return sbN.toString();
    }
}
