package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xi3 extends j2 {
    public final bj3 a;
    public final Window.Callback b;
    public final vi3 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final e7 h = new e7(7, this);

    public xi3(Toolbar toolbar, CharSequence charSequence, qg qgVar) {
        vi3 vi3Var = new vi3(this);
        bj3 bj3Var = new bj3(toolbar, false);
        this.a = bj3Var;
        qgVar.getClass();
        this.b = qgVar;
        bj3Var.k = qgVar;
        toolbar.setOnMenuItemClickListener(vi3Var);
        boolean z = bj3Var.g;
        if (!z) {
            bj3Var.h = charSequence;
            if ((bj3Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    mq3.j(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.c = new vi3(this);
    }

    @Override // defpackage.j2
    public final boolean a() {
        z2 z2Var;
        ActionMenuView actionMenuView = this.a.a.f;
        return (actionMenuView == null || (z2Var = actionMenuView.y) == null || !z2Var.c()) ? false : true;
    }

    @Override // defpackage.j2
    public final boolean b() {
        wn1 wn1Var;
        ri3 ri3Var = this.a.a.R;
        if (ri3Var == null || (wn1Var = ri3Var.g) == null) {
            return false;
        }
        if (ri3Var == null) {
            wn1Var = null;
        }
        if (wn1Var == null) {
            return true;
        }
        wn1Var.collapseActionView();
        return true;
    }

    @Override // defpackage.j2
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        qn1.b();
    }

    @Override // defpackage.j2
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.j2
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // defpackage.j2
    public final boolean f() {
        bj3 bj3Var = this.a;
        Toolbar toolbar = bj3Var.a;
        e7 e7Var = this.h;
        toolbar.removeCallbacks(e7Var);
        Toolbar toolbar2 = bj3Var.a;
        WeakHashMap weakHashMap = mq3.a;
        toolbar2.postOnAnimation(e7Var);
        return true;
    }

    @Override // defpackage.j2
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.j2
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu menuP = p();
        if (menuP == null) {
            return false;
        }
        menuP.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuP.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.j2
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // defpackage.j2
    public final boolean k() {
        return this.a.a.u();
    }

    @Override // defpackage.j2
    public final void n(CharSequence charSequence) {
        bj3 bj3Var = this.a;
        if (bj3Var.g) {
            return;
        }
        Toolbar toolbar = bj3Var.a;
        bj3Var.h = charSequence;
        if ((bj3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (bj3Var.g) {
                mq3.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu p() {
        boolean z = this.e;
        bj3 bj3Var = this.a;
        if (!z) {
            wi3 wi3Var = new wi3(this);
            vi3 vi3Var = new vi3(this);
            Toolbar toolbar = bj3Var.a;
            toolbar.S = wi3Var;
            toolbar.T = vi3Var;
            ActionMenuView actionMenuView = toolbar.f;
            if (actionMenuView != null) {
                actionMenuView.z = wi3Var;
                actionMenuView.A = vi3Var;
            }
            this.e = true;
        }
        return bj3Var.a.getMenu();
    }

    @Override // defpackage.j2
    public final void g() {
    }

    @Override // defpackage.j2
    public final void l(boolean z) {
    }

    @Override // defpackage.j2
    public final void m(boolean z) {
    }
}
