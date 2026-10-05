package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class fl3 extends t22 {
    public static Class j = null;
    public static Constructor k = null;
    public static Method l = null;
    public static Method m = null;
    public static boolean n = false;
    public final Class c;
    public final Constructor d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final Method i;

    public fl3() throws NoSuchMethodException {
        Method methodX;
        Constructor<?> constructor;
        Method methodW;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodW = W(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodX = X(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodX = null;
            constructor = null;
            methodW = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.c = cls;
        this.d = constructor;
        this.e = methodW;
        this.f = method;
        this.g = method2;
        this.h = method3;
        this.i = methodX;
    }

    public static boolean S(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        V();
        try {
            return ((Boolean) l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void V() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (n) {
            return;
        }
        n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        k = constructor;
        j = cls;
        l = method2;
        m = method;
    }

    public static Method W(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean R(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.e.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface T(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.i.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean U(Object obj) {
        try {
            return ((Boolean) this.g.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method X(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.t22
    public final Typeface s(Context context, pq0 pq0Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        qq0[] qq0VarArr = pq0Var.a;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            V();
            try {
                Object objNewInstance2 = k.newInstance(null);
                for (qq0 qq0Var : qq0VarArr) {
                    File fileX = w22.x(context);
                    if (fileX != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(qq0Var.f);
                                try {
                                    boolean zP = w22.p(fileX, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zP) {
                                        fileX.delete();
                                        return null;
                                    }
                                    if (!S(objNewInstance2, fileX.getPath(), qq0Var.b, qq0Var.c)) {
                                        fileX.delete();
                                        return null;
                                    }
                                    fileX.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileX.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileX.delete();
                            throw th4;
                        }
                    }
                }
                V();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) j, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) m.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            objNewInstance = this.d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = qq0VarArr.length;
            while (true) {
                if (i2 < length) {
                    qq0 qq0Var2 = qq0VarArr[i2];
                    fl3 fl3Var = this;
                    Context context2 = context;
                    if (fl3Var.R(context2, objNewInstance, qq0Var2.a, qq0Var2.e, qq0Var2.b, qq0Var2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(qq0Var2.d))) {
                        i2++;
                        this = fl3Var;
                        context = context2;
                    } else {
                        try {
                            fl3Var.h.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    fl3 fl3Var2 = this;
                    if (fl3Var2.U(objNewInstance)) {
                        return fl3Var2.T(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.t22
    public final Typeface t(Context context, zq0[] zq0VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceT;
        boolean zBooleanValue;
        if (zq0VarArr.length >= 1) {
            Method method = this.e;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (zq0 zq0Var : zq0VarArr) {
                        if (zq0Var.f == 0) {
                            Uri uri = zq0Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, w22.B(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.d.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = zq0VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.h;
                            if (i2 < length) {
                                zq0 zq0Var2 = zq0VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(zq0Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f.invoke(objNewInstance, byteBuffer, Integer.valueOf(zq0Var2.b), null, Integer.valueOf(zq0Var2.c), Integer.valueOf(zq0Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (U(objNewInstance) && (typefaceT = T(objNewInstance)) != null) {
                                return Typeface.create(typefaceT, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    zq0 zq0Var3 = null;
                    for (zq0 zq0Var4 : zq0VarArr) {
                        int iAbs = (Math.abs(zq0Var4.c - i3) * 2) + (zq0Var4.d == z2 ? 0 : 1);
                        if (zq0Var3 == null || i4 > iAbs) {
                            zq0Var3 = zq0Var4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(zq0Var3.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(zq0Var3.c).setItalic(zq0Var3.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.t22
    public final Typeface v(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.d.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!R(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.h.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (U(objNewInstance)) {
                    return T(objNewInstance);
                }
            }
        } else {
            File fileX = w22.x(context);
            try {
                if (fileX != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zP = w22.p(fileX, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zP) {
                                fileX.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileX.getPath());
                            fileX.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                fileX.delete();
                return null;
            } catch (Throwable th4) {
                fileX.delete();
                throw th4;
            }
        }
        return null;
    }
}
