package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qk implements v32 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public qk(af afVar, ua0 ua0Var, zp0 zp0Var, gh3 gh3Var, List list, boolean z) {
        int i;
        String str;
        int i2;
        List list2;
        af afVar2 = afVar;
        gh3 gh3Var2 = gh3Var;
        this.a = afVar2;
        this.b = list;
        final int i3 = 0;
        cs0 cs0Var = new cs0(this) { // from class: cr1
            public final /* synthetic */ qk g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                qk qkVar = this.g;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) qkVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((u32) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fA2 = ((u32) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        u32 u32Var = (u32) obj;
                        return Float.valueOf(u32Var != null ? u32Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) qkVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((u32) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((u32) obj5).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        u32 u32Var2 = (u32) obj;
                        return Float.valueOf(u32Var2 != null ? u32Var2.a.i.c() : 0.0f);
                }
            }
        };
        pe1 pe1Var = pe1.f;
        this.c = ur.J(pe1Var, cs0Var);
        final int i4 = 1;
        this.d = ur.J(pe1Var, new cs0(this) { // from class: cr1
            public final /* synthetic */ qk g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                int i42 = i4;
                Object obj = null;
                int i5 = 1;
                qk qkVar = this.g;
                switch (i42) {
                    case 0:
                        ArrayList arrayList = (ArrayList) qkVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((u32) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fA2 = ((u32) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        u32 u32Var = (u32) obj;
                        return Float.valueOf(u32Var != null ? u32Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) qkVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((u32) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((u32) obj5).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        u32 u32Var2 = (u32) obj;
                        return Float.valueOf(u32Var2 != null ? u32Var2.a.i.c() : 0.0f);
                }
            }
        });
        x32 x32Var = gh3Var2.b;
        af afVar3 = bf.a;
        ArrayList arrayList = afVar2.i;
        String str2 = afVar2.g;
        ni0 ni0Var = ni0.f;
        List listG0 = arrayList != null ? qx.G0(arrayList, new up0(7)) : ni0Var;
        ArrayList arrayList2 = new ArrayList();
        mj mjVar = new mj();
        int size = listG0.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            ze zeVar = (ze) listG0.get(i5);
            ze zeVarA = ze.a(zeVar, x32Var.a((x32) zeVar.a), i3, 14);
            Object obj = zeVarA.a;
            int i7 = zeVarA.c;
            int i8 = zeVarA.b;
            while (i6 < i8 && !mjVar.isEmpty()) {
                ze zeVar2 = (ze) mjVar.last();
                List list3 = listG0;
                int i9 = zeVar2.c;
                ni0 ni0Var2 = ni0Var;
                Object obj2 = zeVar2.a;
                if (i8 < i9) {
                    arrayList2.add(new ze(i6, i8, obj2));
                    i6 = i8;
                    listG0 = list3;
                    ni0Var = ni0Var2;
                } else {
                    int i10 = size;
                    arrayList2.add(new ze(i6, i9, obj2));
                    i6 = zeVar2.c;
                    while (!mjVar.isEmpty() && i6 == ((ze) mjVar.last()).c) {
                        mjVar.removeLast();
                    }
                    listG0 = list3;
                    ni0Var = ni0Var2;
                    size = i10;
                }
            }
            List list4 = listG0;
            ni0 ni0Var3 = ni0Var;
            int i11 = size;
            if (i6 < i8) {
                arrayList2.add(new ze(i6, i8, x32Var));
                i6 = i8;
            }
            ze zeVar3 = (ze) mjVar.h();
            if (zeVar3 != null) {
                int i12 = zeVar3.c;
                Object obj3 = zeVar3.a;
                int i13 = zeVar3.b;
                if (i13 == i8 && i12 == i7) {
                    mjVar.removeLast();
                    mjVar.addLast(new ze(i8, i7, ((x32) obj3).a((x32) obj)));
                } else if (i13 == i12) {
                    arrayList2.add(new ze(i13, i12, obj3));
                    mjVar.removeLast();
                    mjVar.addLast(new ze(i8, i7, obj));
                } else {
                    if (i12 < i7) {
                        throw new IllegalArgumentException();
                    }
                    mjVar.addLast(new ze(i8, i7, ((x32) obj3).a((x32) obj)));
                }
            } else {
                mjVar.addLast(new ze(i8, i7, obj));
            }
            i5++;
            listG0 = list4;
            ni0Var = ni0Var3;
            size = i11;
            i3 = 0;
        }
        ni0 ni0Var4 = ni0Var;
        while (i6 <= str2.length() && !mjVar.isEmpty()) {
            ze zeVar4 = (ze) mjVar.last();
            Object obj4 = zeVar4.a;
            int i14 = zeVar4.c;
            arrayList2.add(new ze(i6, i14, obj4));
            while (!mjVar.isEmpty() && i14 == ((ze) mjVar.last()).c) {
                mjVar.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str2.length()) {
            arrayList2.add(new ze(i6, str2.length(), x32Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new ze(0, 0, x32Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            ze zeVar5 = (ze) arrayList2.get(i15);
            int i16 = zeVar5.b;
            int i17 = zeVar5.c;
            String strSubstring = i16 != i17 ? str2.substring(i16, i17) : "";
            List listA = bf.a(afVar2, i16, i17, new u0(13));
            af afVar4 = new af(strSubstring, listA == null ? ni0Var4 : listA);
            x32 x32Var2 = (x32) zeVar5.a;
            if (x32Var2.b == 0) {
                str = str2;
                i2 = size2;
                x32Var2 = new x32(x32Var2.a, x32Var.b, x32Var2.c, x32Var2.d, x32Var2.e, x32Var2.f, x32Var2.g, x32Var2.h, x32Var2.i);
            } else {
                str = str2;
                i2 = size2;
            }
            gh3 gh3Var3 = new gh3(gh3Var2.a, x32Var.a(x32Var2));
            List list5 = afVar4.f;
            List list6 = list5 == null ? ni0Var4 : list5;
            List list7 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i18 = 0;
            while (i18 < size3) {
                ze zeVar6 = (ze) list7.get(i18);
                int i19 = zeVar6.b;
                x32 x32Var3 = x32Var;
                int i20 = zeVar6.c;
                if (bf.b(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        n21.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList4.add(new ze(i19 - i16, i20 - i16, zeVar6.a));
                } else {
                    list2 = list7;
                }
                i18++;
                list7 = list2;
                x32Var = x32Var3;
            }
            arrayList3.add(new u32(new ca(strSubstring, gh3Var3, list6, arrayList4, zp0Var, ua0Var, z), i16, i17));
            i15++;
            afVar2 = afVar;
            gh3Var2 = gh3Var;
            str2 = str;
            size2 = i2;
        }
        this.e = arrayList3;
    }

    @Override // defpackage.v32
    public float a() {
        return ((Number) ((lc1) this.c).getValue()).floatValue();
    }

    @Override // defpackage.v32
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((u32) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v32
    public float c() {
        return ((Number) ((lc1) this.d).getValue()).floatValue();
    }

    public mr d(pk pkVar, cs0 cs0Var) {
        int i;
        int i2;
        int i3;
        ok2 ok2Var = new ok2();
        ok2Var.f = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                pkVar.b(th);
                return f5.z;
            }
            bk bkVar = (bk) this.c;
            do {
                i = bkVar.get();
                i2 = i + 1;
            } while (!bkVar.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            ok2Var.f = (i2 >>> 27) & 15;
            ((as1) this.d).b(pkVar);
            if (z && cs0Var != null) {
                try {
                    cs0Var.a();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                as1 as1Var = (as1) this.d;
                                Object[] objArr = as1Var.a;
                                int i5 = as1Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((pk) objArr[i6]).b(th2);
                                }
                                ((as1) this.d).e();
                                bk bkVar2 = (bk) this.c;
                                do {
                                    i3 = bkVar2.get();
                                } while (!bkVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new a31(new ok(pkVar, this, ok2Var, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi e(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.l(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk.e(int):java.text.Bidi");
    }

    public jd3 f() {
        ArrayList arrayList = (ArrayList) this.e;
        Intent intent = (Intent) this.c;
        iu1 iu1Var = (iu1) this.d;
        fu1 fu1Var = null;
        if (iu1Var == null) {
            c.q("You must call setGraph() before constructing the deep link");
            return null;
        }
        if (arrayList.isEmpty()) {
            c.q("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            du1 du1Var = (du1) obj;
            int i2 = du1Var.a;
            Bundle bundle = du1Var.b;
            fu1 fu1VarG = g(i2);
            if (fu1VarG == null) {
                int i3 = fu1.j;
                throw new IllegalArgumentException("Navigation destination " + pq.w((qh0) this.b, i2) + " cannot be found in the navigation graph " + iu1Var);
            }
            for (int i4 : fu1VarG.b(fu1Var)) {
                arrayList2.add(Integer.valueOf(i4));
                arrayList3.add(bundle);
            }
            fu1Var = fu1VarG;
        }
        intent.putExtra("android-support-nav:controller:deepLinkIds", qx.M0(arrayList2));
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        jd3 jd3Var = new jd3((Context) this.a);
        Intent intent2 = new Intent(intent);
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = intent2.resolveActivity(jd3Var.g.getPackageManager());
        }
        if (component != null) {
            jd3Var.a(component);
        }
        ArrayList arrayList4 = jd3Var.f;
        arrayList4.add(intent2);
        int size2 = arrayList4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Intent intent3 = (Intent) arrayList4.get(i5);
            if (intent3 != null) {
                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return jd3Var;
    }

    public fu1 g(int i) {
        mj mjVar = new mj();
        iu1 iu1Var = (iu1) this.d;
        iu1Var.getClass();
        mjVar.addLast(iu1Var);
        while (!mjVar.isEmpty()) {
            fu1 fu1Var = (fu1) mjVar.removeFirst();
            if (fu1Var.g.a == i) {
                return fu1Var;
            }
            if (fu1Var instanceof iu1) {
                Iterator it = ((iu1) fu1Var).iterator();
                while (true) {
                    ku1 ku1Var = (ku1) it;
                    if (ku1Var.hasNext()) {
                        mjVar.addLast((fu1) ku1Var.next());
                    }
                }
            }
        }
        return null;
    }

    public void h(ns0 ns0Var) {
        int i;
        synchronized (this.a) {
            try {
                as1 as1Var = (as1) this.d;
                this.d = (as1) this.e;
                this.e = as1Var;
                bk bkVar = (bk) this.c;
                do {
                    i = bkVar.get();
                } while (!bkVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = as1Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ns0Var.h(as1Var.g(i3));
                }
                as1Var.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float i(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float j(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return i(i, z);
        }
        int iF = ur.F(layout, i, z2);
        int lineStart = layout.getLineStart(iF);
        int lineEnd = layout.getLineEnd(iF);
        if (i != lineStart && i != lineEnd) {
            return i(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return i(i, z);
        }
        int iK = k(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(l(iK))) == -1;
        int iM = m(lineEnd, lineStart);
        int iL = l(iK);
        int i4 = lineStart - iL;
        int i5 = iM - iL;
        Bidi bidiE = e(iK);
        Bidi bidiCreateLineBidi = bidiE != null ? bidiE.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iF) : layout.getLineRight(iF);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        db1[] db1VarArr = new db1[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            db1VarArr[i6] = new db1(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, db1VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (db1VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == db1VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iF) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(db1VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(db1VarArr[i3 + 1].a) : layout.getLineRight(iF);
        }
        int iM2 = i > iM ? m(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (db1VarArr[i9].b == iM2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == db1VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iF) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(db1VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(db1VarArr[i2 + 1].b) : layout.getLineRight(iF);
    }

    public int k(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        int iO = vr.o(arrayList, Integer.valueOf(i));
        int i2 = iO < 0 ? -(iO + 1) : iO + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int l(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public int m(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((s51.r(cCharAt, 8192) < 0 || s51.r(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void n(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        i93 i93Var = (i93) ((LinkedHashMap) this.c).get(str);
        if (i93Var != null) {
            i93Var.i(obj);
        }
        i93 i93Var2 = (i93) ((LinkedHashMap) this.d).get(str);
        if (i93Var2 != null) {
            i93Var2.i(obj);
        }
    }

    public void o() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((du1) obj).a;
            if (g(i2) == null) {
                int i3 = fu1.j;
                throw new IllegalArgumentException("Navigation destination " + pq.w((qh0) this.b, i2) + " cannot be found in the navigation graph " + ((iu1) this.d));
            }
        }
    }

    public qk() {
        this.a = new Object();
        this.c = new bk(0);
        this.d = new as1();
        this.e = new as1();
    }

    public qk(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iN0 = y93.n0(((Layout) this.a).getText(), '\n', length, 4);
            length = iN0 < 0 ? ((Layout) this.a).getText().length() : iN0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.a).getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.b).size()];
        ((ArrayList) this.b).size();
    }

    public qk(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new hr0(4, this);
    }

    public qk(nu1 nu1Var) {
        Intent launchIntentForPackage;
        nu1Var.getClass();
        Context context = nu1Var.a;
        context.getClass();
        this.a = context;
        this.b = new qh0(context, 1);
        zl0 zl0Var = new zl0(pv2.J(pv2.H(context, new fi1(19)), new fi1(20)));
        Activity activity = (Activity) (!zl0Var.hasNext() ? null : zl0Var.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.c = launchIntentForPackage;
        this.e = new ArrayList();
        this.d = nu1Var.b.g();
    }

    public qk(id3 id3Var) {
        id3Var.getClass();
        this.a = id3Var;
        this.d = uz0.a;
        this.e = hn0.a;
    }
}
