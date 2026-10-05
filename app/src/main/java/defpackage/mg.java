package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mg extends t22 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mg(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.gr3
    public final void a() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                vg vgVar = ((kg) obj).g;
                vgVar.z.setAlpha(1.0f);
                vgVar.C.d(null);
                vgVar.C = null;
                break;
            case 1:
                vg vgVar2 = (vg) obj;
                vgVar2.z.setAlpha(1.0f);
                vgVar2.C.d(null);
                vgVar2.C = null;
                break;
            default:
                vg vgVar3 = (vg) ((a31) obj).h;
                vgVar3.z.setVisibility(8);
                PopupWindow popupWindow = vgVar3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vgVar3.z.getParent() instanceof View) {
                    View view = (View) vgVar3.z.getParent();
                    WeakHashMap weakHashMap = mq3.a;
                    view.requestApplyInsets();
                }
                vgVar3.z.e();
                vgVar3.C.d(null);
                vgVar3.C = null;
                ViewGroup viewGroup = vgVar3.F;
                WeakHashMap weakHashMap2 = mq3.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.t22, defpackage.gr3
    public void c() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((kg) obj).g.z.setVisibility(0);
                break;
            case 1:
                vg vgVar = (vg) obj;
                vgVar.z.setVisibility(0);
                if (vgVar.z.getParent() instanceof View) {
                    View view = (View) vgVar.z.getParent();
                    WeakHashMap weakHashMap = mq3.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
