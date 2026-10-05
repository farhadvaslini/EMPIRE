package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h7 extends ViewGroup implements q12, po2, a90, u02, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, ap0 {
    public static Class N0;
    public static Method O0;
    public static Method P0;
    public static final as1 Q0 = new as1();
    public static y6 R0;
    public static Method S0;
    public static Method T0;
    public final yu2 A;
    public final e7 A0;
    public final o7 B;
    public final x6 B0;
    public c8 C;
    public boolean C0;
    public final f9 D;
    public rs0 D0;
    public final jk E;
    public final a21 E0;
    public final as1 F;
    public final s6 F0;
    public as1 G;
    public final s6 G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public final lq1 J;
    public boolean J0;
    public final ot K;
    public final k71 K0;
    public final d42 L;
    public View L0;
    public final cb0 M;
    public final d7 M0;
    public final k6 N;
    public final l6 O;
    public boolean P;
    public final t12 Q;
    public boolean R;
    public zc S;
    public m30 T;
    public boolean U;
    public final zm1 V;
    public long W;
    public final int[] a0;
    public final float[] b0;
    public final Matrix c0;
    public final float[] d0;
    public final float[] e0;
    public final d42 f;
    public long f0;
    public long g;
    public boolean g0;
    public final boolean h;
    public long h0;
    public p11 i;
    public ns0 i0;
    public sf1 j;
    public ig3 j0;
    public tf1 k;
    public gg3 k0;
    public lc0 l;
    public final AtomicReference l0;
    public un2 m;
    public ka0 m0;
    public final mj n;
    public final os1 n0;
    public final x6 o;
    public final d42 o0;
    public final d42 p;
    public e31 p0;
    public final View q;
    public final cq1 q0;
    public final ep0 r;
    public cc r0;
    public o50 s;
    public MotionEvent s0;
    public final s8 t;
    public long t0;
    public final d42 u;
    public final ar2 u0;
    public final cb0 v;
    public final as1 v0;
    public final k31 w;
    public float w0;
    public final tb1 x;
    public float x0;
    public final or1 y;
    public float y0;
    public final lk2 z;
    public float z0;

    public h7(Context context, a20 a20Var) {
        super(context);
        this.f = b32.w(a20Var);
        this.g = 9205357640488583168L;
        int i = 1;
        this.h = true;
        this.m = f5.Y;
        this.n = new mj();
        int i2 = 0;
        this.o = new x6(this, i2);
        this.p = new d42(rn.f(context), m22.k);
        this.r = new ep0(this, this);
        this.s = a20Var.c().j();
        this.t = new s8();
        this.u = b32.w(Boolean.FALSE);
        int i3 = 2;
        this.v = b32.j(new s6(this, i3));
        this.w = new k31();
        tb1 tb1Var = new tb1(3);
        tb1Var.f0(qo2.c);
        tb1Var.c0(getDensity());
        tb1Var.h0(getViewConfiguration());
        tb1Var.g0(new f7(this).d(((ep0) getFocusOwner()).e).d(getDragAndDropManager().c));
        this.x = tb1Var;
        or1 or1Var = h41.a;
        this.y = new or1();
        this.z = new lk2(getLayoutNodes(), this);
        this.A = new yu2(getRoot(), new qi0(), getLayoutNodes());
        o7 o7Var = new o7(this);
        this.B = o7Var;
        this.C = new c8(this, new c7(0, this, w7.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 0));
        this.D = new f9(this);
        this.E = new jk();
        this.F = new as1();
        this.J = new lq1();
        tb1 root = getRoot();
        ot otVar = new ot();
        otVar.b = root;
        otVar.c = new iy0(root.L.c);
        otVar.d = new k71(8);
        otVar.e = new ly0();
        this.K = otVar;
        this.L = b32.w(new Configuration(context.getResources().getConfiguration()));
        this.M = b32.j(new s6(this, 3));
        this.N = new k6(this, getAutofillTree());
        this.O = new l6(new a31(25, context), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.Q = new t12(new r6(this, i));
        this.V = new zm1(getRoot());
        this.W = 9223372034707292159L;
        this.a0 = new int[]{0, 0};
        this.b0 = wm1.a();
        this.c0 = new Matrix();
        this.d0 = wm1.a();
        this.e0 = wm1.a();
        this.f0 = -1L;
        this.h0 = 9187343241974906880L;
        this.l0 = new AtomicReference(null);
        this.n0 = a20Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = yo0.a;
        bb1 bb1Var = bb1.f;
        bb1 bb1Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : bb1.g : bb1Var;
        this.o0 = b32.w(bb1Var2 != null ? bb1Var2 : bb1Var);
        this.q0 = new cq1(this);
        this.u0 = new ar2(6);
        this.v0 = new as1();
        this.w0 = Float.NaN;
        this.x0 = Float.NaN;
        this.y0 = Float.NaN;
        this.z0 = Float.NaN;
        this.A0 = new e7(i2, this);
        this.B0 = new x6(this, i);
        this.D0 = new e90(i, this);
        this.E0 = new a21(context, new r6(this, i3));
        this.F0 = new s6(this, 4);
        this.G0 = new s6(this, i2);
        addOnAttachStateChangeListener(this.C);
        setWillNotDraw(false);
        setFocusable(true);
        v7.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        mq3.i(this, o7Var);
        setOnDragListener(getDragAndDropManager());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            q7.a.a(this);
        }
        if (n()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(2131230822, Boolean.TRUE);
            this.q = view;
            addView(view, -1);
        }
        this.K0 = i4 >= 31 ? new k71(12) : null;
        this.M0 = new d7(this);
    }

    public static boolean d(h7 h7Var, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static final void e(h7 h7Var, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        o7 o7Var = h7Var.B;
        if (s51.n(str, o7Var.I)) {
            int iD2 = o7Var.G.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!s51.n(str, o7Var.J) || (iD = o7Var.H.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static void g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof h7) {
                ((h7) childAt).w();
            } else if (childAt instanceof ViewGroup) {
                g((ViewGroup) childAt);
            }
        }
    }

    private final sr getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    private final ig3 getLegacyTextInputServiceAndroid() {
        ig3 ig3Var = this.j0;
        if (ig3Var != null) {
            return ig3Var;
        }
        ig3 ig3Var2 = new ig3(getView(), this, new u6(this));
        this.j0 = ig3Var2;
        return ig3Var2;
    }

    private final a20 get_composeViewContext() {
        return (a20) this.f.getValue();
    }

    public static long h(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static void l(tb1 tb1Var) {
        tb1Var.D();
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            l((tb1) objArr[i2]);
        }
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean o(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !mq1.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.u.setValue(Boolean.valueOf(z));
    }

    private void setDensity(ua0 ua0Var) {
        this.p.setValue(ua0Var);
    }

    private void setLayoutDirection(bb1 bb1Var) {
        this.o0.setValue(bb1Var);
    }

    private final void set_composeViewContext(a20 a20Var) {
        this.f.setValue(a20Var);
    }

    public final void A() {
        o7 o7Var = this.B;
        o7Var.C = true;
        Handler handler = o7Var.i.getHandler();
        if (o7Var.q() && !o7Var.N && handler != null) {
            o7Var.N = true;
            handler.post(o7Var.P);
        }
        c8 c8Var = this.C;
        c8Var.l = true;
        Handler handler2 = c8Var.f.getHandler();
        if (!c8Var.g() || c8Var.r || handler2 == null) {
            return;
        }
        c8Var.r = true;
        handler2.post(c8Var.s);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(android.view.ViewStructure r14) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.B(android.view.ViewStructure):void");
    }

    public final void C() {
        if (this.g0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f0) {
            this.f0 = jCurrentAnimationTimeMillis;
            E();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.a0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.h0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.f0 = AnimationUtils.currentAnimationTimeMillis();
        E();
        float x = motionEvent.getX();
        long jB = wm1.b((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.d0);
        this.h0 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
    }

    public final void E() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.d0;
        int[] iArr = this.a0;
        if (i >= 29) {
            vq.a.a(this, fArr, this.c0, iArr);
        } else {
            wm1.d(fArr);
            uq.N(this, fArr, this.b0, iArr);
        }
        gq.I(fArr, this.e0);
    }

    public final boolean F() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void G(cs0 cs0Var) {
        mj mjVar = this.n;
        boolean zIsEmpty = mjVar.isEmpty();
        mjVar.addLast(cs0Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.o);
            } else {
                c.p("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void H(tb1 tb1Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (tb1Var != null) {
            while (tb1Var != null && tb1Var.r() == rb1.f) {
                if (!this.U) {
                    tb1 tb1VarU = tb1Var.u();
                    if (tb1VarU == null) {
                        break;
                    }
                    long j = tb1VarU.L.c.i;
                    if (m30.g(j) && m30.f(j)) {
                        break;
                    }
                }
                tb1Var = tb1Var.u();
            }
            if (tb1Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long I(long j) {
        C();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.h0 >> 32));
        return wm1.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.h0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.e0);
    }

    public final int J(MotionEvent motionEvent) {
        Object obj;
        if (this.H0) {
            this.H0 = false;
            re1 re1Var = getComposeViewContext().t;
            int metaState = motionEvent.getMetaState();
            re1Var.getClass();
            is3.a.setValue(new nb2(metaState));
        }
        lq1 lq1Var = this.J;
        a31 a31VarC = lq1Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        ot otVar = this.K;
        if (a31VarC == null) {
            if (!otVar.a) {
                ((xk1) ((k71) otVar.d).g).a();
                ((iy0) otVar.c).c();
            }
            return 0;
        }
        List list = (List) a31VarC.g;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((ib2) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        ib2 ib2Var = (ib2) obj;
        if (ib2Var != null) {
            this.g = ib2Var.d;
        }
        int iC = otVar.c(a31VarC, this, p(motionEvent));
        a31VarC.h = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iC & 1) != 0) {
            return iC;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        lq1Var.c.delete(pointerId);
        lq1Var.b.delete(pointerId);
        return iC;
    }

    public final void K(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jS = s((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jS >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jS & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        a31 a31VarC = this.J.c(motionEventObtain, this);
        a31VarC.getClass();
        this.K.c(a31VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(defpackage.rs0 r8, defpackage.q40 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.g7
            if (r0 == 0) goto L13
            r0 = r9
            g7 r0 = (defpackage.g7) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            g7 r0 = new g7
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            return
        L27:
            defpackage.y02.Q(r9)
            goto L4b
        L2b:
            defpackage.y02.Q(r9)
            r9 = r2
            r6 r2 = new r6
            r1 = 0
            r2.<init>(r7, r1)
            r0.k = r9
            n9 r1 = new n9
            r5 = 0
            r6 = 15
            java.util.concurrent.atomic.AtomicReference r3 = r7.l0
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.ur.w(r1, r0)
            y50 r8 = defpackage.y50.f
            if (r7 != r8) goto L4b
            return
        L4b:
            defpackage.c.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.L(rs0, q40):void");
    }

    public final void M(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (s51.n(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(rn.f(getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.N():void");
    }

    public final void O(float f) {
        if (n()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.w0) || f > this.w0) {
                    this.w0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.x0) || f < this.x0) {
                    this.x0 = f;
                }
            }
        }
    }

    @Override // defpackage.ap0
    public final void a(rp0 rp0Var, rp0 rp0Var2) {
        ax1 ax1Var;
        boolean z;
        ax1 ax1Var2;
        boolean z2;
        if (rp0Var != null) {
            rp0 rp0Var3 = rp0Var;
            if (!rp0Var3.f.s) {
                m21.c("visitAncestors called on an unattached node");
            }
            aq1 aq1Var = rp0Var3.f;
            tb1 tb1VarX = vr.X(rp0Var);
            js1 js1Var = null;
            ArrayList arrayList = null;
            while (tb1VarX != null) {
                if ((tb1VarX.L.f.i & 2097152) != 0) {
                    while (aq1Var != null) {
                        if ((aq1Var.h & 2097152) != 0) {
                            aq1 aq1VarJ = aq1Var;
                            qs1 qs1Var = null;
                            while (aq1VarJ != null) {
                                if (aq1VarJ instanceof y11) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(aq1VarJ);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (aq1VarJ.h & 2097152) != 0 && (aq1VarJ instanceof ja0)) {
                                    int i = 0;
                                    for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                        if ((aq1Var2.h & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                aq1VarJ = aq1Var2;
                                            } else {
                                                if (qs1Var == null) {
                                                    qs1Var = new qs1(new aq1[16]);
                                                }
                                                if (aq1VarJ != null) {
                                                    qs1Var.b(aq1VarJ);
                                                    aq1VarJ = null;
                                                }
                                                qs1Var.b(aq1Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                aq1VarJ = vr.j(qs1Var);
                            }
                        }
                        aq1Var = aq1Var.j;
                    }
                }
                tb1VarX = tb1VarX.u();
                aq1Var = (tb1VarX == null || (ax1Var2 = tb1VarX.L) == null) ? null : ax1Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (rp0Var2 != null) {
                if (!rp0Var2.f.s) {
                    m21.c("visitAncestors called on an unattached node");
                }
                aq1 aq1Var3 = rp0Var2.f;
                tb1 tb1VarX2 = vr.X(rp0Var2);
                js1 js1Var2 = null;
                while (tb1VarX2 != null) {
                    if ((tb1VarX2.L.f.i & 2097152) != 0) {
                        while (aq1Var3 != null) {
                            if ((aq1Var3.h & 2097152) != 0) {
                                aq1 aq1VarJ2 = aq1Var3;
                                qs1 qs1Var2 = null;
                                while (aq1VarJ2 != null) {
                                    if (aq1VarJ2 instanceof y11) {
                                        if (js1Var2 == null) {
                                            js1 js1Var3 = or2.a;
                                            js1Var2 = new js1();
                                        }
                                        js1Var2.a(aq1VarJ2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (aq1VarJ2.h & 2097152) != 0 && (aq1VarJ2 instanceof ja0)) {
                                        int i2 = 0;
                                        for (aq1 aq1Var4 = ((ja0) aq1VarJ2).u; aq1Var4 != null; aq1Var4 = aq1Var4.k) {
                                            if ((aq1Var4.h & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    aq1VarJ2 = aq1Var4;
                                                } else {
                                                    if (qs1Var2 == null) {
                                                        qs1Var2 = new qs1(new aq1[16]);
                                                    }
                                                    if (aq1VarJ2 != null) {
                                                        qs1Var2.b(aq1VarJ2);
                                                        aq1VarJ2 = null;
                                                    }
                                                    qs1Var2.b(aq1Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    aq1VarJ2 = vr.j(qs1Var2);
                                }
                            }
                            aq1Var3 = aq1Var3.j;
                        }
                    }
                    tb1VarX2 = tb1VarX2.u();
                    aq1Var3 = (tb1VarX2 == null || (ax1Var = tb1VarX2.L) == null) ? null : ax1Var.e;
                }
                js1Var = js1Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                y11 y11Var = (y11) arrayList.get(i3);
                if (!(js1Var != null ? js1Var.c(y11Var) : false)) {
                    y11Var.V();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        rp0 rp0Var = ((ep0) getFocusOwner()).c;
        if (!rp0Var.s) {
            return;
        }
        if (!rp0Var.f.s) {
            m21.c("visitSubtreeIf called on an unattached node");
        }
        qs1 qs1Var = new qs1(new aq1[16]);
        aq1 aq1Var = rp0Var.f;
        aq1 aq1Var2 = aq1Var.k;
        if (aq1Var2 == null) {
            vr.h(qs1Var, aq1Var);
        } else {
            qs1Var.b(aq1Var2);
        }
        while (true) {
            int i3 = qs1Var.h;
            if (i3 == 0) {
                return;
            }
            aq1 aq1Var3 = (aq1) qs1Var.k(i3 - 1);
            if ((aq1Var3.i & 1024) != 0) {
                for (aq1 aq1Var4 = aq1Var3; aq1Var4 != null && aq1Var4.s; aq1Var4 = aq1Var4.k) {
                    if ((aq1Var4.h & 1024) != 0) {
                        aq1 aq1VarJ = aq1Var4;
                        qs1 qs1Var2 = null;
                        while (aq1VarJ != null) {
                            int i4 = 0;
                            if (aq1VarJ instanceof rp0) {
                                rp0 rp0Var2 = (rp0) aq1VarJ;
                                if (rp0Var2.s && rp0Var2.r1().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    rp0 rp0Var3 = ((ep0) getFocusOwner()).c;
                                    if (rp0Var3.s) {
                                        if (!rp0Var3.f.s) {
                                            m21.c("visitSubtreeIf called on an unattached node");
                                        }
                                        qs1 qs1Var3 = new qs1(new aq1[16]);
                                        aq1 aq1Var5 = rp0Var3.f;
                                        aq1 aq1Var6 = aq1Var5.k;
                                        if (aq1Var6 == null) {
                                            vr.h(qs1Var3, aq1Var5);
                                        } else {
                                            qs1Var3.b(aq1Var6);
                                        }
                                        while (true) {
                                            int i5 = qs1Var3.h;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            aq1 aq1Var7 = (aq1) qs1Var3.k(i5 - 1);
                                            if ((aq1Var7.i & 1024) != 0) {
                                                for (aq1 aq1Var8 = aq1Var7; aq1Var8 != null && aq1Var8.s; aq1Var8 = aq1Var8.k) {
                                                    if ((aq1Var8.h & 1024) != 0) {
                                                        aq1 aq1VarJ2 = aq1Var8;
                                                        qs1 qs1Var4 = null;
                                                        while (aq1VarJ2 != null) {
                                                            if (aq1VarJ2 instanceof rp0) {
                                                                rp0 rp0Var4 = (rp0) aq1VarJ2;
                                                                if (rp0Var4.s) {
                                                                    gp0 gp0VarR1 = rp0Var4.r1();
                                                                    if (rp0Var4.s && !rp0Var4.t && gp0VarR1.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((aq1VarJ2.h & 1024) != 0 && (aq1VarJ2 instanceof ja0)) {
                                                                int i6 = 0;
                                                                for (aq1 aq1Var9 = ((ja0) aq1VarJ2).u; aq1Var9 != null; aq1Var9 = aq1Var9.k) {
                                                                    if ((aq1Var9.h & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            aq1VarJ2 = aq1Var9;
                                                                        } else {
                                                                            if (qs1Var4 == null) {
                                                                                qs1Var4 = new qs1(new aq1[16]);
                                                                            }
                                                                            if (aq1VarJ2 != null) {
                                                                                qs1Var4.b(aq1VarJ2);
                                                                                aq1VarJ2 = null;
                                                                            }
                                                                            qs1Var4.b(aq1Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            aq1VarJ2 = vr.j(qs1Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            vr.h(qs1Var3, aq1Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                for (aq1 aq1Var10 = ((ja0) aq1VarJ).u; aq1Var10 != null; aq1Var10 = aq1Var10.k) {
                                    if ((aq1Var10.h & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            aq1VarJ = aq1Var10;
                                        } else {
                                            if (qs1Var2 == null) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (aq1VarJ != null) {
                                                qs1Var2.b(aq1VarJ);
                                                aq1VarJ = null;
                                            }
                                            qs1Var2.b(aq1Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            aq1VarJ = vr.j(qs1Var2);
                        }
                    }
                }
            }
            vr.h(qs1Var, aq1Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        qu2 qu2VarW;
        ns0 ns0Var;
        ns0 ns0Var2;
        l6 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                tb1 tb1Var = (tb1) autofillManager.g.c.b(iKeyAt);
                if (tb1Var != null && (qu2VarW = tb1Var.w()) != null) {
                    is1 is1Var = qu2VarW.f;
                    Object objG = is1Var.g(pu2.g);
                    if (objG == null) {
                        objG = null;
                    }
                    y0 y0Var = (y0) objG;
                    if (y0Var != null && (ns0Var2 = (ns0) y0Var.b) != null) {
                    }
                    Object objG2 = is1Var.g(pu2.h);
                    y0 y0Var2 = (y0) (objG2 != null ? objG2 : null);
                    if (y0Var2 != null && (ns0Var = (ns0) y0Var2.b) != null) {
                    }
                }
            }
        }
        k6 autofill = getAutofill();
        if (autofill != null) {
            jk jkVar = autofill.b;
            if (jkVar.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (jkVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        qn1.b();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new rx1("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new rx1("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new rx1("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // defpackage.a90
    public final void b(of1 of1Var) {
        tf1 tf1Var = this.k;
        if (tf1Var != null) {
            wl1 wl1Var = (wl1) tf1Var.a.g;
            if (wl1Var.f && !wl1Var.h) {
                mr mrVar = tf1Var.d;
                if (mrVar != null) {
                    mrVar.cancel();
                }
                tf1Var.d = null;
                return;
            }
            if (wl1Var.g) {
                return;
            }
            if (!wl1Var.h) {
                zb2.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!wl1Var.i.i()) {
                zb2.a("Attempted to start retaining exited values with pending exited values");
            }
            wl1Var.h = false;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.B.h(false, i, this.g);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.B.h(true, i, this.g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        as1 as1Var = this.F;
        if (!isAttachedToWindow()) {
            l(getRoot());
        }
        t(true);
        a73.j().m();
        this.H = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            sr canvasHolder = getCanvasHolder();
            n6 n6Var = canvasHolder.a;
            Canvas canvas2 = n6Var.a;
            n6Var.a = canvas;
            getRoot().i(n6Var, null);
            canvasHolder.a.a = canvas2;
            if (as1Var.j()) {
                int i = as1Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((tw0) ((p12) as1Var.g(i2))).g();
                }
            }
            int i3 = sq3.f;
            as1Var.e();
            this.H = false;
            Trace.endSection();
            as1 as1Var2 = this.G;
            if (as1Var2 != null) {
                as1Var.c(as1Var2);
                as1Var2.e();
            }
            if (n()) {
                if (Float.compare(this.w0, this.y0) != 0) {
                    float f = this.w0;
                    this.y0 = f;
                    of.a(this, f);
                }
                View view = this.q;
                if (view != null) {
                    if (Float.compare(this.x0, this.z0) != 0) {
                        float f2 = this.x0;
                        this.z0 = f2;
                        of.a(view, f2);
                    }
                    if (!Float.isNaN(this.x0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.w0 = Float.NaN;
                this.x0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04d3 A[PHI: r5
      0x04d3: PHI (r5v65 ??) = (r5v86 ??), (r5v87 ??), (r5v88 ??) binds: [B:302:0x0495, B:304:0x0499, B:319:0x04cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x06a6 A[PHI: r4
      0x06a6: PHI (r4v28 ??) = (r4v66 ??), (r4v67 ??), (r4v68 ??) binds: [B:439:0x066c, B:441:0x0670, B:456:0x06a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [aq1] */
    /* JADX WARN: Type inference failed for: r3v41, types: [aq1] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [qs1] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [qs1] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v50, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r6v47 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        if (q(r24) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 1;
        if (!isFocused()) {
            return ((ep0) getFocusOwner()).d(keyEvent, new u1(i, this, keyEvent));
        }
        re1 re1Var = getComposeViewContext().t;
        int metaState = keyEvent.getMetaState();
        re1Var.getClass();
        is3.a.setValue(new nb2(metaState));
        return ((ep0) getFocusOwner()).d(keyEvent, new q20(23)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        ax1 ax1Var;
        if (isFocused()) {
            ep0 ep0Var = (ep0) getFocusOwner();
            if (ep0Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                rp0 rp0VarS = br.s(ep0Var.c);
                if (rp0VarS != null) {
                    if (!rp0VarS.f.s) {
                        m21.c("visitAncestors called on an unattached node");
                    }
                    aq1 aq1Var = rp0VarS.f;
                    tb1 tb1VarX = vr.X(rp0VarS);
                    while (tb1VarX != null) {
                        if ((tb1VarX.L.f.i & 131072) != 0) {
                            while (aq1Var != null) {
                                if ((aq1Var.h & 131072) != 0) {
                                    aq1 aq1VarJ = aq1Var;
                                    qs1 qs1Var = null;
                                    while (aq1VarJ != null) {
                                        if ((aq1VarJ.h & 131072) != 0 && (aq1VarJ instanceof ja0)) {
                                            int i = 0;
                                            for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                                if ((aq1Var2.h & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        aq1VarJ = aq1Var2;
                                                    } else {
                                                        if (qs1Var == null) {
                                                            qs1Var = new qs1(new aq1[16]);
                                                        }
                                                        if (aq1VarJ != null) {
                                                            qs1Var.b(aq1VarJ);
                                                            aq1VarJ = null;
                                                        }
                                                        qs1Var.b(aq1Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        aq1VarJ = vr.j(qs1Var);
                                    }
                                }
                                aq1Var = aq1Var.j;
                            }
                        }
                        tb1VarX = tb1VarX.u();
                        aq1Var = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.J0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.J0 = false;
            B(viewStructure);
        } catch (Throwable th) {
            this.J0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            p7.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object ckVar;
        rp0 rp0VarF;
        if (this.C0) {
            x6 x6Var = this.B0;
            removeCallbacks(x6Var);
            MotionEvent motionEvent2 = this.s0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.C0 = false;
            } else {
                x6Var.run();
            }
        }
        if (!o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || q(motionEvent))) {
            int iK = k(motionEvent);
            int i = 1;
            if ((iK & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (ckVar = view.getTag(2131230788)) == null) {
                    ckVar = new ck(i);
                }
                if (ckVar.equals(new ck(i)) && (rp0VarF = ((ep0) getFocusOwner()).f()) != null) {
                    ex1 ex1VarW = vr.W(rp0VarF);
                    if (!vr.y(ex1VarW).c0(ex1VarW, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((ep0) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iK & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a90
    public final void f(of1 of1Var) {
        mr mrVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(vm1.y());
        }
        tf1 tf1Var = this.k;
        if (tf1Var != null) {
            sf1 sf1Var = this.j;
            sf1Var.getClass();
            k71 k71Var = tf1Var.a;
            wl1 wl1Var = (wl1) k71Var.g;
            if (!wl1Var.f || wl1Var.h) {
                return;
            }
            try {
                mrVarS = ((vu3) sf1Var).a.s(new ja(25, tf1Var));
            } catch (CancellationException unused) {
                wl1 wl1Var2 = (wl1) k71Var.g;
                if (!wl1Var2.g) {
                    if (wl1Var2.h) {
                        zb2.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    wl1Var2.a();
                    wl1Var2.h = true;
                }
                mrVarS = null;
            }
            mr mrVar = tf1Var.d;
            if (mrVar != null) {
                mrVar.cancel();
            }
            tf1Var.d = mrVarS;
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return vm1.v(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        jk2 jk2VarA;
        if (view == null || this.V.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !w7.y(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            rp0 rp0VarS = br.s(((ep0) getFocusOwner()).c);
            jk2VarA = rp0VarS != null ? br.v(rp0VarS) : null;
            if (jk2VarA == null) {
                jk2VarA = yo0.a(view, this);
            }
        } else {
            jk2VarA = yo0.a(view, this);
        }
        ro0 ro0VarD = yo0.d(i);
        int i2 = ro0VarD != null ? ro0VarD.a : 6;
        qk2 qk2Var = new qk2();
        if (((ep0) getFocusOwner()).e(i2, jk2VarA, new t6(0, qk2Var)) == null) {
            return view;
        }
        Object obj = qk2Var.f;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || g12.S(br.v((rp0) obj), yo0.a(viewFindNextFocus, this), jk2VarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public h1 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final zc getAndroidViewsHandler$ui() {
        if (this.S == null) {
            zc zcVar = new zc(getContext());
            this.S = zcVar;
            addView(zcVar, -1);
            requestLayout();
        }
        zc zcVar2 = this.S;
        zcVar2.getClass();
        return zcVar2;
    }

    public jk getAutofillTree() {
        return this.E;
    }

    public ax getClipboard() {
        return getComposeViewContext().n;
    }

    public bx getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final a20 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.I0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.L.getValue();
    }

    public final c8 getContentCaptureManager$ui() {
        return this.C;
    }

    public o50 getCoroutineContext() {
        return this.s;
    }

    public ua0 getDensity() {
        return (ua0) this.p.getValue();
    }

    public jk2 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            rp0 rp0VarS = br.s(((ep0) getFocusOwner()).c);
            if (rp0VarS != null) {
                return br.v(rp0VarS);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return yo0.a(viewFindFocus, this);
        }
        return null;
    }

    public bp0 getFocusOwner() {
        return this.r;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        jk2 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (s51.n(((ep0) getFocusOwner()).e(6, null, new u0(3)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public zp0 getFontFamilyResolver() {
        return (zp0) this.n0.getValue();
    }

    public yp0 getFontLoader() {
        return getComposeViewContext().o;
    }

    public final sf1 getFrameEndScheduler$ui() {
        return this.j;
    }

    public ow0 getGraphicsContext() {
        return this.D;
    }

    public px0 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.V.b.D() || !this.n.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public e31 getInputModeManager() {
        e31 e31Var = this.p0;
        if (e31Var == null) {
            e31Var = new e31(isInTouchMode() ? 1 : 2);
            this.p0 = e31Var;
        }
        return e31Var;
    }

    public final k31 getInsetsListener() {
        return this.w;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f0;
    }

    @Override // android.view.View, android.view.ViewParent
    public bb1 getLayoutDirection() {
        return (bb1) this.o0.getValue();
    }

    public qj1 getLocaleList() {
        return (qj1) this.M.getValue();
    }

    public long getMeasureIteration() {
        zm1 zm1Var = this.V;
        if (!zm1Var.c) {
            m21.a("measureIteration should be only used during the measure/layout pass");
        }
        return zm1Var.g;
    }

    public cq1 getModifierLocalManager() {
        return this.q0;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public h7 m8getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public h62 getPlacementScope() {
        s12 s12Var = j62.a;
        return new bl1(1, this);
    }

    public final rs0 getPlayNavigationSoundEffect$ui() {
        return this.D0;
    }

    public fb2 getPointerIconService() {
        return this.M0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final p11 m1getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.i;
    }

    public lk2 getRectManager() {
        return this.z;
    }

    public un2 getRetainedValuesStore() {
        return this.m;
    }

    public tb1 getRoot() {
        return this.x;
    }

    public final lc0 getSavedStateRegistry() {
        lc0 lc0Var = this.l;
        if (lc0Var != null) {
            return lc0Var;
        }
        a20 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        wq2 wq2Var = composeViewContext.e;
        wq2Var.getClass();
        Object parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(2131230800);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strG = by1.g("SaveableStateRegistry:", strValueOf);
        tq2 savedStateRegistry = wq2Var.getSavedStateRegistry();
        Bundle bundleA = savedStateRegistry.a(strG);
        if (bundleA != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleA.keySet()) {
                ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                parcelableArrayList.getClass();
                linkedHashMap.put(str, parcelableArrayList);
            }
        }
        n20 n20Var = new n20(5);
        r93 r93Var = iq2.a;
        hq2 hq2Var = new hq2(linkedHashMap, n20Var);
        boolean z = false;
        if (savedStateRegistry.b(strG) == null) {
            try {
                savedStateRegistry.c(strG, new hr0(2, hq2Var));
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        lc0 lc0Var2 = new lc0(hq2Var, new mc0(z, savedStateRegistry, strG));
        this.l = lc0Var2;
        return lc0Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        k71 k71Var;
        if (Build.VERSION.SDK_INT >= 31 && (k71Var = this.K0) != null && ((Boolean) ((d42) k71Var.g).getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof h7) {
                return ((h7) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public yu2 getSemanticsOwner() {
        return this.A;
    }

    public vb1 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? jf.a.a(this) : this.R;
    }

    public t12 getSnapshotObserver() {
        return this.Q;
    }

    public t73 getSoftwareKeyboardController() {
        ka0 ka0Var = this.m0;
        if (ka0Var != null) {
            return ka0Var;
        }
        ka0 ka0Var2 = new ka0(getTextInputService());
        this.m0 = ka0Var2;
        return ka0Var2;
    }

    public gg3 getTextInputService() {
        gg3 gg3Var = this.k0;
        if (gg3Var != null) {
            return gg3Var;
        }
        gg3 gg3Var2 = new gg3(getLegacyTextInputServiceAndroid());
        this.k0 = gg3Var2;
        return gg3Var2;
    }

    public hh3 getTextToolbar() {
        cc ccVar = this.r0;
        if (ccVar != null) {
            return ccVar;
        }
        cc ccVar2 = new cc();
        new ak2(new ja(3, ccVar2));
        this.r0 = ccVar2;
        return ccVar2;
    }

    public final oo2 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public oq3 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    public hs3 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public final void j(tb1 tb1Var, boolean z) {
        this.V.g(tb1Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(android.view.MotionEvent r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7.k(android.view.MotionEvent):int");
    }

    public final void m(tb1 tb1Var) {
        this.V.r(tb1Var, false);
        qs1 qs1VarZ = tb1Var.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            m((tb1) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        un2 un2Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().H()) {
            getRoot().b(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(vm1.y());
        }
        this.w.onViewAttachedToWindow(this);
        if (!this.I0) {
            getComposeViewContext().e();
        }
        int i = 0;
        this.I0 = false;
        m(getRoot());
        l(getRoot());
        getSnapshotObserver().a.e();
        h7 h7VarM8getOutOfFrameExecutor = m8getOutOfFrameExecutor();
        if (h7VarM8getOutOfFrameExecutor == null) {
            c.q("Expected the view to be attached to window.");
            return;
        }
        h7VarM8getOutOfFrameExecutor.G(new s6(this, i));
        getComposeViewContext().d();
        a20 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        cr3 cr3Var = composeViewContext.f;
        sf1 sf1Var = this.j;
        if (cr3Var == null || sf1Var == null) {
            un2Var = null;
        } else {
            br3 viewModelStore = cr3Var.getViewModelStore();
            ar3 ar3Var = new ar3();
            d60 d60Var = d60.b;
            d60Var.getClass();
            pl plVar = new pl(viewModelStore, ar3Var, d60Var);
            lu luVarA = rk2.a(uf1.class);
            String strB = luVarA.b();
            if (strB == null) {
                c.p("Local and anonymous classes can not be ViewModels");
                return;
            }
            uf1 uf1Var = (uf1) plVar.y(luVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            or1 or1Var = uf1Var.b;
            Object objB = or1Var.b(id);
            if (objB == null) {
                objB = new as1(1);
                or1Var.i(id, objB);
            }
            as1 as1Var = (as1) objB;
            Object[] objArr = as1Var.a;
            int i2 = as1Var.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((tf1) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            tf1 tf1Var = (tf1) obj;
            if (tf1Var == null) {
                tf1Var = new tf1();
                as1Var.b(tf1Var);
            }
            tf1Var.c = true;
            this.k = tf1Var;
            un2Var = tf1Var.b;
        }
        if (un2Var == null) {
            un2Var = f5.Y;
        }
        this.m = un2Var;
        ns0 ns0Var = this.i0;
        if (ns0Var != null) {
            ns0Var.h(getComposeViewContext());
            this.i0 = null;
        }
        gf1 lifecycle = getComposeViewContext().d().getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.C);
        getInputModeManager().a.setValue(new c31(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            t7.a.b(this);
        }
        l6 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((ep0) getFocusOwner()).g.b(autofillManager);
            getSemanticsOwner().d.b(autofillManager);
        }
        ((ep0) getFocusOwner()).g.b(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        kz2 kz2Var = (kz2) this.l0.get();
        ma maVar = (ma) (kz2Var != null ? kz2Var.b : null);
        if (maVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        kz2 kz2Var2 = (kz2) maVar.i.get();
        b31 b31Var = (b31) (kz2Var2 != null ? kz2Var2.b : null);
        return b31Var != null && (b31Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        kz2 kz2Var = (kz2) this.l0.get();
        ma maVar = (ma) (kz2Var != null ? kz2Var.b : null);
        if (maVar != null) {
            kz2 kz2Var2 = (kz2) maVar.i.get();
            b31 b31Var = (b31) (kz2Var2 != null ? kz2Var2.b : null);
            if (b31Var == null) {
                return null;
            }
            synchronized (b31Var.c) {
                if (b31Var.e) {
                    return null;
                }
                hk2 hk2VarA = b31Var.a.a(editorInfo);
                s sVar = new s(29, b31Var);
                InputConnection wx1Var = Build.VERSION.SDK_INT >= 34 ? new wx1(hk2VarA, sVar) : new vx1(hk2VarA, sVar);
                b31Var.d.b(new ur3(wx1Var));
                return wx1Var;
            }
        }
        ig3 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        b11 b11Var = legacyTextInputServiceAndroid.h;
        bg3 bg3Var = legacyTextInputServiceAndroid.g;
        int i2 = b11Var.e;
        boolean z = b11Var.a;
        if (i2 == 1) {
            i = z ? 6 : 0;
        } else if (i2 == 0) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 == 6) {
            i = 5;
        } else if (i2 == 5) {
            i = 7;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 == 4) {
            i = 4;
        } else {
            if (i2 != 7) {
                c.q("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i3 = b11Var.d;
        int i4 = 23;
        if (i3 == 1) {
            editorInfo.inputType = 1;
        } else if (i3 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i;
        } else if (i3 == 3) {
            editorInfo.inputType = 2;
        } else if (i3 == 4) {
            editorInfo.inputType = 3;
        } else if (i3 == 5) {
            editorInfo.inputType = 17;
        } else if (i3 == 6) {
            editorInfo.inputType = 33;
        } else if (i3 == 7) {
            editorInfo.inputType = 129;
        } else if (i3 == 8) {
            editorInfo.inputType = 18;
        } else if (i3 == 9) {
            editorInfo.inputType = 8194;
        } else if (i3 == 10) {
            editorInfo.inputType = 145;
        } else if (i3 == 11) {
            editorInfo.inputType = 113;
        } else if (i3 == 12) {
            editorInfo.inputType = 97;
        } else if (i3 == 13) {
            editorInfo.inputType = 49;
        } else if (i3 == 14) {
            editorInfo.inputType = 65;
        } else if (i3 == 15) {
            editorInfo.inputType = 81;
        } else if (i3 == 16) {
            editorInfo.inputType = 177;
        } else if (i3 == 17) {
            editorInfo.inputType = 193;
        } else if (i3 == 18) {
            editorInfo.inputType = 4;
        } else if (i3 == 19) {
            editorInfo.inputType = 20;
        } else if (i3 == 20) {
            editorInfo.inputType = 36;
        } else if (i3 == 21) {
            editorInfo.inputType = 4098;
        } else if (i3 == 22) {
            editorInfo.inputType = 12290;
        } else if (i3 == 23) {
            editorInfo.inputType = 8210;
        } else if (i3 == 24) {
            editorInfo.inputType = 4114;
        } else {
            if (i3 != 25) {
                c.q("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 12306;
        }
        if (!z) {
            int i5 = editorInfo.inputType;
            if ((i5 & 15) == 1) {
                editorInfo.inputType = i5 | 131072;
                if (i2 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 15) == 1) {
            int i7 = b11Var.b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | 4096;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | 8192;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (b11Var.c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = bg3Var.b;
        int i8 = yg3.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        ur.P(editorInfo, bg3Var.a.g);
        editorInfo.imeOptions |= 33554432;
        if (nh0.d()) {
            nh0.a().i(editorInfo);
        }
        gk2 gk2Var = new gk2(legacyTextInputServiceAndroid.g, new k71(i4, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(gk2Var));
        return gk2Var;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        vu2 vu2Var;
        c8 c8Var = this.C;
        c8Var.getClass();
        for (long j : jArr) {
            xu2 xu2Var = (xu2) c8Var.e().b((int) j);
            if (xu2Var != null && (vu2Var = xu2Var.a) != null) {
                s7.s();
                ViewTranslationRequest.Builder builderN = s7.n(c8Var.f.getAutofillId(), vu2Var.f);
                Object objG = vu2Var.d.f.g(zu2.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builderN.setValue("android:text", TranslationRequestValue.forText(new af(yi1.a(list, "\n", null, 62))));
                    consumer.accept(builderN.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.w.onViewDetachedFromWindow(this);
        View view = this.q;
        if (n() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            as1 as1Var = Q0;
            synchronized (as1Var) {
                as1Var.k(this);
            }
        }
        getComposeViewContext().b();
        p73 p73Var = getSnapshotObserver().a;
        b4 b4Var = p73Var.h;
        if (b4Var != null) {
            b4Var.b();
        }
        p73Var.a();
        gf1 lifecycle = getComposeViewContext().d().getLifecycle();
        lifecycle.b(this.C);
        lifecycle.b(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        tf1 tf1Var = this.k;
        if (tf1Var != null) {
            tf1Var.c = false;
        }
        this.k = null;
        if (i >= 31) {
            t7.a.a(this);
        }
        l6 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.k(autofillManager);
            ((ep0) getFocusOwner()).g.k(autofillManager);
        }
        lk2 rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        lk2 rectManager2 = getRectManager();
        v6 v6Var = rectManager2.i;
        if (v6Var != null) {
            rectManager2.b.removeCallbacks(v6Var);
            rectManager2.i = null;
        }
        ((ep0) getFocusOwner()).g.k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        ep0 ep0Var = (ep0) getFocusOwner();
        uq.F(ep0Var.c, true);
        if (ep0Var.f() != null) {
            rp0 rp0VarF = ep0Var.f();
            ep0Var.i(null);
            if (rp0VarF != null) {
                rp0VarF.q1(mp0.f, mp0.h);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f0 = 0L;
        N();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        M(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f0 = 0L;
            this.V.l(this.F0);
            this.T = null;
            N();
            if (this.S != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        zm1 zm1Var = this.V;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().H()) {
                getRoot().b(this);
            }
            if (!isAttachedToWindow()) {
                m(getRoot());
            }
            long jH = h(i);
            long jH2 = h(i2);
            long jX = lq.x((int) (jH >>> 32), (int) (jH & 4294967295L), (int) (jH2 >>> 32), (int) (4294967295L & jH2));
            m30 m30Var = this.T;
            if (m30Var == null) {
                this.T = new m30(jX);
                this.U = false;
            } else if (!m30.c(m30Var.a, jX)) {
                this.U = true;
            }
            zm1Var.s(jX);
            zm1Var.n();
            setMeasuredDimension(getRoot().M.p.f, getRoot().M.p.g);
            if (this.S != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().M.p.f, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().M.p.g, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.J0) {
            return;
        }
        B(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        eb2 eb2Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (eb2Var = ((d7) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return eb2Var instanceof na ? PointerIcon.getSystemIcon(context, ((na) eb2Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.h) {
            int[] iArr = yo0.a;
            bb1 bb1Var = bb1.f;
            bb1 bb1Var2 = i != 0 ? i != 1 ? null : bb1.g : bb1Var;
            if (bb1Var2 != null) {
                bb1Var = bb1Var2;
            }
            setLayoutDirection(bb1Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        k71 k71Var;
        if (Build.VERSION.SDK_INT < 31 || (k71Var = this.K0) == null) {
            return;
        }
        yu2 semanticsOwner = getSemanticsOwner();
        o50 coroutineContext = getCoroutineContext();
        qs1 qs1Var = new qs1(new vr2[16]);
        oz2.O(semanticsOwner.a(), 0, new ur2(1, 8, qs1.class, qs1Var, "add", "add(Ljava/lang/Object;)Z"));
        final ns0[] ns0VarArr = {new cr2(10), new cr2(11)};
        Arrays.sort(qs1Var.f, 0, qs1Var.h, new Comparator() { // from class: fz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                for (ns0 ns0Var : ns0VarArr) {
                    int iT = ur.t((Comparable) ns0Var.h(obj), (Comparable) ns0Var.h(obj2));
                    if (iT != 0) {
                        return iT;
                    }
                }
                return 0;
            }
        });
        int i = qs1Var.h;
        vr2 vr2Var = (vr2) (i == 0 ? null : qs1Var.f[i - 1]);
        if (vr2Var == null) {
            return;
        }
        m41 m41Var = vr2Var.c;
        r10 r10Var = new r10(vr2Var.a, m41Var, ur.c(coroutineContext), k71Var, this);
        ex1 ex1Var = vr2Var.d;
        jk2 jk2VarC0 = vr.y(ex1Var).c0(ex1Var, true);
        long jC = m41Var.c();
        ScrollCaptureTarget scrollCaptureTargetN = a72.n(this, w22.F(br.L(jk2VarC0)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), r10Var);
        scrollCaptureTargetN.setScrollBounds(w22.F(m41Var));
        consumer.accept(scrollCaptureTargetN);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        N();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new c31(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        c8 c8Var = this.C;
        c8Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (s51.n(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            w7.I(c8Var, longSparseArray);
        } else {
            c8Var.f.post(new a8(0, c8Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zY;
        this.H0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zY = vm1.y())) {
            return;
        }
        setShowLayoutBounds(zY);
        l(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.s0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void r(float[] fArr) {
        C();
        wm1.e(fArr, this.d0);
        w7.z(fArr, Float.intBitsToFloat((int) (this.h0 >> 32)), Float.intBitsToFloat((int) (this.h0 & 4294967295L)), this.b0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            ro0 ro0VarD = yo0.d(i);
            int i3 = ro0VarD != null ? ro0VarD.a : 7;
            Boolean boolE = ((ep0) getFocusOwner()).e(i3, rect != null ? new jk2(rect.left, rect.top, rect.right, rect.bottom) : null, new w6(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!s51.n(boolE, bool)) {
                if (!s51.n(((ep0) getFocusOwner()).e(i3, null, new w6(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((ep0) getFocusOwner()).h(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final long s(long j) {
        C();
        long jB = wm1.b(j, this.d0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.h0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.h0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.B.m = j;
    }

    public final void setComposeViewContext(a20 a20Var) {
        if (getCoroutineContext() != a20Var.c().j() && !((yr1) getRoot().n()).isEmpty()) {
            m21.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        t63 t63VarL = jo3.l();
        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
        t63 t63VarS = jo3.s(t63VarL);
        try {
            a20 a20Var2 = get_composeViewContext();
            if (a20Var != a20Var2) {
                if (isAttachedToWindow()) {
                    a20Var2.b();
                    a20Var.e();
                }
                set_composeViewContext(a20Var);
                setCoroutineContext(a20Var.c().j());
            }
        } finally {
            jo3.v(t63VarL, t63VarS, ns0VarE);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.I0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.L.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(c8 c8Var) {
        this.C = c8Var;
    }

    public void setCoroutineContext(o50 o50Var) {
        this.s = o50Var;
    }

    public final void setFrameEndScheduler$ui(sf1 sf1Var) {
        this.j = sf1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f0 = j;
    }

    public final void setOnReadyForComposition(ns0 ns0Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.I0) {
            ns0Var.h(getComposeViewContext());
        } else {
            this.i0 = ns0Var;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(rs0 rs0Var) {
        this.D0 = rs0Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m2setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(p11 p11Var) {
        this.i = p11Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.R = z;
    }

    public void setUncaughtExceptionHandler(oo2 oo2Var) {
        this.V.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z) {
        zm1 zm1Var = this.V;
        if (zm1Var.b.D() || ((qs1) zm1Var.e.g).h != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (zm1Var.l(z ? this.F0 : this.G0)) {
                    requestLayout();
                }
                zm1Var.b(false);
                getRectManager().a();
                if (this.I) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.I = false;
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void u(tb1 tb1Var, long j) {
        zm1 zm1Var = this.V;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            zm1Var.m(tb1Var, j);
            if (!zm1Var.b.D()) {
                zm1Var.b(false);
                getRectManager().a();
                this.G0.a();
                if (this.I) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.I = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean v(int i) {
        if (i != 7 && i != 8) {
            Integer numC = yo0.c(i);
            if (numC == null) {
                throw nc2.d("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            rp0 rp0VarF = ((ep0) getFocusOwner()).f();
            if (rp0VarF == null) {
                c.q("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = yo0.c(i);
            if (numC2 == null) {
                throw nc2.d("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            pq3 pq3Var = vr.X(rp0VarF).u;
            View interopView = pq3Var != null ? pq3Var.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !w7.y(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return yo0.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final void w() {
        as1 as1Var;
        Object[] objArr;
        if (this.P) {
            p73 p73Var = getSnapshotObserver().a;
            s12 s12Var = new s12(7);
            synchronized (p73Var.g) {
                try {
                    qs1 qs1Var = p73Var.f;
                    int i = qs1Var.h;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = qs1Var.f;
                        if (i2 >= i) {
                            break;
                        }
                        o73 o73Var = (o73) objArr[i2];
                        o73Var.d(s12Var);
                        if (!o73Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = qs1Var.f;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    qs1Var.h = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.P = false;
        }
        zc zcVar = this.S;
        if (zcVar != null) {
            g(zcVar);
        }
        l6 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            pr1 pr1Var = autofillManager.m;
            if (pr1Var.d == 0 && autofillManager.n) {
                autofillManager.f.w().commit();
                autofillManager.n = false;
            }
            if (pr1Var.d != 0) {
                autofillManager.n = true;
            }
        }
        while (this.v0.j() && this.v0.g(0) != null) {
            int i5 = this.v0.b;
            int i6 = 0;
            while (true) {
                as1Var = this.v0;
                if (i6 < i5) {
                    cs0 cs0Var = (cs0) as1Var.g(i6);
                    this.v0.o(i6, null);
                    if (cs0Var != null) {
                        cs0Var.a();
                    }
                    i6++;
                }
            }
            as1Var.m(0, i5);
        }
    }

    public final void x(tb1 tb1Var) {
        o7 o7Var = this.B;
        o7Var.C = true;
        if (o7Var.q()) {
            o7Var.r(tb1Var);
        }
        c8 c8Var = this.C;
        c8Var.l = true;
        if (c8Var.g()) {
            c8Var.m.l(dm3.a);
        }
    }

    public final void y(tb1 tb1Var, boolean z, boolean z2, boolean z3) {
        tb1 tb1VarU;
        tb1 tb1VarU2;
        zm1 zm1Var = this.V;
        if (!z) {
            if (zm1Var.r(tb1Var, z2) && z3) {
                H(tb1Var);
                return;
            }
            return;
        }
        pi piVar = zm1Var.b;
        tb1 tb1Var2 = tb1Var.n;
        xb1 xb1Var = tb1Var.M;
        if (tb1Var2 == null) {
            m21.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = xb1Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    c.k();
                    return;
                }
                if (!xb1Var.e || z2) {
                    xb1Var.e = true;
                    xb1Var.p.z = true;
                    if (tb1Var.W) {
                        return;
                    }
                    if ((s51.n(tb1Var.J(), Boolean.TRUE) || zm1.i(tb1Var)) && ((tb1VarU = tb1Var.u()) == null || !tb1VarU.M.e)) {
                        piVar.b(tb1Var, a61.f);
                    } else if ((tb1Var.I() || zm1.j(tb1Var)) && ((tb1VarU2 = tb1Var.u()) == null || !tb1VarU2.q())) {
                        piVar.b(tb1Var, a61.h);
                    }
                    if (zm1Var.d || !z3) {
                        return;
                    }
                    H(tb1Var);
                    return;
                }
                return;
            }
        }
        zm1Var.h.b(new ym1(tb1Var, true, z2));
    }

    public final void z(tb1 tb1Var, boolean z, boolean z2) {
        xb1 xb1Var = tb1Var.M;
        a61 a61Var = a61.i;
        zm1 zm1Var = this.V;
        if (!z) {
            zm1Var.getClass();
            int iOrdinal = xb1Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                c.k();
                return;
            }
            tb1 tb1VarU = tb1Var.u();
            boolean z3 = tb1VarU == null || tb1VarU.I();
            if (!z2) {
                if (tb1Var.q()) {
                    return;
                }
                if (tb1Var.p() && tb1Var.I() == z3 && tb1Var.I() == xb1Var.p.y) {
                    return;
                }
            }
            bn1 bn1Var = xb1Var.p;
            bn1Var.A = true;
            bn1Var.B = true;
            if (!tb1Var.W && bn1Var.y && z3) {
                if ((tb1VarU == null || !tb1VarU.p()) && (tb1VarU == null || !tb1VarU.q())) {
                    zm1Var.b.b(tb1Var, a61Var);
                }
                if (zm1Var.d) {
                    return;
                }
                H(null);
                return;
            }
            return;
        }
        pi piVar = zm1Var.b;
        int iOrdinal2 = xb1Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    c.k();
                    return;
                }
            }
        }
        if ((xb1Var.e || xb1Var.f) && !z2) {
            return;
        }
        xb1Var.f = true;
        xb1Var.g = true;
        bn1 bn1Var2 = xb1Var.p;
        bn1Var2.A = true;
        bn1Var2.B = true;
        if (tb1Var.W) {
            return;
        }
        tb1 tb1VarU2 = tb1Var.u();
        if (s51.n(tb1Var.J(), Boolean.TRUE) && ((tb1VarU2 == null || !tb1VarU2.M.e) && (tb1VarU2 == null || !tb1VarU2.M.f))) {
            piVar.b(tb1Var, a61.g);
        } else if (tb1Var.I() && ((tb1VarU2 == null || !tb1VarU2.p()) && (tb1VarU2 == null || !tb1VarU2.q()))) {
            piVar.b(tb1Var, a61Var);
        }
        if (zm1Var.d) {
            return;
        }
        H(null);
    }

    public k6 getAutofill() {
        return this.N;
    }

    public l6 getAutofillManager() {
        return this.O;
    }

    public s8 getDragAndDropManager() {
        return this.t;
    }

    public or1 getLayoutNodes() {
        return this.y;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @za0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m0getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @za0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public po2 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(oo2 oo2Var) {
    }
}
