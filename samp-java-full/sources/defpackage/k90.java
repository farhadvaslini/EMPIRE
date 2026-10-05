package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k90 implements cs2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public k90(cs2 cs2Var, i32 i32Var) {
        this.b = cs2Var;
    }

    @Override // defpackage.cs2
    public final float a(float f) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                l90 l90Var = (l90) obj;
                if (Float.isNaN(f)) {
                    return 0.0f;
                }
                float fFloatValue = ((Number) l90Var.a.h(Float.valueOf(f))).floatValue();
                l90Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
                l90Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
                return fFloatValue;
            default:
                return ((cs2) obj).a(f);
        }
    }

    public k90(l90 l90Var) {
        this.b = l90Var;
    }
}
