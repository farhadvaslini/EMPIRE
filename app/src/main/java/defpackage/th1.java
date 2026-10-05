package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class th1 implements PointerInputEventHandler {
    public final /* synthetic */ ex a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ z60 d;
    public final /* synthetic */ os1 e;

    public th1(ex exVar, int i, boolean z, z60 z60Var, os1 os1Var) {
        this.a = exVar;
        this.b = i;
        this.c = z;
        this.d = z60Var;
        this.e = os1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(kb2 kb2Var, p40 p40Var) {
        final ex exVar = this.a;
        final int i = this.b;
        final boolean z = this.c;
        final z60 z60Var = this.d;
        final os1 os1Var = this.e;
        Object objD = cd3.d(kb2Var, null, new ns0() { // from class: sh1
            @Override // defpackage.ns0
            public final Object h(Object obj) {
                ex exVar2 = exVar;
                float f = exVar2.g;
                float f2 = exVar2.f;
                float f3 = f - f2;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((gy1) obj).a >> 32));
                int i2 = i;
                if (i2 < 1) {
                    i2 = 1;
                }
                float f4 = (fIntBitsToFloat / i2) * f3;
                float fFloatValue = ((Number) y02.j(Float.valueOf(z ? f2 + f4 : f - f4), exVar2)).floatValue();
                z60Var.a(fFloatValue);
                ((ns0) os1Var.getValue()).h(Float.valueOf(fFloatValue));
                return dm3.a;
            }
        }, p40Var, 7);
        return objD == y50.f ? objD : dm3.a;
    }
}
