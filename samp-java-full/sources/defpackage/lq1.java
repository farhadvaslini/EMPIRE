package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lq1 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final xk1 e = new xk1();
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public gy1 j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.c.clear();
        this.b.clear();
    }

    public final a31 c(MotionEvent motionEvent, h7 h7Var) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.b.clear();
            sparseBooleanArray.clear();
            this.h = false;
            this.i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || !(motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5)) {
            this.i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(d(h7Var, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            if (motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 1) {
                if (motionEvent.getActionMasked() == 1) {
                    this.h = false;
                    this.i = false;
                    this.j = null;
                }
                e(motionEvent);
                return null;
            }
            this.i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.j = new gy1((((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L));
            } else if (motionEvent.getActionMasked() == 5 && motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 2) {
                this.j = new gy1((((long) Float.floatToRawIntBits((motionEvent.getRawX(1) + motionEvent.getRawX(0)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((motionEvent.getRawY(1) + motionEvent.getRawY(0)) / 2.0f)) & 4294967295L));
            }
            arrayList.add(d(h7Var, motionEvent, this.j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.h = false;
            this.i = false;
            this.j = null;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new a31(arrayList, false, motionEvent, 26);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0182 A[EDGE_INSN: B:84:0x0182->B:62:0x0182 BREAK  A[LOOP:0: B:43:0x00ea->B:61:0x0179], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ib2 d(h7 h7Var, MotionEvent motionEvent, gy1 gy1Var, int i, boolean z) {
        long jValueAt;
        char c;
        long j;
        long jS;
        long j2;
        long jI;
        int toolType;
        int i2;
        int historySize;
        int i3;
        long jFloatToRawIntBits;
        float fFloatValue;
        int i4;
        long j3;
        Float fValueOf;
        int i5;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.b;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j4 = this.a;
            this.a = 1 + j4;
            sparseLongArray.put(pointerId, j4);
            jValueAt = j4;
        }
        float pressure = motionEvent.getPressure(i);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32);
        if (i == 0) {
            if (gy1Var != null) {
                jS = gy1Var.a;
                c = ' ';
                j = 4294967295L;
            } else {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(rawX);
                int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
                c = ' ';
                j = 4294967295L;
                jS = (jFloatToRawIntBits3 << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
            }
            jI = h7Var.I(jS);
        } else {
            c = ' ';
            j = 4294967295L;
            if (Build.VERSION.SDK_INT < 29) {
                jS = h7Var.s(jFloatToRawIntBits2);
                j2 = jFloatToRawIntBits2;
                toolType = motionEvent.getToolType(i);
                if (toolType == 0) {
                    int i6 = 2;
                    if (toolType == 1) {
                        i2 = ((motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.h || this.i)) ? i6 : 1;
                    } else if (toolType != 2) {
                        if (toolType != 3) {
                            i6 = 4;
                            if (toolType != 4) {
                                i2 = 0;
                            }
                        }
                    } else {
                        i2 = 3;
                    }
                }
                ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                char c2 = c;
                i3 = 0;
                while (true) {
                    jFloatToRawIntBits = 0;
                    if (i3 < historySize) {
                        break;
                    }
                    float historicalX = motionEvent.getHistoricalX(i, i3);
                    float historicalY = motionEvent.getHistoricalY(i, i3);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                        i5 = historySize;
                    } else {
                        long jFloatToRawIntBits4 = Float.floatToRawIntBits(historicalX);
                        int iFloatToRawIntBits2 = Float.floatToRawIntBits(historicalY);
                        i5 = historySize;
                        long j5 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits2) & j);
                        long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                        float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                        fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                        float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                        if (Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 3) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3))) & j);
                        }
                        arrayList.add(new hy0(historicalEventTime, j5, fFloatValue2, jFloatToRawIntBits, j5));
                    }
                    i3++;
                    historySize = i5;
                }
                long jFloatToRawIntBits5 = motionEvent.getActionMasked() != 8 ? (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j) : 0L;
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29 && motionEvent.getClassification() == 5) {
                    float axisValue = motionEvent.getAxisValue(52, i);
                    fValueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    }
                }
                float f = fFloatValue;
                if (i4 >= 29 || motionEvent.getClassification() != 3) {
                    j3 = jFloatToRawIntBits2;
                } else {
                    j3 = jFloatToRawIntBits2;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j);
                }
                return new ib2(jValueAt, motionEvent.getEventTime(), jS, j2, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits5, f, jFloatToRawIntBits, j3);
            }
            jS = gy1Var != null ? gy1Var.a : (((long) Float.floatToRawIntBits(motionEvent.getRawX(i))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L);
            jI = h7Var.I(jS);
        }
        j2 = jI;
        toolType = motionEvent.getToolType(i);
        if (toolType == 0) {
        }
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        char c22 = c;
        i3 = 0;
        while (true) {
            jFloatToRawIntBits = 0;
            if (i3 < historySize) {
            }
            i3++;
            historySize = i5;
        }
        if (motionEvent.getActionMasked() != 8) {
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            float axisValue2 = motionEvent.getAxisValue(52, i);
            if (axisValue2 > 0.0f) {
            }
            if (fValueOf != null) {
            }
        }
        float f2 = fFloatValue;
        if (i4 >= 29) {
            j3 = jFloatToRawIntBits2;
        }
        return new ib2(jValueAt, motionEvent.getEventTime(), jS, j2, z, pressure, i2, this.c.get(motionEvent.getPointerId(i), false), arrayList2, jFloatToRawIntBits5, f2, jFloatToRawIntBits, j3);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
