package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nh0 {
    public static final Object j = new Object();
    public static volatile nh0 k;
    public final ReentrantReadWriteLock a;
    public final tj b;
    public volatile int c;
    public final Handler d;
    public final jh0 e;
    public final mh0 f;
    public final zj g;
    public final int h;
    public final u80 i;

    public nh0(jq0 jq0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        mh0 mh0Var = jq0Var.a;
        this.f = mh0Var;
        int i = jq0Var.b;
        this.h = i;
        this.i = jq0Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new tj(0);
        this.g = new zj(21);
        jh0 jh0Var = new jh0(this);
        this.e = jh0Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                mh0Var.a(new ih0(jh0Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static nh0 a() {
        nh0 nh0Var;
        synchronized (j) {
            try {
                nh0Var = k;
                if (!(nh0Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return nh0Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            c.q("Not initialized yet");
            return 0;
        }
        jo3.h(charSequence, "charSequence cannot be null");
        pi piVar = this.e.b;
        piVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            kl3[] kl3VarArr = (kl3[]) spanned.getSpans(i, i + 1, kl3.class);
            if (kl3VarArr.length > 0) {
                return spanned.getSpanStart(kl3VarArr[0]);
            }
        }
        return ((zh0) piVar.I(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new zh0(i))).g;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            c.q("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            jh0 jh0Var = this.e;
            nh0 nh0Var = jh0Var.a;
            try {
                nh0Var.f.a(new ih0(jh0Var));
            } catch (Throwable th) {
                nh0Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new lh0(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009d, B:60:0x00ad, B:61:0x00b0), top: B:105:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009d, B:60:0x00ad, B:61:0x00b0), top: B:105:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf A[Catch: all -> 0x00f5, TRY_ENTER, TryCatch #0 {all -> 0x00f5, blocks: (B:65:0x00bf, B:68:0x00c7, B:50:0x0082), top: B:101:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        kl3[] kl3VarArr;
        boolean z = false;
        im3 im3Var = null;
        if (!(c() == 1)) {
            c.q("Not initialized yet");
            return null;
        }
        if (i < 0) {
            c.p("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            c.p("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            c.p("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            c.p("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            c.p("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z2 = i3 == 1;
        pi piVar = this.e.b;
        piVar.getClass();
        boolean z3 = charSequence instanceof k83;
        if (z3) {
            ((k83) charSequence).a();
        }
        if (z3) {
            im3Var = new im3((Spannable) charSequence);
            if (im3Var != null) {
            }
            i4 = i;
            i5 = i2;
            if (i4 == i5) {
            }
            ((k83) charSequence2).b();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, kl3.class) <= i2) {
                    im3Var = new im3();
                    im3Var.f = false;
                    im3Var.g = new SpannableString(charSequence);
                }
                if (im3Var != null) {
                    while (i < r0) {
                    }
                }
                i4 = i;
                i5 = i2;
                if (i4 == i5) {
                    charSequence2 = charSequence;
                    if (!z3) {
                    }
                }
                ((k83) charSequence2).b();
                return charSequence2;
            }
            try {
                im3Var = new im3((Spannable) charSequence);
                if (im3Var != null && (kl3VarArr = (kl3[]) im3Var.g.getSpans(i, i2, kl3.class)) != null && kl3VarArr.length > 0) {
                    for (kl3 kl3Var : kl3VarArr) {
                        int spanStart = im3Var.g.getSpanStart(kl3Var);
                        int spanEnd = im3Var.g.getSpanEnd(kl3Var);
                        if (spanStart != i2) {
                            im3Var.removeSpan(kl3Var);
                        }
                        i = Math.min(spanStart, i);
                        i2 = Math.max(spanEnd, i2);
                    }
                }
                i4 = i;
                i5 = i2;
                if (i4 == i5 || i4 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z3) {
                        return charSequence2;
                    }
                } else {
                    charSequence2 = charSequence;
                    try {
                        im3 im3Var2 = (im3) piVar.I(charSequence2, i4, i5, Integer.MAX_VALUE, z2, new a31(im3Var, z, (zj) piVar.g, 13));
                        if (im3Var2 != null) {
                            Spannable spannable = im3Var2.g;
                            if (z3) {
                                ((k83) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z3) {
                            return charSequence2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z3) {
                        }
                    }
                }
                ((k83) charSequence2).b();
                return charSequence2;
            } catch (Throwable th3) {
                th = th3;
                charSequence2 = charSequence;
                th = th;
                if (!z3) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z3) {
            throw th;
        }
        ((k83) charSequence2).b();
        throw th;
    }

    public final void h(kh0 kh0Var) {
        jo3.h(kh0Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new lh0(Arrays.asList(kh0Var), this.c, null));
            } else {
                this.b.add(kh0Var);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        jh0 jh0Var = this.e;
        jh0Var.getClass();
        Bundle bundle = editorInfo.extras;
        ap1 ap1Var = (ap1) jh0Var.c.g;
        int iA = ap1Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) ap1Var.i).getInt(iA + ap1Var.f) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
