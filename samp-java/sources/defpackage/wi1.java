package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class wi1 implements v33 {
    public static final Method E;
    public static final Method F;
    public Rect B;
    public boolean C;
    public final fh D;
    public final Context f;
    public ListAdapter g;
    public cg0 h;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public ti1 s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public final Handler z;
    public final int i = -2;
    public int j = -2;
    public final int m = 1002;
    public int q = 0;
    public final int r = Integer.MAX_VALUE;
    public final si1 v = new si1(this, 1);
    public final vi1 w = new vi1(this);
    public final ui1 x = new ui1(this);
    public final si1 y = new si1(this, 0);
    public final Rect A = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                E = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                F = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public wi1(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f = context;
        this.z = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pf2.o, i, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        fh fhVar = new fh(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, pf2.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            fhVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        fhVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : rn.C(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.D = fhVar;
        fhVar.setInputMethodMode(1);
    }

    @Override // defpackage.v33
    public final boolean a() {
        return this.D.isShowing();
    }

    public final int b() {
        return this.k;
    }

    @Override // defpackage.v33
    public final void c() {
        int i;
        int paddingBottom;
        cg0 cg0Var;
        cg0 cg0Var2 = this.h;
        Context context = this.f;
        fh fhVar = this.D;
        if (cg0Var2 == null) {
            cg0 cg0VarQ = q(context, !this.C);
            this.h = cg0VarQ;
            cg0VarQ.setAdapter(this.g);
            this.h.setOnItemClickListener(this.u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new pi1(this));
            this.h.setOnScrollListener(this.x);
            fhVar.setContentView(this.h);
        }
        Drawable background = fhVar.getBackground();
        Rect rect = this.A;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.n) {
                this.l = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = qi1.a(fhVar, this.t, this.l, fhVar.getInputMethodMode() == 2);
        int i3 = this.i;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.j;
            int iA2 = this.h.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z = fhVar.getInputMethodMode() == 2;
        fhVar.setWindowLayoutType(this.m);
        if (fhVar.isShowing()) {
            if (this.t.isAttachedToWindow()) {
                int width = this.j;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.t.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.j;
                    if (z) {
                        fhVar.setWidth(i5 == -1 ? -1 : 0);
                        fhVar.setHeight(0);
                    } else {
                        fhVar.setWidth(i5 == -1 ? -1 : 0);
                        fhVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                fhVar.setOutsideTouchable(true);
                int i6 = width;
                View view = this.t;
                int i7 = this.k;
                int i8 = this.l;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                fhVar.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.j;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.t.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        fhVar.setWidth(width2);
        fhVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = E;
            if (method != null) {
                try {
                    method.invoke(fhVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            ri1.b(fhVar, true);
        }
        fhVar.setOutsideTouchable(true);
        fhVar.setTouchInterceptor(this.w);
        if (this.p) {
            fhVar.setOverlapAnchor(this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = F;
            if (method2 != null) {
                try {
                    method2.invoke(fhVar, this.B);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            ri1.a(fhVar, this.B);
        }
        fhVar.showAsDropDown(this.t, this.k, this.l, this.q);
        this.h.setSelection(-1);
        if ((!this.C || this.h.isInTouchMode()) && (cg0Var = this.h) != null) {
            cg0Var.setListSelectionHidden(true);
            cg0Var.requestLayout();
        }
        if (this.C) {
            return;
        }
        this.z.post(this.y);
    }

    public final Drawable d() {
        return this.D.getBackground();
    }

    @Override // defpackage.v33
    public final void dismiss() {
        fh fhVar = this.D;
        fhVar.dismiss();
        fhVar.setContentView(null);
        this.h = null;
        this.z.removeCallbacks(this.v);
    }

    public final void f(Drawable drawable) {
        this.D.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.l = i;
        this.n = true;
    }

    @Override // defpackage.v33
    public final cg0 i() {
        return this.h;
    }

    public final void l(int i) {
        this.k = i;
    }

    public final int n() {
        if (this.n) {
            return this.l;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        ti1 ti1Var = this.s;
        if (ti1Var == null) {
            this.s = new ti1(this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(ti1Var);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        cg0 cg0Var = this.h;
        if (cg0Var != null) {
            cg0Var.setAdapter(this.g);
        }
    }

    public cg0 q(Context context, boolean z) {
        return new cg0(context, z);
    }

    public final void r(int i) {
        Drawable background = this.D.getBackground();
        if (background == null) {
            this.j = i;
            return;
        }
        Rect rect = this.A;
        background.getPadding(rect);
        this.j = rect.left + rect.right + i;
    }
}
