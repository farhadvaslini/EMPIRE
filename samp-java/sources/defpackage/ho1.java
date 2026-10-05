package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ho1 {
    public final Context a;
    public final nn1 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public oo1 h;
    public fo1 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final go1 k = new go1(this);

    public ho1(Context context, nn1 nn1Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = nn1Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final fo1 a() {
        fo1 y83Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131099670);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                y83Var = new ds(context2, this.e, this.d, this.c);
            } else {
                y83Var = new y83(context2, this.b, this.e, this.d, this.c);
            }
            y83Var.l(this.b);
            y83Var.r(this.k);
            y83Var.n(this.e);
            y83Var.e(this.h);
            y83Var.o(this.g);
            y83Var.p(this.f);
            this.i = y83Var;
        }
        return this.i;
    }

    public final boolean b() {
        fo1 fo1Var = this.i;
        return fo1Var != null && fo1Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        fo1 fo1VarA = a();
        fo1VarA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            fo1VarA.q(i);
            fo1VarA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            fo1VarA.f = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        fo1VarA.c();
    }
}
