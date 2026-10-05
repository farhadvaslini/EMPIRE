package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class h00 implements us0 {
    public final /* synthetic */ int f;

    public /* synthetic */ h00(int i) {
        this.f = i;
    }

    @Override // defpackage.us0
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                je3 je3Var = (je3) obj;
                yd3 yd3Var = (yd3) obj2;
                cs0 cs0Var = (cs0) obj3;
                nv0 nv0Var = (nv0) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? nv0Var.f(je3Var) : nv0Var.h(je3Var) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? nv0Var.f(yd3Var) : nv0Var.h(yd3Var) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= nv0Var.h(cs0Var) ? 256 : 128;
                }
                if (!nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
                    nv0Var.U();
                } else {
                    x90.c(je3Var, yd3Var, cs0Var, nv0Var, i2 & 1022);
                }
                break;
            case 1:
                je3 je3Var2 = (je3) obj;
                yd3 yd3Var2 = (yd3) obj2;
                cs0 cs0Var2 = (cs0) obj3;
                nv0 nv0Var2 = (nv0) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? nv0Var2.f(je3Var2) : nv0Var2.h(je3Var2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? nv0Var2.f(yd3Var2) : nv0Var2.h(yd3Var2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= nv0Var2.h(cs0Var2) ? 256 : 128;
                }
                if (!nv0Var2.R(i3 & 1, (i3 & 1171) != 1170)) {
                    nv0Var2.U();
                } else {
                    x90.c(je3Var2, yd3Var2, cs0Var2, nv0Var2, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                yg3 yg3Var = (yg3) obj5;
                String string = ((CharSequence) obj4).subSequence(yg3.f(yg3Var.a), yg3.e(yg3Var.a)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return dm3Var;
    }
}
