package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wk3 extends uk3 {
    public final t52 i;

    public wk3(t52 t52Var) {
        this.i = t52Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        this.h = i + 2;
        Object[] objArr = this.f;
        return new ur1(this.i, objArr[i], objArr[i + 1]);
    }
}
