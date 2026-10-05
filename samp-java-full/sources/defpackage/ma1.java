package defpackage;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ma1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sa1 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma1(sa1 sa1Var, boolean z, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
        this.m = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((ma1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        boolean z = this.m;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                return new ma1(sa1Var, z, p40Var, 0);
            case 1:
                return new ma1(sa1Var, z, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new ma1(sa1Var, z, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new ma1(sa1Var, z, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new ma1(sa1Var, z, p40Var, 4);
            default:
                return new ma1(sa1Var, z, p40Var, 5);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Object qn2Var;
        List list;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        boolean z = this.m;
        sa1 sa1Var = this.l;
        y50 y50Var = y50.f;
        p40 p40Var = null;
        switch (i) {
            case 0:
                i93 i93Var = sa1Var.m;
                i93 i93Var2 = sa1Var.l;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    if (((List) i93Var2.getValue()).isEmpty()) {
                        SharedPreferences sharedPreferences = (SharedPreferences) sa1Var.e.g;
                        String string = sharedPreferences.getString("json", null);
                        if (string == null) {
                            list = null;
                        } else {
                            try {
                                qn2Var = a31.C(string);
                            } catch (Throwable th) {
                                qn2Var = new qn2(th);
                            }
                            if (rn2.a(qn2Var) != null) {
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                editorEdit.getClass();
                                editorEdit.remove("json");
                                editorEdit.apply();
                                qn2Var = null;
                            }
                            list = (List) qn2Var;
                        }
                        if (list != null) {
                            i93Var2.getClass();
                            i93Var2.j(null, list);
                            sa1Var.r(list, false);
                        }
                    }
                    i93Var.getClass();
                    i93Var.j(null, rj2.g);
                    j90 j90Var = ac0.a;
                    x80 x80Var = x80.h;
                    hm hmVar = new hm(sa1Var, p40Var, 4);
                    this.k = 1;
                    obj = cl3.G(x80Var, hmVar, this);
                    if (obj == y50Var) {
                    }
                    break;
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                Object obj2 = ((rn2) obj).f;
                if (rn2.a(obj2) != null) {
                    i93Var.getClass();
                    i93Var.j(null, rj2.i);
                } else {
                    List list2 = (List) obj2;
                    i93Var2.i(list2);
                    i93Var.getClass();
                    i93Var.j(null, rj2.h);
                    sa1Var.r(list2, z);
                }
                break;
            case 1:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var = sa1Var.c;
                    this.k = 1;
                    if (qy2Var.m(z, this) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var2 = sa1Var.c;
                    this.k = 1;
                    if (qy2Var2.r(z, this) == y50Var) {
                    }
                } else if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var3 = sa1Var.c;
                    this.k = 1;
                    if (qy2Var3.x(z, this) == y50Var) {
                    }
                } else if (i5 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var4 = sa1Var.c;
                    this.k = 1;
                    if (qy2Var4.y(z, this) == y50Var) {
                    }
                } else if (i6 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i7 = this.k;
                if (i7 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var5 = sa1Var.c;
                    this.k = 1;
                    if (qy2Var5.z(z, this) == y50Var) {
                    }
                } else if (i7 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }
}
