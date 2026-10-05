package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;
import top.th1nk.samp.R;
import top.th1nk.samp.feature.download.DownloadForegroundService;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pi implements q73, ad0, fq2 {
    public static volatile pi j;
    public static final Object k = new Object();
    public static final ec2 l = new ec2("auto_check_enabled");
    public static final ec2 m = new ec2("pre_release_enabled");
    public static final ec2 n = new ec2("last_check_millis");
    public static pi o;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public pi(int i) {
        this.f = i;
        switch (i) {
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                this.g = new yl1(21);
                this.h = new yl1(21);
                this.i = new yl1(21);
                break;
            case 8:
                this.g = new is1();
                break;
            case jo3.g /* 15 */:
                long[] jArr = nr2.a;
                this.g = new is1();
                break;
            case 18:
                this.g = new AtomicReference(f80.E0);
                this.h = new Object();
                break;
            case 22:
                this.g = new WeakHashMap();
                this.h = new WeakHashMap();
                this.i = new WeakHashMap();
                break;
            default:
                this.i = new ak2(15);
                break;
        }
    }

    public static pi H(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new pi(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z) {
        kl3[] kl3VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (kl3VarArr = (kl3[]) editable.getSpans(selectionStart, selectionEnd, kl3.class)) != null && kl3VarArr.length > 0) {
                for (kl3 kl3Var : kl3VarArr) {
                    int spanStart = editable.getSpanStart(kl3Var);
                    int spanEnd = editable.getSpanEnd(kl3Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static pi u(Context context) {
        if (j == null) {
            synchronized (k) {
                try {
                    if (j == null) {
                        j = new pi(context);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public long A() {
        return ((rr) this.i).f.d;
    }

    public int B() {
        return ((Number) ((fd1) this.g).a()).intValue();
    }

    public boolean C(CharSequence charSequence, int i, int i2, jl3 jl3Var) {
        if ((jl3Var.c & 3) == 0) {
            u80 u80Var = (u80) this.i;
            zo1 zo1VarB = jl3Var.b();
            int iA = zo1VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) zo1VarB.i).getShort(iA + zo1VarB.f);
            }
            u80Var.getClass();
            ThreadLocal threadLocal = u80.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = u80Var.a.hasGlyph(sb.toString());
            int i3 = jl3Var.c & 4;
            jl3Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (jl3Var.c & 3) == 2;
    }

    public boolean D() {
        return !(((x73) ((yl1) this.g).g).isEmpty() && ((x73) ((yl1) this.i).g).isEmpty() && ((x73) ((yl1) this.h).g).isEmpty());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(q40 q40Var) {
        sn3 sn3Var;
        if (q40Var instanceof sn3) {
            sn3Var = (sn3) q40Var;
            int i = sn3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sn3Var.k = i - Integer.MIN_VALUE;
            } else {
                sn3Var = new sn3(this, q40Var);
            }
        }
        Object objE = sn3Var.i;
        int i2 = sn3Var.k;
        if (i2 == 0) {
            y02.Q(objE);
            fn0 fn0VarB = ((e70) this.g).b();
            sn3Var.k = 1;
            objE = lr.E(fn0VarB, sn3Var);
            y50 y50Var = y50.f;
            if (objE == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objE);
        }
        Boolean bool = (Boolean) ((es1) objE).c(m);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    public boolean F() {
        if (((e93) this.g).getValue() != this.i) {
            return true;
        }
        pi piVar = (pi) this.h;
        return piVar != null && piVar.F();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(q40 q40Var) {
        tn3 tn3Var;
        if (q40Var instanceof tn3) {
            tn3Var = (tn3) q40Var;
            int i = tn3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn3Var.k = i - Integer.MIN_VALUE;
            } else {
                tn3Var = new tn3(this, q40Var);
            }
        }
        Object obj = tn3Var.i;
        int i2 = tn3Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            e70 e70Var = (e70) this.g;
            l70 l70Var = new l70(2, p40Var, 3);
            tn3Var.k = 1;
            Object objL = b32.l(e70Var, l70Var, tn3Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }

    public Object I(CharSequence charSequence, int i, int i2, int i3, boolean z, yh0 yh0Var) {
        int i4;
        char c;
        bi0 bi0Var = new bi0((bp1) ((pl) this.h).i);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zJ = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zJ) {
                SparseArray sparseArray = bi0Var.c.a;
                bp1 bp1Var = sparseArray == null ? null : (bp1) sparseArray.get(iCodePointAt);
                if (bi0Var.a == 2) {
                    if (bp1Var != null) {
                        bi0Var.c = bp1Var;
                        bi0Var.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            bi0Var.a();
                        } else if (iCodePointAt != 65039) {
                            bp1 bp1Var2 = bi0Var.c;
                            if (bp1Var2.b != null) {
                                if (bi0Var.f != 1) {
                                    bi0Var.d = bp1Var2;
                                    bi0Var.a();
                                } else if (bi0Var.b()) {
                                    bi0Var.d = bi0Var.c;
                                    bi0Var.a();
                                } else {
                                    bi0Var.a();
                                }
                                c = 3;
                            } else {
                                bi0Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (bp1Var == null) {
                    bi0Var.a();
                    c = 1;
                } else {
                    bi0Var.a = 2;
                    bi0Var.c = bp1Var;
                    bi0Var.f = 1;
                    c = 2;
                }
                bi0Var.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !C(charSequence, i4, iCharCount, bi0Var.d.b)) {
                        zJ = yh0Var.j(charSequence, i4, iCharCount, bi0Var.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (bi0Var.a == 2 && bi0Var.c.b != null && ((bi0Var.f > 1 || bi0Var.b()) && i5 < i3 && zJ && (z || !C(charSequence, i4, iCharCount, bi0Var.c.b)))) {
            yh0Var.j(charSequence, i4, iCharCount, bi0Var.c.b);
        }
        return yh0Var.a();
    }

    public void J() {
        ((TypedArray) this.g).recycle();
    }

    public void K(Object obj) {
        long jG = g12.G();
        if (jG == uh3.a) {
            this.i = obj;
            return;
        }
        synchronized (this.h) {
            rh3 rh3Var = (rh3) ((AtomicReference) this.g).get();
            int iA = rh3Var.a(jG);
            if (iA < 0) {
                ((AtomicReference) this.g).set(rh3Var.b(jG, obj));
            } else {
                rh3Var.c[iA] = obj;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object L(boolean z, q40 q40Var) {
        un3 un3Var;
        if (q40Var instanceof un3) {
            un3Var = (un3) q40Var;
            int i = un3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                un3Var.k = i - Integer.MIN_VALUE;
            } else {
                un3Var = new un3(this, q40Var);
            }
        }
        Object obj = un3Var.i;
        int i2 = un3Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            e70 e70Var = (e70) this.g;
            kw2 kw2Var = new kw2(z, p40Var, 5);
            un3Var.k = 1;
            Object objL = b32.l(e70Var, kw2Var, un3Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }

    public void M(pr prVar) {
        ((rr) this.i).f.c = prVar;
    }

    public void N(ua0 ua0Var) {
        ((rr) this.i).f.a = ua0Var;
    }

    public void O(bb1 bb1Var) {
        ((rr) this.i).f.b = bb1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object P(boolean z, q40 q40Var) {
        vn3 vn3Var;
        if (q40Var instanceof vn3) {
            vn3Var = (vn3) q40Var;
            int i = vn3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vn3Var.k = i - Integer.MIN_VALUE;
            } else {
                vn3Var = new vn3(this, q40Var);
            }
        }
        Object obj = vn3Var.i;
        int i2 = vn3Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            e70 e70Var = (e70) this.g;
            kw2 kw2Var = new kw2(z, p40Var, 6);
            vn3Var.k = 1;
            Object objL = b32.l(e70Var, kw2Var, vn3Var);
            y50 y50Var = y50.f;
            if (objL == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }

    public void Q(long j2) {
        ((rr) this.i).f.d = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object R(q40 q40Var) {
        wn3 wn3Var;
        if (q40Var instanceof wn3) {
            wn3Var = (wn3) q40Var;
            int i = wn3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wn3Var.k = i - Integer.MIN_VALUE;
            } else {
                wn3Var = new wn3(this, q40Var);
            }
        }
        Object objE = wn3Var.i;
        int i2 = wn3Var.k;
        if (i2 == 0) {
            y02.Q(objE);
            fn0 fn0VarB = ((e70) this.g).b();
            wn3Var.k = 1;
            objE = lr.E(fn0VarB, wn3Var);
            y50 y50Var = y50.f;
            if (objE == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objE);
        }
        es1 es1Var = (es1) objE;
        Boolean bool = (Boolean) es1Var.c(l);
        if (!(bool != null ? bool.booleanValue() : true)) {
            return Boolean.FALSE;
        }
        Long l2 = (Long) es1Var.c(n);
        return Boolean.valueOf(System.currentTimeMillis() - (l2 != null ? l2.longValue() : 0L) >= 7200000);
    }

    public void S() {
        is1 is1Var = (is1) this.g;
        String str = (String) this.h;
        List list = (List) is1Var.k(str);
        if (list != null) {
            list.remove((cs0) this.i);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        is1Var.m(str, list);
    }

    @Override // defpackage.ad0
    public void a(File file) {
        int i = this.f;
        file.getClass();
        switch (i) {
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                jr jrVar = (jr) this.i;
                if (jrVar.r() instanceof qx1) {
                    jrVar.t(new rn2(file));
                }
                break;
            default:
                i93 i93Var = ((sm2) this.g).p;
                dd0 dd0Var = new dd0(file, (bm2) this.h);
                i93Var.getClass();
                i93Var.j(null, dd0Var);
                int i2 = DownloadForegroundService.g;
                pq.T((Application) this.i);
                break;
        }
    }

    public void b(tb1 tb1Var, a61 a61Var) {
        yl1 yl1Var = (yl1) this.g;
        yl1 yl1Var2 = (yl1) this.h;
        yl1 yl1Var3 = (yl1) this.i;
        int iOrdinal = a61Var.ordinal();
        if (iOrdinal == 0) {
            yl1Var.r(tb1Var);
            yl1Var3.r(tb1Var);
            return;
        }
        if (iOrdinal == 1) {
            yl1Var2.r(tb1Var);
            yl1Var3.r(tb1Var);
            return;
        }
        if (iOrdinal == 2) {
            if (tb1Var.n != null) {
                yl1Var3.r(tb1Var);
                return;
            } else {
                yl1Var.r(tb1Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            c.k();
        } else if (tb1Var.n != null) {
            yl1Var3.r(tb1Var);
        } else {
            yl1Var2.r(tb1Var);
        }
    }

    @Override // defpackage.q73
    public z73 c() {
        return (ej2) this.h;
    }

    public boolean d(tb1 tb1Var) {
        return !(tb1Var.n == null) && (((x73) ((yl1) this.g).g).contains(tb1Var) || ((x73) ((yl1) this.h).g).contains(tb1Var));
    }

    @Override // defpackage.ad0
    public void e(cd0 cd0Var) {
        switch (this.f) {
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                i93 i93Var = ((tw) this.g).p;
                hv hvVar = new hv(ev.g, ((vu) this.h).a, cd0Var);
                i93Var.getClass();
                i93Var.j(null, hvVar);
                break;
            default:
                bm2 bm2Var = (bm2) this.h;
                sm2 sm2Var = (sm2) this.g;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = cd0Var.a;
                long j3 = cd0Var.b;
                if (j2 >= j3 || jElapsedRealtime - sm2Var.j >= 150) {
                    sm2Var.j = jElapsedRealtime;
                    i93 i93Var2 = sm2Var.p;
                    ed0 ed0Var = new ed0(bm2Var, cd0Var);
                    i93Var2.getClass();
                    i93Var2.j(null, ed0Var);
                    String str = sm2.e(sm2Var, j2) + " / " + sm2.e(sm2Var, j3) + " · " + sm2.e(sm2Var, cd0Var.c) + "/s";
                    int i = j3 > 0 ? (int) ((j2 * 100) / j3) : 0;
                    int i2 = j3 > 0 ? 100 : 0;
                    int i3 = DownloadForegroundService.g;
                    Application application = (Application) this.i;
                    String str2 = bm2Var.a;
                    application.getClass();
                    Intent intent = new Intent(application, (Class<?>) DownloadForegroundService.class);
                    intent.setAction("top.th1nk.samp.download.UPDATE");
                    intent.putExtra("title", str2);
                    intent.putExtra("content", str);
                    intent.putExtra("progress", i);
                    intent.putExtra("max", i2);
                    try {
                        application.startService(intent);
                    } catch (Exception e) {
                        ti tiVar = ui.a;
                        ui.c(ti.i, "DownloadService", by1.g("Failed to update notification: ", e.getMessage()), null);
                    }
                }
                break;
        }
    }

    @Override // defpackage.ad0
    public void f(String str) {
        switch (this.f) {
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                jr jrVar = (jr) this.i;
                if (jrVar.r() instanceof qx1) {
                    jrVar.t(new rn2(new qn2(new IllegalStateException(str))));
                }
                break;
            default:
                i93 i93Var = ((sm2) this.g).p;
                fd0 fd0Var = new fd0(str, (bm2) this.h);
                i93Var.getClass();
                i93Var.j(null, fd0Var);
                int i = DownloadForegroundService.g;
                pq.T((Application) this.i);
                break;
        }
    }

    public void h(Bundle bundle) {
        HashSet hashSet = (HashSet) this.h;
        String string = ((Context) this.i).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (h21.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    i((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new kz(e);
            }
        }
    }

    public Object i(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.g;
        if (b32.t()) {
            try {
                b32.d(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                h21 h21Var = (h21) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = h21Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            i(cls2, hashSet);
                        }
                    }
                }
                objB = h21Var.b((Context) this.i);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th) {
                throw new kz(th);
            }
        }
        return objB;
    }

    public Object j() {
        long jG = g12.G();
        if (jG == uh3.a) {
            return this.i;
        }
        rh3 rh3Var = (rh3) ((AtomicReference) this.g).get();
        int iA = rh3Var.a(jG);
        if (iA >= 0) {
            return rh3Var.c[iA];
        }
        return null;
    }

    public pr k() {
        return ((rr) this.i).f.c;
    }

    public ColorStateList l(int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.g;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = rn.B((Context) this.i, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    @Override // defpackage.q73
    public g43 m() {
        return (dj2) this.i;
    }

    public qj1 n() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((ak2) this.i)) {
            try {
                qj1 qj1Var = (qj1) this.h;
                if (qj1Var != null && localeList == ((LocaleList) this.g)) {
                    return qj1Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new pj1(localeList.get(i)));
                }
                qj1 qj1Var2 = new qj1(arrayList);
                this.g = localeList;
                this.h = qj1Var2;
                return qj1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ua0 o() {
        return ((rr) this.i).f.a;
    }

    public Drawable p(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.g;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : rn.C((Context) this.i, resourceId);
    }

    public Drawable q(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.g).hasValue(i) || (resourceId = ((TypedArray) this.g).getResourceId(i, 0)) == 0) {
            return null;
        }
        yg ygVarA = yg.a();
        Context context = (Context) this.i;
        synchronized (ygVarA) {
            drawableE = ygVarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public int r() {
        if (x().a.isEmpty()) {
            return -1;
        }
        long j2 = ((long) ((fn1) qx.q0(x().a)).a) - ((long) x().h);
        if (j2 < 0) {
            j2 = 0;
        }
        return (int) j2;
    }

    public Typeface s(int i, int i2, xh xhVar) throws Throwable {
        xh xhVar2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.g).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.h) == null) {
                this.h = new TypedValue();
            }
            Context context = (Context) this.i;
            TypedValue typedValue = (TypedValue) this.h;
            ThreadLocal threadLocal = vm2.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    xhVar.a(-3);
                    return null;
                }
                int i3 = typedValue.assetCookie;
                nl1 nl1Var = el3.b;
                Typeface typeface = (Typeface) nl1Var.a(el3.b(resources, resourceId, string, i3, i2));
                int i4 = 6;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new a8(i4, xhVar, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e) {
                    e = e;
                    xhVar2 = xhVar;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    xhVar2 = xhVar;
                }
                try {
                    if (!string.toLowerCase().endsWith(".xml")) {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceV = el3.a.v(context, resources, resourceId, string);
                        if (typefaceV != null) {
                            nl1Var.b(el3.b(resources, resourceId, string, i5, i2), typefaceV);
                        }
                        if (typefaceV != null) {
                            new Handler(Looper.getMainLooper()).post(new a8(i4, xhVar, typefaceV));
                        } else {
                            xhVar.a(-3);
                        }
                        return typefaceV;
                    }
                    oq0 oq0VarR = vr.R(resources.getXml(resourceId), resources);
                    if (oq0VarR != null) {
                        return el3.a(context, oq0VarR, resources, resourceId, string, typedValue.assetCookie, i2, xhVar, true);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        xhVar.a(-3);
                        return null;
                    } catch (IOException e3) {
                        iOException = e3;
                        xhVar2 = xhVar;
                    } catch (XmlPullParserException e4) {
                        xmlPullParserException = e4;
                        xhVar2 = xhVar;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        xhVar2.a(-3);
                        return null;
                    }
                } catch (IOException e5) {
                    e = e5;
                    iOException = e;
                } catch (XmlPullParserException e6) {
                    e = e6;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                    xhVar2.a(-3);
                    return null;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                xhVar2.a(-3);
                return null;
            }
        }
        return null;
    }

    public boolean t() {
        return !x().a.isEmpty();
    }

    public String toString() {
        switch (this.f) {
            case vr.i /* 12 */:
                String str = (String) this.i;
                String str2 = (String) this.h;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.g;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public int v() {
        if (x().a.isEmpty()) {
            return -1;
        }
        long j2 = ((long) ((fn1) qx.y0(x().a)).a) + ((long) x().h);
        long jB = ((long) B()) - 1;
        if (j2 > jB) {
            j2 = jB;
        }
        return (int) j2;
    }

    public bb1 w() {
        return ((rr) this.i).f.b;
    }

    public y22 x() {
        y22 y22Var = (y22) this.h;
        if (y22Var != null) {
            return y22Var;
        }
        s51.F("layoutInfo");
        throw null;
    }

    public int y() {
        if (x().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((fn1) qx.y0(x().a)).j + x().b) + x().c) - x().g);
    }

    public int z() {
        if (x().a.isEmpty()) {
            return 0;
        }
        int i = ((fn1) qx.q0(x().a)).j + (-x().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    public pi(Application application) {
        this.f = 1;
        application.getClass();
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        ih2 ih2VarA = bo3.b.a(applicationContext, bo3.a[0]);
        this.g = ih2VarA;
        this.h = new t92(ih2VarA.b(), 17);
        this.i = new t92(ih2VarA.b(), 18);
        ih2VarA.b();
    }

    public pi(yj2 yj2Var) {
        this.f = 13;
        this.g = new bk(0);
        this.h = new qk();
        this.i = new me1(4, this, yj2Var);
    }

    public /* synthetic */ pi(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public pi(pl plVar) {
        this.f = 3;
        this.g = plVar;
        s90 s90Var = (s90) plVar.i;
        s90Var.getClass();
        this.h = new ej2(s90Var);
        r90 r90Var = (r90) plVar.j;
        r90Var.getClass();
        this.i = new dj2(r90Var);
    }

    public pi(View view) {
        this.f = 9;
        this.g = view;
        this.h = ur.J(pe1.f, new ja(18, this));
        this.i = new k71(view);
    }

    public pi(fd1 fd1Var) {
        this.f = 14;
        this.g = fd1Var;
    }

    public pi(rr rrVar) {
        this.f = 4;
        this.i = rrVar;
        this.g = new yl1(10, this);
    }

    public pi(Context context, TypedArray typedArray) {
        this.f = 19;
        this.i = context;
        this.g = typedArray;
    }

    public pi(Context context, LocationManager locationManager) {
        this.f = 20;
        this.h = new za();
        this.i = context;
        this.g = locationManager;
    }

    public pi(Context context) {
        this.f = 0;
        this.i = context.getApplicationContext();
        this.h = new HashSet();
        this.g = new HashMap();
    }

    public pi(pl plVar, zj zjVar, u80 u80Var, Set set) {
        this.f = 7;
        this.g = zjVar;
        this.h = plVar;
        this.i = u80Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            I(str, 0, str.length(), 1, true, new ai0(0, str));
        }
    }

    public pi(ml3 ml3Var, pi piVar) {
        this.f = 21;
        this.g = ml3Var;
        this.h = piVar;
        this.i = ml3Var.f;
    }
}
