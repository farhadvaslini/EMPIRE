package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class n52 extends o52 implements p20 {
    public static final n52 i = new n52(tk3.e, 0);

    @Override // defpackage.o52
    public final q52 a() {
        m52 m52Var = new m52(this);
        m52Var.l = this;
        return m52Var;
    }

    @Override // defpackage.o52
    public final q52 b() {
        m52 m52Var = new m52(this);
        m52Var.l = this;
        return m52Var;
    }

    @Override // defpackage.o52, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ee2) {
            return super.containsKey((ee2) obj);
        }
        return false;
    }

    @Override // defpackage.o52, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof oo3) {
            return super.containsValue((oo3) obj);
        }
        return false;
    }

    public final n52 d(ee2 ee2Var, oo3 oo3Var) {
        s4 s4VarU = this.f.u(ee2Var.hashCode(), 0, ee2Var, oo3Var);
        return s4VarU == null ? this : new n52((tk3) s4VarU.b, this.g + s4VarU.a);
    }

    @Override // defpackage.o52, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ee2) {
            return (oo3) super.get((ee2) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ee2) ? obj2 : (oo3) super.getOrDefault((ee2) obj, (oo3) obj2);
    }
}
