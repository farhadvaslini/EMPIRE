package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class nq0 {
    public static final nl1 a = new nl1(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final w33 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new nl2());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new w33(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((hq0) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mq0 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceT;
        nl1 nl1Var = a;
        b32.d("getFontSync");
        try {
            Typeface typeface = (Typeface) nl1Var.a(str);
            if (typeface != null) {
                return new mq0(typeface);
            }
            s4 s4VarA = gq0.a(context, list);
            List list2 = (List) s4VarA.b;
            int i3 = s4VarA.a;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                zq0[] zq0VarArr = (zq0[]) list2.get(0);
                if (zq0VarArr == null || zq0VarArr.length == 0) {
                    i2 = 1;
                } else {
                    int length = zq0VarArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = zq0VarArr[i4].f;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new mq0(i2);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                zq0[] zq0VarArr2 = (zq0[]) list2.get(0);
                t22 t22Var = el3.a;
                b32.d("TypefaceCompat.createFromFontInfo");
                typefaceT = el3.a.t(context, zq0VarArr2, i);
                Trace.endSection();
            } else {
                t22 t22Var2 = el3.a;
                b32.d("TypefaceCompat.createFromFontInfoWithFallback");
                typefaceT = el3.a.u(context, list2, i);
                Trace.endSection();
            }
            if (typefaceT == null) {
                return new mq0(-3);
            }
            nl1Var.b(str, typefaceT);
            return new mq0(typefaceT);
        } catch (PackageManager.NameNotFoundException unused) {
            return new mq0(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }
}
