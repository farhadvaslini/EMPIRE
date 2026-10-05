package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m71 {
    public final t73 a;
    public n71 b;
    public bp0 c;

    public m71(t73 t73Var) {
        this.a = t73Var;
    }

    public final n71 a() {
        n71 n71Var = this.b;
        if (n71Var != null) {
            return n71Var;
        }
        s51.F("keyboardActions");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        ns0 ns0Var;
        t73 t73Var;
        if (i != 7 && i != 2 && i != 6 && i != 5) {
            if (i == 3) {
                ns0Var = a().a;
            } else if (i == 4) {
                ns0Var = a().b;
            } else if (i != 1 && i != 0) {
                c.q("invalid ImeAction");
                return false;
            }
            if (ns0Var == null) {
                ns0Var.h(this);
                return true;
            }
            if (i == 6) {
                bp0 bp0Var = this.c;
                if (bp0Var != null) {
                    ((ep0) bp0Var).g(1, true);
                    return true;
                }
                s51.F("focusManager");
                throw null;
            }
            if (i != 5) {
                if (i != 7 || (t73Var = this.a) == null) {
                    return false;
                }
                ((ka0) t73Var).a();
                return true;
            }
            bp0 bp0Var2 = this.c;
            if (bp0Var2 != null) {
                ((ep0) bp0Var2).g(2, true);
                return true;
            }
            s51.F("focusManager");
            throw null;
        }
        a();
        ns0Var = null;
        if (ns0Var == null) {
        }
    }
}
