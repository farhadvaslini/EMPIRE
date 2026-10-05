package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h9 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1 A[LOOP:1: B:27:0x00cf->B:33:0x00f1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h9(defpackage.l41 r13, defpackage.vp r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9.<init>(l41, vp):void");
    }

    public void a(int i, uc1 uc1Var) {
        if (i < 0) {
            p21.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        h51 h51Var = new h51(this.b, i, uc1Var);
        this.b += i;
        ((qs1) this.c).b(h51Var);
    }

    public void b() {
        c30 c30Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            wf0.a(drawable);
        }
        if (drawable == null || (c30Var = (c30) this.d) == null) {
            return;
        }
        yg.d(drawable, c30Var, imageView.getDrawableState());
    }

    public void c(int i) {
        if (this.b + i <= ((byte[]) this.c).length) {
            return;
        }
        c.p("Unexpected end of SA-MP query response");
    }

    public h51 d(int i) {
        if (i < 0 || i >= this.b) {
            p21.e("Index " + i + ", size " + this.b);
        }
        h51 h51Var = (h51) this.d;
        if (h51Var != null) {
            int i2 = h51Var.a;
            if (i < h51Var.b + i2 && i2 <= i) {
                return h51Var;
            }
        }
        qs1 qs1Var = (qs1) this.c;
        h51 h51Var2 = (h51) qs1Var.f[ur.j(i, qs1Var)];
        this.d = h51Var2;
        return h51Var2;
    }

    public int e(Object obj) {
        wr1 wr1Var = (wr1) this.c;
        int iD = wr1Var.d(obj);
        if (iD >= 0) {
            return wr1Var.c[iD];
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i9 = this.b;
        int i10 = i9 + 3;
        this.b = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.c = Arrays.copyOf(jArr, iMax);
            this.d = Arrays.copyOf((long[]) this.d, iMax);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            m21.c("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            m21.c("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = kk2.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public void g(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = pf2.f;
        pi piVarH = pi.H(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) piVarH.g;
        mq3.h(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) piVarH.g, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = rn.C(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                wf0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(piVarH.l(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(wf0.b(typedArray.getInt(3, -1), null));
            }
            piVarH.J();
        } catch (Throwable th) {
            piVarH.J();
            throw th;
        }
    }

    public String h(int i) {
        if (i < 0) {
            c.p("Negative string length");
            return null;
        }
        c(i);
        byte[] bArr = (byte[]) this.c;
        int i2 = this.b;
        byte[] bArrM = uj.M(bArr, i2, i2 + i);
        this.b += i;
        return y93.H0(new String(bArrM, (Charset) this.d), 0);
    }

    public int i() {
        c(2);
        int i = ByteBuffer.wrap((byte[]) this.c, this.b, 2).order(ByteOrder.LITTLE_ENDIAN).getShort() & 65535;
        this.b += 2;
        return i;
    }

    public void j(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = kk2.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.c;
            long[] jArr2 = (long[]) this.d;
            int i7 = this.b;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = kk2.b;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    c3 = c;
                    i6 = i14;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i6 = i6;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((de2) this.c) == de2.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public h9(de2 de2Var, int i, String str) {
        this.a = 8;
        this.c = de2Var;
        this.b = i;
        this.d = str;
    }

    public h9(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = 0;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            c.p("changes cannot be empty");
            throw null;
        }
    }

    public h9(ImageView imageView) {
        this.a = 1;
        this.b = 0;
        this.c = imageView;
    }

    public /* synthetic */ h9(int i) {
        this.a = i;
    }

    public h9() {
        this.a = 3;
        this.c = new qs1(new h51[16]);
    }

    public h9(byte[] bArr, Charset charset) {
        this.a = 6;
        charset.getClass();
        this.c = bArr;
        this.b = 11;
        this.d = charset;
    }

    public h9(oq3 oq3Var) {
        this.a = 2;
        this.c = oq3Var;
    }
}
