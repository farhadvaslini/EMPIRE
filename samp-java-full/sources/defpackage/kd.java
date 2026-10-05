package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kd extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(vb1 vb1Var, jk2 jk2Var, i23 i23Var) {
        super(1);
        this.g = 6;
        this.h = vb1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return Boolean.valueOf(s51.n(obj, obj2));
            case 1:
                h62 h62Var = (h62) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    h62Var.C((i62) arrayList.get(i2), 0, 0, 0.0f);
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                te teVar = (te) obj;
                float f = teVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = teVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = teVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = teVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new wx(wx.a(vp.a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, ky.x), (iy) obj2));
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(!s51.n(obj, ((gk3) obj2).d.getValue()));
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((uw0) obj).d(((Number) ((e93) obj2).getValue()).floatValue());
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                qf0 qf0Var = (qf0) obj;
                qw0 qw0Var = (qw0) obj2;
                da daVar = qw0Var.l;
                if (qw0Var.n && qw0Var.A && daVar != null) {
                    pi piVarZ = qf0Var.Z();
                    long jA = piVarZ.A();
                    piVarZ.k().l();
                    try {
                        ((pi) ((yl1) piVarZ.g).g).k().s(daVar);
                        qw0Var.c(qf0Var);
                    } finally {
                        nc2.t(piVarZ, jA);
                    }
                } else {
                    qw0Var.c(qf0Var);
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((vb1) obj2).c();
                return dm3Var;
            default:
                ((uw0) obj).o(((Boolean) ((cs0) obj2).a()).booleanValue());
                return dm3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd(int i, Object obj) {
        super(1);
        this.g = i;
        this.h = obj;
    }
}
