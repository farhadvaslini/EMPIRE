package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class t93 implements zo {
    public final cs0 b;
    public final zo c;

    public t93(cs0 cs0Var, bb1 bb1Var, zo zoVar) {
        this.b = cs0Var;
        this.c = zoVar;
    }

    @Override // defpackage.zo
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.b.a()).intValue();
        return this.c.a(f - fIntValue, f2, f3 - fIntValue);
    }
}
