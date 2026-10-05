package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fk3 {
    public final cl0 a;
    public final q43 b;
    public final hs c;
    public final kr2 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ fk3(cl0 cl0Var, q43 q43Var, hs hsVar, kr2 kr2Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : cl0Var, (i & 2) != 0 ? null : q43Var, (i & 4) != 0 ? null : hsVar, (i & 8) != 0 ? null : kr2Var, (i & 32) == 0, (i & 64) != 0 ? oi0.f : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk3)) {
            return false;
        }
        fk3 fk3Var = (fk3) obj;
        return s51.n(this.a, fk3Var.a) && s51.n(this.b, fk3Var.b) && s51.n(this.c, fk3Var.c) && s51.n(this.d, fk3Var.d) && this.e == fk3Var.e && s51.n(this.f, fk3Var.f);
    }

    public final int hashCode() {
        cl0 cl0Var = this.a;
        int iHashCode = (cl0Var == null ? 0 : cl0Var.hashCode()) * 31;
        q43 q43Var = this.b;
        int iHashCode2 = (iHashCode + (q43Var == null ? 0 : q43Var.hashCode())) * 31;
        hs hsVar = this.c;
        int iHashCode3 = (iHashCode2 + (hsVar == null ? 0 : hsVar.hashCode())) * 31;
        kr2 kr2Var = this.d;
        return this.f.hashCode() + by1.b((iHashCode3 + (kr2Var != null ? kr2Var.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }

    public fk3(cl0 cl0Var, q43 q43Var, hs hsVar, kr2 kr2Var, boolean z, Map map) {
        this.a = cl0Var;
        this.b = q43Var;
        this.c = hsVar;
        this.d = kr2Var;
        this.e = z;
        this.f = map;
    }
}
