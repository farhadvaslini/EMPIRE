package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class s4 {
    public int a;
    public Object b;

    public s4(Context context) {
        int iG = t4.g(context, 0);
        this.b = new o4(new ContextThemeWrapper(context, t4.g(context, iG)));
        this.a = iG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e9, code lost:
    
        if (r8.size() <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01eb, code lost:
    
        r0 = new defpackage.a31(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f2, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f6, code lost:
    
        if (r20 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f8, code lost:
    
        r0 = new defpackage.a31(r6, r11, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0200, code lost:
    
        r0 = new defpackage.a31(r6, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0208, code lost:
    
        if (r12 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020b, code lost:
    
        if (r12 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020d, code lost:
    
        r17 = (int[]) r0.g;
        r18 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021b, code lost:
    
        if (r4 == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x021d, code lost:
    
        if (r4 == 2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x021f, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0228, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022b, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x022e, code lost:
    
        r12 = new android.graphics.LinearGradient(r26, r27, r15, r16, r17, r18, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0232, code lost:
    
        r12 = new android.graphics.SweepGradient(r10, r9, (int[]) r0.g, (float[]) r0.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0244, code lost:
    
        if (r23 <= 0.0f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0246, code lost:
    
        r1 = (int[]) r0.g;
        r22 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0253, code lost:
    
        if (r4 == 1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0256, code lost:
    
        if (r4 == 2) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0258, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0265, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0268, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026b, code lost:
    
        r12 = new android.graphics.RadialGradient(r10, r9, r23, r1, r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0276, code lost:
    
        return new defpackage.s4(0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027e, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.s4 d(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4.d(android.content.res.Resources, int, android.content.res.Resources$Theme):s4");
    }

    public void a(long j) {
        if (b(j)) {
            return;
        }
        int i = this.a;
        long[] jArrCopyOf = (long[]) this.b;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.b = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public boolean b(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public t4 c() {
        o4 o4Var = (o4) this.b;
        t4 t4Var = new t4(o4Var.a, this.a);
        View view = o4Var.e;
        r4 r4Var = t4Var.l;
        if (view != null) {
            r4Var.n = view;
        } else {
            CharSequence charSequence = o4Var.d;
            if (charSequence != null) {
                r4Var.d = charSequence;
                TextView textView = r4Var.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = o4Var.c;
            if (drawable != null) {
                r4Var.j = drawable;
                ImageView imageView = r4Var.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    r4Var.k.setImageDrawable(drawable);
                }
            }
        }
        if (o4Var.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) o4Var.b.inflate(r4Var.r, (ViewGroup) null);
            int i = o4Var.i ? r4Var.s : r4Var.t;
            ListAdapter q4Var = o4Var.g;
            if (q4Var == null) {
                q4Var = new q4(o4Var.a, i, R.id.text1, null);
            }
            r4Var.o = q4Var;
            r4Var.p = o4Var.j;
            if (o4Var.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new n4(o4Var, r4Var));
            }
            if (o4Var.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            r4Var.e = alertController$RecycleListView;
        }
        t4Var.setCancelable(true);
        t4Var.setCanceledOnTouchOutside(true);
        t4Var.setOnCancelListener(null);
        t4Var.setOnDismissListener(null);
        pn1 pn1Var = o4Var.f;
        if (pn1Var != null) {
            t4Var.setOnKeyListener(pn1Var);
        }
        return t4Var;
    }

    public void e(int i, yj yjVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            yj yjVar2 = ((yj[]) this.b)[i2];
            yjVar2.getClass();
            if (s51.s(0L, yjVar.g - yjVar2.g) <= 0) {
                break;
            }
            yjVar2.f = i;
            ((yj[]) this.b)[i] = yjVar2;
            i = i2;
        }
        ((yj[]) this.b)[i] = yjVar;
        yjVar.f = i;
    }

    public void f(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.b;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public void g(yj yjVar) {
        yj yjVar2;
        int i = yjVar.f;
        if (i == -1) {
            c.p("Failed requirement.");
            return;
        }
        int i2 = this.a;
        yj yjVar3 = ((yj[]) this.b)[i2];
        yjVar3.getClass();
        yjVar.f = -1;
        ((yj[]) this.b)[i2] = null;
        this.a = i2 - 1;
        if (yjVar == yjVar3) {
            return;
        }
        int iS = s51.s(0L, yjVar3.g - yjVar.g);
        if (iS == 0) {
            ((yj[]) this.b)[i] = yjVar3;
            yjVar3.f = i;
            return;
        }
        if (iS >= 0) {
            e(i, yjVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                yjVar2 = ((yj[]) this.b)[i3];
                yjVar2.getClass();
            } else {
                yjVar2 = ((yj[]) this.b)[i3];
                yjVar2.getClass();
                yj yjVar4 = ((yj[]) this.b)[i4];
                yjVar4.getClass();
                if (s51.s(0L, yjVar4.g - yjVar2.g) >= 0) {
                    yjVar2 = yjVar4;
                }
            }
            if (s51.s(0L, yjVar2.g - yjVar3.g) <= 0) {
                break;
            }
            int i6 = yjVar2.f;
            yjVar2.f = i;
            ((yj[]) this.b)[i] = yjVar2;
            i = i6;
        }
        ((yj[]) this.b)[i] = yjVar3;
        yjVar3.f = i;
    }

    public /* synthetic */ s4(int i, Object obj) {
        this.b = obj;
        this.a = i;
    }

    public s4(int i, ArrayList arrayList) {
        switch (i) {
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                this.b = arrayList;
                break;
            default:
                this.a = 0;
                this.b = arrayList;
                break;
        }
    }
}
