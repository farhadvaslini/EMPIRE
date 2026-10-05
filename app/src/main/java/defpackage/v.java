package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.nvidia.devtech.NvEventQueueActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x029e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02a2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026f A[Catch: all -> 0x029e, LOOP:1: B:148:0x020f->B:163:0x026f, LOOP_END, TryCatch #14 {all -> 0x029e, all -> 0x0299, blocks: (B:145:0x0201, B:148:0x020f, B:150:0x021f, B:152:0x022b, B:154:0x0234, B:156:0x0243, B:158:0x0260, B:163:0x026f, B:164:0x0273, B:166:0x0285, B:170:0x029a, B:171:0x029d, B:165:0x0278), top: B:254:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        int i;
        View viewFindFocus;
        int i2 = this.f;
        Boolean bool = null;
        ?? r4 = 1;
        r4 = 1;
        int i3 = 0;
        Object obj2 = this.g;
        switch (i2) {
            case 0:
                ((w) obj2).b();
                return;
            case 1:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = l3.g;
                Method method = l3.f;
                ?? r5 = Build.VERSION.SDK_INT;
                if (r5 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((r5 != 26 && r5 != 27) || method != null) && (l3.e != null || l3.d != null)) {
                    try {
                        Object obj3 = l3.c.get(activity);
                        if (obj3 != null && (obj = l3.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            k3 k3Var = new k3(activity);
                            application.registerActivityLifecycleCallbacks(k3Var);
                            handler.post(new x2(k3Var, false, obj3, 1));
                            if (r5 != 26 && r5 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool2 = Boolean.FALSE;
                                        r4 = application;
                                        r5 = k3Var;
                                        method.invoke(obj, obj3, null, null, 0, bool2, null, null, bool2, bool2);
                                    } catch (Throwable th) {
                                        th = th;
                                        ?? r42 = application;
                                        ?? r52 = k3Var;
                                        handler.post(new x2(r42, false, r52, 2));
                                        throw th;
                                    }
                                } else {
                                    r4 = application;
                                    r5 = k3Var;
                                    activity.recreate();
                                }
                                handler.post(new x2(r4, false, r5, 2));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                o7 o7Var = (o7) obj2;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    o7Var.i.t(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        o7Var.i();
                        Trace.endSection();
                        o7Var.N = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                c8 c8Var = (c8) obj2;
                boolean zG = c8Var.g();
                h7 h7Var = c8Var.f;
                if (zG) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        h7Var.t(true);
                        or1 or1Var = c8Var.p;
                        int[] iArr = or1Var.b;
                        long[] jArr = or1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = i3;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (c8Var.e().a(i7)) {
                                                i = length;
                                            } else {
                                                i = length;
                                                c8Var.i.add(new r30(i7, c8Var.o, s30.g, null));
                                                c8Var.m.l(dm3.a);
                                            }
                                        }
                                        j >>= 8;
                                        i6++;
                                        length = i;
                                    }
                                    int i8 = length;
                                    if (i5 == 8) {
                                        length = i8;
                                        if (i4 == length) {
                                            i4++;
                                            i3 = 0;
                                        }
                                    }
                                } else if (i4 == length) {
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        c8Var.j(h7Var.getSemanticsOwner().a(), c8Var.q);
                        Trace.endSection();
                        c8Var.d(c8Var.e());
                        c8Var.n();
                        c8Var.r = false;
                        return;
                    } finally {
                    }
                }
                return;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ActionMode actionMode = ((wb) obj2).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                tz tzVar = (tz) obj2;
                Runnable runnable = tzVar.g;
                if (runnable != null) {
                    runnable.run();
                    tzVar.g = null;
                    return;
                }
                return;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                a00.a((a00) obj2);
                return;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                iq0 iq0Var = (iq0) obj2;
                synchronized (iq0Var.d) {
                    try {
                        if (iq0Var.h == null) {
                            return;
                        }
                        try {
                            zq0 zq0VarC = iq0Var.c();
                            int i9 = zq0VarC.f;
                            if (i9 == 2) {
                                synchronized (iq0Var.d) {
                                }
                            }
                            if (i9 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                int i10 = pj3.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                zj zjVar = iq0Var.c;
                                Context context = iq0Var.a;
                                zjVar.getClass();
                                zq0[] zq0VarArr = {zq0VarC};
                                t22 t22Var = el3.a;
                                b32.d("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceT = el3.a.t(context, zq0VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferB = w22.B(iq0Var.a, zq0VarC.a);
                                    if (mappedByteBufferB == null || typefaceT == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        pl plVar = new pl(typefaceT, ur.L(mappedByteBufferB));
                                        Trace.endSection();
                                        synchronized (iq0Var.d) {
                                            try {
                                                vr vrVar = iq0Var.h;
                                                if (vrVar != null) {
                                                    vrVar.P(plVar);
                                                }
                                            } finally {
                                            }
                                            break;
                                        }
                                        iq0Var.b();
                                        return;
                                    } finally {
                                        int i11 = pj3.a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                            break;
                        } catch (Throwable th3) {
                            synchronized (iq0Var.d) {
                                try {
                                    vr vrVar2 = iq0Var.h;
                                    if (vrVar2 != null) {
                                        vrVar2.O(th3);
                                    }
                                    iq0Var.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                GameAudioPlayer.playUrl$lambda$0((String) obj2);
                return;
            case vr.g /* 9 */:
                GameAudioPlayer.cleoRemoveStream$lambda$0((gv0) obj2);
                return;
            case vr.h /* 10 */:
                ((NvEventQueueActivity) obj2).lambda$DoResumeEvent$1();
                return;
            case 11:
                gd2 gd2Var = (gd2) obj2;
                rf1 rf1Var = gd2Var.k;
                if (gd2Var.g == 0) {
                    gd2Var.h = true;
                    rf1Var.e(ef1.ON_PAUSE);
                }
                if (gd2Var.f == 0 && gd2Var.h) {
                    rf1Var.e(ef1.ON_STOP);
                    gd2Var.i = true;
                    return;
                }
                return;
            case vr.i /* 12 */:
                jo2.setRippleState$lambda$1((jo2) obj2);
                return;
            case 13:
                View view = (View) obj2;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                ig3 ig3Var = (ig3) obj2;
                pi piVar = ig3Var.b;
                ig3Var.n = null;
                qs1 qs1Var = ig3Var.m;
                View view2 = ig3Var.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    qs1Var.g();
                    return;
                }
                Object[] objArr = qs1Var.f;
                int i12 = qs1Var.h;
                Boolean boolValueOf = null;
                for (int i13 = 0; i13 < i12; i13++) {
                    hg3 hg3Var = (hg3) objArr[i13];
                    int iOrdinal = hg3Var.ordinal();
                    if (iOrdinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (iOrdinal == 1) {
                        bool = Boolean.FALSE;
                    } else if (iOrdinal != 2 && iOrdinal != 3) {
                        c.k();
                        return;
                    } else {
                        if (!s51.n(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(hg3Var == hg3.h);
                        }
                    }
                    boolValueOf = bool;
                }
                qs1Var.g();
                if (s51.n(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((lc1) piVar.h).getValue()).restartInput((View) piVar.g);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((k71) ((k71) piVar.i).g).s();
                    } else {
                        ((k71) ((k71) piVar.i).g).h();
                    }
                }
                if (s51.n(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((lc1) piVar.h).getValue()).restartInput((View) piVar.g);
                    return;
                }
                return;
        }
    }
}
