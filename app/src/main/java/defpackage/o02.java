package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class o02 {
    public final int a;
    public final int b;

    public /* synthetic */ o02(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var);

    public iv0 b(lx lxVar) {
        return null;
    }

    public final String toString() {
        String strC = rk2.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public o02(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
