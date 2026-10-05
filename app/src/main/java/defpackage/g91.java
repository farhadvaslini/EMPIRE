package defpackage;

import android.app.Application;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g91 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ go3 g;

    public /* synthetic */ g91(go3 go3Var, int i) {
        this.f = i;
        this.g = go3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        boolean zBooleanValue;
        Object qn2Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        boolean z = false;
        switch (i) {
            case 0:
                go3 go3Var = this.g;
                i93 i93Var = go3Var.k;
                Object value = go3Var.i.getValue();
                vm3 vm3Var = value instanceof vm3 ? (vm3) value : null;
                if (vm3Var != null) {
                    qn3 qn3Var = vm3Var.a;
                    String str = qn3Var.d;
                    w83 w83Var = go3Var.m;
                    if ((w83Var == null || !w83Var.b()) && !(i93Var.getValue() instanceof ln3)) {
                        Application application = go3Var.b;
                        application.getClass();
                        File file = new File(application.getCacheDir(), "update");
                        File file2 = new File(file, qn3Var.b);
                        boolean z2 = file2.isFile() && file2.length() == qn3Var.e;
                        if (z2) {
                            if (y93.q0(str)) {
                                z = true;
                            } else {
                                if (y93.q0(str) || !file2.isFile()) {
                                    zBooleanValue = false;
                                } else {
                                    try {
                                        qn2Var = Boolean.valueOf(uq.K(file2).equalsIgnoreCase(str));
                                    } catch (Throwable th) {
                                        qn2Var = new qn2(th);
                                    }
                                    Object obj = Boolean.FALSE;
                                    if (qn2Var instanceof qn2) {
                                        qn2Var = obj;
                                    }
                                    zBooleanValue = ((Boolean) qn2Var).booleanValue();
                                }
                                if (zBooleanValue) {
                                }
                            }
                        }
                        if (z2 && z && (i93Var.getValue() instanceof mn3)) {
                            i93Var.j(null, new on3(file2));
                            go3Var.h();
                        } else {
                            w83 w83Var2 = go3Var.m;
                            if (w83Var2 != null) {
                                w83Var2.c(null);
                            }
                            go3Var.m = cl3.t(f80.F(go3Var), null, new m9(file, file2, go3Var, qn3Var, application, null, 16), 3);
                        }
                    }
                }
                break;
            default:
                this.g.g(false);
                break;
        }
        return dm3Var;
    }
}
