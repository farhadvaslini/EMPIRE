package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class v8 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(kb2 kb2Var, p40 p40Var) {
        int i = this.a;
        int i2 = 1;
        int i3 = 7;
        int i4 = 2;
        int i5 = 0;
        int i6 = 3;
        p40 p40Var2 = null;
        Object obj = this.b;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                Object objT = vp.t(kb2Var, new u8((w8) obj, p40Var2, i5), p40Var);
                return objT == y50Var ? objT : dm3Var;
            case 1:
                z60 z60Var = (z60) obj;
                t60 t60Var = new t60(z60Var, i5);
                t60 t60Var2 = new t60(z60Var, i2);
                u60 u60Var = new u60(z60Var, i5);
                y7 y7Var = new y7(i3, z60Var, kb2Var);
                r93 r93Var = fh1.a;
                Object objT2 = vp.t(kb2Var, new eh1(t60Var, y7Var, u60Var, t60Var2, null), p40Var);
                if (objT2 != y50Var) {
                    objT2 = dm3Var;
                }
                return objT2 == y50Var ? objT2 : dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Object objT3 = vp.t(kb2Var, new u8((mc0) obj, p40Var2, i4), p40Var);
                return objT3 == y50Var ? objT3 : dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                a51 a51Var = (a51) obj;
                x41 x41Var = new x41(a51Var, i2);
                x41 x41Var2 = new x41(a51Var, i4);
                ja jaVar = new ja(20, a51Var);
                u uVar = new u(16, a51Var);
                r93 r93Var2 = fh1.a;
                Object objT4 = vp.t(kb2Var, new eh1(x41Var, uVar, jaVar, x41Var2, null), p40Var);
                if (objT4 != y50Var) {
                    objT4 = dm3Var;
                }
                return objT4 == y50Var ? objT4 : dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                Object objW = ur.w(new hd1(kb2Var, (i32) obj, p40Var2, i5), p40Var);
                return objW == y50Var ? objW : dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                Object objD = cd3.d(kb2Var, null, new rf((cs0) obj, i6), p40Var, 7);
                return objD == y50Var ? objD : dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                Object objP1 = ((sb3) kb2Var).p1(new u8((w40) obj, p40Var2, 4), p40Var);
                return objP1 == y50Var ? objP1 : dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                h53 h53Var = (h53) obj;
                Object objD2 = cd3.d(kb2Var, new f53(h53Var, null), new a53(h53Var, i4), p40Var, 3);
                return objD2 == y50Var ? objD2 : dm3Var;
            case 8:
                Object objT5 = vp.t(kb2Var, new om((ia3) obj, p40Var2, i6), p40Var);
                return objT5 == y50Var ? objT5 : dm3Var;
            case vr.g /* 9 */:
                Object objT6 = vp.t(kb2Var, new u8(new vw2(1, (ce3) obj, ce3.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 5), p40Var2, i6), p40Var);
                if (objT6 != y50Var) {
                    objT6 = dm3Var;
                }
                return objT6 == y50Var ? objT6 : dm3Var;
            case vr.h /* 10 */:
                sf3 sf3Var = (sf3) obj;
                g51 g51Var = sf3Var.A;
                qf3 qf3Var = sf3Var.z;
                sb3 sb3Var = (sb3) kb2Var;
                sb3Var.getClass();
                Object objT7 = vp.t(kb2Var, new om(new h9(vr.X(sb3Var).G), g51Var, qf3Var, null), p40Var);
                if (objT7 != y50Var) {
                    objT7 = dm3Var;
                }
                return objT7 == y50Var ? objT7 : dm3Var;
            default:
                Object objW2 = ur.w(new rw(kb2Var, (qe3) obj, p40Var2, 5), p40Var);
                if (objW2 != y50Var) {
                    objW2 = dm3Var;
                }
                return objW2 == y50Var ? objW2 : dm3Var;
        }
    }
}
