package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bz implements o50, Serializable {
    public final o50 f;
    public final m50 g;

    public bz(m50 m50Var, o50 o50Var) {
        o50Var.getClass();
        m50Var.getClass();
        this.f = o50Var;
        this.g = m50Var;
    }

    public final boolean equals(Object obj) {
        boolean zN;
        if (this == obj) {
            return true;
        }
        if (obj instanceof bz) {
            bz bzVar = (bz) obj;
            int i = 2;
            bz bzVar2 = bzVar;
            int i2 = 2;
            while (true) {
                o50 o50Var = bzVar2.f;
                bzVar2 = o50Var instanceof bz ? (bz) o50Var : null;
                if (bzVar2 == null) {
                    break;
                }
                i2++;
            }
            bz bzVar3 = this;
            while (true) {
                o50 o50Var2 = bzVar3.f;
                bzVar3 = o50Var2 instanceof bz ? (bz) o50Var2 : null;
                if (bzVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    m50 m50Var = this.g;
                    if (!s51.n(bzVar.m(m50Var.getKey()), m50Var)) {
                        zN = false;
                        break;
                    }
                    o50 o50Var3 = this.f;
                    if (!(o50Var3 instanceof bz)) {
                        o50Var3.getClass();
                        m50 m50Var2 = (m50) o50Var3;
                        zN = s51.n(bzVar.m(m50Var2.getKey()), m50Var2);
                        break;
                    }
                    this = (bz) o50Var3;
                }
                if (zN) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode();
    }

    @Override // defpackage.o50
    public final o50 k(o50 o50Var) {
        o50Var.getClass();
        return o50Var == li0.f ? this : (o50) o50Var.p(new z00(13, (byte) 0), this);
    }

    @Override // defpackage.o50
    public final m50 m(n50 n50Var) {
        n50Var.getClass();
        while (true) {
            m50 m50VarM = this.g.m(n50Var);
            if (m50VarM != null) {
                return m50VarM;
            }
            o50 o50Var = this.f;
            if (!(o50Var instanceof bz)) {
                return o50Var.m(n50Var);
            }
            this = (bz) o50Var;
        }
    }

    @Override // defpackage.o50
    public final Object p(rs0 rs0Var, Object obj) {
        return rs0Var.f(this.f.p(rs0Var, obj), this.g);
    }

    public final String toString() {
        return "[" + ((String) p(new wc(7), "")) + ']';
    }

    @Override // defpackage.o50
    public final o50 u(n50 n50Var) {
        n50Var.getClass();
        m50 m50Var = this.g;
        m50 m50VarM = m50Var.m(n50Var);
        o50 o50Var = this.f;
        if (m50VarM != null) {
            return o50Var;
        }
        o50 o50VarU = o50Var.u(n50Var);
        return o50VarU == o50Var ? this : o50VarU == li0.f ? m50Var : new bz(m50Var, o50VarU);
    }
}
