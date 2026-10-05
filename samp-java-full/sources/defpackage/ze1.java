package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 {
    public final View a;
    public final a31 b;
    public ns0 c;
    public ye1 e;
    public sf3 f;
    public oq3 g;
    public final lc1 k;
    public Rect l;
    public final ue1 m;
    public ns0 d = new n20(25);
    public bg3 h = new bg3("", yg3.b, 4);
    public b11 i = b11.g;
    public final ArrayList j = new ArrayList();

    public ze1(View view, l9 l9Var, a31 a31Var) {
        this.a = view;
        this.b = a31Var;
        int i = 24;
        this.c = new n20(i);
        this.k = ur.J(pe1.f, new ja(i, this));
        this.m = new ue1(l9Var, a31Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[PHI: r15
      0x00a5: PHI (r15v5 int) = (r15v0 int), (r15v4 int) binds: [B:36:0x00a3, B:48:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hk2 a(EditorInfo editorInfo) {
        int i;
        int i2;
        bg3 bg3Var = this.h;
        String str = bg3Var.a.g;
        long j = bg3Var.b;
        b11 b11Var = this.i;
        int i3 = b11Var.e;
        int i4 = b11Var.d;
        boolean z = b11Var.a;
        int i5 = 3;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                c.q("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        qj1 qj1Var = b11Var.f;
        if (s51.n(qj1Var, qj1.h)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(rx.d0(qj1Var, 10));
            Iterator it = qj1Var.f.iterator();
            while (it.hasNext()) {
                arrayList.add(((pj1) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = i5;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else {
                    i5 = 18;
                    if (i4 != 8) {
                        if (i4 == 9) {
                            i2 = 8194;
                        } else if (i4 == 10) {
                            i2 = 145;
                        } else if (i4 == 11) {
                            i2 = 113;
                        } else if (i4 == 12) {
                            i2 = 97;
                        } else if (i4 == 13) {
                            i2 = 49;
                        } else if (i4 == 14) {
                            i2 = 65;
                        } else if (i4 == 15) {
                            i2 = 81;
                        } else if (i4 == 16) {
                            i2 = 177;
                        } else if (i4 == 17) {
                            i2 = 193;
                        } else if (i4 == 18) {
                            i2 = 4;
                        } else {
                            i2 = 20;
                            if (i4 != 19) {
                                if (i4 == 20) {
                                    i2 = 36;
                                } else if (i4 == 21) {
                                    i2 = 4098;
                                } else if (i4 == 22) {
                                    i2 = 12290;
                                } else if (i4 == 23) {
                                    i2 = 8210;
                                } else if (i4 == 24) {
                                    i2 = 4114;
                                } else {
                                    if (i4 != 25) {
                                        c.q("Invalid Keyboard Type");
                                        return null;
                                    }
                                    i2 = 12306;
                                }
                            }
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (b11Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
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
            if (Build.VERSION.SDK_INT >= 37) {
                editorInfo.inputType |= 2097152;
            }
        }
        int i8 = yg3.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        ur.P(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!ja3.a || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            ur.Q(editorInfo, false);
        } else {
            ur.Q(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(vr.L(i9.n(), i9.A(), i9.x(), i9.z(), i9.B(), i9.C(), i9.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(oz2.L(i9.n(), i9.A(), i9.x(), i9.z()));
        }
        ve1 ve1Var = we1.a;
        if (nh0.d()) {
            nh0.a().i(editorInfo);
        }
        hk2 hk2Var = new hk2(this.h, new k71(2, this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(hk2Var));
        return hk2Var;
    }
}
