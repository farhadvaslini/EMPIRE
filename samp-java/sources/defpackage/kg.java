package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kg implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ vg g;

    public /* synthetic */ kg(vg vgVar, int i) {
        this.f = i;
        this.g = vgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f;
        vg vgVar = this.g;
        switch (i) {
            case 0:
                if ((vgVar.e0 & 1) != 0) {
                    vgVar.w(0);
                }
                if ((vgVar.e0 & 4096) != 0) {
                    vgVar.w(108);
                }
                vgVar.d0 = false;
                vgVar.e0 = 0;
                break;
            default:
                vgVar.A.showAtLocation(vgVar.z, 55, 0, 0);
                er3 er3Var = vgVar.C;
                if (er3Var != null) {
                    er3Var.b();
                }
                if (vgVar.E && (viewGroup = vgVar.F) != null && viewGroup.isLaidOut()) {
                    vgVar.z.setAlpha(0.0f);
                    er3 er3VarA = mq3.a(vgVar.z);
                    er3VarA.a(1.0f);
                    vgVar.C = er3VarA;
                    er3VarA.d(new mg(0, this));
                } else {
                    vgVar.z.setAlpha(1.0f);
                    vgVar.z.setVisibility(0);
                }
                break;
        }
    }
}
