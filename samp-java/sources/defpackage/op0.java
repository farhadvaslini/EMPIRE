package defpackage;

import java.util.Map;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class op0 extends ct0 implements rs0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.m = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        boolean zA;
        boolean zA2;
        int i = this.m;
        jd1 jd1Var = null;
        Object[] objArr = 0;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                mp0 mp0Var = (mp0) obj;
                mp0 mp0Var2 = (mp0) obj2;
                pp0 pp0Var = (pp0) obj3;
                if (pp0Var.s && (zA = mp0Var2.a()) != mp0Var.a()) {
                    if (!zA) {
                        jd1 jd1Var2 = pp0Var.w;
                        if (jd1Var2 != null) {
                            jd1Var2.b();
                        }
                        pp0Var.w = null;
                    } else {
                        qk2 qk2Var = new qk2();
                        gq.M(pp0Var, new u1(16, qk2Var, pp0Var));
                        jd1 jd1Var3 = (jd1) qk2Var.f;
                        if (jd1Var3 != null) {
                            jd1Var3.a();
                            jd1Var = jd1Var3;
                        }
                        pp0Var.w = jd1Var;
                    }
                }
                break;
            case 1:
                mp0 mp0Var3 = (mp0) obj;
                mp0 mp0Var4 = (mp0) obj2;
                wp0 wp0Var = (wp0) obj3;
                if (wp0Var.s && (zA2 = mp0Var4.a()) != mp0Var3.a()) {
                    ns0 ns0Var = wp0Var.w;
                    if (ns0Var != null) {
                        ns0Var.h(Boolean.valueOf(zA2));
                    }
                    if (zA2) {
                        cl3.t(wp0Var.d1(), null, new l80(wp0Var, objArr == true ? 1 : 0, 2), 1);
                        qk2 qk2Var2 = new qk2();
                        gq.M(wp0Var, new u1(18, qk2Var2, wp0Var));
                        jd1 jd1Var4 = (jd1) qk2Var2.f;
                        if (jd1Var4 != null) {
                            jd1Var4.a();
                        } else {
                            jd1Var4 = null;
                        }
                        wp0Var.y = jd1Var4;
                        ex1 ex1Var = wp0Var.z;
                        if (ex1Var != null && ex1Var.w1().s) {
                            wp0Var.t1();
                        }
                    } else {
                        jd1 jd1Var5 = wp0Var.y;
                        if (jd1Var5 != null) {
                            jd1Var5.b();
                        }
                        wp0Var.y = null;
                        wp0Var.t1();
                    }
                    y02.w(wp0Var);
                    qr1 qr1Var = wp0Var.v;
                    if (qr1Var != null) {
                        wo0 wo0Var = wp0Var.x;
                        if (zA2) {
                            if (wo0Var != null) {
                                wp0Var.s1(qr1Var, new xo0(wo0Var));
                                wp0Var.x = null;
                            }
                            wo0 wo0Var2 = new wo0();
                            wp0Var.s1(qr1Var, wo0Var2);
                            wp0Var.x = wo0Var2;
                        } else if (wo0Var != null) {
                            wp0Var.s1(qr1Var, new xo0(wo0Var));
                            wp0Var.x = null;
                        }
                    }
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                sv2 sv2Var = (sv2) obj;
                Map map = (Map) obj2;
                sv2Var.getClass();
                map.getClass();
                sa1 sa1Var = (sa1) obj3;
                sa1Var.getClass();
                i93 i93Var = sa1Var.q;
                hp2 hp2Var = new hp2(true, sv2Var, map);
                i93Var.getClass();
                i93Var.j(null, hp2Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                sv2 sv2Var2 = (sv2) obj;
                Map map2 = (Map) obj2;
                sv2Var2.getClass();
                map2.getClass();
                sa1 sa1Var2 = (sa1) obj3;
                sa1Var2.getClass();
                i93 i93Var2 = sa1Var2.q;
                hp2 hp2Var2 = new hp2(true, sv2Var2, map2);
                i93Var2.getClass();
                i93Var2.j(null, hp2Var2);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                String str = (String) obj;
                cs0 cs0Var = (cs0) obj2;
                str.getClass();
                cs0Var.getClass();
                sa1 sa1Var3 = (sa1) obj3;
                sa1Var3.getClass();
                cl3.t(f80.F(sa1Var3), null, new l(sa1Var3, str, cs0Var, null, 22), 3);
                break;
            default:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                vi2 vi2Var = (vi2) obj3;
                vi2Var.getClass();
                RaksampNativeBridge.INSTANCE.enterVehicle(vi2Var.c, iIntValue, zBooleanValue);
                break;
        }
        return dm3Var;
    }
}
