package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s12 implements ns0 {
    public final /* synthetic */ int f;

    public /* synthetic */ s12(int i) {
        this.f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0218  */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        boolean z;
        String str;
        int i = this.f;
        Object obj2 = null;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                tb1 tb1Var = (tb1) obj;
                if (tb1Var.H()) {
                    tb1.W(tb1Var, false, 7);
                }
                return dm3Var;
            case 1:
                tb1 tb1Var2 = (tb1) obj;
                if (tb1Var2.H()) {
                    tb1.Y(tb1Var2, false, 7);
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                tb1 tb1Var3 = (tb1) obj;
                if (tb1Var3.H()) {
                    tb1Var3.F();
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                tb1 tb1Var4 = (tb1) obj;
                if (tb1Var4.H()) {
                    tb1Var4.X(false);
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                tb1 tb1Var5 = (tb1) obj;
                if (tb1Var5.H()) {
                    tb1Var5.X(false);
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                tb1 tb1Var6 = (tb1) obj;
                if (tb1Var6.H()) {
                    tb1Var6.V(false);
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                tb1 tb1Var7 = (tb1) obj;
                if (tb1Var7.H()) {
                    tb1Var7.V(false);
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                obj.getClass();
                return Boolean.valueOf(!((r12) obj).U());
            case 8:
                s12 s12Var = j62.a;
                return dm3Var;
            case vr.g /* 9 */:
                ln2 ln2Var = (ln2) obj;
                ln2Var.getClass();
                nn2 nn2Var = ln2Var.l;
                if (nn2Var.b() > 262144) {
                    c.q("Response is too large");
                    return null;
                }
                rp rpVarF = nn2Var.f();
                hp hpVar = new hp();
                long j = 0;
                while (j <= 262144) {
                    long jD = rpVarF.d(Math.min(8192L, 262145 - j), hpVar);
                    if (jD == -1) {
                        if (j > 262144) {
                            String strM = hpVar.m();
                            return new y72(x72.a(strM), strM);
                        }
                        c.q("Response is too large");
                        return null;
                    }
                    j += jD;
                }
                if (j > 262144) {
                }
                break;
            case vr.h /* 10 */:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 11:
                y31 y31Var = (y31) obj;
                y31Var.getClass();
                return y31Var.a.d;
            case vr.i /* 12 */:
                File file = (File) obj;
                if (file.isDirectory()) {
                    String name = file.getName();
                    name.getClass();
                    if (!y93.B0(name, '.')) {
                        uk2 uk2Var = k82.l;
                        String name2 = file.getName();
                        name2.getClass();
                        z = k82.l.c(name2);
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                r32 r32Var = (r32) obj;
                r32Var.getClass();
                return Boolean.valueOf(s51.n(r32Var.f, "plugin"));
            case 14:
                r32 r32Var2 = (r32) obj;
                r32Var2.getClass();
                return (String) r32Var2.g;
            case jo3.g /* 15 */:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 16:
                w72 w72Var = (w72) obj;
                w72Var.getClass();
                return w72Var.a;
            case 17:
                y31 y31Var2 = (y31) obj;
                y31Var2.getClass();
                return y31Var2.a.b;
            case 18:
                rb2 rb2Var = (rb2) obj;
                if (rb2Var.isAttachedToWindow()) {
                    rb2Var.r();
                }
                return dm3Var;
            case 19:
                ((Context) obj).getClass();
                return ni0.f;
            case 20:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 21:
                r71 r71Var = (r71) obj;
                r71Var.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                r71Var.a(fValueOf, 300).b = qq1.b;
                r71Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                r71Var.a(fValueOf2, 1800);
                r71Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                r71Var.a(fValueOf3, 3300);
                r71Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                r71Var.a(fValueOf4, 4800);
                r71Var.a(fValueOf4, 6000);
                return dm3Var;
            case 22:
                bv2.h((dv2) obj, qd2.d);
                return dm3Var;
            case 23:
                vb1 vb1Var = (vb1) obj;
                pi piVar = vb1Var.f.g;
                long jA = piVar.A();
                piVar.k().l();
                try {
                    ((yl1) piVar.g).t(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    vb1Var.c();
                    return dm3Var;
                } finally {
                    nc2.t(piVar, jA);
                }
            case 24:
                Float f = (Float) obj;
                f.getClass();
                return new af2(new ed(f, rn.f1, obj2, 12));
            case 25:
                bt btVar = (bt) obj;
                btVar.getClass();
                return Long.valueOf(btVar.d);
            case 26:
                cf2 cf2Var = (cf2) obj;
                cf2Var.getClass();
                return Integer.valueOf(cf2Var.a);
            case 27:
                hb0 hb0Var = (hb0) obj;
                hb0Var.getClass();
                return Integer.valueOf(hb0Var.a);
            case 28:
                n72 n72Var = (n72) obj;
                n72Var.getClass();
                return by1.e(n72Var.a, "player-");
            default:
                gp3 gp3Var = (gp3) obj;
                gp3Var.getClass();
                return by1.e(gp3Var.a, "vehicle-");
        }
    }
}
