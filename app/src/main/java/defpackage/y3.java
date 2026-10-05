package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends s3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ q3 d;

    public /* synthetic */ y3(z3 z3Var, String str, q3 q3Var, int i) {
        this.a = i;
        this.b = z3Var;
        this.c = str;
        this.d = q3Var;
    }

    @Override // defpackage.s3
    public final void a(Object obj) throws Exception {
        int i = this.a;
        q3 q3Var = this.d;
        String str = this.c;
        z3 z3Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = z3Var.d;
                Object obj2 = z3Var.b.get(str);
                if (obj2 == null) {
                    qn1.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", q3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    z3Var.b(iIntValue, q3Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = z3Var.d;
                Object obj3 = z3Var.b.get(str);
                if (obj3 == null) {
                    qn1.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", q3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    z3Var.b(iIntValue2, q3Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void b() {
        this.b.e(this.c);
    }
}
