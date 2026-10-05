package defpackage;

import android.R;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class a31 implements ef0, bx, d3, yh0, q73, ua3, mr, p02 {
    public static final int[] i = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public a31(int i2) {
        this.f = i2;
        switch (i2) {
            case 20:
                this.g = new is1();
                this.h = new is1();
                break;
            case 21:
                this.g = new qs1(new tb1[16]);
                break;
            case 29:
                this.g = new LinkedHashMap();
                this.h = new LinkedHashMap();
                break;
            default:
                this.g = new np3(true);
                this.h = new np3(true);
                break;
        }
    }

    public static ArrayList C(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("servers");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("host");
                if (jSONObjectOptJSONObject.has("port")) {
                    int iOptInt = jSONObjectOptJSONObject.optInt("port", -1);
                    strOptString.getClass();
                    xv2 xv2VarX = d32.x(strOptString, String.valueOf(iOptInt));
                    if (xv2VarX instanceof wv2) {
                        sv2 sv2Var = ((wv2) xv2VarX).a;
                        String lowerCase = sv2Var.c.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (hashSet.add(lowerCase)) {
                            arrayList.add(sv2Var);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void p(tb1 tb1Var) {
        if (tb1Var.V > 0) {
            if (tb1Var.M.d == pb1.j && !tb1Var.p() && !tb1Var.q() && !tb1Var.W && tb1Var.I()) {
                aq1 aq1Var = tb1Var.L.f;
                if ((aq1Var.i & 256) != 0) {
                    while (aq1Var != null) {
                        if ((aq1Var.h & 256) != 0) {
                            ?? J = aq1Var;
                            ?? qs1Var = 0;
                            while (J != 0) {
                                if (J instanceof dw0) {
                                    dw0 dw0Var = (dw0) J;
                                    dw0Var.O(vr.U(dw0Var, 256));
                                } else if ((J.h & 256) != 0 && (J instanceof ja0)) {
                                    aq1 aq1Var2 = ((ja0) J).u;
                                    int i2 = 0;
                                    J = J;
                                    qs1Var = qs1Var;
                                    while (aq1Var2 != null) {
                                        if ((aq1Var2.h & 256) != 0) {
                                            i2++;
                                            qs1Var = qs1Var;
                                            if (i2 == 1) {
                                                J = aq1Var2;
                                            } else {
                                                if (qs1Var == 0) {
                                                    qs1Var = new qs1(new aq1[16]);
                                                }
                                                if (J != 0) {
                                                    qs1Var.b(J);
                                                    J = 0;
                                                }
                                                qs1Var.b(aq1Var2);
                                            }
                                        }
                                        aq1Var2 = aq1Var2.k;
                                        J = J;
                                        qs1Var = qs1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = vr.j(qs1Var);
                            }
                        }
                        if ((aq1Var.i & 256) == 0) {
                            break;
                        } else {
                            aq1Var = aq1Var.k;
                        }
                    }
                }
            }
            tb1Var.U = false;
            qs1 qs1VarZ = tb1Var.z();
            Object[] objArr = qs1VarZ.f;
            int i3 = qs1VarZ.h;
            for (int i4 = 0; i4 < i3; i4++) {
                p((tb1) objArr[i4]);
            }
        }
    }

    public uh0 A(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        yl1 yl1Var = (yl1) this.h;
        if (inputConnection == null) {
            yl1Var.getClass();
            inputConnection2 = null;
        } else {
            a31 a31Var = (a31) yl1Var.g;
            a31Var.getClass();
            if (!(inputConnection instanceof uh0)) {
                inputConnection = new uh0(editorInfo, inputConnection, (EditText) a31Var.g);
            }
            inputConnection2 = inputConnection;
        }
        return (uh0) inputConnection2;
    }

    public void B(mq0 mq0Var) {
        ol2 ol2Var = (ol2) this.h;
        k71 k71Var = (k71) this.g;
        int i2 = mq0Var.b;
        if (i2 != 0) {
            ol2Var.execute(new ar(k71Var, i2));
        } else {
            ol2Var.execute(new x2(k71Var, false, mq0Var.a, 4));
        }
    }

    public void D(boolean z) {
        gi0 gi0Var = (gi0) ((a31) ((yl1) this.h).g).h;
        if (gi0Var.h != z) {
            if (gi0Var.g != null) {
                nh0 nh0VarA = nh0.a();
                fi0 fi0Var = gi0Var.g;
                nh0VarA.getClass();
                jo3.h(fi0Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = nh0VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    nh0VarA.b.remove(fi0Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gi0Var.h = z;
            if (z) {
                gi0.a(gi0Var.f, nh0.a().c());
            }
        }
    }

    public Drawable E(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.h) == null) {
                this.h = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            int id = layerDrawable.getId(i2);
            drawableArr[i2] = E(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i3 = 0; i3 < numberOfLayers; i3++) {
            layerDrawable2.setId(i3, layerDrawable.getId(i3));
            layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
            layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
            layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
            layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
            layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
            layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
            layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
            layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
            layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
        }
        return layerDrawable2;
    }

    @Override // defpackage.yh0
    public Object a() {
        return (im3) this.g;
    }

    @Override // defpackage.ua3
    public void b(ta3 ta3Var) {
        wr1 wr1Var = (wr1) this.h;
        wr1Var.a();
        bs1 bs1Var = (bs1) ta3Var.g;
        Object[] objArr = bs1Var.b;
        long[] jArr = bs1Var.c;
        int i2 = bs1Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            Object obj = objArr[i2];
            Object objB = ((zc1) this.g).b(obj);
            int iD = wr1Var.d(objB);
            int i4 = iD >= 0 ? wr1Var.c[iD] : 0;
            if (i4 == 7) {
                ta3Var.remove(obj);
            } else {
                wr1Var.g(i4 + 1, objB);
            }
            i2 = i3;
        }
    }

    @Override // defpackage.q73
    public z73 c() {
        return (xj0) this.h;
    }

    @Override // defpackage.mr
    public void cancel() {
        if (((bk) this.h).compareAndSet(1, 1)) {
            return;
        }
        ((ok) this.g).a();
    }

    @Override // defpackage.d3
    public boolean d(e3 e3Var, Menu menu) {
        return ((d3) this.g).d(e3Var, menu);
    }

    @Override // defpackage.d3
    public boolean e(e3 e3Var, MenuItem menuItem) {
        return ((d3) this.g).e(e3Var, menuItem);
    }

    @Override // defpackage.ef0
    public Object f(n9 n9Var, re0 re0Var) {
        Object objA = ((d6) this.h).a(ts1.g, new b6(this, n9Var, (p40) null), re0Var);
        return objA == y50.f ? objA : dm3.a;
    }

    @Override // defpackage.p02
    public List g(Integer num) {
        List listG = ((p02) this.g).g(null);
        m53 m53Var = (m53) this.h;
        int i2 = m53Var.v;
        return i2 < 0 ? listG : qx.D0(pq.l(m53Var, num, i2, Integer.valueOf(m53Var.E(m53Var.b, i2))), listG);
    }

    @Override // defpackage.d3
    public boolean h(e3 e3Var, Menu menu) {
        ViewGroup viewGroup = ((vg) this.h).F;
        WeakHashMap weakHashMap = mq3.a;
        viewGroup.requestApplyInsets();
        return ((d3) this.g).h(e3Var, menu);
    }

    @Override // defpackage.d3
    public void i(e3 e3Var) {
        ((d3) this.g).i(e3Var);
        vg vgVar = (vg) this.h;
        if (vgVar.A != null) {
            vgVar.q.getDecorView().removeCallbacks(vgVar.B);
        }
        if (vgVar.z != null) {
            er3 er3Var = vgVar.C;
            if (er3Var != null) {
                er3Var.b();
            }
            er3 er3VarA = mq3.a(vgVar.z);
            er3VarA.a(0.0f);
            vgVar.C = er3VarA;
            er3VarA.d(new mg(2, this));
        }
        vgVar.y = null;
        ViewGroup viewGroup = vgVar.F;
        WeakHashMap weakHashMap = mq3.a;
        viewGroup.requestApplyInsets();
        vgVar.J();
    }

    @Override // defpackage.yh0
    public boolean j(CharSequence charSequence, int i2, int i3, jl3 jl3Var) {
        if ((jl3Var.c & 4) > 0) {
            return true;
        }
        if (((im3) this.g) == null) {
            this.g = new im3(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((zj) this.h).getClass();
        ((im3) this.g).setSpan(new kl3(jl3Var), i2, i3, 33);
        return true;
    }

    @Override // defpackage.ua3
    public boolean k(Object obj, Object obj2) {
        zc1 zc1Var = (zc1) this.g;
        return s51.n(zc1Var.b(obj), zc1Var.b(obj2));
    }

    @Override // defpackage.p02
    public boolean l() {
        return ((p02) this.g).l();
    }

    @Override // defpackage.q73
    public g43 m() {
        return (wj0) this.g;
    }

    public bg3 n(List list) {
        eh0 eh0Var;
        Exception e;
        eh0 eh0Var2;
        try {
            int size = list.size();
            int i2 = 0;
            eh0Var = null;
            while (i2 < size) {
                try {
                    eh0Var2 = (eh0) list.get(i2);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    eh0Var2.a((fh0) this.h);
                    i2++;
                    eh0Var = eh0Var2;
                } catch (Exception e3) {
                    e = e3;
                    eh0Var = eh0Var2;
                    StringBuilder sb = new StringBuilder();
                    int iC = ((fh0) this.h).a.c();
                    yg3 yg3VarC = ((fh0) this.h).c();
                    fh0 fh0Var = (fh0) this.h;
                    sb.append("Error while applying EditCommand batch to buffer (length=" + iC + ", composition=" + yg3VarC + ", selection=" + yg3.h(d32.f(fh0Var.b, fh0Var.c)) + "):");
                    sb.append('\n');
                    qx.w0(list, sb, "\n", new s(eh0Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            fh0 fh0Var2 = (fh0) this.h;
            fh0Var2.getClass();
            af afVar = new af(fh0Var2.a.toString());
            fh0 fh0Var3 = (fh0) this.h;
            long jF = d32.f(fh0Var3.b, fh0Var3.c);
            yg3 yg3Var = yg3.g(((bg3) this.g).b) ? null : new yg3(jF);
            bg3 bg3Var = new bg3(afVar, yg3Var != null ? yg3Var.a : d32.f(yg3.e(jF), yg3.f(jF)), ((fh0) this.h).c());
            this.g = bg3Var;
            return bg3Var;
        } catch (Exception e4) {
            eh0Var = null;
            e = e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.g
            qs1 r0 = (defpackage.qs1) r0
            up0 r1 = defpackage.up0.d
            java.lang.Object[] r2 = r0.f
            int r3 = r0.h
            r4 = 0
            java.util.Arrays.sort(r2, r4, r3, r1)
            int r1 = r0.h
            java.lang.Object r2 = r6.h
            tb1[] r2 = (defpackage.tb1[]) r2
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            tb1[] r2 = new defpackage.tb1[r2]
        L21:
            r3 = 0
            r6.h = r3
        L24:
            if (r4 >= r1) goto L2f
            java.lang.Object[] r5 = r0.f
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L24
        L2f:
            r0.g()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L48
            r0 = r2[r1]
            r0.getClass()
            boolean r4 = r0.U
            if (r4 == 0) goto L43
            p(r0)
        L43:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L34
        L48:
            r6.h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a31.o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.am2
            if (r0 == 0) goto L13
            r0 = r6
            am2 r0 = (defpackage.am2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            am2 r0 = new am2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.j
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.String r5 = r0.i
            defpackage.y02.Q(r6)
            rn2 r6 = (defpackage.rn2) r6
            java.lang.Object r6 = r6.f
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L32:
            defpackage.y02.Q(r6)
            gm2 r6 = defpackage.gm2.a
            r0.i = r5
            r0.l = r2
            java.lang.Object r6 = r6.a(r5, r0)
            y50 r0 = defpackage.y50.f
            if (r6 != r0) goto L44
            return r0
        L44:
            boolean r0 = r6 instanceof defpackage.qn2
            if (r0 != 0) goto L7f
            cm2 r6 = (defpackage.cm2) r6     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r6.b     // Catch: java.lang.Throwable -> L78
            java.lang.Object r4 = r4.h     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch: java.lang.Throwable -> L78
            r4.getClass()     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L78
            r4.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "https://sa-mp.th1nk.top/data/sources.json"
            boolean r1 = defpackage.s51.n(r5, r1)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L68
            java.lang.String r5 = "official_json"
            r4.putString(r5, r0)     // Catch: java.lang.Throwable -> L78
            goto L72
        L68:
            java.lang.String r1 = "custom_url"
            r4.putString(r1, r5)     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = "custom_json"
            r4.putString(r5, r0)     // Catch: java.lang.Throwable -> L78
        L72:
            r4.apply()     // Catch: java.lang.Throwable -> L78
            hm2 r4 = r6.a     // Catch: java.lang.Throwable -> L78
            return r4
        L78:
            r4 = move-exception
            qn2 r5 = new qn2
            r5.<init>(r4)
            return r5
        L7f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a31.q(java.lang.String, q40):java.lang.Object");
    }

    public File r() {
        Context context = (Context) this.g;
        File externalFilesDir = context.getExternalFilesDir(null);
        return externalFilesDir == null ? new File(context.getFilesDir(), "files") : externalFilesDir;
    }

    public ClipboardManager s() {
        ClipboardManager clipboardManager = (ClipboardManager) this.h;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.g).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.h = clipboardManager2;
        return clipboardManager2;
    }

    public InputMethodManager t() {
        return (InputMethodManager) ((lc1) this.h).getValue();
    }

    public KeyListener u(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((a31) ((yl1) this.h).g).getClass();
        if (keyListener instanceof xh0) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new xh0(keyListener);
    }

    public cn1 v() {
        return (cn1) ((d42) this.h).getValue();
    }

    public AutofillManager w() {
        AutofillManager autofillManager = (AutofillManager) this.h;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.g).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.h = autofillManager2;
            return autofillManager2;
        }
        c.q("Could not locate AutofillManager from context");
        return null;
    }

    public void x(AttributeSet attributeSet, int i2) {
        boolean z = true;
        switch (this.f) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.g;
                pi piVarH = pi.H(absSeekBar.getContext(), attributeSet, i, i2);
                Drawable drawableQ = piVarH.q(0);
                if (drawableQ != null) {
                    if (drawableQ instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableQ;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable drawableE = E(animationDrawable.getFrame(i3), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableQ = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableQ);
                }
                Drawable drawableQ2 = piVarH.q(1);
                if (drawableQ2 != null) {
                    absSeekBar.setProgressDrawable(E(drawableQ2, false));
                }
                piVarH.J();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.g).getContext().obtainStyledAttributes(attributeSet, pf2.i, i2, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    D(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public AutofillId y(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return gf.d(m6.e(this.h), ((View) this.g).getAutofillId(), j);
        }
        return null;
    }

    public void z(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            w().notifyViewVisibilityChanged(view, i2, z);
        }
    }

    public /* synthetic */ a31(int i2, Object obj, Object obj2) {
        this.f = i2;
        this.h = obj;
        this.g = obj2;
    }

    public /* synthetic */ a31(int i2, boolean z) {
        this.f = i2;
    }

    public /* synthetic */ a31(Object obj, boolean z, Object obj2, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    public a31(Application application, int i2) {
        this.f = i2;
        application.getClass();
        switch (i2) {
            case 28:
                this.g = application;
                this.h = application.getApplicationContext().getSharedPreferences("resource_source_cache", 0);
                break;
            default:
                this.g = application.getApplicationContext().getSharedPreferences("recommended_servers", 0);
                ly1 ly1Var = new ly1();
                ly1Var.a(10L);
                ly1Var.b(10L);
                this.h = new my1(ly1Var);
                break;
        }
    }

    public /* synthetic */ a31(int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    public a31(tb1 tb1Var, cn1 cn1Var) {
        this.f = 16;
        this.g = tb1Var;
        this.h = b32.w(cn1Var);
    }

    public a31(i32 i32Var, w91 w91Var, c32 c32Var) {
        this.f = 24;
        this.g = i32Var;
        this.h = w91Var;
    }

    public a31(ok okVar) {
        this.f = 22;
        this.g = okVar;
        this.h = new bk(0);
    }

    public a31(EditText editText, int i2) {
        this.f = i2;
        switch (i2) {
            case vr.i /* 12 */:
                this.g = editText;
                gi0 gi0Var = new gi0(editText);
                this.h = gi0Var;
                editText.addTextChangedListener(gi0Var);
                if (sh0.b == null) {
                    synchronized (sh0.a) {
                        try {
                            if (sh0.b == null) {
                                sh0 sh0Var = new sh0();
                                try {
                                    sh0.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, sh0.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                sh0.b = sh0Var;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(sh0.b);
                return;
            default:
                this.g = editText;
                this.h = new yl1(editText);
                return;
        }
    }

    public a31(View view) {
        this.f = 0;
        this.g = view;
        this.h = ur.J(pe1.f, new ja(19, this));
    }

    public a31(zc1 zc1Var) {
        this.f = 17;
        this.g = zc1Var;
        wr1 wr1Var = ay1.a;
        this.h = new wr1();
    }

    public a31(yj0 yj0Var) {
        this.f = 14;
        ak0 ak0Var = (ak0) yj0Var.d;
        this.g = new wj0(yj0Var, ak0Var.e().m());
        this.h = new xj0(yj0Var, ak0Var.e().c(), -1L, true);
    }

    public a31(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 15;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.g)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.h)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public a31(int i2, int i3) {
        this.f = 15;
        this.g = new int[]{i2, i3};
        this.h = new float[]{0.0f, 1.0f};
    }

    public a31(int i2, int i3, int i4) {
        this.f = 15;
        this.g = new int[]{i2, i3, i4};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }

    public a31(d6 d6Var) {
        this.f = 2;
        this.h = d6Var;
        this.g = new c6(0, d6Var);
    }
}
