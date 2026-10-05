package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sa1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa1(sa1 sa1Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((fa1) m((p40) obj2, (String) obj)).o(dm3Var);
                break;
            case 1:
                ((fa1) m((p40) obj2, (oh3) obj)).o(dm3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((fa1) m((p40) obj2, (qf2) obj)).o(dm3Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((fa1) m((p40) obj2, (String) obj)).o(dm3Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((fa1) m((p40) obj2, (List) obj)).o(dm3Var);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((fa1) m((p40) obj2, (String) obj)).o(dm3Var);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((fa1) m((p40) obj2, (Map) obj)).o(dm3Var);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ((fa1) m((p40) obj2, (qp2) obj)).o(dm3Var);
                break;
            case 8:
                ((fa1) m((p40) obj2, (String) obj)).o(dm3Var);
                break;
            default:
                ((fa1) m((p40) obj2, (String) obj)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                fa1 fa1Var = new fa1(sa1Var, p40Var, 0);
                fa1Var.k = obj;
                return fa1Var;
            case 1:
                fa1 fa1Var2 = new fa1(sa1Var, p40Var, 1);
                fa1Var2.k = obj;
                return fa1Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                fa1 fa1Var3 = new fa1(sa1Var, p40Var, 2);
                fa1Var3.k = obj;
                return fa1Var3;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                fa1 fa1Var4 = new fa1(sa1Var, p40Var, 3);
                fa1Var4.k = obj;
                return fa1Var4;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                fa1 fa1Var5 = new fa1(sa1Var, p40Var, 4);
                fa1Var5.k = obj;
                return fa1Var5;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                fa1 fa1Var6 = new fa1(sa1Var, p40Var, 5);
                fa1Var6.k = obj;
                return fa1Var6;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                fa1 fa1Var7 = new fa1(sa1Var, p40Var, 6);
                fa1Var7.k = obj;
                return fa1Var7;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                fa1 fa1Var8 = new fa1(sa1Var, p40Var, 7);
                fa1Var8.k = obj;
                return fa1Var8;
            case 8:
                fa1 fa1Var9 = new fa1(sa1Var, p40Var, 8);
                fa1Var9.k = obj;
                return fa1Var9;
            default:
                fa1 fa1Var10 = new fa1(sa1Var, p40Var, 9);
                fa1Var10.k = obj;
                return fa1Var10;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        sa1 sa1Var = this.l;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                String str = (String) this.k;
                y02.Q(obj);
                sa1Var.z.i(str);
                return dm3Var;
            case 1:
                oh3 oh3Var = (oh3) this.k;
                y02.Q(obj);
                sa1Var.A.i(oh3Var);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                qf2 qf2Var = (qf2) this.k;
                y02.Q(obj);
                sa1Var.C.i(qf2Var);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                String str2 = (String) this.k;
                y02.Q(obj);
                sa1Var.I.i(str2);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                List list = (List) this.k;
                y02.Q(obj);
                sa1 sa1Var2 = this.l;
                LinkedHashSet linkedHashSet = sa1Var2.J;
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    p40 p40Var = null;
                    if (i2 < 0) {
                        vr.b0();
                        throw null;
                    }
                    kq2 kq2Var = (kq2) obj2;
                    String str3 = kq2Var.e;
                    if (!linkedHashSet.contains(str3)) {
                        linkedHashSet.add(str3);
                        cl3.t(f80.F(sa1Var2), null, new ia1(i2, sa1Var2, kq2Var, p40Var, 0), 3);
                    }
                    i2 = i3;
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                String str4 = (String) this.k;
                y02.Q(obj);
                sa1Var.t.i(str4);
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                Map map = (Map) this.k;
                y02.Q(obj);
                sa1Var.u.i(map);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                qp2 qp2Var = (qp2) this.k;
                y02.Q(obj);
                sa1Var.v.i(qp2Var);
                return dm3Var;
            case 8:
                String str5 = (String) this.k;
                y02.Q(obj);
                sa1Var.w.i(str5);
                return dm3Var;
            default:
                String str6 = (String) this.k;
                y02.Q(obj);
                sa1Var.x.i(str6);
                return dm3Var;
        }
    }
}
