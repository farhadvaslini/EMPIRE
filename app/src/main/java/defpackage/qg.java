package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qg implements Window.Callback {
    public final Window.Callback f;
    public vi3 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ vg k;

    public qg(vg vgVar, Window.Callback callback) {
        this.k = vgVar;
        if (callback != null) {
            this.f = callback;
        } else {
            c.p("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.h = true;
            callback.onContentChanged();
        } finally {
            this.h = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        cs3.a(this.f, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.i;
        Window.Callback callback = this.f;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.k.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            vg vgVar = this.k;
            vgVar.B();
            j2 j2Var = vgVar.s;
            if (j2Var == null || !j2Var.i(keyCode, keyEvent)) {
                ug ugVar = vgVar.R;
                if (ugVar == null || !vgVar.G(ugVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (vgVar.R == null) {
                        ug ugVarA = vgVar.A(0);
                        vgVar.H(ugVarA, keyEvent);
                        boolean zG = vgVar.G(ugVarA, keyEvent.getKeyCode(), keyEvent);
                        ugVarA.k = false;
                        if (zG) {
                        }
                    }
                    return false;
                }
                ug ugVar2 = vgVar.R;
                if (ugVar2 != null) {
                    ugVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.h) {
            this.f.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof nn1)) {
            return this.f.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        vi3 vi3Var = this.g;
        if (vi3Var != null) {
            View view = i == 0 ? new View(vi3Var.f.a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            vg vgVar = this.k;
            vgVar.B();
            j2 j2Var = vgVar.s;
            if (j2Var != null) {
                j2Var.c(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.j) {
            this.f.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        vg vgVar = this.k;
        if (i == 108) {
            vgVar.B();
            j2 j2Var = vgVar.s;
            if (j2Var != null) {
                j2Var.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            ug ugVarA = vgVar.A(i);
            if (ugVarA.m) {
                vgVar.t(ugVarA, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        ds3.a(this.f, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        nn1 nn1Var = menu instanceof nn1 ? (nn1) menu : null;
        if (i == 0 && nn1Var == null) {
            return false;
        }
        if (nn1Var != null) {
            nn1Var.x = true;
        }
        vi3 vi3Var = this.g;
        if (vi3Var != null && i == 0) {
            xi3 xi3Var = vi3Var.f;
            if (!xi3Var.d) {
                xi3Var.a.l = true;
                xi3Var.d = true;
            }
        }
        boolean zOnPreparePanel = this.f.onPreparePanel(i, view, menu);
        if (nn1Var != null) {
            nn1Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        nn1 nn1Var = this.k.A(0).h;
        if (nn1Var != null) {
            d(list, nn1Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return bs3.a(this.f, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        vg vgVar = this.k;
        if (!vgVar.D || i != 0) {
            return bs3.b(this.f, callback, i);
        }
        pl plVar = new pl(vgVar.p, callback);
        e3 e3VarN = vgVar.n(plVar);
        if (e3VarN != null) {
            return plVar.t(e3VarN);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
