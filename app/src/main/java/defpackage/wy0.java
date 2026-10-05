package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wy0 implements z13 {
    public static final wy0 b = new wy0(0);
    public static final wy0 c = new wy0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ wy0(int i) {
        this.a = i;
    }

    @Override // defpackage.z13
    public final vr a(long j, bb1 bb1Var, ua0 ua0Var) {
        switch (this.a) {
            case 0:
                float fP0 = ua0Var.p0(30.0f);
                return new w02(new jk2(0.0f, -fP0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fP0));
            case 1:
                float fP02 = ua0Var.p0(30.0f);
                return new w02(new jk2(-fP02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fP02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new w02(b32.b(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
