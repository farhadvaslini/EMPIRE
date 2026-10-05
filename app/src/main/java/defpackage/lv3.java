package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class lv3 {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = y93.w0(y93.v0(my1.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(i01 i01Var, i01 i01Var2) {
        i01Var.getClass();
        i01Var2.getClass();
        return s51.n(i01Var.d, i01Var2.d) && i01Var.e == i01Var2.e && s51.n(i01Var.a, i01Var2.a);
    }

    public static final int b(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        if (j < 0) {
            qn1.e("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            c.g("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        c.g("timeout".concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!s51.n(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(ln2 ln2Var) {
        String strA = ln2Var.k.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = jv3.a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(rp rpVar, Charset charset) {
        rpVar.getClass();
        charset.getClass();
        int iS = rpVar.s(jv3.b);
        if (iS == -1) {
            return charset;
        }
        if (iS == 0) {
            return ys.a;
        }
        if (iS == 1) {
            return ys.b;
        }
        if (iS == 2) {
            Charset charset2 = ys.a;
            Charset charset3 = ys.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            ys.e = charsetForName;
            return charsetForName;
        }
        if (iS == 3) {
            return ys.c;
        }
        if (iS != 4) {
            throw new AssertionError();
        }
        Charset charset4 = ys.a;
        Charset charset5 = ys.f;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        ys.f = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(z73 z73Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = z73Var.a().e() ? z73Var.a().c() - jNanoTime : Long.MAX_VALUE;
        z73Var.a().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            hp hpVar = new hp();
            while (z73Var.d(8192L, hpVar) != -1) {
                hpVar.skip(hpVar.g);
            }
            if (jC == Long.MAX_VALUE) {
                z73Var.a().a();
                return true;
            }
            z73Var.a().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                z73Var.a().a();
                return false;
            }
            z73Var.a().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                z73Var.a().a();
            } else {
                z73Var.a().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ux0 h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sx0 sx0Var = (sx0) it.next();
            kq kqVar = sx0Var.a;
            kq kqVar2 = sx0Var.b;
            String strL = kqVar.l();
            String strL2 = kqVar2.l();
            arrayList.add(strL);
            arrayList.add(y93.G0(strL2).toString());
        }
        return new ux0((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(i01 i01Var, boolean z) {
        i01Var.getClass();
        int i = i01Var.e;
        String str = i01Var.d;
        if (y93.h0(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = i01Var.a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return ni0.f;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return ni0.f;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List listAsList = Arrays.asList(objArr2);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
