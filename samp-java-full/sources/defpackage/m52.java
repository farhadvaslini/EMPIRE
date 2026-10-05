package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m52 extends q52 {
    public n52 l;

    @Override // defpackage.q52, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ee2) {
            return super.containsKey((ee2) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof oo3) {
            return super.containsValue((oo3) obj);
        }
        return false;
    }

    @Override // defpackage.q52
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final n52 b() {
        tk3 tk3Var = this.h;
        n52 n52Var = this.l;
        if (tk3Var != n52Var.f) {
            this.g = new h01(10);
            n52Var = new n52(this.h, this.k);
        }
        this.l = n52Var;
        return n52Var;
    }

    @Override // defpackage.q52, java.util.AbstractMap, java.util.Map
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

    @Override // defpackage.q52, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof ee2) {
            return (oo3) super.remove((ee2) obj);
        }
        return null;
    }
}
