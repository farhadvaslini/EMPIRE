package top.th1nk.samp;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.ac0;
import defpackage.b32;
import defpackage.bh0;
import defpackage.ch0;
import defpackage.cl3;
import defpackage.d00;
import defpackage.d32;
import defpackage.db3;
import defpackage.dh0;
import defpackage.hf1;
import defpackage.hm;
import defpackage.j90;
import defpackage.k71;
import defpackage.n32;
import defpackage.n92;
import defpackage.p40;
import defpackage.p83;
import defpackage.pq;
import defpackage.qi;
import defpackage.vg0;
import defpackage.wg0;
import defpackage.x10;
import defpackage.x80;
import defpackage.xg0;
import defpackage.xz;
import defpackage.yb3;
import defpackage.yg0;
import defpackage.yz;
import defpackage.zg0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class MainActivity extends xz {
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        List list = qi.a;
        String string = context.getSharedPreferences("servers", 0).getString("language_tag", null);
        if (string == null) {
            string = qi.a();
        }
        super.attachBaseContext(qi.c(context, qi.b(string)));
    }

    @Override // defpackage.xz, defpackage.wz, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        (i >= 31 ? new p83(this) : new k71(19, this)).i();
        super.onCreate(bundle);
        int i2 = 2;
        yb3 yb3Var = new yb3(0, 0, new db3(i2));
        yb3 yb3Var2 = new yb3(xg0.a, xg0.b, new db3(i2));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        yg0 dh0Var = xg0.c;
        if (dh0Var == null) {
            dh0Var = i >= 35 ? new dh0() : i >= 30 ? new ch0() : i >= 29 ? new bh0() : i >= 28 ? new zg0() : new yg0();
            xg0.c = dh0Var;
        }
        yg0 yg0Var = dh0Var;
        vg0 vg0Var = new vg0(yg0Var, yb3Var, yb3Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i3 = 0;
        while (true) {
            if (i3 >= viewGroup.getChildCount()) {
                wg0 wg0Var = new wg0(vg0Var, viewGroup.getContext());
                wg0Var.setTag(yg0Var);
                wg0Var.setVisibility(8);
                wg0Var.setWillNotDraw(true);
                viewGroup.addView(wg0Var);
                break;
            }
            int i4 = i3 + 1;
            View childAt = viewGroup.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof yg0) {
                break;
            } else {
                i3 = i4;
            }
        }
        vg0Var.run();
        Window window = getWindow();
        window.getClass();
        yg0Var.a(window);
        d00 d00Var = n92.m;
        ViewGroup.LayoutParams layoutParams = yz.a;
        View childAt2 = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        p40 p40Var = null;
        x10 x10Var = childAt2 instanceof x10 ? (x10) childAt2 : null;
        if (x10Var != null) {
            x10Var.setParentCompositionContext(null);
            x10Var.setContent(d00Var);
        } else {
            x10 x10Var2 = new x10(this);
            x10Var2.setParentCompositionContext(null);
            x10Var2.setContent(d00Var);
            View decorView2 = getWindow().getDecorView();
            if (b32.m(decorView2) == null) {
                decorView2.setTag(2131230924, this);
            }
            if (n32.n(decorView2) == null) {
                decorView2.setTag(2131230928, this);
            }
            if (d32.o(decorView2) == null) {
                decorView2.setTag(2131230927, this);
            }
            setContentView(x10Var2, yz.a);
        }
        hf1 hf1VarA = pq.A(this);
        j90 j90Var = ac0.a;
        cl3.t(hf1VarA, x80.h, new hm(this, p40Var, 6), 2);
        if (Build.VERSION.SDK_INT < 33 || n92.h(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1001);
    }

    @Override // defpackage.xz, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
