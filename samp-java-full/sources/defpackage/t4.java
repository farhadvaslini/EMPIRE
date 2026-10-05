package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends a00 implements DialogInterface, ag {
    public vg j;
    public final wg k;
    public final r4 l;

    /* JADX WARN: Type inference failed for: r2v2, types: [wg] */
    public t4(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iG = g(contextThemeWrapper, i);
        if (iG == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iG;
        }
        super(contextThemeWrapper, i2);
        this.k = new f71() { // from class: wg
            @Override // defpackage.f71
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f.i(keyEvent);
            }
        };
        jg jgVarD = d();
        if (iG == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iG = typedValue2.resourceId;
        }
        ((vg) jgVarD).Y = iG;
        jgVarD.d();
        this.l = new r4(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.a00, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        vg vgVar = (vg) d();
        vgVar.x();
        ((ViewGroup) vgVar.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        vgVar.r.a(vgVar.q.getCallback());
    }

    public final jg d() {
        if (this.j == null) {
            hg hgVar = jg.f;
            this.j = new vg(getContext(), getWindow(), this, this);
        }
        return this.j;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return lr.x(this.k, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void f(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        vg vgVar = (vg) d();
        vgVar.x();
        return vgVar.q.findViewById(i);
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // defpackage.a00, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        f(bundle);
        r4 r4Var = this.l;
        r4Var.b.setContentView(r4Var.q);
        Context context = r4Var.a;
        Window window = r4Var.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = r4.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = r4.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = r4.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        r4Var.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        r4Var.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        r4Var.m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            r4Var.i.removeView(r4Var.m);
            if (r4Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) r4Var.i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(r4Var.i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(r4Var.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        r4Var.f = button;
        l2 l2Var = r4Var.w;
        button.setOnClickListener(l2Var);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = r4Var.f;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            r4Var.f.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        r4Var.g = button3;
        button3.setOnClickListener(l2Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = r4Var.g;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            r4Var.g.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        r4Var.h = button5;
        button5.setOnClickListener(l2Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = r4Var.h;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            r4Var.h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = r4Var.f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = r4Var.g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = r4Var.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (r4Var.n != null) {
            viewGroupA.addView(r4Var.n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            r4Var.k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(r4Var.d) || !r4Var.u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                r4Var.k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                r4Var.l = textView2;
                textView2.setText(r4Var.d);
                Drawable drawable = r4Var.j;
                if (drawable != null) {
                    r4Var.k.setImageDrawable(drawable);
                } else {
                    r4Var.l.setPadding(r4Var.k.getPaddingLeft(), r4Var.k.getPaddingTop(), r4Var.k.getPaddingRight(), r4Var.k.getPaddingBottom());
                    r4Var.k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupA3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = r4Var.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = r4Var.e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = r4Var.e;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.g);
        }
        if (!z) {
            View view = r4Var.e;
            if (view == null) {
                view = r4Var.i;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = mq3.a;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = r4Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = r4Var.o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = r4Var.p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.a00, android.app.Dialog
    public final void onStop() {
        super.onStop();
        vg vgVar = (vg) d();
        vgVar.B();
        j2 j2Var = vgVar.s;
        if (j2Var != null) {
            j2Var.m(false);
        }
    }

    @Override // defpackage.a00, android.app.Dialog
    public final void setContentView(int i) {
        e();
        d().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().m(getContext().getString(i));
    }

    @Override // defpackage.a00, android.app.Dialog
    public final void setContentView(View view) {
        e();
        d().j(view);
    }

    @Override // defpackage.a00, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        h(charSequence);
        r4 r4Var = this.l;
        r4Var.d = charSequence;
        TextView textView = r4Var.l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
