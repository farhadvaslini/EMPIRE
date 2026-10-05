package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class di0 extends gq {
    public final TextView h;
    public final wh0 i;
    public boolean j = true;

    public di0(TextView textView) {
        this.h = textView;
        this.i = new wh0(textView);
    }

    @Override // defpackage.gq
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        if (!this.j) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof wh0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            wh0 wh0Var = this.i;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = wh0Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == wh0Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.gq
    public final void O(boolean z) {
        if (z) {
            T();
        }
    }

    @Override // defpackage.gq
    public final void P(boolean z) {
        this.j = z;
        T();
        TextView textView = this.h;
        textView.setFilters(G(textView.getFilters()));
    }

    public final void T() {
        TextView textView = this.h;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.j) {
            if (!(transformationMethod instanceof hi0) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new hi0(transformationMethod);
            }
        } else if (transformationMethod instanceof hi0) {
            transformationMethod = ((hi0) transformationMethod).f;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
