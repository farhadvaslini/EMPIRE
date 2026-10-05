package defpackage;

import android.graphics.PathMeasure;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x91 implements cs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ x91(int i) {
        this.f = i;
    }

    @Override // defpackage.cs0
    public final Object a() {
        switch (this.f) {
            case 0:
                r93 r93Var = da1.a;
                return null;
            case 1:
                return new tb1(3);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new ie1(0, 0);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new x91(7);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new wr();
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new wr();
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new wr();
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                r93 r93Var2 = fh1.a;
                return Float.valueOf(1.0f);
            case 8:
                return new wr();
            case vr.g /* 9 */:
                return new wr();
            case vr.h /* 10 */:
                return new q13(wx.b(0.05f, wx.b), 0.0f, 26);
            case 11:
                return uo2.a;
            case vr.i /* 12 */:
                return new q13(wx.b(0.05f, wx.b), 0.0f, 26);
            case 13:
                r93 r93Var3 = yh1.a;
                return null;
            case 14:
                t20 t20Var = hj1.a;
                return null;
            case jo3.g /* 15 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 16:
                t20 t20Var2 = jj1.a;
                return null;
            case 17:
                t20 t20Var3 = kj1.a;
                return null;
            case 18:
                r93 r93Var4 = mj1.a;
                return f5.Y;
            case 19:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 20:
                return new tb1(2);
            case 21:
                return oq1.a;
            case 22:
                return UUID.randomUUID();
            case 23:
                return new xq2();
            case 24:
                j21 j21Var = new j21(0);
                j21Var.a(rk2.a(rt1.class), new fi1(12));
                return j21Var.b();
            case 25:
                float f = iv1.a;
                return d90.a;
            case 26:
                float f2 = wv1.a;
                return f90.a;
            case 27:
                n40 n40VarC = ur.c(li0.f);
                ur.o(n40VarC, null);
                return n40VarC;
            case 28:
                return new k12();
            default:
                return new fa(new PathMeasure());
        }
    }
}
